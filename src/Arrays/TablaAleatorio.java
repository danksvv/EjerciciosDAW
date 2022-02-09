package Arrays;

public class TablaAleatorio {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        cargarMatriz(matriz);
        System.out.println("\t=======================");
        System.out.println("\t\t\tMATRIZ");
        System.out.println("\t=======================");
        visualizarMatriz(matriz);
        System.out.println("\t=====================");
        System.out.println("\t\tSUMA FILAS");
        System.out.println("\t=====================");
        sumarFilas(matriz);
        System.out.println("\t=====================");
        System.out.println("\t\tSUMA COLUMNAS");
        System.out.println("\t=====================");
        sumarColumnas(matriz);
    }

    public static void cargarMatriz(int[][] m) {
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
    }

    public static void visualizarMatriz(int[][] m) {
        for (int[] a : m) {
            System.out.print("\t");
            for (int b : a)
                System.out.print(" " + b);
            System.out.println(" ");
        }

    }

    public static void sumarFilas(int[][] m) {
        int suma;
        for (int i=0; i<m.length; i++) {
            suma = 0;
            for (int j=0; j<m[i].length; j++) {
                suma += m[i][j];
            }
            System.out.println("La suma de la fila " + i + " es : " + suma);
        }
    }

    public static void sumarColumnas(int[][] m) {
        int suma;
        for (int i=0; i<m.length; i++) {
            suma=0;
            for(int j=0; j<m[i].length; j++) {
                suma += m[j][i];
            }
            System.out.println("La suma de la columna " + i + " es " + suma);
        }
    }
}

