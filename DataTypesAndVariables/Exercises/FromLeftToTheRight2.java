package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class FromLeftToTheRight2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            long firstNum = scanner.nextLong();
            long secondNum = scanner.nextLong();
            if (firstNum > secondNum) {
                int sum = 0;
                while (firstNum != 0) {
                    int dig = (int) Math.abs(firstNum % 10);
                    sum += dig;
                    firstNum /= 10;
                }
                System.out.println(sum);
            } else {
                int sum = 0;
                while (secondNum != 0) {
                    int dig = (int) Math.abs(secondNum % 10);
                    sum += dig;
                    secondNum /= 10;
                }
                System.out.println(sum);
            }
        }
    }
}
