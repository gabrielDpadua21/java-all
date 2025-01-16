package all.java.java360.conditionals;

/**
 * Condicional switch
 * *
 * So pode utilizar byte, short, char ou int
 * \n
 * Ex: com switch expression: a partir do java 14
 */
public class Switch {
    public static void main(String[] args) {
        int month = 2;
        int days = switch (month) {
            case 1, 3, 4 -> 31;
            case 2, 6, 8 -> 28;
            default -> {
                System.out.println("Més invalido");
                yield 0;
            }
        };

        System.out.println("days: " + days);
    }
}
