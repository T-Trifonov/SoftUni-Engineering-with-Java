package E_FunctionalProgramming;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class T04AddVAT {

    private static final double VAT_VALUE = 1.2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> values = Arrays.stream(scanner.nextLine().split(", ")).map(el -> Double.parseDouble(el)).collect(Collectors.toList());

        UnaryOperator<Double> addVat = value -> value*VAT_VALUE;
        System.out.println("Prices with VAT:");
        values.forEach(el -> {
            System.out.printf("%.2f%n", addVat.apply(el));
        });

    }
}
