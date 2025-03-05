package all.java.java360.exercicies;

import java.util.Scanner;

public class AverageWithInput {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int notes = 1;
        double sumGrades = 0.0;

        while(true) {
            System.out.print("Digite a nota: " + notes + " :  ");
            String line = scanner.nextLine();
            if (line.isEmpty()) break;
            sumGrades += Double.parseDouble(line);
            notes++;
        }

        double avg = (sumGrades / (notes - 1));

        System.out.println("AVG: " + avg);

    }

}
