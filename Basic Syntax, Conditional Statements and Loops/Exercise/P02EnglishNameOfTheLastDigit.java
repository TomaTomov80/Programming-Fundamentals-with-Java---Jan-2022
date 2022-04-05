package BSCSL.Exercise;

import java.util.Scanner;

public class P02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int lastDigit = num % 10;
        String text = "";
        if (lastDigit == 1) {
            text = "one";
        } else if (lastDigit == 2){
            text = "two";
        } else if (lastDigit == 3){
            text = "three";
        }else if (lastDigit == 4){
            text = "four";
        }else if (lastDigit == 5){
            text = "five";
        }else if (lastDigit == 6){
            text = "six";
        }else if (lastDigit == 7){
            text = "seven";
        }else if (lastDigit == 8){
            text = "eight";
        }else if (lastDigit == 9){
            text = "nine";
        } else if (lastDigit == 0) {
            text = "zero";
        }
        System.out.printf("%s", text);
    }
}
