package I_TextProcessing;

import java.util.*;

public class T04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] replaceWord = scanner.nextLine().split(", ");
        String string = scanner.nextLine();

        for (String output: replaceWord) {
            string = string.replace(output,replace(output));
        }

        System.out.println(string);

    }

    public static String replace(String word){

        String output="";

        for (int i = 0; i < word.length() ; i++) {
            output +="*";
        }

        return output;
    }

}
