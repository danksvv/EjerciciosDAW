package Banco;

public class Cliente {
    private String NIF;
    private String nombre;
    private String direccion;
    private int numClientes;
    private static int numSiguiente = 1;

    public Cliente(String NIF, String nombre, String direccion){
        this.NIF = NIF;
        this.nombre = nombre;
        this.direccion =direccion;
        this.numClientes = numSiguiente;
        numSiguiente++;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumClientes() {
        return numClientes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "NIF='" + NIF + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nº Cliente=" + numClientes +
                '}';
    }
}


