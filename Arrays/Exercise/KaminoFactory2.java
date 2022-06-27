package Arrays.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KaminoFactory2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine().replaceAll("!", "");

        StringBuilder inputSB = new StringBuilder(input);




        List<String> allDnaList = new ArrayList<>();

        while (!input.equals("Clone them!")) {

            allDnaList.add(input);
            input = scanner.nextLine().replaceAll("!", "");
        }

        String regex = "1+";

        int maxCount = 0;
        int bestIndex = -1;

        for (int i = 0; i < allDnaList.size(); i++) {

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(allDnaList.get(i));

            while (matcher.find()) {

                if (matcher.group().length() > maxCount){
                    maxCount = matcher.group().length();
                    bestIndex = i;
                }
            }


        }

        System.out.println();

    }
}
