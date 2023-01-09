package J_MapsLambdaAndStreamAPI.LAB;

import java.util.*;

public class T04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInputs = Integer.parseInt(scanner.nextLine());

        Map<String, String> register = new LinkedHashMap<>();

        for (int i = 1; i <= numInputs; i++) {

            String[] command = scanner.nextLine().split("\\s+");

            if (command[0].equals("register")) {

                if (register.containsKey(command[1])) {

                    System.out.printf("ERROR: already registered with plate number %s%n", register.get(command[1]));


                } else {

                    register.put(command[1], command[2]);
                    System.out.printf("%s registered %s successfully%n", command[1], command[2]);
                }

            } else if (command[0].equals("unregister")) {

                if (register.containsKey(command[1])) {

                    register.remove(command[1]);
                    System.out.printf("%s unregistered successfully%n", command[1]);

                } else {

                    System.out.printf("ERROR: user %s not found%n", command[1]);

                }

            }


        }

        for (Map.Entry<String, String> output : register.entrySet()) {
            System.out.printf("%s => %s%n", output.getKey(), output.getValue());
        }

    }
}
