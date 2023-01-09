package E__List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02GaussTrick {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < (numberList.size() / 2); i++) {
            int firstValue = numberList.get(i);
            int lastValue = numberList.get((numberList.size() - 1) - i);


                System.out.print((firstValue + lastValue)+" ");

        }

        if ((numberList.size())%2!=0){
            System.out.println(numberList.get((numberList.size() / 2)));
        }

    }
}
