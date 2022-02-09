package Arrays;

public class TablasTraspuesta {
    public static void main(String[] args) {
        int fila = 5;
        int columna = 3;
        int[][] matriz1;
        int[][] matriz2;

        matriz1 = cargarMatriz(fila, columna);
        visualizarMatriz(matriz1);
        matriz2 = cargarMatriz(columna, fila);
        visualizarMatriz(matriz2);
    }

    public static int[][] cargarMatriz(int f, int c) {
        int [][] matriz = new int[f][c];
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        return matriz;
    }

    public static void visualizarMatriz(int[][] m) {
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println(" ");
        }
    }
}
