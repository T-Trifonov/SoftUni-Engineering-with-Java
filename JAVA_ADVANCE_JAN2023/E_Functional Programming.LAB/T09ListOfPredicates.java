import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class T09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(el -> Integer.parseInt(el)).collect(Collectors.toList());

        BiFunction<Integer, List<Integer>, Boolean> isDivisible = ((number, list) -> {

            for (int numInList : list) {
                if (number % numInList != 0) {
                    return false;
                }
            }

            return true;

        });

        for (int i = 1; i <= n; i++) {
            if (isDivisible.apply(i, numbers)) {
                System.out.print(i + " ");
            }
        }

    }
}
