package T05JediGalaxy;

public class Process {

    public static boolean isInside(int[][] matrix, int rowE, int colE) {
        return rowE >= 0 && rowE < matrix.length && colE >= 0 && colE < matrix[0].length;
    }

    public static void destroetCell(int[][] matrix, int rowE, int colE) {
        if (isInside(matrix, rowE, colE)) {
            matrix[rowE][colE] = 0;
        }
    }

    public static long getPoints(int[][] matrix, int rowP, int colP, long points) {
        if (isInside(matrix, rowP, colP)) {
            points = matrix[rowP][colP];
        }
        return points;
    }

}
