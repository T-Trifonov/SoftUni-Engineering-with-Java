package D_Methods.LAB;

        import java.util.Scanner;

public class T09PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        while (!string.equals("END")) {

            String reverse=reverseString(string);

            int number = Integer.parseInt(string);
            int reverseNumber = Integer.parseInt(reverse);

            if (number == reverseNumber) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            string = scanner.nextLine();

        }

    }


    public static String reverseString(String input) {

        String reverseString = "";

        for (int i = input.length()-1; i >= 0; i--) {
            char symbol = input.charAt(i);
            reverseString += symbol;
        }

        return reverseString;

    }

}
