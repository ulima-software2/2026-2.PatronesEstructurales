package pe.edu.ulima.is2.patrones.bridge;

public class Impreso implements Canal{
    @Override
    public void generar() {
        System.out.println("Se imprime");
    }
}
