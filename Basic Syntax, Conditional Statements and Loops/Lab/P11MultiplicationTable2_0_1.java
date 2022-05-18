package BSCSL.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2_0_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int result = 0;
        do {
            result = n1 * n2;
            System.out.printf("%d X %d = %d\n", n1, n2, result);
            n2++;
        } while (n2 <= 10);
    }
}
