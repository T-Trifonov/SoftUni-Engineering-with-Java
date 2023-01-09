package D_Methods;

import java.util.Scanner;

public class T09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();

        switch (typeInput) {
            case "int":

                int numberFirst = Integer.parseInt(scanner.nextLine());
                int numberSecond = Integer.parseInt(scanner.nextLine());

                System.out.println(getMax(numberFirst, numberSecond));

                break;

            case "char":

                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);

                System.out.println(getMax(firstSymbol, secondSymbol));

                break;

            case "string":

                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();

                System.out.println(getMax(firstString, secondString));

                break;
        }

    }

    public static int getMax(int numA, int numB) {
        if (numA > numB) {
            return numA;
        } else {
            return numB;
        }
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }

}
