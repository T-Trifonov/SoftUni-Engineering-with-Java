package J_MapsLambdaAndStreamAPI.LAB;

import java.util.*;

public class T08CompanyUsers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> register = new LinkedHashMap<>();

        //{companyName} -> {employeeId}

        String[] input = scanner.nextLine().split("\\s+->\\s+");

        while (!(input[0].equals("End"))){

            String companyName = input[0];
            String employeeID = input[1];

            register.putIfAbsent(companyName, new ArrayList<>());

            if (register.containsKey(companyName)){
                if (!(register.get(companyName).contains(employeeID))) {
                    register.get(companyName).add(employeeID);
                }
            }



            input = scanner.nextLine().split("\\s+->\\s+");
        }

        for (Map.Entry<String, List<String>> output : register.entrySet()) {

            System.out.printf("%s%n",output.getKey());

            for (int i = 0; i < output.getValue().size(); i++) {
                System.out.printf("-- %s%n", output.getValue().get(i));
            }

        }

    }
}
