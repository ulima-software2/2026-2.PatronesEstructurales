package pe.edu.ulima.is2.patrones.decorator;

public class Pepperoni extends PizzaDecorador{
    public Pepperoni(Pizza decorado) {
        super(decorado);
    }

    @Override
    public float calcularPrecio() {
        return decorado.calcularPrecio() + 10f;
    }
}
