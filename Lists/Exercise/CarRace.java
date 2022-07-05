package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        double sumLeft = 0;
        double sumRight = 0;

        for (int i = 0; i < integerList.size() / 2; i++) {
            int currNum = integerList.get(i);

            if (currNum != 0) {
                sumLeft += currNum;
            } else {
                sumLeft *= 0.8;
            }
        }

        for (int i = integerList.size() - 1; i >= integerList.size() / 2 + 1; i--) {
            int currNum = integerList.get(i);

            if (currNum != 0) {
                sumRight += currNum;
            } else {
                sumRight *= 0.8;
            }
         }

        if (sumLeft <= sumRight){
            System.out.printf("The winner is left with total time: %.1f", sumLeft);
        } else {
            System.out.printf("The winner is right with total time: %.1f", sumRight);
        }
    }
}
