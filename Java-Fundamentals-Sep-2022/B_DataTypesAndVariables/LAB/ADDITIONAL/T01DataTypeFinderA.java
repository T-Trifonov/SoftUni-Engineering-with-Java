package B_DataTypesAndVariables.LAB.ADDITIONAL;

import java.util.*;

public class T01DataTypeFinderA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!(input.equals("END"))){

            if (input.matches("[+-]?[0-9][0-9]*")){
                System.out.println(input+" is integer type");
            } else if (input.matches("[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?")){
                System.out.println(input+" is floating point type");
            } else if (input.matches("[A-Za-z]?")){
                System.out.println(input+" is character type");
            } else if (input.toLowerCase().equals("true") || input.toLowerCase().equals("false")){
                System.out.println(input+ " is boolean type");
            } else  {
                System.out.println(input+" is string type");
            }

            input = scanner.nextLine();
        }

    }
}
