package D_Methods.LAB;

import java.util.Locale;
import java.util.Scanner;

public class T02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        vowelsCount(string);

    }

    public static void vowelsCount(String string) {

        int counterVowels = 0;
        char symbol = ' ';

        string=string.toLowerCase();

        for (int i = 0; i <= string.length()-1; i++) {
            symbol = string.charAt(i);
            if (symbol == 'e' || symbol == 'a' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                counterVowels++;
            }
        }

        System.out.println(counterVowels);

    }

}




