package I_TextProcessing.LAB;

import java.util.*;

public class T06ReplaceRepeatingChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder outputString = new StringBuilder(input);

        for (int i = 0; i < outputString.length() - 1; i++) {
            if (outputString.charAt(i) == outputString.charAt(i + 1)) {

                outputString.deleteCharAt(i);

                i--;

            }
        }

        System.out.println(outputString);

    }
}
