package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double brP = Double.parseDouble(scanner.nextLine());
        double usd = brP * 1.36;
        System.out.printf("%.3f", usd);
    }
}
