package C_SetsAndMapsAdvanced.LAB;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class T02SetsOfElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] setLength = scanner.nextLine().split("\\s+");

        int setNumbersFirst = Integer.parseInt(setLength[0]);
        int setNumbersSecond = Integer.parseInt(setLength[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <=setNumbersFirst ; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            firstSet.add(element);
        }

        for (int i = 1; i <=setNumbersSecond ; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            secondSet.add(element);
        }

        firstSet.retainAll(secondSet);

        firstSet.forEach(el -> System.out.print(el + " "));

    }
}
