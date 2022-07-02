package Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> number = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List<Double> convertedList = extractedList(number);


        while (convertedList.size() != number.size()) {
            number = convertedList;
            convertedList = extractedList(number);

        }

        for (Double a : convertedList) {
            System.out.print(new DecimalFormat("0.#").format(a) + " ");

        }
    }

    private static List<Double> extractedList(List<Double> number) {
        int index = 0;
        boolean found = false;
        List<Double> convertedList = new ArrayList<>();
        while (index < number.size()) {

            if (index < number.size() - 1 && number.get(index).equals(number.get(index + 1)) && !found) {

                convertedList.add(number.get(index) + number.get(index + 1));
                index += 2;
                found = true;


            } else {
                convertedList.add(number.get(index));
                index++;
            }

        }

        return convertedList;
    }
}
