package pe.edu.ulima.is2.patrones.decorator;

public class PizzaBasica implements Pizza{
    @Override
    public float calcularPrecio() {
        return 30f;
    }
}
