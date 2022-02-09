package Posicion;

public class Posicion {
    private int x;
    private int y;

    // Métodos constructores
    public Posicion() {
        x = 0;
        y = 0;
    }
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Posicion(Posicion punto) {
        this.x = punto.x;
        this.y = punto.y;
    }

    // Métodos set y get
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getXY() {
        return "(" + x + ", " + y + ")";
    }

    public void decXY(int dec) {
        x -= dec;
        y -= dec;
    }

    public void incXY(int inc) {
        x += inc;
        y += inc;
    }

    public String recta(Posicion punto) {
        if(punto.y == y)
            return "la recta es constante y la gráfica es paralela al eje X";
        else if(punto.x == x)
            return "Pendiente indeterminada";
        else{
            double m = (double) (punto.y - y)/(double) (punto.x - x);
            if(y<0 && x<0)
                    return "y + " + y*(-1) + " = " + Math.round(m*100)/100.0 + "(x + " + x*(-1) + ")";
            else if(y<0)
                return "y + " + y*(-1) + " = " + Math.round(m*100)/100.0 + "(x - " + x + ")";
            else if(x<0)
                return "y - " + y + " = " + Math.round(m*100)/100.0 + "(x + " + x*(-1) + ")";
            else
                return "y - " + y + " = " + Math.round(m*100)/100.0 + "(x - " + x + ")";
        }
    }

    public Posicion opuestoXY() {
        int aux = x;
        x = y;
        y = aux;
        return this;
    }
}
