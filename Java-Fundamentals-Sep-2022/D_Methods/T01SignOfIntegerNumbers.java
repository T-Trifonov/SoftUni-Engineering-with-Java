package D_Methods;

import java.util.Scanner;

public class T01SignOfIntegerNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        typeNumber(num);

    }

    public static void typeNumber(int num){

        if (num>0){
            System.out.printf("The number %d is positive.",num);
        } else if (num<0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num==0){
            System.out.printf("The number 0 is zero.");
        }

    }

}
