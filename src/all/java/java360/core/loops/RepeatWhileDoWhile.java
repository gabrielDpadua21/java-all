package all.java.java360.core.loops;

/**
 * Loops While e Do While - Diferencia pelo inicio da execução
 */

public class RepeatWhileDoWhile {
    public static void main(String[] args) {

        int value = 0;

        while (value < 2) {
            System.out.println("While: " + value);
            value++;
        }

        do {
            System.out.println("Do While: " + value);
            value++;
        } while (value < 10);

    }
}
