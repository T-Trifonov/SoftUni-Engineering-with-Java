package C_SetsAndMapsAdvanced.LAB;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class T01UniqueUsernames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < num; i++) {
            String addUserName = scanner.nextLine();
            usernames.add(addUserName);
        }

        usernames.forEach(System.out::println);

    }

}
