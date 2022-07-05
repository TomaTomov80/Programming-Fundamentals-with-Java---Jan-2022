package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> currList = new ArrayList<>();
        String current = scanner.nextLine();

        for (int i = 0; i < integerList.size(); i++) {
            currList.add(i, integerList.get(i));
        }

        while (!current.equals("Hit it again, Gabsy!")) {

            int drumSet = Integer.parseInt(current);

            for (int i = 0; i < currList.size(); i++) {

                int vallue = currList.get(i);

                currList.set(i, (vallue - drumSet));
            }

            for (int i = 0; i < currList.size(); i++) {

                if (currList.get(i) <= 0) {
                    if (savings >= 3 * integerList.get(i)) {
                        savings -= 3 * integerList.get(i);
                        currList.set(i, integerList.get(i));
                    }
                }
            }

            current = scanner.nextLine();

        }

        currList.removeIf(n -> n <= 0);


        System.out.println(currList.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
