package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        for (int i = 0; i < num.length ; i++) {
            if ( num[i] % 2 ==0){
                evenSum += num[i];
            }
        }
        System.out.printf("%d", evenSum);
    }
}
