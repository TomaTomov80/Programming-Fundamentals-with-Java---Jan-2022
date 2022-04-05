package BSCSL.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNum = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayType = scanner.nextLine();
        double price = 0;
        switch (groupType) {
            case "Students":
                switch (dayType) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (dayType) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (dayType) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.5;
                        break;
                }
                break;
        }
        if (groupType.equals("Students") && groupNum >= 30) {
            price *= .85;
        }
        if (groupType.equals("Business") && groupNum >= 100) {
            groupNum -= 10;
        }
        if (groupType.equals("Regular") && (groupNum >= 10 && groupNum <= 20)) {
            price *= .95;
        }
        price = groupNum * price;
        System.out.printf("Total price: %.2f", price);
    }
}

