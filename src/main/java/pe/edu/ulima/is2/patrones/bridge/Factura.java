package pe.edu.ulima.is2.patrones.bridge;

public class Factura extends Comprobante{
    @Override
    public void imprimir() {
        System.out.println("FACTURA");
        canal.generar();
    }
}
