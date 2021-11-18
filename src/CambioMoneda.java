/*
 * Autor : Dany F. Vilchez Vásquez
 * Ciclo : 1º DAW
 * Tarea 2 - Ejercicio 2(Version 1): Escribe una clase llamado CambioMoneda
 * En esta versión la clase Scanner es pasada por parámetro para usarla en cada método
 * */
import java.util.Scanner;

public class CambioMoneda {
    // Calculamos el cambio a dolares, pidiendo al usuario la cantidad en euros
    public static double calcularDolares(Scanner entrada){
        double euros;
        System.out.print("Introduce la cantidad de euros -> ");
        euros = entrada.nextDouble();
        entrada.close();
        return euros*1.24650;
    }
    // Calculamos el cambio a libras, pidiendo al usuario la cantidad en euros
    public static double calcularLibras(Scanner entrada){
        double euros;
        System.out.print("Introduce la cantidad de euros -> ");
        euros = entrada.nextDouble();
        entrada.close();
        return euros*0.79550;
    }
    // Calculamos el cambio a yenes, pidiendo al usuario la cantidad en euros
    public static double calcularYenes(Scanner entrada){
        double euros;
        System.out.print("Introduce la cantidad de euros -> ");
        euros = entrada.nextDouble();
        entrada.close();
        return euros*144.959;
    }
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        String tipo_moneda;
        double resultado;
        System.out.println("===============================");
        System.out.println("\tCONVERSOR DE DIVISAS");
        System.out.println("===============================");
        // Controlamos que el usuario introduzca la divisa correcta avisando si introduce un nombre incorrecto
        do {
            System.out.println("1) Dolares \n2) Libras \n3) Yenes");
            System.out.print("Introduce el nombre de la divisa que deseas cambiar : ");
            tipo_moneda = keyboardIn.next();
            if (!tipo_moneda.equalsIgnoreCase("dolares") && !tipo_moneda.equalsIgnoreCase("libras") && !tipo_moneda.equalsIgnoreCase("yenes")) {
                System.out.println("Por favor introduce el nombre correcto de la divisa que deseas cambiar");
            }
        } while (!tipo_moneda.equalsIgnoreCase("dolares") && !tipo_moneda.equalsIgnoreCase("libras") && !tipo_moneda.equalsIgnoreCase("yenes"));
        // Según el tipo de moneda, llamaremos a cada método para que nos devuelva el cambio
        switch (tipo_moneda.toLowerCase()) {
            case "dolares" -> resultado = calcularDolares(keyboardIn);
            case "libras" -> resultado = calcularLibras(keyboardIn);
            case "yenes" -> resultado = calcularYenes(keyboardIn);
            default -> resultado = 0;
        }
        keyboardIn.close();
        // Imprimimos el tipo de moneda elegida y el resultado del cambio
        System.out.println("====================================================");
        System.out.print("\t\tEl cambio a " + tipo_moneda + " = ");
        System.out.printf("%.2f", resultado);
        System.out.println("\n====================================================");
    }
}
