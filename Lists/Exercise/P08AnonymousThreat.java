package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String commandWord = commandList.get(0);

        while (!commandWord.equals("3:1")) {


            switch (commandWord) {
                case "merge":
                    int startIndex = Integer.parseInt(commandList.get(1));

                    if (startIndex < 0) {
                        startIndex = 0;
                    } else if (startIndex >= inputList.size() - 1) {
                        break;
                    }

                    int endIndex = Integer.parseInt(commandList.get(2));

                    if (endIndex >= inputList.size()) {
                        endIndex = inputList.size() - 1;
                    } else if (endIndex <= 0) {
                        break;
                    }

                    String mergedWords = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        mergedWords += inputList.get(i);

                    }
                    inputList.subList(startIndex, endIndex + 1).clear();
                    inputList.add(startIndex, mergedWords);

                    break;

                case "divide":
                    int index = Integer.parseInt(commandList.get(1));
                    int partitions = Integer.parseInt(commandList.get(2));

                    String stringToPartitions = inputList.get(index);
                    List<String> stringToPartitionsList = Arrays.stream(stringToPartitions.split("")).collect(Collectors.toList());
                    List<String> partitionedList = new ArrayList<>();

                    if (stringToPartitions.length() % partitions == 0) {
                        int n = stringToPartitions.length() / partitions;

                        for (int i = 0; i < partitions; i++) {
                            String partitionedString = "";
                            for (int j = 0; j < n; j++) {
                                partitionedString += stringToPartitionsList.get(j);
                            }
                            stringToPartitionsList.subList(0, n).clear();
                            partitionedList.add(partitionedString);
                        }

                        inputList.remove(index);
                        inputList.addAll(index, partitionedList);
                    } else {
                        int n = stringToPartitions.length() / partitions;

                        for (int i = 0; i < partitions - 1; i++) {
                            String partitionedString = "";
                            for (int j = 0; j < n; j++) {
                                partitionedString += stringToPartitionsList.get(j);
                            }
                            stringToPartitionsList.subList(0, n).clear();
                            partitionedList.add(partitionedString);
                        }
                        String lastString = "";
                        for (int i = 0; i < stringToPartitionsList.size(); i++) {
                            lastString += stringToPartitionsList.get(i);
                        }

                        partitionedList.add(lastString);
                        inputList.remove(index);
                        inputList.addAll(index, partitionedList);
                    }
                    break;
            }

            commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            commandWord = commandList.get(0);
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }
}
