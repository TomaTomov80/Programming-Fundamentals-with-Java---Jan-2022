package Arrays.Exercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        if (n > 2) {
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            System.out.println(arr[arr.length - 1]);
        } else if (n == 1 || n == 2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
