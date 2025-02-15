package all.java.java360.core.operadores;

import java.util.Scanner;

/**
 * Média das notas de um estudante
 */
public class StudentAvg {
    public static void main(String[] args) {

        double value1;
        double value2;
        double value3;

        System.out.println("Student avarage calculator: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Note 1: ");
        value1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Note 2: ");
        value2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Note 3: ");
        value3 = Double.parseDouble(scanner.nextLine());

        double avg = (value1 + value2 + value3) / 3;

        System.out.println("Avarage: " + avg);
    }
}
