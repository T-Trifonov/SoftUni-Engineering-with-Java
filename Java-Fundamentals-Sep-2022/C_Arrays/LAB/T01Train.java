package C_Arrays.LAB;

import java.util.Scanner;

public class T01Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] array = new int[wagons];
        int sumPeople=0;

        for (int i = 1; i <=wagons ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            array[i-1] = people;
        }

        for (int arr : array) {
            System.out.print(arr+" ");
            sumPeople+=arr;
        }

        System.out.println();
        System.out.println(sumPeople);

    }
}
