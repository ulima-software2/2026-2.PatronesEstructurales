package pe.edu.ulima.is2.patrones.bridge;

public class PDF implements Canal{
    @Override
    public void generar() {
        System.out.println("Se genera");
    }
}
