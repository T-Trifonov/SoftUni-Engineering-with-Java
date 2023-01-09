package J_MapsLambdaAndStreamAPI.LAB;

import java.util.*;

public class T01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        Map<Character, Integer> characterCount = new LinkedHashMap<>();

        for (Character symbol : text.toCharArray()) {

            if (!characterCount.containsKey(symbol)) {
                characterCount.put(symbol, 1);
            } else {
                int characterQty = characterCount.get(symbol);
                characterCount.put(symbol, characterQty + 1);
            }

        }

        characterCount.entrySet().forEach(symbol -> System.out.println(symbol.getKey() + " -> " + symbol.getValue()));

    }
}
