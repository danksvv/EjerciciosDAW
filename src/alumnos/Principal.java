package alumnos;

import java.util.Random;
//import java.util.Arrays;


public class Principal {
    public static String[] asignaturas = new String[] {"Programación", "Base de datos", "Entornos", "Lenguaje de Marcas", "Sistemas Operativos"};
    public static String[] alumnos = new String[] {"Pedro", "David", "Maria", "Ana", "Sandra"};
    public static void main(String[] args) {
        Alumno[] listaAlumnos = new Alumno[5];
        Nota[][] notaAlumnos = new Nota[5][5];
        Nota[][] notaAlumnos2 = new Nota[5][5];

        cargarNotas(notaAlumnos2);
        rellenarAlumnos(listaAlumnos, notaAlumnos2);
        visualizarNotas(listaAlumnos);
        maximaNotaAlumno(listaAlumnos, notaAlumnos2);

        for (Nota[] a : notaAlumnos2) {
            for (Nota b : a)
                System.out.print(" " + b + " ");
            System.out.println(" ");
        }
    }

    public static void cargarNotas(Nota[][] n) {
        Random r = new Random();
        for (int i=0; i<n.length; i++) {
            for (int j=0; j<n[i].length; j++) {
                int nota = r.nextInt(9) + 1;
                n[i][j] = new Nota(asignaturas[j], nota);
            }
        }
    }
    public static void rellenarAlumnos(Alumno[] a, Nota[][] n) {
        for (int i=0; i< a.length; i++) {
            a[i] = new Alumno(alumnos[i], getNota2(n, i));
        }
    }

    public static Nota[] getNota(Nota[][] n, int cont) {
        Random r = new Random();
        Nota[] notas = new Nota[n.length];
        System.arraycopy(n[cont], 0, notas, 0, notas.length);
        for (int i=0; i<asignaturas.length; i++) {
            int nota = r.nextInt(9)+1;
            notas[i] = new Nota(asignaturas[i], nota);
        }
        return notas;
    }

    public static Nota[] getNota2(Nota[][] n, int cont) {
        Nota[] notas = new Nota[n.length];
        System.arraycopy(n[cont], 0, notas, 0, notas.length);
        for (int i=0; i<asignaturas.length; i++) {
            notas[i] = new Nota(asignaturas[i], n[cont][i].getNotaAsignatura());
        }
        return notas;
    }

    public static void visualizarNotas(Alumno[] a) {
        for (Alumno listaAlumno : a) {
            System.out.println(listaAlumno);
        }
    }

    public static void maximaNotaAlumno(Alumno[] a, Nota[][] n) {
        for (int i=0; i<n.length; i++) {
            Nota[] notas = new Nota[n.length];
            System.arraycopy(n[i], 0, notas, 0, notas.length);
            System.out.println("La nota máxima del alumno \'" + a[i].getNombre() + "\' es " + a[i].notaMaxima(notas));
        }
    }
}

