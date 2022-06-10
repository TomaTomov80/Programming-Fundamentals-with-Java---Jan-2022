package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class FromLeftToTheRight1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String twoNum = scanner.nextLine();
            int count = 0;
            char digit = twoNum.charAt(count);
            String num1Str = "";
            while (digit != 32) {
                num1Str = num1Str + digit;
                digit = twoNum.charAt(++count);
            }
            long firstNum = Long.parseLong(num1Str);
            String num2Str = "";
            for (int j = count + 1; j < twoNum.length(); j++) {
                digit = twoNum.charAt(j);
                num2Str = num2Str + digit;
            }
            long secondNum = Long.parseLong(num2Str);
            if (firstNum > secondNum) {
                int sum = 0;
                while (firstNum != 0) {
                    int dig = (int)Math.abs(firstNum % 10);
                    sum += dig;
                    firstNum /= 10;
                }
                System.out.println(sum);
            } else {
                int sum = 0;
                while (secondNum != 0) {
                    int dig = (int)Math.abs(secondNum % 10);
                    sum += dig;
                    secondNum /= 10;
                }
                System.out.println(sum);
            }
        }
    }
}
