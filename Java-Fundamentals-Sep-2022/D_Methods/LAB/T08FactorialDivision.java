package D_Methods.LAB;

import java.util.Scanner;

public class T08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = Integer.parseInt(scanner.nextLine());
        int numB = Integer.parseInt(scanner.nextLine());


        double result = factorial(numA)*1.0/factorial(numB);

        System.out.printf("%.2f", result);

    }

    public static long factorial(long digit){

        long factorial=1;

        for (int i = 1; i <=digit ; i++) {

            factorial=i*factorial;

        }

        return factorial;

    }

}
