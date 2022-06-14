package Arrays.Lab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        for (int i = 0; i < arr.length / 2; i++) {
            String current = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = current;
        }
        for (String s : arr) {
            System.out.printf("%s ", s);
        }
    }
}
