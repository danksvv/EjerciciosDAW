package Museo;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private double cotizacion;

    public Autor(String nombre, String nacionalidad, double cotizacion) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.cotizacion = cotizacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setCotizacion(double cotizacion) {
        this.cotizacion = cotizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public double getCotizacion() {
        return cotizacion;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", cotizacion=" + cotizacion +
                '}';
    }
}
