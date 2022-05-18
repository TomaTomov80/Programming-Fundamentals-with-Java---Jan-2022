package BSCSL.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int result = 0;
        for (int i = n2; i <= 10; i++) {
            result = n1 * i;
            System.out.printf("%d X %d = %d\n", n1, i, result);
        }
        if (n2 > 10){
            System.out.printf("%d X %d = %d", n1, n2, n1 * n2);
        }
    }
}
