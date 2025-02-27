package all.java.java360.core.loops;

public class InnerOutFor {
    public static void main(String[] args) {

        inner:
        for (int i = 0; i < 10; i++) {
            outer:
            for (int j = 10; j > 0; j--) {
                if (j < 5) {
                    break inner;
                }
                System.out.println(i + " - " + j);
            }
        }

        System.out.println("END");

    }
}
