package I_TextProcessing.LAB;

import java.util.*;

public class T08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputString = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (String check : inputString) {
            String temp = check;

            char firstLetter = temp.charAt(0);
            char lastLetter = temp.charAt(temp.length() - 1);
            double digit = Double.parseDouble((temp.substring(1, temp.length() - 1)) + "");

            if (isUppercaseLetter(firstLetter)) {
                totalSum += (digit / letterPosition(firstLetter));
            } else {
                totalSum += (digit * letterPosition(firstLetter));
            }

            if (isUppercaseLetter(lastLetter)){
                totalSum -= letterPosition(lastLetter);
            } else {
                totalSum += letterPosition(lastLetter);
            }

        }

        System.out.printf("%.2f", totalSum);

    }

    public static boolean isUppercaseLetter(char letter) {
        boolean isUppercaseLetter = false;

        if (letter >= 65 && letter <= 90) {
            isUppercaseLetter = true;
        }

        return isUppercaseLetter;
    }

    public static Double letterPosition(char letter) {
        double position = 0;

        if (isUppercaseLetter(letter)) {
            position = ((int) letter) - 64;
        } else {
            position = ((int) letter) - 96;
        }

        return position;

    }

}
