package BSCSL.Exercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int min = 0;
        int midd = 0;
        if (n1 >= n2 && n1 >= n3) {
            max = n1;
        } else if (n1 <= n2 && n1 <= n3) {
            min = n1;
        } else {
            midd = n1;
        }
        if (n2 >= n1 && n2 >= n3) {
            max = n2;
        } else if (n2 <= n1 && n2 <= n3) {
            min = n2;
        } else {
            midd = n2;
        }
        if (n3 > n2 && n3 > n1) {
            max = n3;
        } else if (n3 < n2 && n3 < n1) {
            min = n3;
        } else {
            midd = n3;
        }
        System.out.println(max);
        System.out.println(midd);
        System.out.println(min);
    }
}
