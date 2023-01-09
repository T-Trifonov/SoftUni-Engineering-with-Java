package B_DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class T03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal total = new BigDecimal(0);

        short numbers = Short.parseShort(scanner.nextLine());

        for (int i = 1; i <= numbers; i++) {

            BigDecimal inputvalue = new BigDecimal(scanner.nextLine());

            total = total.add(inputvalue);

        }

        System.out.println(total);

    }
}
