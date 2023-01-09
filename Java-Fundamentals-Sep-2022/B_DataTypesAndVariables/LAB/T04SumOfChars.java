package B_DataTypesAndVariables.LAB;

import java.util.Scanner;

public class T04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCharacter = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <=numbersCharacter ; i++) {
            char symbol = scanner.next().charAt(0);
            sum+=((int)symbol);

        }

        System.out.printf("The sum equals: %d", sum);

    }
}
