package BSCSL.Exercise;

import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int keyboardCount1 = 0;
        int displayCount = 0;

        for (int i = 1; i <= lostGame; i++) {
            boolean headsetCrash = false;
            boolean mousetCrash = false;
            if (i % 2 == 0) {
                headsetCount++;
                headsetCrash = true;
            }
            if (i % 3 == 0) {
                mouseCount++;
                mousetCrash = true;
            }
            if (headsetCrash && mousetCrash) {
                keyboardCount++;
                keyboardCount1++;
            }
            if (keyboardCount1 % 2 == 0 && keyboardCount1 > 1) {
                displayCount++;
                keyboardCount1 = 0;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", ( (headsetCount * headsetPrice) + (mouseCount * mousePrice) + (keyboardCount * keyboardPrice) + (displayCount * displayPrice)));
    }
}
