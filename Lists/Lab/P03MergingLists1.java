package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                resultList.add(firstList.get(i));
                if (i < secondList.size()) {
                    resultList.add(secondList.get(i));
                }
            }
        } else {
            for (int i = 0; i < secondList.size(); i++) {
                if (i < firstList.size()) {
                    resultList.add(firstList.get(i));
                }
                resultList.add(secondList.get(i));
            }
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
