package I_TextProcessing.LAB;

import java.util.*;

public class T02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(sum(input));

    }

    static public Integer sum(String input) {
        String[] inputArr = input.split(" ");

        int total = 0;

        String longWord = "";
        String shortWord = "";

        if (inputArr[0].length() >= inputArr[1].length()) {
            longWord = inputArr[0];
            shortWord = inputArr[1];

        } else {
            longWord = inputArr[1];
            shortWord = inputArr[0];
        }

        for (int i = 0; i <= shortWord.length()-1; i++) {
            total = total + (((int)shortWord.charAt(i)) * ((int) longWord.charAt(i)));

        }

        for (int i = shortWord.length(); i <= longWord.length()-1 ; i++) {
            total +=((int)longWord.charAt(i));
        }

        return total;
    }

}
