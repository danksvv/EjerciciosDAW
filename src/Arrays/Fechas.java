package Arrays;

import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        int[][] dias;
        dias = new int[12][];
        dias[0] = new int[31];
        dias[1] = new int[28];
        dias[2] = new int[31];
        dias[3] = new int[30];
        dias[4] = new int[31];
        dias[5] = new int[30];
        dias[6] = new int[31];
        dias[7] = new int[31];
        dias[8] = new int[30];
        dias[9] = new int[31];
        dias[10] = new int[30];
        dias[11] = new int[31];

        String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        cargarDias(dias);
        limiteFechas(dias, meses);
    }

    public static void cargarDias(int[][] d) {
        int valor = 1;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = valor;
                valor++;
            }
            valor = 1;
        }
        for (int[] ints : d) {
            for (int anInt : ints) System.out.print(" " + anInt);
            System.out.println(" ");

        }

    }

    public static void limiteFechas(int[][] d, String[] m) {
        Scanner keyboardIn = new Scanner(System.in);
        int dia1, dia2, mes1, mes2;
        System.out.print("Introduce la fecha inicial dd mm => ");
        dia1 = keyboardIn.nextInt();
        mes1 = keyboardIn.nextInt();
        System.out.print("Introduce la fecha final dd mm => ");
        dia2 = keyboardIn.nextInt();
        mes2 = keyboardIn.nextInt();
        // el mes empieza en 1 en el calendario gregoriano, pero en el array se cuenta desde el 0
        int n1, n2;
        mes1 -= 1;
        n1 = mes1;
        // la diferencia entre el mes2 y la longitud del array es la cantidad que tenemos que restar al recorrer el array
        //int n2;
        n2 = mes2-1;
        // Invertimos y guardamos la diferencia entre el array total menos el introducido
        mes2 = d.length - mes2;
        for(int i=mes1; i<d.length-mes2; i++) {
            if(n1 == n2) {
                for(int j=dia1-1; j<dia2; j++)
                    System.out.println(d[i][j] + " de " + m[i]);
            }
            else {
                for(int j=0; j<d[i].length; j++) {
                    if(n1 == i && d[i][j] >= dia1)
                        System.out.println(d[i][j] + " de " + m[i]);
                    else if(n1 < i && n2 > i)
                        System.out.println(d[i][j] + " de " + m[i]);
                    else if(n2 == i && d[i][j] <= dia2)
                        System.out.println(d[i][j] + " de " + m[i]);
                }
            }
        }

    }

}
