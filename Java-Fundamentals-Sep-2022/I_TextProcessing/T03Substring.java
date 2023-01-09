package I_TextProcessing;

import java.util.*;

public class T03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String banWord = scanner.nextLine();
        String string = scanner.nextLine();

        while ((string.indexOf(banWord)!=-1)){

            string = string.replace(banWord, "");

        }

        System.out.println(string);

    }
}
