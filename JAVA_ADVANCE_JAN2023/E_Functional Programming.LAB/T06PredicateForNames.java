import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class T06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> checkValidLength = name -> name.length() <= num;

        Arrays.stream(names).filter(checkValidLength).forEach(el -> System.out.println(el));

    }
}
