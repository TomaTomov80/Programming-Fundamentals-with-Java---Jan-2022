package BSCSL.Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num1 = num;
        int sum = 1;
        int sum1 = 0;
        while (num1 != 0){
            int currNum = num1 % 10;
            sum = 1;
            for (int i = 1; i <= currNum; i++) {
                sum *= i;
            }
            sum1 += sum;
            num1 /= 10;
        }
        if (num == sum1){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
