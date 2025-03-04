package all.java.structs;

public class ArraysStructs {

    public static void main(String[] args) {

        final int SIZE = 5;

        int[] array01 = {1, 2, 3, 4, 5};

        int[] array02 = new int[SIZE];

        array02[0] = 1;
        array02[1] = 2;
        array02[2] = 3;
        array02[3] = 4;
        array02[4] = 5;

        System.out.println("LOOP FOR COMUM: array01");

        for (int i = 0; i < array01.length; i++) {
            for(int j = i + 1; j < array01.length; j++) {
                int x = array01[i];
                int y = array01[j];
                System.out.println("X: " + x);
                System.out.println("Y: " + y);
            }
        }

        System.out.println("LOOP FOR COMUM: array02");

        for (int i = 0; i < array02.length; i++) {
            for (int j = i + 1; j < array02.length; j++) {
                int x = array02[i];
                int y = array02[i];
                System.out.println("X: " + x + " - Y: " + y);
            }
        }

    }

}
