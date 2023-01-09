package C_Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class T09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEnd = false;

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (!isEnd){


            String input = scanner.nextLine();


            if (input.equals("end")){
                isEnd=true;
            } else {

                if (input.contains("swap")){

                    int indexA = Integer.parseInt(input.split(" ")[1]);
                    int indexB = Integer.parseInt(input.split(" ")[2]);

                    int indexAValue = array[indexA];
                    int indexBValue = array[indexB];

                    array[indexA] = indexBValue;
                    array[indexB] = indexAValue;

                } else if (input.contains("multiply")){

                    int indexA = Integer.parseInt(input.split(" ")[1]);
                    int indexB = Integer.parseInt(input.split(" ")[2]);

                    int indexAValue = array[indexA];
                    int indexBValue = array[indexB];

                    array[indexA] = indexAValue*indexBValue;



                } else if (input.contains("decrease")){

                    for (int i = 0; i < array.length; i++) {
                        array[i]=array[i]-1;
                    }

                }

            }

        }

        for (int i = 0; i < array.length; i++) {
            if (i== array.length-1) {
                System.out.print(array[array.length-1]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

    }
}
