package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstIntList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondIntList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> mergedList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        if (firstIntList.size() > secondIntList.size()) {

            for (int i = 0; i < secondIntList.size(); i++) {
                mergedList.add(firstIntList.get(i));
                mergedList.add(secondIntList.get((secondIntList.size() - 1) - i));
            }

            int max = Math.max(firstIntList.get(firstIntList.size() - 1), firstIntList.get(firstIntList.size() - 2));
            int min = Math.min(firstIntList.get(firstIntList.size() - 1), firstIntList.get(firstIntList.size() - 2));

            for (int i = 0; i < mergedList.size(); i++) {
                if (mergedList.get(i) > min && mergedList.get(i) < max) {
                    resultList.add(mergedList.get(i));
                }

            }
        } else if (firstIntList.size() < secondIntList.size()) {

            for (int i = 0; i < firstIntList.size(); i++) {
                mergedList.add(firstIntList.get(i));
                mergedList.add(secondIntList.get((secondIntList.size() - 1) - i));
            }

            int max = Math.max(secondIntList.get(0), secondIntList.get(1));
            int min = Math.min(secondIntList.get(0), secondIntList.get(1));

            for (int i = 0; i < mergedList.size(); i++) {
                if (mergedList.get(i) > min && mergedList.get(i) < max) {
                    resultList.add(mergedList.get(i));
                }

            }

        }
        Collections.sort(resultList);
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));

    }
}
