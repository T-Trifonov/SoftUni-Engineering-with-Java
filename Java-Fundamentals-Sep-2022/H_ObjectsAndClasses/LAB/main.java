package H_ObjectsAndClasses.LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String dataInfo = scanner.nextLine();

            String name = dataInfo.split(" ")[0];
            int age = Integer.parseInt(dataInfo.split(" ")[1]);
            if (age >= 31) {
                peopleList.add(new Person(name, age));
            }

        }

        for (Person person : peopleList) {
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }
    }
}
