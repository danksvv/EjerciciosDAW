package Arrays;

import java.util.Scanner;

public class Cifras {
    public static void main(String[] args) {
        int[] cifras = new int[6];
        cargarCifras(cifras);
        coincidirCifras(cifras);
        visualizarCifras(cifras);
    }

    public static void cargarCifras(int[] c) {
        for(int i=0; i<c.length; i++) {
            c[i] = (int)Math.floor(Math.random()*10);
        }
    }

    public static void coincidirCifras(int[] c) {
        Scanner keyboardIn = new Scanner(System.in);
        System.out.print("Introduce una cifra entre 0-9 : ");
        int cifra = keyboardIn.nextInt();
        int veces = 0;
        for (int j : c) {
            if (j == cifra)
                veces++;
        }
        if(veces!=0)
            System.out.println("La cifra " + cifra + " coincide y se repite " + veces + " vez(ces)");
        else
            System.out.println("La cifra no coincide");

    }

    public static void visualizarCifras(int[] c) {

        for(int i : c) {
            System.out.print(" " + i);
        }

    }
}
