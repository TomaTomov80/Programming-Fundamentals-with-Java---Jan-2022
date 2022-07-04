package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int number = bombList.get(0);
        int power = bombList.get(1);
        int index = 0;
        List<Integer> check = new ArrayList<>();
        while (integerList.contains(number)) {
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) == number) {
                    index = i;
                    break;
                }
            }
            if (index - power >= 0 && index + power < integerList.size()) {

                integerList.subList((index - power), (index + power + 1)).clear();

            } else if (index - power < 0 && index + power < integerList.size()) {

                integerList.subList(0, (index + power + 1)).clear();

            } else if (index - power >= 0 && index + power >= integerList.size()) {

                integerList.subList((index - power), integerList.size()).clear();

            } else if (index - power < 0 && index + power >= integerList.size()) {

                integerList.subList(0, integerList.size()).clear();

            }
        }

        int sum = 0;

        for (int n : integerList) {
            sum += n;
        }

        System.out.println(sum);

    }
}
