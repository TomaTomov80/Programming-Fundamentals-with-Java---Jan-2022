package BSCSL.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        int userNameLength = userName.length();
        String password = "";
        for (int i = (userNameLength - 1); i >= 0; i--) {
            char letter = userName.charAt(i);
            password += letter;
        }
        String passwordTry = scanner.nextLine();
        int count = 0;
        while (!passwordTry.equals(password)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            passwordTry = scanner.nextLine();
        }
        if (passwordTry.equals(password)) {
            System.out.printf("User %s logged in.", userName);
        }
    }
}
