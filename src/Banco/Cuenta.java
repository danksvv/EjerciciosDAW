package Banco;

public class Cuenta {

    private int idCuenta;
    private int entidad;
    private int oficina;
    private int control;
    private Cliente titular;
    private double saldo;
    private int numCuentas;
    private static int numSiguiente = 1;

    public Cuenta(int idCuenta, int entidad, int oficina, int control, Cliente titular, double saldo) {
        validarCuenta(idCuenta, entidad, oficina, control, titular, saldo);
        this.idCuenta = idCuenta;
        this.entidad = entidad;
        this.oficina = oficina;
        this.control = control;
        this.titular = titular;
        this.saldo = saldo;
        this.numCuentas = numSiguiente;
        numSiguiente++;
    }

    public void setEntidad(int entidad) {
        this.entidad = entidad;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public int getEntidad() {
        return entidad;
    }

    public int getOficina() {
        return oficina;
    }

    public int getControl() {
        return control;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double ingresar(double cantidad){
        return this.saldo += cantidad;
    }

    public double extraer(double cantidad){
        double nuevoSaldo = 0;
        if(cantidad>0){
            if(cantidad > this.saldo*0.10){
                nuevoSaldo = this.saldo - cantidad;
            }
        } else {
            System.out.println("Operación no permitida!");
        }
        return this.saldo=nuevoSaldo;
    }

    private void validarCuenta(int idCuenta, int entidad, int oficina, int control, Cliente titular, double saldo) {
        boolean validado = false;

        if(String.valueOf(idCuenta).length()==10){
            validado = true;
        }

        if(String.valueOf(entidad).length()==4){
            validado = true;
        }

        if(String.valueOf(oficina).length()==4){
            validado = true;
        }

        if(String.valueOf(control).length()==2){
            validado = true;
        }

        if(titular!=null){
            validado = true;
        }

        if(saldo>0){
            validado = true;
        }

        if(!validado){
            System.out.println("Data inválida!");
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "idCuenta=" + idCuenta +
                ", entidad=" + entidad +
                ", oficina=" + oficina +
                ", control=" + control +
                ", titular=" + titular +
                ", saldo=" + saldo +
                ", nº Cuenta=" + numCuentas +
                '}';
    }
}
