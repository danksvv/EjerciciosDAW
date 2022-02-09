package Articulo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        System.out.print("Introduce el nombre del articulo : ");
        String nombre1 = keyboardIn.next();
        System.out.print("Introduce el color del articulo : ");
        String color1 = keyboardIn.next();
        System.out.print("Introduce el precio del articulo : ");
        double precio1 = keyboardIn.nextDouble();

        Articulo a1 = new Articulo(nombre1, color1, precio1);
        System.out.println();

        Articulo a2 = new Articulo();
        a2.setNombre("Camisa");
        a2.setColor("Blanco");
        a2.setPrecio(80);
        System.out.println();

        System.out.print("Introduce el nombre del articulo : ");
        String nombre3 = keyboardIn.next();
        System.out.print("Introduce el color del articulo : ");
        String color3 = keyboardIn.next();
        Articulo a3 = new Articulo(nombre3, color3);
        a3.setPrecio(50);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println();

        // Cambiar el nombre y color del articulo 1

        System.out.print("Introduce el nuevo nombre del articulo : ");
        nombre1 = keyboardIn.next();
        System.out.print("Introduce el nuevo color del articulo : ");
        color1 = keyboardIn.next();

        a1.setNombre(nombre1);
        a1.setColor(color1);

        System.out.println(a1);

        // Incrementar el precio del articulo 2

        System.out.print("Incremento de precio del articulo 2 : ");
        double incremento1 = keyboardIn.nextDouble();
        a2.incrementarPrecio(incremento1);
        a1.rebajarPrecio(10);

        keyboardIn.close();

        System.out.println(a1);
        System.out.println(a2);

    }
}
