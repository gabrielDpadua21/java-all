package all.java.nelioalves.basic;

import java.util.Locale;

public class Hello {
    public static void main(String[] args) {
        float seconds = 1.22121f;

        System.out.println("Hello Java");

        System.out.printf("hour is %.4f seconds\n", seconds);

        Locale.setDefault(Locale.US);

        System.out.printf("hour is %.3f", seconds);
    }
}
