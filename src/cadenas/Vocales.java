package cadenas;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {

        Scanner keyboardIn = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena = keyboardIn.nextLine();
            String cadena2="";
            char cad=' ';

            for (int i = 0; i < cadena.length(); i++) {
                cad = cadena.charAt(i);

                if ((cad == 97) || (cad == 111) || (cad == 101) || (cad == 105) || (cad == 117))
                    cad++;

                else
                    cadena2 += cad;

            }
            System.out.println("cadena: "+ cadena);
            System.out.println("cadena solo vocales: "+ cadena2);
    }
}
