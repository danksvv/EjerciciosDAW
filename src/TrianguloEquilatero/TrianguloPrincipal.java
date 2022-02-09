package TrianguloEquilatero;

import java.util.Scanner;

public class TrianguloPrincipal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TrianguloEquilatero t1 = new TrianguloEquilatero();

        System.out.print("Introduce el lado de triangulo 1 : ");
        double lado1 = keyboard.nextDouble();
        t1.setLado(lado1);
        // Imprimir valores con los métodos get
        System.out.println("Altura " + t1.getAltura());
        System.out.println("Area " + t1.getArea());
        System.out.println("Perimetro " + t1.getPerimetro());
        // Método toString
        System.out.println(t1);

        System.out.print("Introduce el lado de triangulo 2 : ");
        double lado2 = keyboard.nextDouble();
        TrianguloEquilatero t2 = new TrianguloEquilatero(lado2);
        // Imprimir valores con los métodos get
        System.out.println("Altura -> " + t2.getAltura());
        System.out.println("Area -> " + t2.getArea());
        System.out.println("Perimetro -> " + t2.getPerimetro());
        // Método toString
        System.out.println(t2);

        // Cambiamos el lado del triangulo 1
        System.out.print("Introduce el lado de triangulo 1 : ");
        lado1 = keyboard.nextDouble();
        t1.setLado(lado1);
        // Imprimir valores con los métodos get
        System.out.println("Altura " + t1.getAltura());
        System.out.println("Area " + t1.getArea());
        System.out.println("Perimetro " + t1.getPerimetro());
        // Método toString
        System.out.println(t1);
    }
}
