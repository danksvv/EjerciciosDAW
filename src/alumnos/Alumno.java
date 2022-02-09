package alumnos;

import java.util.Arrays;

public class Alumno {
    private String nombre;
    private Nota[] notas;

    public Alumno(String nombre, Nota[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    public int notaMaxima(Nota[] notas) {
        int maximo = notas[0].getNotaAsignatura();
        for (Nota n : notas) {
            if(n.getNotaAsignatura() >= maximo)
                maximo = n.getNotaAsignatura();
        }
        return maximo;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}

