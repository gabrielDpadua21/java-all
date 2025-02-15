package all.java.nelioalves.basic;

public class Casting {
    public static void main(String[] args) {

        int value1, value2;
        double result, resultCast;

        value1 = 5;
        value2 = 2;

        result = value1 / value2;
        resultCast = (double) value1 / value2;

        System.out.println(result);
        System.out.println(resultCast);

    }
}
