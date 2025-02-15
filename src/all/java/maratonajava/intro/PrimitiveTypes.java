package all.java.maratonajava.intro;

/**
 * Tipos primitivos
 * int, double, float, char, byte, short, long, boolean
 */
public class PrimitiveTypes {

    public static <T> String printType(T obj, Class<T> clazz) {
        return "Typeof is: " + clazz.getSimpleName();
    }

    public static void main(String[] args) {
        int age = 18;
        double size = 12.1;
        float price = 9;
        char letter = 87;
        byte bit = 127;
        short number = 2;
        long value = 10L;
        boolean isTrue = true;

        System.out.println(printType(age, Integer.class) + ", value: " + age);
        System.out.println(printType(size, Double.class) + ",  value: " + size);
        System.out.println(printType(price, Float.class) + ", value: " + price);
        System.out.println(printType(letter, Character.class) + ", value: " + letter);
        System.out.println(printType(bit, Byte.class) + ", value: " + bit);
        System.out.println(printType(number, Short.class) + ", value: " + number);
        System.out.println(printType(value, Long.class) + ", value: " + value);
        System.out.println(printType(isTrue, Boolean.class) + ", value: " + isTrue);
    }
}
