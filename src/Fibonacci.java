/*
 * Autor : Dany F. Vilchez Vásquez
 * Ciclo : 1º DAW
 * Tarea 2 - Ejercicio 4: Programa que devuelva el anterior nº al introducido
 * de la Serie Fibonacci
 * */
import java.util.Scanner;

public class Fibonacci {
    public static int devolverAnterior(int num) {
        Scanner keyboardIn = new Scanner(System.in);
        int elementos, c;
        int a=0;
        int b=1;
        // Solicitamos al usuario un rango de nº de la Serie Fibonacci
        System.out.print("¿Cual es el Rango de elementos de la Serie Fibonacci en el que deseas buscar?: ");
        elementos = keyboardIn.nextInt();
        keyboardIn.close();
        // En cada iteración sumanos los dos anteriores y vamos asignando nuevos valores
        // en cada iteración a "a" y "b" para sumar el siguiente usando la variable "c" como comodín
        for (int i=0; i<elementos; i++){
            c = a+b;
            if (num==b)
                 return a;
            a = b;
            b = c;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        int numero_anterior;
        int numero;
        // Pedimos al usuario el nº de la Serie Fibonacci para buscar su anterior
        System.out.print("Introduce el elemento a buscar en la Serie Fibonacci para encontrar el nº anterior: ");
        numero = keyboardIn.nextInt();
        // llamamos al método que nos devuelve el nº anterior
        numero_anterior = devolverAnterior(numero);
        keyboardIn.close();
        System.out.println("==================================================================");
        if (numero_anterior == 0)
            System.out.println("El nº " + numero + " no tiene un nº anteior en la Serie Fibonacci");
        else {
            if (numero_anterior == numero)
                System.out.println("el nº " + numero + " no pertenece a la Serie Fibonacci ");
            else
                System.out.println("El nº " + numero + " pertenece a la Serie Fibonacci y el anterior es  el nº " + numero_anterior);
        }
        System.out.println("==================================================================");
    }
}
