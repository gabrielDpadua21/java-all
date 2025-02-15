package all.java.maratonajava.intro;

/**
 * Casting de tipos
 */
public class Casting {
    public static void main(String[] args) {

        int value = 10;

        // casting implicito ...
        var value02 = 12.0;

        // casting explicito ...
        System.out.println((double) value);
        System.out.println((float) value);
        System.out.println((long) value);
        System.out.println((int) value02);
    }
}
