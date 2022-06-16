package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mainArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] currArr = new int[mainArr.length - 1];
        while (currArr.length >= 1) {
            for (int i = 0; i < mainArr.length-1; i++) {
                currArr[i] = mainArr[i] + mainArr[i + 1];
            }
            mainArr = currArr;
            currArr = new int[mainArr.length - 1];
        }
        System.out.printf("%d", mainArr[0]);
    }
}
