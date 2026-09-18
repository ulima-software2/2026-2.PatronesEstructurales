package pe.edu.ulima.is2.patrones.bridge;

public class Correo implements Canal{
    @Override
    public void generar() {
        System.out.println("Se envia");
    }
}
