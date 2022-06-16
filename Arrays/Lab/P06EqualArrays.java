package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean isEqual = true;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == secondArr[i]) {
                sum += firstArr[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isEqual = false;
                break;
            }
        }
        if (isEqual){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
