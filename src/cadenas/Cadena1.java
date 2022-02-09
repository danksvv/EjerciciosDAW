package cadenas;

import java.util.Scanner;

public class Cadena1 {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = keyboardIn.nextLine();

        int tamano = cadena.length();

        int mitad = tamano/2;

        System.out.println("El tamano es : " + tamano);
        System.out.println("El caracter de la mitad es : " + cadena.charAt(mitad));
        System.out.println("La primera parte es : " + cadena.substring(0, mitad));
        System.out.println("La segunda parte es : " + cadena.substring(mitad, tamano));
        keyboardIn.close();
    }
}
