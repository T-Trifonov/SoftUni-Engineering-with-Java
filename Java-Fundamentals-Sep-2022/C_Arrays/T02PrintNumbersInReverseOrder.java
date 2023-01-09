package C_Arrays;

import java.util.Scanner;

public class T02PrintNumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int array [] = new int[numbers];

        for (int i = 0; i < numbers ; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            array [i] = value;
        }

        for (int i = array.length-1; i >= 0;i--) {
            System.out.print(array[i]+" ");
        }

    }
}
