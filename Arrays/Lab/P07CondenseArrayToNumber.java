package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mainArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] currArr1 = mainArr;
        int[] currArr2 = new int[currArr1.length - 1];
        if (mainArr.length != 1) {
            for (int i = 0; i < currArr1.length - 1; i++) {
                currArr2[i] = currArr1[i] + currArr1[i + 1];
                if (i == currArr1.length - 2) {
                    currArr1 = currArr2;
                    currArr2 = new int[currArr1.length - 1];
                    i = -1;
                }
                if (currArr2.length == 1) {
                    break;
                }
            }
            System.out.printf("%d", currArr1[0] + currArr1[1]);
        } else {
            System.out.printf("%d", mainArr[0]);
        }
    }
}
