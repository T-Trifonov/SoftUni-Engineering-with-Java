package J_MapsLambdaAndStreamAPI;

import java.text.DecimalFormat;
import  java.util.*;

public class T01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> count = new TreeMap<>();

        for (double value : numbers) {
            if (!count.containsKey(value)){
                count.put(value, 1);
            } else {
                count.put(value, count.get(value)+1);
            }
        }

        for (Map.Entry<Double, Integer> output : count.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %s%n", df.format(output.getKey()), df.format(output.getValue()));
        }


    }
}
