package D_Methods.LAB;

import java.util.Scanner;

public class T05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(sum(numOne,numTwo),numThree));

    }

    public static int sum(int numA, int numB){

        int total = numA+numB;

        return total;
    }

    public static int subtract(int sum, int numC){

        int result = sum - numC;

        return result;
    }

}
