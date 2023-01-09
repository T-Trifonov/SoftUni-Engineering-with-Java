package C_Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T10TreasureHunt_ME {
    public static void main(String[] args) {

        boolean isStop = false;
        boolean isAvailable = false;
        String temp = "";
        int countSymbols = 0;
        int countWords = 0;

        Scanner scanner = new Scanner(System.in);

        String[] threasureCheast = scanner.nextLine().split("\\|");

        while (!isStop) {


            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("Yohoho!")) {
                isStop = true;

            } else {


                if (command[0].equals("Loot")) {

                    for (int i = 1; i < command.length; i++) {
                        isAvailable = false;
                        for (int j = 0; j < threasureCheast.length; j++) {

                            if (command[i].equals(threasureCheast[j])) {
                                isAvailable = true;
                                break;
                            }

                        }

                        if (!isAvailable) {
                            temp = command[i] + " " + String.join(" ", threasureCheast);
                            threasureCheast = temp.split(" ");
                        }

                    }


                } else if (command[0].equals("Drop")) {

                    int dropPosition = Integer.parseInt(command[1]);

                    if (dropPosition < threasureCheast.length - 1 && dropPosition >= 0) {

                        String tempItem = threasureCheast[dropPosition];

                        for (int i = dropPosition; i < threasureCheast.length - 1; i++) {
                            threasureCheast[i] = threasureCheast[i + 1];
                        }

                        threasureCheast[threasureCheast.length - 1] = tempItem;
                    }

                } else if (command[0].equals("Steal")) {

                    int numLastItem = Integer.parseInt(command[1]);

                    for (int i = threasureCheast.length - numLastItem; i < threasureCheast.length; i++) {
                        if (i == threasureCheast.length - 1) {
                            System.out.print(threasureCheast[i]);
                            System.out.println();
                        } else {
                            System.out.print(threasureCheast[i] + ", ");
                        }

                    }

                    String[] arrayTemp = new String[threasureCheast.length - numLastItem];

                    for (int i = 0; i < threasureCheast.length - numLastItem; i++) {

                        arrayTemp[i] = threasureCheast[i];

                    }

                    threasureCheast = arrayTemp;

                }
            }

        }


        for (int i = 0; i < threasureCheast.length; i++) {
            String symbolCount = threasureCheast[i];
            countSymbols += symbolCount.length();

        }

        countWords = threasureCheast.length;

        if (countSymbols > 0) {

            System.out.printf("Average treasure gain: %.2f pirate credits.", countSymbols * 1.0 / countWords);

        } else {

            System.out.println("Failed treasure hunt.");

        }


    }

}




