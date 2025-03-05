package all.java.java360.exercicies;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Digite um numero para calcular a tabuada: ");
        int value = Integer.parseInt(scanner.nextLine());

        System.out.println("TABUADA DE " + value + " : ");
        System.out.println("==================================");
        for (int i = 0; i <= 10; i++) {
            System.out.println(value + " X " + i + " = " + (value * i));
        }
        System.out.println("==================================");

    }

}
