package Arrays;

public class TablaSuma {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        cargarMatriz(matriz);
        visualizasMatriz(matriz);
        sumarColumnas(matriz);
        sumarFilas(matriz);
    }

    public static void cargarMatriz(int[][] m) {
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++)
                m[i][j] = j + i;
        }
    }

    public static void visualizasMatriz(int[][] m) {
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println(" ");
        }

    }

    public static void sumarColumnas(int[][] m) {
        int suma=0;
        for (int i=0; i<m.length; i++) {
            suma = 0;
            for(int j=0; j<m[i].length; j++) {
                suma += m[j][i];
            }
            System.out.println("COLUMNAS : " + i + " suma total => " + suma);

        }
    }
    public static void sumarFilas(int[][] m) {
        int suma=0;
        for (int i=0; i<m.length; i++) {
            suma = 0;
            for(int j=0; j<m[i].length; j++) {
                suma += m[i][j];
            }
            System.out.println("FILA : " + i + " suma total => " + suma);

        }
    }
}
