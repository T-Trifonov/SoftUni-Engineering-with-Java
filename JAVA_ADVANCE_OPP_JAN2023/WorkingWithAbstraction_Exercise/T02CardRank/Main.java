package T02CardRank;

import java.util.Scanner;

public class Main {

    enum CardSuits {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;

    }

    enum CardRank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        System.out.println(command + ":");
        if (command.equals("Card Suits")) {
            for (CardSuits current : CardSuits.values()) {
                System.out.println("Ordinal value: " + current.ordinal() + ";" + " Name value: " + current.name());
            }
        } else if (command.equals("Card Ranks")) {
            for (CardRank current : CardRank.values()) {
                System.out.println("Ordinal value: " + current.ordinal() + ";" + " Name value: " + current.name());
            }
        }
    }

}



