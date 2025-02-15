package all.java.java360.core.operadores;

/**
 * Operadores de atribuição em java e incremento e decremento pre e pós
 */
public class AttrOperators {
    public static void main(String[] args) {

        System.out.println("Attr Operators");

        int value1 = 10;
        int value2 = 20;
        int value3 = value2;
        value3 += value1;
        int value4 = value2;
        value4 -= value1;
        int value5 = value1;
        value5 *= value2;
        int value6 = value1;
        value6 /= value2;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);


        // increment and decrement

        System.out.println(value1++);
        System.out.println(value2--);
        System.out.println(++value1);
        System.out.println(--value2);
    }
}
