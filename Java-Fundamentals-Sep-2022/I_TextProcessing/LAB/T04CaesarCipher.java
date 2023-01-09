package I_TextProcessing.LAB;

import java.util.*;

public class T04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        char[] charArr = inputText.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            System.out.print((char)((charArr[i])+3));
        }

    }

}
