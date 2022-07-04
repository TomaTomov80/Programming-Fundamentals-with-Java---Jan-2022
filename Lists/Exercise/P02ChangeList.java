package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String commandWord = commandList.get(0);

        while (!commandWord.equals("end")) {

            switch (commandWord) {
                case "Delete":

                    int element = Integer.parseInt(commandList.get(1));

                    integerList.removeIf(n -> n == element);

                    break;

                case "Insert":

                    int elementIns = Integer.parseInt(commandList.get(1));
                    int position = Integer.parseInt(commandList.get(2));

                    integerList.add(position, elementIns);

                    break;

            }

            commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            commandWord = commandList.get(0);
        }

        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));

    }
}
