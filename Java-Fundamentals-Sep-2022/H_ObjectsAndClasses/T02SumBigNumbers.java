package H_ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class T02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstDigit = new BigInteger(scanner.nextLine());
        BigInteger secondDigit = new BigInteger(scanner.nextLine());

        BigInteger result = firstDigit.add(secondDigit);

        System.out.println(result);

    }

}

