package Museo;

public class Obra {
    private String titulo;
    private int gradoConservacion;
    private double precio;
    private Autor autores;
    private Sala salas;

    public Obra(String titulo, int gradoConservacion, double precio, Autor autores, Sala salas) {
        this.titulo = titulo;
        this.gradoConservacion = gradoConservacion;
        this.precio = precio;
        this.autores = autores;
        this.salas = salas;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGradoConservacion(int gradoConservacion) {
        this.gradoConservacion = gradoConservacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAutores(Autor autores) {
        this.autores = autores;
    }

    public void setSalas(Sala salas) {
        this.salas = salas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getGradoConservacion() {
        return gradoConservacion;
    }

    public double getPrecio() {
        return precio;
    }

    public Autor getAutores() {
        return autores;
    }

    public Sala getSalas() {
        return salas;
    }

    public void calcularPrecio(int gradoConservacion, Autor autores) {
        precio = 1000 * gradoConservacion * autores.getCotizacion();
    }

    @Override
    public String toString() {
        return "Obra{" +
                "titulo='" + titulo + '\'' +
                ", gradoConservacion=" + gradoConservacion +
                ", precio=" + precio +
                ", autores=" + autores +
                ", salas=" + salas +
                '}';
    }
}
