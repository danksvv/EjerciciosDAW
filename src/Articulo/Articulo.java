package Articulo;

public class Articulo {
    private final int codigo;
    private String nombre;
    private String color;
    private double precio;
    private static int codSiguiente = 1;

    public Articulo(String nombre, String color, double precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.codigo = codSiguiente;
        codSiguiente++;
    }
    public Articulo(){
        this("","",0);
        //codSiguiente++;
    }
    public Articulo(String nombre, String color) {
        this(nombre, color, 0);
        //codSiguiente++;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void incrementarPrecio(double incremento) {
        precio = getPrecio() + incremento;
    }

    public void rebajarPrecio(int porcentaje){
        precio -= precio * porcentaje/100;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo=" + getCodigo() +
                ", nombre='" + getNombre() + '\'' +
                ", color='" + getColor() + '\'' +
                ", precio=" + getPrecio() +
                '}';
    }
}
