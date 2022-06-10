package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class FromLeftToTheRight3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            long firstNum = scanner.nextLong();
            long secondNum = scanner.nextLong();
            long max = Math.max(firstNum, secondNum);
            int sum = 0;
            while (max != 0) {
                int dig = (int) Math.abs(max % 10);
                sum += dig;
                max /= 10;
            }
            System.out.println(sum);
        }
    }
}

