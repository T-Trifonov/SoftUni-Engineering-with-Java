package E__List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03MergingLists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> outputList = new ArrayList<>();

        int listOneSize = listOne.size();
        int listTwoSize = listTwo.size();

        int minLength = 0;
        int maxLength = 0;

        boolean isLong=true;

        if (listOneSize > listTwoSize) {
            minLength = listTwoSize;
            maxLength = listOneSize;
        } else {
            minLength = listOneSize;
            maxLength = listTwoSize;
            isLong = false;
        }
        for (int i = 0; i < minLength; i++) {
            int valueFirstList = listOne.get(i);
            int valueSecondList = listTwo.get(i);

            outputList.add(valueFirstList);
            outputList.add(valueSecondList);

        }

        for (int i = minLength; i <= maxLength-1; i++) {
            if (isLong){
                int valueFirstList = listOne.get(i);
                outputList.add(valueFirstList);
            } else {
                int valueSecondList = listTwo.get(i);
                outputList.add(valueSecondList);
            }
        }

        for (int output:outputList) {
            System.out.print(output+" ");
        }

    }
}
