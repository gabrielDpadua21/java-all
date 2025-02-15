package all.java.nelioalves.basic;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("type your name: ");
        String name = sc.next();

        System.out.printf("""
                Hello, %s
                %n""", name);

        System.out.println("type three letters");
        char letter01 = sc.next().charAt(0);
        char letter02 = sc.next().charAt(0);
        char letter03 = sc.next().charAt(0);

        System.out.printf("Letters: %s, %s, %s%n", letter01, letter02, letter03);
    }
}
