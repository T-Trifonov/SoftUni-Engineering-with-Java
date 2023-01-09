package C_Arrays.LAB;

import java.util.Scanner;

public class T02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");


        for (String checkSecondArray : secondArray) {
            for (String checkFirstArray : firstArray) {
                if (checkFirstArray.equals(checkSecondArray)) {
                    System.out.print(checkSecondArray + " ");
                }
            }
        }

    }
}
