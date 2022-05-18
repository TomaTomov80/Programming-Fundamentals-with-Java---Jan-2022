package BSCSL.Lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
            count++;
            sum += i;
            if (count == n) {
                System.out.printf("Sum: %d", sum);
                break;
            }
        }
    }
}
