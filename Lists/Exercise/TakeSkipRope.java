package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope {
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

            for (int j = 0; j < n; j++) {
                if (stringList.size() > 0) {
                    resultString.add(stringList.get(0));
                    stringList.remove(0);
                }
            }

            int m = skipList.get(i);

            for (int j = 0; j < m; j++) {
                if (stringList.size() > 0) {
                    stringList.remove(0);
                }
            }

        }
        for ( String currString : resultString){
            System.out.print(currString);
        }

    }
}
