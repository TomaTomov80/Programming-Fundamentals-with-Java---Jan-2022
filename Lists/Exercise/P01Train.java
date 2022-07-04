package Lists.Exercise;

import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> trainWagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxPassengers = Integer.parseInt(scanner.nextLine());
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("end")) {
            String firstCommand = command.get(0);
            if (firstCommand.equals("Add")){
                int waggonToAdd = Integer.parseInt(command.get(1));

                trainWagons.add(waggonToAdd);

            } else {
                int passengers = Integer.parseInt(command.get(0));

                for (int i = 0; i < trainWagons.size(); i++) {
                    if (trainWagons.get(i) + passengers <= maxPassengers ){

                        trainWagons.set(i, trainWagons.get(i) + passengers);
                        break;

                    }
                }
              }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        System.out.println(trainWagons.toString().replaceAll("[\\[\\],]", ""));

    }
}
