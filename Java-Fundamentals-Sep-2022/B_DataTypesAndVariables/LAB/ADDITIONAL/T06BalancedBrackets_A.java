package B_DataTypesAndVariables.LAB.ADDITIONAL;

import java.util.Scanner;

public class T06BalancedBrackets_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSymbols = Integer.parseInt(scanner.nextLine());

        boolean isEqual = false;

        String[] array = new String[numSymbols];

        for (int i = 1; i <= numSymbols; i++) {

            String symbol = scanner.nextLine();
            array[i - 1] = symbol;

        }

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals("(")){
                isEqual = false;
                array[i]="openBracket";
                for (int j = i+1; j < array.length ; j++) {
                    if (array[j].equals(")")){
                        array[j]="closeBracket";
                        isEqual=true;
                        break;

                    }
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("(") || array[i].equals(")")){
                isEqual =false;
            }
        }

        if (isEqual){
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
