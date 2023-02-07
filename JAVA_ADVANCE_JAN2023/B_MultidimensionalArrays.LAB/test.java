package B_MultidimensionalArrays.LAB;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {


        int row = 5;
        int cols = 5;

        int count = 1;

        int[][] matrix = new int[row][];

        List<List<Integer>> matrixA = new ArrayList<>();

        List<Integer> values = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);


        matrixA.add(values);

        values.set(3, null);

        matrixA.add(values);

        System.out.println();





//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = Integer.toString(count);
//                count++;
//            }
//
//
//        }
//
//
//        matrix[4][4]=null;
//        matrix[2][2]=null;
//
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println();
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//        }
//
//
//        System.out.println();


    }
}