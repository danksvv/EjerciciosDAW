/*
 * Autor : Dany F. Vilchez Vásquez
 * Ciclo : 1º DAW
* Tarea 2 - Ejercicio 1: Haz una clase que calcule el factorial de un número,
* debe tener al menos un método estático a parte del Main().
* */
import java.util.Scanner;

public class Factorial {
    // Método que devuelve el valor a través de un operador ternario recursivo
    public static int calcularFactorial(int num) {
        return (num<1) ? 1 : num * calcularFactorial(num-1);
    }
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        int numero;
        // Controlamos que el usuario introduzca valores positivos
        do {
            System.out.print("Introduce el valor que deseas factorizar -> ");
            numero = keyboardIn.nextInt();
            if (numero<0)
                System.out.println("Introduce valores mayores que 0");
        } while (numero<0);
        keyboardIn.close();
        // Imprimimos el resultado llamando al método calcularFactorial()
        System.out.println("=================================");
        System.out.println("\tEl Factorial de " + numero + " es " + calcularFactorial(numero));
        System.out.println("=================================");
    }
}
