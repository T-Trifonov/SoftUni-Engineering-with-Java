package D_Methods.LAB;

import java.util.Scanner;

public class T03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char beginCharacter = scanner.nextLine().charAt(0);
        char endCharacter = scanner.nextLine().charAt(0);

        listCharacters(beginCharacter, endCharacter);

    }

    public static void listCharacters(char begin, char end) {

        if (begin < end) {
            for (int i = begin + 1; i < end; i++) {
                System.out.print((char) i+ " ");
            }

        } else {

            for (int i = end + 1; i < begin; i++) {
                System.out.print((char) i+ " ");
            }
        }

    }
}
