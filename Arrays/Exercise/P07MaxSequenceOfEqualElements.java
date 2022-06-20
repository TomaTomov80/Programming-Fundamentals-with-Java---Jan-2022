package Arrays.Exercise;

import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int count = 0;
        int max = 0;
        String maxStr = "";
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                maxStr = arr[i];
            }
        }
        for (int i = 1; i <= max + 1; i++) {
            System.out.print(maxStr + " ");
        }
    }
}
