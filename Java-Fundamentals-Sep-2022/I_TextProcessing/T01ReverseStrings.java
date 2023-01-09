package I_TextProcessing;

import java.util.*;

public class T01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")) {


            String reverseString = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                char symbol = input.charAt(i);
                reverseString+=symbol;

            }

            System.out.printf("%s = %s%n", input, reverseString);

            input = scanner.nextLine();
        }

    }
}
