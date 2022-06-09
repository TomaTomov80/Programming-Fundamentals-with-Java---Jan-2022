package DataTypesAndVariables.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int halfN = n / 2;
        int nIni = n;
        while (n >= m) {
            if ( n == 0 ){
                break;
            }
            count++;
            n -= m;
            if (nIni % 2 == 0 &&  y != 0) {
                if (n == halfN) {
                    n /= y;
                    if (n < m) {
                        break;
                    }
                }
            }
        }
        System.out.println(n);
        System.out.println(count);
    }
}


