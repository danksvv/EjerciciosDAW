/*
 * Autor : Dany F. Vilchez Vásquez
 * Ciclo : 1º DAW
 * Tarea 2 - Ejercicio 3: Programa que valida si un nº es divisor de otro introducidos por teclado
 * */
import java.util.Scanner;

public class Divisores {
    // El método recibe dos String y valida si el uno es divisor de otro, tomando en cuenta
    // el principio de que un divisor de un nº es menor al número que lo divide.
    public static void calcularDivisores(String a, String b) {
        int valor1 = Integer.parseInt(a);
        int valor2 = Integer.parseInt(b);
        int resto;
        System.out.println("========================");
        if (valor1>valor2) {
                resto = valor1%valor2;
                if (resto == 0)
                    System.out.println("El " + valor2 + " es divisor de " + valor1);
                else
                    System.out.println("El " + valor2 + " no es divisor de " + valor1);
            }
            else if (valor2>valor1) {
                resto = valor2%valor1;
                if (resto == 0)
                    System.out.println("El " + valor1 + " es divisor de " + valor2);
                else
                    System.out.println("El " + valor1 + " no es divisor de " + valor2);
            }
            else
                System.out.println("El " + valor1 + " y " + valor2 + " es divisor de si mismo ");
        System.out.println("========================");
    }
    // Método que valida si cadena introducida es un digito
    public static boolean validarNumero(String cadena) {
        for (int i = 0; i<cadena.length(); i++){
            // Si el caracter no es un digito es false, se niega se hace true y entra en el if
            // y retorna false.
            if (!Character.isDigit(cadena.charAt(i)))
                return false;
        }
        // si nunca entre en el false. se da por válido y retorna un true
        return true;
    }
    public static void main(String[] args) {
     Scanner keyboardIn = new Scanner(System.in);
     String valor1, valor2;
     boolean sw1, sw2;
     // Controlamos que el usuario introduzca valores validos enteros
     do {
         System.out.print("Introduce un valor númerico : ");
         valor1 = keyboardIn.next();
         System.out.print("Introduce un valor númerico : ");
         valor2 = keyboardIn.next();
         // Recibe un valor booleano, si el nº es distinto de entero retorna un false, sino true
         sw1 = validarNumero(valor1);
         sw2 = validarNumero(valor2);
         if (!sw1 || !sw2) {
             System.out.println("===================================================");
             System.out.println("AVISO : Introduce valores numericos enteros validos");
             System.out.println("===================================================");
         }
     } while (!sw1 || !sw2);
     // Llmamamos al método calcular divisores pasando por parámetros los valores validos
     calcularDivisores(valor1, valor2);
     keyboardIn.close();
    }
}
