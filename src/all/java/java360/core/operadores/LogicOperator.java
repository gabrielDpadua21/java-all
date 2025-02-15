package all.java.java360.core.operadores;

/**
 * Operadores lógicos AND, OR, NOT E XOR
 */
public class LogicOperator {
    public static void main(String[] args) {

        boolean value1 = true;
        boolean value2 = false;

        System.out.println("&& - AND: " + (value1 && value2));
        System.out.println("|| - OR:  " + (value1 || value2));
        System.out.println("^ - XOR: " + (value1 ^ value2));
        System.out.println("! - NOT: " + (!value1));

        // ordem de prioridade !, && e ||
        System.out.println("prioridade: " + (!value1 && value2 || value2));

    }
}
