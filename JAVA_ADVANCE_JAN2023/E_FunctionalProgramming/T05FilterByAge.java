package E_FunctionalProgramming;

import java.util.*;

public class T05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> base = new LinkedHashMap<>();

        for (int i = 0; i < numInput; i++) {
            String[] input = scanner.nextLine().split(",\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            base.put(name, age);

        }

        String outputCondition = scanner.nextLine();
        int ageCondition = Integer.parseInt(scanner.nextLine());
        String outputPrint = scanner.nextLine();

        if (outputCondition.equals("older")) {

            printOlder(base, ageCondition, outputPrint);

        } else if (outputCondition.equals("younger")) {

            printYounger(base, ageCondition, outputPrint);

        }

    }


    //--//

    private static void printYounger(Map<String, Integer> base, int ageCondition, String outputPrint) {

        for (Map.Entry<String, Integer> current : base.entrySet()) {
            if (current.getValue()<=ageCondition){
                if (outputPrint.equals("name age")){
                    System.out.printf("%s - %d%n", current.getKey(), current.getValue());
                } else if (outputPrint.equals("name")) {
                    System.out.printf("%s%n", current.getKey());
                } else if (outputPrint.equals("age")){
                    System.out.printf("%d%n", current.getValue());
                }
            }
        }

    }

    //--//

    private static void printOlder(Map<String, Integer> base, int ageCondition, String outputPrint) {

        for (Map.Entry<String, Integer> current : base.entrySet()) {
            if (current.getValue()>=ageCondition){
                if (outputPrint.equals("name age")){
                    System.out.printf("%s - %d%n", current.getKey(), current.getValue());
                } else if (outputPrint.equals("name")) {
                    System.out.printf("%s%n", current.getKey());
                } else if (outputPrint.equals("age")){
                    System.out.printf("%d%n", current.getValue());
                }
            }
        }

    }
}
