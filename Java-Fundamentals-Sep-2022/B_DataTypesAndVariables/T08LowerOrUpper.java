package B_DataTypesAndVariables;

import java.util.Scanner;

public class T08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.next().charAt(0);

        int ascii = (int) symbol;

        if (ascii >= 65 && ascii <= 90) {
            System.out.println("upper-case");
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println("lower-case");
        } else {
            System.out.println("ERROR!");
        }

    }
}
