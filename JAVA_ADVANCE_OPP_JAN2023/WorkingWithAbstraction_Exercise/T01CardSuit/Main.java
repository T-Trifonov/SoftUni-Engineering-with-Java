package T01CardSuit;

public class Main {

    enum CardSuits {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;
    }

    public static void main(String[] args) {
        System.out.println("Card Suits:");
        CardSuits[] cardSuits = CardSuits.values();
        for (CardSuits value :  cardSuits) {
            System.out.println("Ordinal value: "+ value.ordinal()+ ";" + " Name value: " + value.name());
        }

    }

}
