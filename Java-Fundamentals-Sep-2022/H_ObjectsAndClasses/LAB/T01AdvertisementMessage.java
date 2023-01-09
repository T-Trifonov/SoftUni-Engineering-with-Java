package H_ObjectsAndClasses.LAB;


import java.util.*;

public class T01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrases = new String[]{"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int num = Integer.parseInt(scanner.nextLine());

        Random rnd = new Random();

        String phrasesA = phrases[rnd.nextInt(phrases.length)];

        for (int i = 0; i < num; i++) {
            System.out.printf("%s %s %s - %s%n", phrases[rnd.nextInt(phrases.length-1)], events[rnd.nextInt(events.length-1)],
                    authors[rnd.nextInt(authors.length-1)], cities[rnd.nextInt(cities.length-1)]);
        }

    }
}
