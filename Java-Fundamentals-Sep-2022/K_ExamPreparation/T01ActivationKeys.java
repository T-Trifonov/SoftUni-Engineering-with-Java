package K_ExamPreparation;

import java.util.*;

public class T01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String[] command = scanner.nextLine().split(">>>");

        while (!command[0].equals("Generate")){

            if (command[0].equals("Contains")){

                String substring = command[1];

                if (activationKey.contains(substring)){
                    System.out.printf("%s contains %s%n", activationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (command[0].equals("Flip")){

                int startIndex = Integer.parseInt(command[2]);
                int endIndex = Integer.parseInt(command[3]);

                if (command[1].equals("Upper")){

                    activationKey = activationKey.replace((activationKey.substring(startIndex,endIndex)), (activationKey.substring(startIndex,endIndex)).toUpperCase());

                } else if (command[1].equals("Lower")){

                    activationKey = activationKey.replace((activationKey.substring(startIndex,endIndex)), (activationKey.substring(startIndex,endIndex)).toLowerCase());

                }

                System.out.println(activationKey);

            } else if (command[0].equals("Slice")){

                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);

                activationKey = activationKey.replace(activationKey.substring(startIndex,endIndex), "");

                System.out.println(activationKey);

            }

            command = scanner.nextLine().split(">>>");

        }

        System.out.printf("Your activation key is: %s", activationKey);

    }

}
