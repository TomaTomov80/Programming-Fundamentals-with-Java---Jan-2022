package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String firstName = scanner.nextLine();
       String secongName = scanner.nextLine();
       String delimiter = scanner.nextLine();
        System.out.println(firstName + delimiter + secongName);
    }
}
