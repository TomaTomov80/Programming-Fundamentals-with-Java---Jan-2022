package Arrays.Exercise;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String firstString = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = firstString;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
