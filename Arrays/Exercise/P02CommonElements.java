package Arrays.Exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
        for (String value : secondArr) {
            for (String s : firstArr) {
                if (value.equals(s)) {
                    System.out.print(value + " ");
                }
            }
        }
    }
}
