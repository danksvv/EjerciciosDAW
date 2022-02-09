package Posicion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Posicion p1 = new Posicion(2, 3);
        System.out.println(p1.getXY());
        //p1.opuestoXY();
        System.out.println(p1.getXY());
        Scanner keyboardIn = new Scanner(System.in);
        System.out.print("Introduce el valor a incrementar : ");
        int incremento = keyboardIn.nextInt();
        p1.incXY(incremento);
        System.out.println(p1.getXY());
        Posicion p2 = new Posicion(5,1);
        System.out.println(p1.recta(p2));
    }
}
