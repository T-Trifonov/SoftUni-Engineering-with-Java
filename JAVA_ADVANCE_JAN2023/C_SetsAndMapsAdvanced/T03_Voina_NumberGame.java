package C_SetsAndMapsAdvanced;

import java.util.*;


public class T03_Voina_NumberGame {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeck = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondDeck = new LinkedHashSet<>();

        String[] firstDeckInput = scanner.nextLine().split("\\s+");
        String[] secondDeckInput = scanner.nextLine().split("\\s+");


        for (String el : firstDeckInput) {
            firstDeck.add(Integer.parseInt(el));
        }

        for (String el : secondDeckInput) {
            secondDeck.add(Integer.parseInt(el));
        }


        for (int i = 1; i <= 50; i++) {
            if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
                break;
            }

            int firstNumber = firstDeck.iterator().next();
            firstDeck.remove(firstNumber);

            int secondNumber = secondDeck.iterator().next();
            secondDeck.remove(secondNumber);

            if (firstNumber > secondNumber) {

                firstDeck.add(firstNumber);
                firstDeck.add(secondNumber);

            } else if (firstNumber < secondNumber) {

                secondDeck.add(firstNumber);
                secondDeck.add(secondNumber);

            }

        }

        if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else if (firstDeck.size() < secondDeck.size()) {
            System.out.println("Second player win!");
        } else if (firstDeck.size() == secondDeck.size()) {
            System.out.println("Draw!");
        }

    }

}
