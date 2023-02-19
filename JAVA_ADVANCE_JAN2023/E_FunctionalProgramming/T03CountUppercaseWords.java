package E_FunctionalProgramming;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class T03CountUppercaseWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //The following example shows how to use Predicate

        Predicate<String> isStartWithUpperCase = el -> Character.isUpperCase(el.charAt(0));
        Consumer<String> printElement = el -> System.out.println(el);
        //Supplier

        List<String> wordsCollection = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(word -> isStartWithUpperCase.test(word))
                .collect(Collectors.toList());

        System.out.println(wordsCollection.size());
        wordsCollection.forEach(w -> printElement.accept(w));

    }

}
