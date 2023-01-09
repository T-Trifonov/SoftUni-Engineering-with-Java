package D_Methods.LAB;

import java.util.Locale;
import java.util.Scanner;

public class T04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (passwordLength(password) && lettersDigits(password) && digitsLength(password)) {
            System.out.println("Password is valid");
        }
        if (!passwordLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!lettersDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitsLength(password)) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static boolean passwordLength(String input) {

        boolean isLength = false;

        if (input.length() >= 6 && input.length() <= 10) {
            isLength = true;
        }

        return isLength;

    }

    public static boolean lettersDigits(String input) {

        boolean isLettersDigit = false;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {

            char check = input.charAt(i);

            if (check >= 48 && check <= 57) {

                isLettersDigit = true;

            } else if (check >= 97 && check <= 122) {

                isLettersDigit = true;

            } else {

                isLettersDigit = false;
                break;

            }

        }

        return isLettersDigit;

    }

    public static boolean digitsLength(String input) {

        boolean isDigitLength = false;

        int counter = 0;

        for (int i = 0; i < input.length(); i++) {

            char check = input.charAt(i);

            if (check >= 48 && check <= 57) {

                counter++;

            }

            if (counter >= 2) {
                isDigitLength = true;
                break;
            }

        }

        return isDigitLength;

    }

}
