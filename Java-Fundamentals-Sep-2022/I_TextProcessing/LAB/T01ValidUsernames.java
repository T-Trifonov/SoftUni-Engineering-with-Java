package I_TextProcessing.LAB;

import java.util.*;

public class T01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");

        for (String checkUserName : userNames) {
            if (isValid(checkUserName)) {
                System.out.println(checkUserName);
            }
        }

    }

    public static boolean isValid(String userName) {
        boolean isValidLength = (userName.length() >= 3 && userName.length() <= 16);
        char[] symbols = userName.toCharArray();

        boolean isValidSymbol = true;
        for (char checkSymbol : symbols) {
            if (!(Character.isLetterOrDigit(checkSymbol) || checkSymbol=='-' || checkSymbol == '_')) {
                isValidSymbol =false;
            }
        }

        return isValidLength && isValidSymbol;
    }

}
