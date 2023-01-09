package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T06TriplesOfLatinLetters {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            char firstSymbol = (char) (i + 97);
            for (int j = 0; j < num; j++) {
                char secondSymbol = (char) (j + 97);
                for (int k = 0; k < num; k++) {
                    char thirdSymbol = (char) (k + 97);
                    System.out.printf("%c%c%c%n", firstSymbol, secondSymbol, thirdSymbol);
                }
            }
        }

    }
}
