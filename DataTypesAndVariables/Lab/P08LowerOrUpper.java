package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char newChar = scanner.nextLine().charAt(0);
        if (newChar >= 65 && newChar <= 90){
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
