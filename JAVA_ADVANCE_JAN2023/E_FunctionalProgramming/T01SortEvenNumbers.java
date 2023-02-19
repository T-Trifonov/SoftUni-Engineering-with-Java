package E_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class T01SortEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(el -> Integer.parseInt(el)).toArray();

        var isFirst = new AtomicBoolean(false);
        Arrays.stream(numbers).forEach(el ->
        {
            if (el % 2 == 0 && !isFirst.get()) {
                System.out.print(el);
                isFirst.set(true);

            } else if (el % 2 == 0) {
                System.out.print(", " + el);
            }
        });

        System.out.println();

        Arrays.stream(numbers).sorted().forEach(el ->
        {
            if (el % 2 == 0 && isFirst.get()) {
                System.out.print(el);
                isFirst.set(false);

            } else if (el % 2 == 0) {
                System.out.print(", " + el);
            }
        });


    }
}
