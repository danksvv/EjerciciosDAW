package Arrays;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] suma = new int[3];
       Scanner keyboardIn = new Scanner(System.in);
        System.out.println("CARGAR ELEMENTOS DEL PRIMER ARRAY");
        for(int i=0; i<arr1.length; i++)
            System.out.println("SUMA : " + arr1[i]);
        cargarArray(keyboardIn, arr1);
        System.out.println("CARGAR ELEMENTOS DEL SEGUNDO ARRAY");
        cargarArray(keyboardIn, arr2);
        sumaArrays(arr1, arr2, suma);
        imprimirArrays(suma);
        for(int i=0; i<arr1.length; i++)
            System.out.println("SUMA : " + arr1[i]);
        keyboardIn.close();
    }
    public static void cargarArray(Scanner leer, int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print("Introduce el " + (i + 1) + " elemento del array : ");
            arr[i] = leer.nextInt();
        }
    }

    public static void sumaArrays(int[] a, int[] b, int[] suma){
        for(int i=0; i<suma.length; i++)
            suma[i] = a[i] + b[i];

    }

    public static void imprimirArrays(int[] suma){
        for(int num : suma)
            System.out.println(num + " ");
    }

}
