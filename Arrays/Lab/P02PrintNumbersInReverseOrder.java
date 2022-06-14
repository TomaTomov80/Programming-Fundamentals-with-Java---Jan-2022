package Arrays.Lab;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] num = new String[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextLine();
        }
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.printf("%s ", num[i]);
        }
    }
}
