package Arrays.Exercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        for (int i = 0; i < n; i++) {
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();
            if ((i+1) % 2 != 0){
                firstArr[i] = firstNum;
                secondArr[i] = secondNum;
            } else {
                firstArr[i] = secondNum;
                secondArr[i] = firstNum;
            }
        }
        for (int i : firstArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : secondArr) {
            System.out.print(i + " ");
        }
    }
}
