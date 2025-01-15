package all.java.java360.conditionals;

/**
 * Estruturas de seleção com IF/ELSE
 */
public class Conditional {
    public static void main(String[] args) {
        int hour = 12;

        if (hour >= 0 && hour < 12) System.out.println("Good morning!");
        else if (hour >= 12 && hour < 18) System.out.println("Good Eveening");
        else System.out.println("Good Night");
    }
}
