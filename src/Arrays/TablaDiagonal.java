package Arrays;

public class TablaDiagonal {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        rellenarMatriz(matriz);
        visualizarMatriz(matriz);
    }

    public static void rellenarMatriz(int[][] m) {
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++) {
                if (i==j)
                    m[i][j] = 1;
                else
                    m[i][j] = 0;
            }
        }
    }

    public static void visualizarMatriz(int[][] m) {
        for (int[] ints : m) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println(" ");
        }
    }
}
