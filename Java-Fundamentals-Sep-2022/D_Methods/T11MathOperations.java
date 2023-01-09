package D_Methods;

import java.util.Scanner;

public class T11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int numberB = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calc(numberA, command, numberB));


    }

    public static double calc(int numA, String command, int numB) {

        double result = 0;


        switch (command) {
            case "+":
                result = numA + numB;
                break;
            case "-":
                result = numA - numB;
                break;

            case "*":
                result = numA * numB;
                break;

            case "/":
                result = numA * 1.0 / numB;
                break;

        }

        return result;
    }


}
