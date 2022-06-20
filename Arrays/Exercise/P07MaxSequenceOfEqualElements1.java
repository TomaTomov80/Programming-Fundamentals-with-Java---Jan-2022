package Arrays.Exercise;

import java.util.Scanner;

public class P07MaxSequenceOfEqualElements1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        String[] currArr = new String[arr.length];
        String[] longestSeq = new String[arr.length];
        int bestIndex = -1;
        int count = 1;
        int bestCount = 0;
        String bestString = "";
        int indexBest = -1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i].equals(arr[i + 1])) {
                count++;

                if (count > bestCount) {
                    bestCount = count;
                    bestString = arr[i];
                    indexBest = i + 2 - bestCount;

                }

            } else {
                count = 1;
            }

        }
        for (int i = 0; i < bestCount; i++) {
            System.out.print(bestString + " ");

        }

    }
}
