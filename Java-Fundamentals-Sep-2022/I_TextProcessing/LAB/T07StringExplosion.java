package I_TextProcessing.LAB;

import java.util.*;

public class T07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        StringBuilder outputString = new StringBuilder(inputString);

        int power = 0;

        for (int i = 0; i < outputString.length(); i++) {
            if (outputString.charAt(i) == '>' && Character.isDigit(outputString.charAt(i + 1))) {
                power += Integer.parseInt(outputString.charAt(i + 1) + "");

            }

            if (power > 0) {
                if (!(outputString.charAt(i) == '>')) {
                    outputString.deleteCharAt(i);
                    power--;
                    i--;
                }
            }


        }

        System.out.println(outputString);

    }
}
