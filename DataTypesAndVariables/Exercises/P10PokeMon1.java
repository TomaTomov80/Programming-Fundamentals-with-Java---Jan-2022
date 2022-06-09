package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10PokeMon1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double halfN = n / 2.0;
        while (n >= m) {
            n -= m;
            count++;
            if (n == halfN && y > 0) {
                n /= y;
            }
        }
        System.out.println(n);
        System.out.println(count);
    }
}


