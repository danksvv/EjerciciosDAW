/*
 * Autor : Dany F. Vilchez Vásquez
 * Ciclo : 1º DAW
 * Tarea 2 - Ejercicio 5: Programa que evalua una notación prefija
 * pasando un párametro de tipo string y dos de tipo double, que nos devuelve
 * un resultado de tipo doble.
 * */
import java.util.Scanner;

public class NotacionPrefija {
    public static double calcularOperacion(String s, double oper1, double oper2) {
        // Retornamos el resultado de cada operación, en cada caso
        return switch (s) {
            case "+" -> oper1+oper2;
            case "-" -> oper1-oper2;
            case "*" -> oper1*oper2;
            case "/" -> oper1/oper2;
            case "%" -> oper1%oper2;
            case "^" -> Math.pow(oper1, oper2);
            default -> 0.0;
        };
    }
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        String signo;
        double operador1, operador2;

        // Imprimimos un menú con las operaciones que puede realizar nuestro programa
        // Solicitamos al usuario que introduzca en el orden indicado, y recibimos los tres valores
        System.out.println("===========================================");
        System.out.println("\t\t\tNOTACION PREFIJA");
        System.out.println("===========================================\n");
        System.out.println("""
                1.\t+: suma los dos operandos.\s
                2.\t-: resta los operandos.\s
                3.\t*: multiplica los operandos.\s
                4.\t/: divide los operandos, este debe dar un resultado con decimales \s
                5.\t^: 1º operando como base y 2º como exponente.\s
                6.\t%: módulo, resto de la división entre operando1 y operando2. \s
                """);
        System.out.print("Introduce el signo (+ - * / % ^) y dos operados separados por espacio (ejem : + 2 2) -> ");
        signo = keyboardIn.next();
        operador1 = keyboardIn.nextDouble();
        operador2 = keyboardIn.nextDouble();
        keyboardIn.close();
        System.out.println("=======================================");
        // Antes de enviar al método para que nos devuela el resultado, controlamos que en la division y el resto
        // el operador2 no sea 0, ya que la división es indeterminada, si el operador2 no lo es en ambos casos
        // se pasara al método para que nos devuelva la operacion solicitada
        if (signo.equalsIgnoreCase("/") || signo.equalsIgnoreCase("%")){
            if (operador2==0)
                System.out.println("\tLa división entre 0 es infinita");
            else
                System.out.println("\tRESULTADO : " + operador1 + " " + signo + " " + operador2 + " = " + calcularOperacion(signo, operador1, operador2));
        }
        else
            System.out.println("\tRESULTADO : " + operador1 + " " + signo + " " + operador2 + " = " + calcularOperacion(signo, operador1, operador2));

        System.out.println("=======================================");
    }
}
