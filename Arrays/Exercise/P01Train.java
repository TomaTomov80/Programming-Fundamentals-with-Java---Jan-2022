package Arrays.Exercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] peopleIntrain = new int[n];
        int sum = 0;
        for (int i = 0; i < peopleIntrain.length; i++) {
            peopleIntrain[i] = Integer.parseInt(scanner.nextLine());
            sum += peopleIntrain[i];
        }
        for (int i : peopleIntrain) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.printf("%d", sum);
    }
}
