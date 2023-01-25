package A_StacksAndQueues;

import java.util.PriorityQueue;
import java.util.Scanner;

public class T07MathPotato {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] players = scanner.nextLine().split("\\s+");
        int step = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> playersInGame = new PriorityQueue<>();

        for (String player: players) {
            playersInGame.offer(player);
        }

        int counter = 1;

        while(playersInGame.size()>1){
            for (int i = 1; i < step; i++) {
                playersInGame.offer(playersInGame.poll());
            }

            if (isPrime(counter)) {

                System.out.println("Prime " + playersInGame.peek());

            } else {
                System.out.println("Removed " + playersInGame.poll());
            }

            counter++;

        }

        System.out.println("Last is " + playersInGame.poll());


    }

    private static boolean isPrime(int counter) {

        if (counter==1){
            return false;
        }

        for (int i = 2; i < counter; i++) {
            if (counter%i == 0){
                return false;
            }
        }

        return true;

    }

}
