package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BalancedBrackets1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i <= n; i++) {
            String nextString = scanner.nextLine();
            if (nextString.equals("(")) {
                count1++;
            }
            if (nextString.equals(")")) {
                count2++;
            }
            if (count2 > count1) {
                break;
            }
        }
        if (count1 == count2) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
