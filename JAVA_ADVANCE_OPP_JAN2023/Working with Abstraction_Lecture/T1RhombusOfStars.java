package A_WorkingWithAbstraction;

import java.util.*;

public class T1RhombusOfStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i < num; i++) {
            printStarUP(i, num - i);
            System.out.println();
        }

        for (int i = num; i >= 0; i--) {

            printStarDown(i, num-i);
            System.out.println();

        }

    }

    private static void printStarDown(int i, int i1) {

        for (int j = 0; j < i1; j++) {
            System.out.print(" ");
        }

        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }

    }

    private static void printStarUP(int i, int i1) {

        for (int j = 0; j < i1; j++) {
            System.out.print(" ");
        }

        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }

    }





}
