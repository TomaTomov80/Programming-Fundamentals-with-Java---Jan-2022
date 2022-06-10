package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String word = "";
        for (int i = 1; i <= n; i++) {
            char character = scanner.nextLine().charAt(0);
            character += key;
            word += character;
        }
        System.out.println(word);
    }
}
