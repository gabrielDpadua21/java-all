package all.java.java360.core.operadores;

import java.util.Scanner;

/**
 * Conversor de temperatura de Calsius para Fahrenheint
 */
public class TemparatureConverter {
    public static void main(String[] args) {

        System.out.println("Temperature converter Fahrenheit to Celsius");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature in fahrenhenit");
        double tempFah = Double.parseDouble(scanner.nextLine());

        double tempCel = (tempFah - 32) / 9 * 5;

        System.out.println("Temperature in celsius: " + tempCel);

    }
}
