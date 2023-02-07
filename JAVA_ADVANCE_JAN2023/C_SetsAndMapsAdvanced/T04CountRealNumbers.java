package C_SetsAndMapsAdvanced;

import java.util.*;

public class T04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> base = new LinkedHashMap<>();

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(el -> Double.parseDouble(el)).toArray();

        for (int i = 0; i < numbers.length; i++) {
            if (base.containsKey(numbers[i])) {
                base.put(numbers[i], base.get(numbers[i]) + 1);
            } else {
                base.put(numbers[i], 1);
            }
        }

        for (Double el : base.keySet()) {
            System.out.printf("%.1f -> %d%n", el, base.get(el));
        }

    }
}
