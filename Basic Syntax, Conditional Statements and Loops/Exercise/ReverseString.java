package BSCSL.Exercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int userNameLength = text.length();
        String reverse = "";
        for (int i = (userNameLength - 1); i >= 0; i--) {
            char letter = text.charAt(i);
            reverse += letter;
        }
        System.out.println(reverse);
    }
}
