package TrianguloEquilatero;

public class TrianguloEquilatero {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }
    public TrianguloEquilatero() {}

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public double getAltura() {
        return Math.round(((lado * Math.sqrt(3))/2)*100.0)/100.0;
    }
    public double getArea() {
        return Math.round((getAltura()*lado/2)*100)/100.0;
    }
    public double getPerimetro() {
        return lado * 3;
    }

    @Override
    public String toString() {
        return "TrianguloEquilatero{\nLado -> " + getLado() +
                "\nArea -> " + getArea() +
                "\nPerimetro -> " + getPerimetro() + " }";
    }
}
