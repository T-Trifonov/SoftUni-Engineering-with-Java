package C_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class T06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumFirstArray = 0;
        boolean isEqual = true;
        int positionDiff = 0;

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                sumFirstArray += firstArray[i];
            } else {
                positionDiff = i;
                isEqual = false;
                break;
            }

        }

        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sumFirstArray);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", positionDiff);
        }
    }
}
