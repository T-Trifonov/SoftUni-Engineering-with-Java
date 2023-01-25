package C_SetsAndMapsAdvanced.LAB;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Map<String, String> base = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.endsWith(".uk") && !email.endsWith(".us") && !email.endsWith(".com")) {
                base.put(name, email);
            }

            name = scanner.nextLine();
        }

        base.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
