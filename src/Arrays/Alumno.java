package Arrays;
public class Alumno {
    public Alumno() {}

    public Alumno(String nombre, Nota notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    private String nombre;
    private Nota notas;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   /* public int[][] getNotas() {
        return notas;
    }
    public void setNotas(int[][] notas) {
        this.notas = notas;
    }
    public int notaMaxima() {
        int max = 0;
        for(int i=0; i<notas[1].length; i++)
            if(max <= notas[1][i])
                max = notas[1][i];
        return max;
    }
    public double media() {
        double media = 0;
        for(int i=0; i<notas[1].length; i++)
            media+=notas[1][i];
        return media/notas[1].length;
    }*/
}
