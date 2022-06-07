package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int curr = 0;
        boolean isValid = false;
        for (int i = 1; i <= n; i++) {
            curr = i;
            while (curr != 0) {
                sum += curr % 10;
                curr = curr / 10;
            }
            isValid = (sum == 5) || (sum == 7) || (sum == 11);
            if (isValid) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;

        }

    }
}
