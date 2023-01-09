package J_MapsLambdaAndStreamAPI;

import java.util.*;

public class T02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInputs = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < numInputs; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);

        }

        for (Map.Entry<String, ArrayList<String>> output : words.entrySet()) {
            System.out.printf("%s - %s%n", output.getKey(), String.join(", ", output.getValue()));
        }

    }

}
