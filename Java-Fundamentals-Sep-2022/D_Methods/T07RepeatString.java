package D_Methods;

import java.util.Scanner;

public class T07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        System.out.println(stringRepeat(string, repeatTimes));

    }

    public static String stringRepeat(String input, int repeat) {
        String outputString = "";

        for (int i = 1; i <= repeat; i++) {
            outputString += input;
        }

        return outputString;

    }

}
