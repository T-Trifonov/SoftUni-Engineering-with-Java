package M_FinalExam;

import java.util.*;

public class T03Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> dictionary = new LinkedHashMap<>();


        String[] wordInformation = scanner.nextLine().split("\\s+[|]\\s+");
        String[] testWord = scanner.nextLine().split("\\s+[|]\\s+");
        String command = scanner.nextLine();

        for (int i = 0; i < wordInformation.length; i++) {

            String[] wordDefinition = wordInformation[i].split(": ");

            dictionary.putIfAbsent(wordDefinition[0], new ArrayList<>());

            if (dictionary.containsKey(wordDefinition[0])) {

                dictionary.get(wordDefinition[0]).add(wordDefinition[1]);

            }

        }



        if (command.equals("Test")) {

            for (int i = 0; i < testWord.length; i++) {

                String currentWord = testWord[i];

                if (dictionary.containsKey(currentWord)) {

                    for (Map.Entry<String, List<String>> outputInfo : dictionary.entrySet()) {
                        if (outputInfo.getKey().equals(currentWord)) {
                            System.out.printf("%s:%n", outputInfo.getKey());
                            for (int j = 0; j < outputInfo.getValue().size(); j++) {
                                System.out.printf(" -%s%n", outputInfo.getValue().get(j));
                            }


                        }
                    }

                }

            }

        } else if (command.equals("Hand Over")){

            for (Map.Entry<String, List<String>> output : dictionary.entrySet()) {

                System.out.printf("%s ", output.getKey());

            }

        }

    }
}
