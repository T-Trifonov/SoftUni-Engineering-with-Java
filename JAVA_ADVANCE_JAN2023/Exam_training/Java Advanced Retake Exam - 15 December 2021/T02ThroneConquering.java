
import java.util.*;

public class T02ThroneConquering {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[rows][];

        for (int i = 0; i < rows; i++) {
            String colsInput = scanner.nextLine();
            char[] rowInput = colsInput.toCharArray();
            matrix[i]=rowInput;
        }

        int rowP = 0;
        int colP=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]=='P'){
                    rowP=i;
                    colP=j;
                    break;
                }
            }
        }

        String[] commandLine = scanner.nextLine().split("\\s+");

        boolean isWin=false;

        while (commandLine.length>0){

            //int test = matrix.length;
            //int test1 = matrix[0].length;

            String commandMove = commandLine[0];
            int rowE = Integer.parseInt(commandLine[1]);
            int colE = Integer.parseInt(commandLine[2]);

            matrix[rowE][colE]='S';
            matrix[rowP][colP]='-';

            //up

            if (commandMove.equals("up") && rowP-1>=0){
                rowP-=1;
                energy-=1;
            } else if (commandMove.equals("down") && rowP+1<=matrix.length-1){
                rowP+=1;
                energy-=1;
            } else if (commandMove.equals("left") && colP-1>=0){
                colP-=1;
                energy-=1;
            } else if (commandMove.equals("right") && colP+1<=matrix[0].length-1){
                colP+=1;
                energy-=1;
            } else {
                energy-=1;
            }

            if (energy<=0){
                matrix[rowP][colP]='X';
                break;
            }

            if (matrix[rowP][colP]=='H'){
                isWin=true;
                matrix[rowP][colP]='-';
                break;
            } else if (matrix[rowP][colP]=='S'){
                energy-=2;
            }

            if (energy<=0){
                matrix[rowP][colP]='X';
                break;
            }

            matrix[rowP][colP]='P';

            commandLine = scanner.nextLine().split("\\s+");
        }

        if (isWin){
            System.out.printf("Paris has successfully abducted Helen! Energy left: %d", energy);
        }else {
            System.out.printf("Paris died at %d;%d.", rowP, colP);
        }

        printMatrix(matrix);

    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }
}
