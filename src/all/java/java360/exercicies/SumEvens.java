package all.java.java360.exercicies;

public class SumEvens {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <101; i++) {
            sum += i % 2 == 0 ? i: 0;
        }

        System.out.println("Sum 100 even values: " + sum);

    }

}
