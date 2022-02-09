package cadenas;

import java.util.Scanner;

public class Cadena2 {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        String cadena;
        char caracter;
        System.out.println("Introduce una cadena de texto : ");
        cadena = keyboardIn.nextLine();
        System.out.println("Introduce el caracter a buscar : ");
        caracter = keyboardIn.next().charAt(0);

        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) == caracter) {
                System.out.println("Posicion " + i);
            }
        }

    }
}
