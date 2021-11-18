/*
 * Autor : Dany F. Vilchez Vásquez
 * Ciclo : 1º DAW
 * Tarea 2 - Ejercicio 2(Version 2): Escribe una clase llamado CambioMoneda
 * en esta versión la clase Scanner está definida como un atributo de la clase
 * */
import java.util.Scanner;

public class CambioMonedaV2 {
    // Declaramos un objeto Scanner como atributo de la clase
    static Scanner keyboardIn = new Scanner(System.in);

    // Calculamos el cambio a dolares, pidiendo al usuario la cantidad en euros
    public static double calcularDolares(){
        double euros;
        System.out.print("Introduce la cantidad de euros -> ");
        euros = keyboardIn.nextDouble();
        keyboardIn.close();
        return euros*1.24650;
    }
    // Calculamos el cambio a libras, pidiendo al usuario la cantidad en euros
    public static double calcularLibras(){
        double euros;
        System.out.print("Introduce la cantidad de euros -> ");
        euros = keyboardIn.nextDouble();
        keyboardIn.close();
        return euros*0.79550;
    }
    // Calculamos el cambio a yenes, pidiendo al usuario la cantidad en euros
    public static double calcularYenes(){
        double euros;
        System.out.print("Introduce la cantidad de euros -> ");
        euros = keyboardIn.nextDouble();
        keyboardIn.close();
        return euros*144.959;
    }
    public static void main(String[] args) {
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
            case "dolares" -> resultado = calcularDolares();
            case "libras" -> resultado = calcularLibras();
            case "yenes" -> resultado = calcularYenes();
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
