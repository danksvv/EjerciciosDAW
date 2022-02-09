package Museo;

public class Principal {

    public static void main(String[] args) {

        Autor a1 = new Autor("Leonardo da vinci", "Italia", 1000);
        Sala s1 = new Sala("Museo del Louvre", "Segunda planta");
        Obra ob1 = new Obra("La Gioconda", 4, 2000, a1, s1);

        System.out.println(a1);
        System.out.println(s1);
        System.out.println("Precio Inicial de salida: ");
        System.out.println(ob1);
        ob1.calcularPrecio(4, a1);
        System.out.println("Precio Final de salida: ");
        System.out.println(ob1);

    }
}

