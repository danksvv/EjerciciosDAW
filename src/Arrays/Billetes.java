package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Billetes {
    public static void main(String[] args) {

        double[] billetes = {500, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
        int[] veces = new int[14];
        Arrays.fill(veces, 0);

        desglosarBilletes(billetes, veces);
        System.out.println("\t=====================");
        System.out.println("\tBILLETES DESGLOSADOS");
        System.out.println("\t=====================");
        visualizarBilletes(billetes, veces);
    }

    // Cargamos los billetes y monedas en el array
    public static void desglosarBilletes(double[] b, int[] v) {
        Scanner keyboardIn = new Scanner(System.in);
        double cantidad;
        System.out.print("Introduce la cantidad a desglosar => ");
        cantidad = keyboardIn.nextDouble();

        for(int i=0; i<b.length; i++) {
            while(cantidad >= b[i]){
                    cantidad -= b[i];
                    // Importante redondear para evitar desbordamiento de decimales
                    cantidad = Math.round(cantidad*100.0)/100.0;
                    v[i]++;
            }
        }
        keyboardIn.close();
    }

    // Visualizar billetes y monedas
    public static void visualizarBilletes(double[] b, int[] v) {
        for(int i=0; i<v.length; i++) {
            if(v[i] != 0){
                if(b[i] >= 5)
                    System.out.println("\t- Billete: " + b[i] + "\t x \t" + v[i]);
                else
                    System.out.println("\t- Monedas: " + b[i] + "\t x \t" + v[i]);
            }

        }

    }
}
