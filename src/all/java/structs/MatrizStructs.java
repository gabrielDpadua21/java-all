package all.java.structs;

public class MatrizStructs {

    public static void main(String[] args) {

        final int ROWS = 2;
        final int COLS = 2;

        int [][] matriz01 = {
                {1, 2},
                {3, 4}
        };

        int [][] matriz02 = new int[ROWS][COLS];

        matriz02[0][0] = 1;
        matriz02[0][1] = 2;
        matriz02[1][0] = 3;
        matriz02[1][1] = 4;

        System.out.println("MATRIZ 01: ");

        for (int i = 0; i < matriz01.length; i++) {
            System.out.print("{ ");
            for(int j = 0; j < matriz01[i].length; j++) {
                int current = matriz01[i][j];
                System.out.print(current + " ");
            }
            System.out.print("}\n");
        }

        System.out.println("\nMATRIZ 02: ");

        for (int i = 0; i < matriz02.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz02[i].length; j++) {
                int current = matriz02[i][j];
                System.out.print(current + " ");
            }
            System.out.print("]\n");
        }
    }
}
