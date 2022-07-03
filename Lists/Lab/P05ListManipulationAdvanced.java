package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!commandList.get(0).equals("end")) {
            String commandWord = commandList.get(0);

            switch (commandWord) {
                case "Contains":
                    int value = Integer.parseInt(commandList.get(1));

                    if (integerList.contains(value)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }

                    break;

                case "Print":
                    String secondWord = commandList.get(1);

                    if (secondWord.equals("even")) {
                        for (int num : integerList) {
                            if (num % 2 == 0)
                                System.out.print(num + " ");
                        }
                        System.out.println();
                    } else {
                        for (int num : integerList) {
                            if (num % 2 != 0)
                                System.out.print(num + " ");
                        }
                        System.out.println();
                    }

                    break;

                case "Get":
                    int sum = 0;

                    for (int num : integerList) {
                        sum += num;
                    }
                    System.out.println(sum);

                    break;

                case "Filter":
                    String condition = commandList.get(1);
                    int number = Integer.parseInt(commandList.get(2));

                    if (condition.equals("<")) {

                        for (int num : integerList) {
                            if (num < number) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();

                    } else if (condition.equals(">")) {

                        for (int num : integerList) {
                            if (num > number) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();

                    } else if (condition.equals(">=")) {

                        for (int num : integerList) {
                            if (num >= number) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();

                    } else if (condition.equals("<=")) {

                        for (int num : integerList) {
                            if (num <= number) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                    }

                    break;


            }

            commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
    }
}
