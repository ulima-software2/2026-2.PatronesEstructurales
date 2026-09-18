package pe.edu.ulima.is2.patrones.bridge;

public class Main {
    static void main(String[] args) {
        Comprobante comprobante = new Boleta();
        comprobante.setCanal(new PDF());
        comprobante.imprimir();

        comprobante.setCanal(new Correo());
        comprobante.imprimir();
    }
}
