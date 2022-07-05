package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> textList = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < textList.size(); i++) {
            char currChar = textList.get(i).charAt(0);
            if (currChar >= 48 && currChar <= 57) {
                integerList.add(Integer.parseInt(textList.get(i)));

            } else {
                stringList.add(textList.get(i));
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i < integerList.size(); i++) {

            if (i % 2 == 0) {
                takeList.add(integerList.get(i));
            } else {
                skipList.add(integerList.get(i));
            }
        }

        List<String> resultString = new ArrayList<>();

        for (int i = 0; i < takeList.size(); i++) {

            int n = takeList.get(i);

            if (stringList.size() > 0) {
                if (n > stringList.size()) {
                    n = stringList.size();
                }
                resultString.addAll(stringList.subList(0, n));
                stringList.subList(0, n).clear();
            }

            int m = skipList.get(i);

            if (m > stringList.size()) {
                m = stringList.size();
            }
            stringList.subList(0, m).clear();

        }
        for (String currString : resultString) {
            System.out.print(currString);
        }

    }
}
