package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Notas {
    public static void main(String[] args) {

        int[] totales = new int[11];
        Arrays.fill(totales, 0);
        System.out.println("\t||| CARGAR NOTAS |||\n");
        cargarNotas(totales);
        System.out.println("\n\t||| VISUALIZAR NOTAS |||\n");
        visualizarNotas(totales);

    }

    public static void cargarNotas(int[] totales) {

        int nota;
        Scanner keyboardIn = new Scanner(System.in);
        do{
            System.out.print("Introduce la nota => ");
            nota = keyboardIn.nextInt();

            switch (nota) {
                case 0 -> totales[0]++;
                case 1 -> totales[1]++;
                case 2 -> totales[2]++;
                case 3 -> totales[3]++;
                case 4 -> totales[4]++;
                case 5 -> totales[5]++;
                case 6 -> totales[6]++;
                case 7 -> totales[7]++;
                case 8 -> totales[8]++;
                case 9 -> totales[9]++;
                case 10 -> totales[10]++;

            }
        }while(nota>=0 && nota<=10);
    }

    public static void visualizarNotas(int[] totales) {

        for(int i= 0; i<totales.length; i++)
            System.out.println("La nota " + i + " se repite " + totales[i] + " veces");

    }
}
