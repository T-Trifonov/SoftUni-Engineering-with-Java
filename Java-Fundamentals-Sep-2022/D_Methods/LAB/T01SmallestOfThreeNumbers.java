package D_Methods.LAB;

import java.util.Scanner;

public class T01SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        minNumber(numOne,numTwo,numThree);

    }

    public static void minNumber(int numA, int numB, int numC){

        if (numA<=numB && numA<=numC){
            System.out.println(numA);
        } else if (numB<=numA && numB<=numC){
            System.out.println(numB);
        } else if (numC<=numA && numC<=numB){
            System.out.println(numC);
        }

    }

}
