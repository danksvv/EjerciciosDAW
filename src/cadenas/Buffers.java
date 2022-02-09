package cadenas;
import java.util.Scanner;

public class Buffers {
    // Las comparaciones entre dos StringBuffer con el metodo equals siempre dará false, porque la comparación
    // la realiza con la referencia del objeto, a diferente de la clase String que compara el contenido de la cadena
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a name ");
        StringBuffer name1 = new StringBuffer(sc.next());
        StringBuffer name2 = name1;
        StringBuffer name3 = new StringBuffer("hola");
        //Comparing the two objects
        boolean bool = name1.equals(name2);
        boolean bool1 = name1.equals(name3);
        System.out.println("Comparando la misma referencia");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(bool);
        System.out.println("Comparando dos referencias del objeto StringBuffer");
        System.out.println(name1);
        System.out.println(name3);
        System.out.println(bool1);
    }
}
