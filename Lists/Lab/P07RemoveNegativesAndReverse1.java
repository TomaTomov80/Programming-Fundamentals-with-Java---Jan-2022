package Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        integerList.removeIf(n -> n < 0);

        if (integerList.size() == 0) {
            System.out.println("empty");
        } else {

            Collections.reverse(integerList);
            System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));

        }
    }
}
