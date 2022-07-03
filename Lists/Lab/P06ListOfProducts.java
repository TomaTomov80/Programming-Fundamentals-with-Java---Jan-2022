package Lists.Lab;

import java.util.*;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> listOfProduct = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            listOfProduct.add(scanner.nextLine());
        }

        Collections.sort(listOfProduct);

        for (int i = 0; i < listOfProduct.size(); i++) {

            System.out.printf("%d.%s%n", i + 1, listOfProduct.get(i));

        }
    }
}
