package A_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T06HotPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] players = scanner.nextLine().split("\\s+");
        int step = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> playersInGame = new ArrayDeque<>();

        for (String player: players) {
            playersInGame.offer(player);
        }

        while(playersInGame.size()>1){
            for (int i = 1; i < step; i++) {
                playersInGame.offer(playersInGame.poll());
            }

            System.out.println("Removed "+ playersInGame.poll());

        }

        System.out.println("Last is " + playersInGame.poll());

    }
}
