package all.java.java360.exercicies;

import java.util.Scanner;

public class TrafficFine {
    public static void main(String[] args) {
        int price = 10;
        int permittedSpeed = 100;
        double fine = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Speed Value: ");
        int speed = Integer.parseInt(sc.nextLine());

        if (permittedSpeed > 100) fine = (speed + (speed * 0.10) - permittedSpeed) * price;
        else fine = ((speed + 7) - permittedSpeed) * price;

        if (fine < 0) fine = 0;

        System.out.println("Fine to pay: " + fine + "$");
    }
}
