package B_DataTypesAndVariables.LAB.ADDITIONAL;

import java.util.Scanner;

class Typetester {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }

    void printType(int x) {
        System.out.println(x + " is an int");
    }

    void printType(float x) {
        System.out.println(x + " is an float");
    }

    void printType(double x) {
        System.out.println(x + " is an double");
    }

    void printType(char x) {
        System.out.println(x + " is an char");
    }

    void printType(String x) {
        System.out.println(x + " is string");
    }


}


public class T01DataTypeFinder {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       var input = scanner.nextLine();

        Typetester t = new Typetester();
        t.printType(input);


//        while (!input.equals("END")){
//
//
//
//
//            input = scanner.nextLine();
//        }


    }
}
