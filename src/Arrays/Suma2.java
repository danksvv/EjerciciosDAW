// 2.	Hacer un programa que trabaje con un array de 10 elementos y llame a métodos que hagan lo siguiente:
//	Cargar el array desde teclado con enteros
//	Visualizar las posiciones de los elementos con contenido menor de 17
//	Calcular la suma de los elementos del array (el resultado se visualizará en el programa principal).
//	Visualizar el total de  ceros, positivos y negativos que hay en las posiciones pares del array
//	Hallar el elemento mayor del array y cuántas veces se repite.
package Arrays;

import java.util.Scanner;

public class Suma2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Scanner keyboardIn = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("\t\tCARGAR ELEMENTOS DEL  ARRAY");
        System.out.println("========================================");
        cargarArray(keyboardIn, arr1);
        System.out.println("========================================");
        System.out.println("POSICION DEL ELEMENTO CON CONTENIDO < 17");
        System.out.println("========================================");
        valoresMenores17(arr1);
        System.out.println("========================================");
        System.out.println("\tSUMA DE LOS ELEMENTOS DEL ARRAY");
        System.out.println("========================================");
        suma(arr1);
        System.out.println("========================================");
        System.out.println("\tTOTAL POSITIVOS, NEGATIVOS Y CEROS");
        System.out.println("========================================");
        totales(arr1);
        System.out.println("========================================");
        System.out.println("\tELEMENTO MAYOR Y VECES REPETIDAS");
        System.out.println("========================================");
        elementoMayor(arr1);
    }

    //	Cargar el array desde teclado con enteros
    public static void cargarArray(Scanner keyboardIn, int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print("Introduce el " + (i + 1) + " elemento del array : ");
            arr[i] = keyboardIn.nextInt();
        }
    }

    //	Visualizar las posiciones de los elementos con contenido menor de 17
    public static void valoresMenores17(int[] arr1) {
        for (int i=0; i<arr1.length; i++) {
            if(arr1[i]<17)
                System.out.println("Posicion : " + i + " del elemento " + arr1[i]);
        }
    }
    public static void suma(int[] arr1) {
        int suma=0;
        for (int j : arr1) suma += j;
        System.out.println("La suma de todos los elementos : " + suma);
    }

    public static void totales(int[] arr1) {
        int positivos, negativos, ceros;
        positivos = negativos = ceros = 0;
        for (int i = 1; i < arr1.length; i += 2) {
            if (arr1[i] > 0)
                positivos++;
            else if (arr1[i] < 0)
                negativos++;
            else
                ceros++;
        }
        System.out.println("Total de ceros : " + ceros);
        System.out.println("Total de positivos : " + positivos);
        System.out.println("Total de negativos : " + negativos);
    }

    //	Hallar el elemento mayor del array y cuántas veces se repite.
    public static void elementoMayor(int[] arr1){
        int veces = 0;
        int mayor = arr1[0];
        for(int i=1; i<arr1.length; i++) {
            if (arr1[i] >= mayor)
                mayor = arr1[i];
        }

        for(int num : arr1) {
            if (mayor == num)
                veces++;
        }
        System.out.println("El mayor es " + mayor + " y se ha repetido " + veces);
    }
}
