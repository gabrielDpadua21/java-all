package all.java.maratonajava.exercicies;

import java.util.Scanner;

public class FirstPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("type your name: ");
        String name = sc.nextLine();

        System.out.println("type your address: ");
        String address = sc.nextLine();

        System.out.println("type the salary: ");
        Double salary = Double.parseDouble(sc.nextLine());

        System.out.println("type the date");
        String date = sc.nextLine();

        String report = """
                I %s, living in %s, confirm to receive the salary of %s, in %s
                """.formatted(name, address, salary, date);

        System.out.println(report);

    }
}
