// Escribir un programa que lea la hora en notación de 24 horas y que imprima en notación de 12; por ejemplo, si la entrada es 13:45,
// la salida será 1:45 pm. El programa debe solici- tar al usuario que introduzca exactamente cinco caracteres para especificar una hora; por ejemplo,
// las 9 en punto se debe introducir así: 09:00.

import java.util.Scanner;

public class Reloj {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        System.out.println("Introduce la hora en formato 24 horas (00:00) : ");
        String h = keyboardIn.next();
        String [] partes = h.split(":");
        int hora = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        switch (hora) {
            case 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 -> {
                if(minutos >= 0 && minutos <= 9)
                    System.out.println("La hora es : " + (hora - 12) + ":0" + minutos + " pm");
                else
                    System.out.println("La hora es : " + (hora - 12) + ":" + minutos + " pm");
            }
            default -> {
                if(minutos >= 0 && minutos <= 9)
                    System.out.println("La hora es : " + hora + ":0" + minutos + " am");
                else
                    System.out.println("La hora es : " + (hora - 12) + ":" + minutos + " pm");
            }
        }
        keyboardIn.close();
    }
}
