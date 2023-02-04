package C_SetsAndMapsAdvanced;

import java.util.*;

public class T02SoftUniParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> guest = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {

            guest.add(input);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("END")) {
            guest.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(guest.size());
        guest.forEach(el-> System.out.println(el));
    }
}
