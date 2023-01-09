package E_List.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            String command = scanner.nextLine();

            while(!command.equals("end")){

                if (command.contains("Delete")){
                    int elementValue=Integer.parseInt(command.split(" ")[1]);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i)==elementValue){
                            list.remove(i);
                            i=i-1;
                        }
                    }
                    
                }

                if (command.contains("Insert")){
                    int elementValue=Integer.parseInt(command.split(" ")[1]);
                    int elementPosition=Integer.parseInt(command.split(" ")[2]);

                    list.add(elementPosition, elementValue);

                }

                command = scanner.nextLine();

            }

        for (int output: list) {
            System.out.print(output+" ");
        }

    }
}
