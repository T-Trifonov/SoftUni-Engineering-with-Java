package J_MapsLambdaAndStreamAPI.LAB;

import java.util.*;

public class T02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resource = new LinkedHashMap<>();

        int counter = 1;

        String input = scanner.nextLine();
        String currentResource = input;

        while (!input.equals("stop")) {

            if (!(counter % 2 == 0)) {

                if (!(resource.containsKey(input))) {
                    resource.put(input, 0);
                    currentResource = input;
                } else {
                    currentResource = input;
                }

            } else {

                int value = Integer.parseInt(input);
                int currentValues = resource.get(currentResource);
                value = value+currentValues;

                resource.put(currentResource, value);

            }

            counter++;
            input = scanner.nextLine();

        }

        for (Map.Entry<String, Integer> output : resource.entrySet()) {
            System.out.printf("%s -> %d%n",output.getKey(),output.getValue());
        }

    }
}
