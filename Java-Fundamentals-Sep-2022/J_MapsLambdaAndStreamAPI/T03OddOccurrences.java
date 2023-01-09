package J_MapsLambdaAndStreamAPI;

import java.util.*;

public class T03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String checkWord : words) {
            checkWord = checkWord.toLowerCase();

            counts.putIfAbsent(checkWord, 0);
            counts.put(checkWord, counts.get(checkWord)+1);

        }

        List<String> output = new ArrayList<>();

        for (Map.Entry<String, Integer> outputString : counts.entrySet()) {
            if (!(outputString.getValue() % 2==0)){
                output.add(outputString.getKey());
            }
        }

        System.out.println(String.join(", ",output));

    }
}
