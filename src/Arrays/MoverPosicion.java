package Arrays;
import java.util.Arrays;

public class MoverPosicion {
    public static void main(String[] args) {
        int[] elementos = new int[30];
        cargarElementos(elementos);
        visualizarElementos(elementos);
        int elementos2[] = elementos.clone();
        //cambiarPosicion(elementos);
        System.out.println(" final 1 ");
        cambiarPosicion2(elementos2);
        System.out.println(" final 2 ");
        visualizarElementos(elementos);
    }

    public static void cargarElementos(int[] e) {
        for(int i=0; i<e.length; i++) {
            e[i] = (int)Math.floor(Math.random()*101);
        }
    }

    public static void visualizarElementos(int[] e) {
        for (int i:
                e) {
            System.out.print(" " + i);
        }
    }

    public static void cambiarPosicion(int[] e) {
        int primero = e[0];
        int i;
        for(i=0; i<e.length-1; i++)
            e[i] = e[i+1];
        e[i] = primero;
    }
    public static void cambiarPosicion2(int[] e) {
        int ultimo = e[e.length-1];
        int i;
        for(i=e.length-1; i>e[0]; i--)
            e[i] = e[i+1];
        e[0] = ultimo;
    }
}
