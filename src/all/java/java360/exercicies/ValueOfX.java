package all.java.java360.exercicies;

import java.util.Scanner;

public class ValueOfX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write X: ");
        int valueX = Integer.parseInt(sc.nextLine());

        if (valueX % 2 == 0) valueX += 5;
        else valueX *= 2;

        System.out.println("Value Of X is: " + valueX);

    }
}
