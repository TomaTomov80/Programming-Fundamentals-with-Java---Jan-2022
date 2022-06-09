package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;
        while (startingYield >= 100) {
            count ++;
            sum += (startingYield - 26);
            startingYield -= 10;
        }
        System.out.printf("%d\n", count);
        if (sum < 26) {
            sum = 0;
            System.out.printf("%d", sum);
        } else {
            System.out.printf("%d", sum - 26);
        }
    }
}
