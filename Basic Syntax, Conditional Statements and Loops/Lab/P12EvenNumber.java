package BSCSL.Lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        while (Math.abs(num) % 2 != 0) {
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());
        }
        if (Math.abs(num) % 2 == 0) {
            System.out.printf("The number is: %d", Math.abs(num));
        }
    }
}
