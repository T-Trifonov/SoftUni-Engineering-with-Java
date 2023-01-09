package H_ObjectsAndClasses;

import java.math.BigInteger;
import java.util.*;

public class T03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= num ; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}
