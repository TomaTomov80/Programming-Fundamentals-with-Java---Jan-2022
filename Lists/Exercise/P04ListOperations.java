package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String comandWord = commandList.get(0);

        while (!comandWord.equals("End")) {

            switch (comandWord) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandList.get(1));

                    integerList.add(numberToAdd);
                    break;
                case "Insert":
                    numberToAdd = Integer.parseInt(commandList.get(1));
                    int index = Integer.parseInt(commandList.get(2));
                    if (index < 0 || index > integerList.size() - 1) {
                        System.out.println("Invalid index");
                    } else {

                        integerList.add(index, numberToAdd);
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(commandList.get(1));

                    if (index < 0 || index > integerList.size() - 1) {
                        System.out.println("Invalid index");
                    } else {

                        integerList.remove(index);
                    }
                    break;
                case "Shift":
                    String secondWord = commandList.get(1);
                    int count = Integer.parseInt(commandList.get(2));

                    if (secondWord.equals("left")) {

                        for (int i = 1; i <= count; i++) {

                            Collections.rotate(integerList, -1);
                        }
                    } else {
                        for (int i = 1; i <= count; i++) {

                            Collections.rotate(integerList, 1);
                        }
                    }
                    break;
            }
            commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            comandWord = commandList.get(0);
        }
        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));
    }
}
