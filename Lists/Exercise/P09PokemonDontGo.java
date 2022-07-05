package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;


        while (integerList.size() != 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int currentNum = integerList.get(0);
                integerList.set(0, integerList.get(integerList.size() - 1));

                sum += currentNum;

                extracted(integerList, currentNum);

            } else if (index >= integerList.size()) {
                int currentNum = integerList.get(integerList.size() - 1);
                integerList.set(integerList.size() - 1, integerList.get(0));

                sum += currentNum;

                extracted(integerList, currentNum);

            } else {
                int currentNum = integerList.get(index);
                sum += currentNum;

                integerList.remove(index);


                extracted(integerList, currentNum);
            }
        }

        System.out.println(sum);

    }

    private static void extracted(List<Integer> integerList, int currentNum) {
        for (int i = 0; i < integerList.size(); i++) {

            if (currentNum >= integerList.get(i)) {
                integerList.set(i, integerList.get(i) + currentNum);
            } else if (currentNum < integerList.get(i)) {
                integerList.set(i, integerList.get(i) - currentNum);
            }
        }
    }
}
