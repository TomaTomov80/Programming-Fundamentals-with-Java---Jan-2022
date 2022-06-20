package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] bestDnaArr = new int[n];
        int sumCurr = 0;
        int countTotal = 0;
        int bestIndexTotal = Integer.MAX_VALUE;
        int sample = 0;
        int sampleBestDna = 0;
        String nextString = scanner.nextLine();
        while (!nextString.equals("Clone them!")) {
            sample++;
            int[] arr = Arrays.stream(nextString.split("[\\!\\!!]+")).mapToInt(Integer::parseInt).toArray();
            int count = 0;
            int sum = 0;
            int countBest = 0;
            int bestIndexCurr = 0;
            int bestIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (arr[i] == 1) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 1) {
                    bestIndexCurr = i;
                }
                if (count >= 1 && count > countBest) {
                    countBest = count;
                    bestIndex = bestIndexCurr;
                }
            }
            if (countBest > countTotal) {
                bestIndexTotal = bestIndex;
                sampleBestDna = sample;
                bestDnaArr = arr;
                sumCurr = sum;
                countTotal = countBest;
            } else if (countBest == countTotal && bestIndex < bestIndexTotal) {
                bestIndexTotal = bestIndex;
                sampleBestDna = sample;
                bestDnaArr = arr;
                sumCurr = sum;
            } else if (countBest == countTotal && bestIndex == bestIndexTotal && sum > sumCurr) {
                sampleBestDna = sample;
                bestDnaArr = arr;
                sumCurr = sum;
            }
            nextString = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", sampleBestDna, sumCurr);
        for (int arg : bestDnaArr) {
            System.out.print(arg + " ");
        }
    }
}
