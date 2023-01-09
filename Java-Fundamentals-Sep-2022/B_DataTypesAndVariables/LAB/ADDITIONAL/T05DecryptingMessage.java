package B_DataTypesAndVariables.LAB.ADDITIONAL;

import java.util.Scanner;

public class T05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numCharacters = Integer.parseInt(scanner.nextLine());

        StringBuilder outputString = new StringBuilder();

        for (int i = 1; i <= numCharacters; i++) {

            char character = scanner.nextLine().charAt(0);

            outputString.append((char)((int)character + key));

        }

        System.out.println(outputString.toString());

    }

}
