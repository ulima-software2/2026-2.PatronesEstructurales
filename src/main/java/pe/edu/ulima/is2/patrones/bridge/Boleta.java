package pe.edu.ulima.is2.patrones.bridge;

public class Boleta extends Comprobante{
    @Override
    public void imprimir() {
        System.out.println("BOLETA");
        canal.generar();
    }
}
