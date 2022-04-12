package BSCSL.Exercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double budgetIni = budget;
        String game = scanner.nextLine();
        double priceGame = 0;

        while (!game.equals("Game Time")) {
            boolean isValid = true;
            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    priceGame = 39.99;
                    break;
                case "CS: OG":
                    priceGame = 15.99;
                    break;
                case "Zplinter Zell":
                    priceGame = 19.99;
                    break;
                case "Honored 2":
                    priceGame = 59.99;
                    break;
                case "RoverWatch":
                    priceGame = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    isValid = false;
                    break;
            }
            if (priceGame == budget && isValid) {
                budget -= priceGame;
                System.out.printf("Bought %s\n", game);
                System.out.println("Out of money!");
                break;
            } else if (priceGame > budget && isValid) {
                System.out.println("Too Expensive");
            } else if (isValid) {
                budget -= priceGame;
                System.out.printf("Bought %s\n", game);
            }

            game = scanner.nextLine();
        }
        if (budget > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", budgetIni - budget, budget);
        }
    }
}
