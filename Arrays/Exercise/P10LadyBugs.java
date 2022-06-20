package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filedSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[filedSize];
        int[] initialIndexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        for (int i = 0; i < initialIndexes.length; i++) {
            if (initialIndexes[i] >= 0 && initialIndexes[i] < field.length) {
                field[initialIndexes[i]] = 1;
            }
        }
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            int indexNum = Integer.parseInt(commandArr[0]);
            int factor = Integer.parseInt(commandArr[2]);
            if ((indexNum < 0 || indexNum >= field.length)){
                command = scanner.nextLine();
                continue;
            }
            if (field[indexNum] == 0){
                command = scanner.nextLine();
                continue;
            }
            if (factor == 0){
                command = scanner.nextLine();
                continue;
            }
            if (commandArr[1].equals("right")) {
                for (int i = factor; i < field.length + factor; i += factor) {
                    if ((indexNum + i < field.length && indexNum + i >= 0) && field[(indexNum + i)] == 0) {
                        field[(indexNum + i)] = 1;
                        field[indexNum] = 0;
                        break;
                    } else if (indexNum + i >= field.length || indexNum + i < 0) {
                        field[indexNum] = 0;
                        break;
                    }
                }
            } else if (commandArr[1].equals("left")) {
                 for (int i = factor; i < field.length + factor; i += factor) {
                    if ((indexNum - i >= 0 && indexNum - i < field.length) && field[(indexNum - i)] == 0) {
                        field[(indexNum - i)] = 1;
                        field[indexNum] = 0;
                        break;
                    } else if (indexNum - i >= field.length || indexNum - i < 0) {
                        field[indexNum] = 0;
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int i : field) {
            System.out.print(i + " ");
        }
    }
}
