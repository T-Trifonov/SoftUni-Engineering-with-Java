package I_TextProcessing;

import java.util.Scanner;

public class T02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String print = "";
        for (int i = 0; i < input.length; i++) {
            print += repeat(input[i]);
        }

        System.out.println(print);

    }

    public static String repeat(String input){

        String string ="";

        for (int i = 1; i <= input.length(); i++) {
            string +=input;
        }

        return string;
    }
}