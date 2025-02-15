package all.java.java360.core.operadores;

/**
 * Problema de casting na divisão
 */
public class OperatorAritmeticDivision {
    public static void main(String[] args) {

        int value1 = 4;
        int value2 = 2;

        // resultado do tipo mais abrangente
        int value3 = value2 / value1;

        // cast implicito
        double value4 = value2 / value1;

        // cast explicito -> melhor resultado para double
        double value5 = (double) value2 / value1;

        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);

    }
}
