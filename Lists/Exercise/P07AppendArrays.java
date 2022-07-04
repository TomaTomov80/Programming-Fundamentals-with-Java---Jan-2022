package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(numList);

        String listString = "";

        for (int i = 0; i < numList.size(); i++) {

            listString += numList.get(i) + " ";

        }
        listString = listString.trim();
        listString = listString.replaceAll("\\s+", " ");

        System.out.println(listString);

    }
}
