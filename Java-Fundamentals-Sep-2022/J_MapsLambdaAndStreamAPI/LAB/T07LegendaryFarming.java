package J_MapsLambdaAndStreamAPI.LAB;

import java.util.*;

public class T07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isWin = true;
        Map<String, Integer> register = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+");

        while (isWin) {

            for (int i = 1; i < input.length; i = i + 2) {

                String item = input[i].toLowerCase();
                int valueItem = Integer.parseInt(input[i - 1]);

                if (register.containsKey(item)) {

                    int currentValueItem = register.get(item);
                    register.put(item, currentValueItem + valueItem);

                } else {

                    register.putIfAbsent(item, valueItem);

                }

                if (item.equals("shards") && register.get(item) >= 250) {

                    System.out.println("Shadowmourne obtained!");
                    int currentValueItem = register.get("shards");
                    register.put("shards", currentValueItem - 250);
                    isWin = false;
                    break;
                } else if (item.equals("fragments") && register.get(item) >= 250) {

                    System.out.println("Valanyr obtained!");
                    int currentValueItem = register.get("fragments");
                    register.put("fragments", currentValueItem - 250);
                    isWin = false;
                    break;
                } else if (item.equals("motes") && register.get(item) >= 250) {

                    System.out.println("Dragonwrath obtained!");
                    int currentValueItem = register.get("motes");
                    register.put("motes", currentValueItem - 250);
                    isWin = false;
                    break;
                }


            }

            if (!isWin){
                break;
            }

            input = scanner.nextLine().split("\\s+");

        }

        if (register.get("shards") != null) {
            System.out.printf("%s: %d%n", "shards", register.get("shards"));
        } else {
            System.out.println("shards: 0");
        }
        if (register.get("fragments") != null) {
            System.out.printf("%s: %d%n", "fragments", register.get("fragments"));
        } else {
            System.out.println("fragments: 0");
        }
        if (register.get("motes") != null) {
            System.out.printf("%s: %d%n", "motes", register.get("motes"));
        } else {
            System.out.println("motes: 0");
        }

        for (Map.Entry<String, Integer> outputOther : register.entrySet()) {

            if (!(outputOther.getKey().equals("shards") || outputOther.getKey().equals("fragments") || outputOther.getKey().equals("motes"))) {
                System.out.printf("%s: %d%n", outputOther.getKey(), outputOther.getValue());
            }

        }


    }
}
