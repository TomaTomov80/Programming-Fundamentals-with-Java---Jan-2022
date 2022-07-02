package Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> number = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < number.size() - 1; i++) {
            if (number.get(i).equals(number.get(i + 1))) {
                double sum = 2 * number.get(i);
                number.set(i, sum);
                number.remove(i + 1);
                i = -1;
            }
        }

        for (double num : number) {
            String output = new DecimalFormat("0.#").format(num) + " ";
            System.out.print(output);
        }
    }
}
