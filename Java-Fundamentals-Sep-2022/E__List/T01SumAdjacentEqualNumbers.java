package E__List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01SumAdjacentEqualNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double currentValue = 0;
        double nextValue = 0;

        List<Double> listNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < listNumbers.size() - 1; i++) {
            currentValue = listNumbers.get(i);
            nextValue = listNumbers.get(i + 1);

            if (currentValue==nextValue){
                listNumbers.set(i,(currentValue+nextValue));
                listNumbers.remove(i+1);
                i=-1;
            }

        }

        for (double output: listNumbers) {

            DecimalFormat formatValue = new DecimalFormat("#.##");
            String formattedValue = formatValue.format(output);
            System.out.printf("%s ", formattedValue);
        }

    }
}
