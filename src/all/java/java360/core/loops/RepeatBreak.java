package all.java.java360.core.loops;

public class RepeatBreak {
    public static void main(String[] args) {

        int i = 10;

        while (i < 200) {
            if (i > 100) break;
            System.out.println(i);
            i*=2;
        }

        System.out.println("END");

    }
}
