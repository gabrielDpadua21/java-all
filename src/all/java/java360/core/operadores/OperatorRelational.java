package all.java.java360.core.operadores;

/**
 * Operadores relacionais
 */
public class OperatorRelational {
    public static void main(String[] args) {

        int value1 = 10;
        int value2 = 10;
        int value3 = 20;

        System.out.println("== " + (value1 == value2));
        System.out.println("> " + (value3 > value1));
        System.out.println("< " + (value1 < value3));
        System.out.println(">= " + (value1 >= value2));
        System.out.println("<= " + (value1 <= value2));
        System.out.println("!= " + (value2 != value3));

    }
}
