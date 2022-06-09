package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0;
        String kegMax = "";
        for (int i = 1; i <= n; i++) {
            String keg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume > maxVolume){
                maxVolume = volume;
                kegMax = keg;
            }
        }
        System.out.printf("%s", kegMax);
    }
}
