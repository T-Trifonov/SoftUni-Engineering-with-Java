package A_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T05PrinterQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputPrint = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!inputPrint.equals("print")) {

            if (inputPrint.equals("cancel") && queue.isEmpty()){
                System.out.println("Printer is on standby");
            }

            if (inputPrint.equals("cancel") && !queue.isEmpty()){
                System.out.println("Canceled " + queue.poll());
            }

            if (!inputPrint.equals("cancel")){
                queue.offer(inputPrint);
            }

            inputPrint = scanner.nextLine();

        }

        while(!queue.isEmpty()){
            System.out.println(queue.pollFirst());
        }


    }

}
