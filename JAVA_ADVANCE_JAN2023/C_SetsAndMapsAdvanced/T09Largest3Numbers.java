package C_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class T09Largest3Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((n1,n2)-> n2.compareTo(n1))
                .collect(Collectors.toList());


        int printNumber = Math.min(sorted.size(), 3);

        for (int i = 0; i < printNumber; i++) {
            System.out.print(sorted.get(i)+" ");
        }

    }
}
