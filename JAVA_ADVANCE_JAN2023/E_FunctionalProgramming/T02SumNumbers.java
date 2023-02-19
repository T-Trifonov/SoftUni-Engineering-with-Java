package E_FunctionalProgramming;

import java.util.*;
import java.util.function.Function;

public class T02SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(el -> Integer.parseInt(el)).toArray();

        Function<int[], Integer> count = el -> nums.length;

        System.out.printf("Count = %d%n", count.apply(nums));

        Function<int[], Integer> sum = el -> Arrays.stream(nums).sum();

        System.out.printf("Sum = %d%n", sum.apply(nums));


//        long count = Arrays.stream(nums).count();
//        System.out.printf("Count = %d%n", count);
//
//        long sum = Arrays.stream(nums).sum();
//
//        System.out.printf("Sum = %d%n", sum);

    }

}
