package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("end")) {

            String commandWord = command.get(0);

            switch (commandWord) {
                case "Add":
                    int numToAdd = Integer.parseInt(command.get(1));

                    integerList.add(numToAdd);

                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(command.get(1));

                    integerList.remove(Integer.valueOf(numToRemove));

                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(command.get(1));

                    integerList.remove(index);

                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(command.get(1));
                    int indexToInsert = Integer.parseInt(command.get(2));

                    integerList.add(indexToInsert, numToInsert);

                    break;
            }

            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));
    }
}
