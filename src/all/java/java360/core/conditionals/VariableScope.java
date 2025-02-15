package all.java.java360.core.conditionals;

/**
 * Area de atuação das variaveis
 * value2 acessivel somente dentro da condicional
 */
public class VariableScope {
    public static void main(String[] args) throws Exception {
        int value = 10;

        if(value == 10) {
            int value2 = 20;
        } else {
            int value2 = 30;
        }

        int value2 = 40;

        System.out.println(value2);

    }
}
