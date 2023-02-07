package C_SetsAndMapsAdvanced;

import java.text.DecimalFormat;
import java.util.*;

public class T08AcademyGraduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> base = new TreeMap<>();

        int numStudent = Integer.parseInt(scanner.nextLine());

        while (numStudent-- > 0) {

            String student = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(el -> Double.parseDouble(el)).toArray();

            base.putIfAbsent(student, new ArrayList<>());

            for (double grade : grades) {
                base.get(student).add(grade);
            }

        }

        String formatPattern = "#.###############";
        //4.351249999999999  /15
        DecimalFormat df = new DecimalFormat(formatPattern);

        for (String studentOut : base.keySet()) {

            double sumGrade = 0;
            for (int i = 0; i < base.get(studentOut).size(); i++) {
                sumGrade += base.get(studentOut).get(i);
            }

            System.out.printf("%s is graduated with %s%n", studentOut, df.format(sumGrade / base.get(studentOut).size()));

        }
    }
}

