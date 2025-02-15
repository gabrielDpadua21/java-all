package all.java.java360.core.base;

/**
 * Casting implicito e explicito
 * Ordem:
 * byte > short > int > long > float > double
 *
 */
public class Casting {
    public static void main(String[] args) {

        // casting implicito
        int value = 200;
        double newValue = value;
        long longValue = 500;

        System.out.println("Casting implicito");
        System.out.println(value);
        System.out.println(newValue);
        System.out.println(longValue);

        // casting explicito
        double doubleValue = 240.56;
        int otherValue = (int) doubleValue;
        long bigLongValue = 3000000000L;
        int smallIntValue = (int) bigLongValue;

        System.out.println("Casting explicito");
        System.out.println(doubleValue);
        System.out.println(otherValue);
        System.out.println(bigLongValue);
        System.out.println(smallIntValue);
    }
}
