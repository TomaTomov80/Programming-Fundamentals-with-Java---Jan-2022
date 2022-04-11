package BSCSL.Exercise;

import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double totalPrice = (Math.ceil(students * 1.1) * saberPrice) + ( students * robePrice ) + (students * beltPrice - (students / 6 * beltPrice) );
        if (totalPrice <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }
    }
}
