
import java.util.*;

public class T01Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] malesInput = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> males = new ArrayDeque<>();

        for (String current : malesInput) {
            males.push(Integer.parseInt(current));
        }

        String[] femalesInput = scanner.nextLine().split("\\s+");
        Deque<Integer> females = new ArrayDeque<>();
        for (int i = 0; i < femalesInput.length; i++) {
            females.offer(Integer.parseInt(femalesInput[i]));
        }

        int matchCounter = 0;

        while (!males.isEmpty() && !females.isEmpty()) {

            int tempMale = males.peek();
            int tempFemale = females.peek();

            boolean isZero = false;

            if (tempMale <= 0) {
                males.pop();
                isZero = true;
            }

            if (tempFemale <= 0) {
                females.poll();
                continue;
            }

            if(isZero){
                continue;
            }


            if (tempMale % 25 == 0) {
                males.pop();
                continue;
            }

            if (tempFemale % 25 == 0) {
                females.poll();
                continue;
            }

            if (tempMale == tempFemale) {
                matchCounter += 1;
                males.pop();
                females.poll();
            } else {
                females.poll();
                if (tempMale - 2 > 0) {
                    tempMale = tempMale - 2;
                    males.pop();
                    males.push(tempMale);
                } else {
                    males.pop();
                }
            }

        }

        System.out.printf("Matches: %d%n", matchCounter);

        if (males.isEmpty() && females.isEmpty()){
            System.out.println("Males left: none");
            System.out.println("Females left: none");
        } else if (males.isEmpty()) {
            System.out.println("Males left: none");
            System.out.print("Females left: ");
            while (!females.isEmpty()) {
                System.out.print(females.poll());
                if (!females.isEmpty()) {
                    System.out.print(", ");
                }

            }
            System.out.println();
        } else {
            System.out.print("Males left: ");
            while (!males.isEmpty()) {
                System.out.print(males.pop());
                if (!males.isEmpty()) {
                    System.out.print(", ");
                }

            }
            System.out.println();

            System.out.println("Females left: none");

        }

    }
}
