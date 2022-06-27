package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrIncreasingOrder = new int[arr.length];
        int[] arrIncreasingOrderIndexes = new int[arr.length];

        int indexOfMin = -1;



            for (int i = 0; i < arr.length; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] < min && arr[j] != Integer.MIN_VALUE) {
                        min = arr[j];
                        indexOfMin = j;

                    }
                }
                arr[indexOfMin] = Integer.MIN_VALUE;

                arrIncreasingOrder[i] = min;
                arrIncreasingOrderIndexes[i] = indexOfMin;
            }




    }
}
