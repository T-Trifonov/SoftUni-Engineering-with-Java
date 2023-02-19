package E_FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;

public class T06FindEvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] interval = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> numbers = new ArrayList<>();

        for (int i = interval[0]; i <= interval[1]; i++) {
            numbers.add(i);
        }

        String condition = scanner.nextLine();

        numbers.forEach(el -> {
                    if (condition.equals("odd")) {
                        if (el % 2 != 0) {
                            System.out.print(el + " ");
                        }
                    } else if (condition.equals("even")) {
                        if (el % 2 == 0) {
                            System.out.print(el + " ");
                        }
                    }
                }
        );

    }
}
