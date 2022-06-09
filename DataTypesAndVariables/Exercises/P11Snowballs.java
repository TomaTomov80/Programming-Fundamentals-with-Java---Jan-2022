package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0;
        double snowballValueMax = 0;
        int snowballTimeMax = 0;
        int snowballQualityMax = 0;
        int snowballSnowMax = 0;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            snowballValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > snowballValueMax){
                snowballValueMax = snowballValue;
                snowballTimeMax = snowballTime;
                snowballQualityMax = snowballQuality;
                snowballSnowMax = snowballSnow;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMax, snowballTimeMax, snowballValueMax, snowballQualityMax);
    }
}
