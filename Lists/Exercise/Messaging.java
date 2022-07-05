package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> stringList = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        List<Integer> reducedList = new ArrayList<>();
        List<String> reducedString = new ArrayList<>();

        for (int i = 0; i < integerList.size(); i++) {
            int currNum = integerList.get(i);
            int sum = 0;

            while (currNum != 0) {

                sum += currNum % 10;

                currNum = currNum / 10;
            }

            reducedList.add(i, sum);

        }

        for (int i = 0; i < reducedList.size(); i++) {
            int currNum = reducedList.get(i);
            int index = 0;
            String currString = "";

            if (currNum < stringList.size()) {
                index = currNum;

                currString = stringList.get(index);

            } else {

                index = (currNum % stringList.size());

                currString = stringList.get(index);

            }

            reducedString.add(i, currString);
            stringList.remove(index);
        }

        for (String string:reducedString){
            System.out.print(string);
        }
    }
}
