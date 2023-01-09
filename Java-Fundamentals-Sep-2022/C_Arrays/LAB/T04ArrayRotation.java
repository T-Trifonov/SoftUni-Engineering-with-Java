package C_Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotationIndex = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= rotationIndex; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                int tempD = array[j + 1];
                array[j + 1] = array[j];
                array[j] = tempD;
            }

        }

        for (int arrP : array) {
            System.out.print(arrP + " ");
        }

    }

}


