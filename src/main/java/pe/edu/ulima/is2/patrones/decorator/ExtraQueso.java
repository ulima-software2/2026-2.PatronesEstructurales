package pe.edu.ulima.is2.patrones.decorator;

public class ExtraQueso extends PizzaDecorador{
    public ExtraQueso(Pizza decorado) {
        super(decorado);
    }

    @Override
    public float calcularPrecio() {
        return decorado.calcularPrecio() + 5f;
    }
}
