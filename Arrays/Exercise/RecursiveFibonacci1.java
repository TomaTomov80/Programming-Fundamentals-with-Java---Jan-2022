package Arrays.Exercise;

import java.util.Scanner;

public class RecursiveFibonacci1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int curr1 = 1;
        int curr2 = 1;
        int currCurr = 1;
        if (n > 2) {
            for (int i = 3; i <= n; i++) {
                currCurr = curr1 + curr2;
                curr2 = curr1;
                curr1 = currCurr;
            }
            System.out.println(currCurr);
        } else if (n == 1 || n == 2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
