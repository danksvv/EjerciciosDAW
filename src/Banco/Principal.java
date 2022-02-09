package Banco;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("X9999999", "Alberto Peréz", "España-Madrid");
        Cuenta cuenta1 = new Cuenta(1111111111, 4444, 1144, 11, cliente1, 100);
        System.out.println("Primera cuenta : " + cuenta1);
        cuenta1.ingresar(100);
        System.out.println("ingreso=" + cuenta1);

        cuenta1.extraer(-100);
        System.out.println("salida=" + cuenta1);
    }
}
