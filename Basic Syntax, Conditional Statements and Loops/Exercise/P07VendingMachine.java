package BSCSL.Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moneyGetStr = scanner.nextLine();
        double sum = 0;
        while (!moneyGetStr.equals("Start")) {
            double moneyGet = Double.parseDouble(moneyGetStr);
            if (moneyGet != 0.1 && moneyGet != 0.2 && moneyGet != 0.5 && moneyGet != 1 && moneyGet != 2) {
                System.out.printf("Cannot accept %.2f\n", moneyGet);
            } else {
                sum += moneyGet;
            }
            moneyGetStr = scanner.nextLine();
        }
        String purchase = scanner.nextLine();
        String productName = "";
        while (!purchase.equals("End")) {
            boolean enoughMoney = false;
            boolean invalidProduct = false;
            switch (purchase) {
                case "Nuts":
                    if (sum >= 2.0) {
                        enoughMoney = true;
                        productName = "Nuts";
                        sum -= 2;
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        enoughMoney = true;
                        productName = "Water";
                        sum -= 0.7;
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        enoughMoney = true;
                        productName = "Crisps";
                        sum -= 1.5;
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        enoughMoney = true;
                        productName = "Soda";
                        sum -= 0.8;
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0) {
                        enoughMoney = true;
                        productName = "Coke";
                        sum -= 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    invalidProduct = true;
                    break;
            }
            if (enoughMoney && !invalidProduct) {
                System.out.printf("Purchased %s\n", productName);
            } else if(!enoughMoney && !invalidProduct) {
                System.out.println("Sorry, not enough money");
            }
            purchase = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
