package D_Methods.LAB;

import java.io.OutputStream;
import java.util.Scanner;

public class T06MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        System.out.println(middleCharacters(string));

    }

    public static String middleCharacters(String input){

        String output="";

        if (input.length()%2==0){

            char symbol = input.charAt((input.length()/2)-1);
            output+=symbol;
            symbol = input.charAt(input.length()/2);
            output+=symbol;

        } else {

            char symbol = input.charAt((input.length()/2));
            output+=symbol;
        }

        return output;

    }


}
