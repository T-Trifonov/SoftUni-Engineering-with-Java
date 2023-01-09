package B_DataTypesAndVariables.LAB.ADDITIONAL;

import java.math.BigDecimal;
import java.util.*;

public class T03FloatingEquality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigDecimal inputValueA = new BigDecimal(scanner.nextLine());
        BigDecimal inputValueB = new BigDecimal(scanner.nextLine());

        BigDecimal outputValue = new BigDecimal(0);
        BigDecimal epsValue = new BigDecimal("0.000001");

        outputValue = inputValueA.subtract(inputValueB);

        outputValue = outputValue.abs();

        if (outputValue.compareTo(epsValue) >= 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
