import java.util.*;

public class T03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> binaryOutput = new ArrayDeque<>();

        int inputDecimal = Integer.parseInt(scanner.nextLine());

        if (inputDecimal<0){
            System.out.println("Cannot handle negative integers");
            return;
        } else if (inputDecimal==0){
            System.out.println(0);
            return;
        }

        while (inputDecimal!=0){
            binaryOutput.push(inputDecimal%2);
            inputDecimal /=2;
        }

        while (!binaryOutput.isEmpty()){
            System.out.print(binaryOutput.pop());
        }

    }
}
