package pe.edu.ulima.is2.patrones.decorator;

public class Tocino extends PizzaDecorador {
    public Tocino(Pizza decorado) {
        super(decorado);
    }

    @Override
    public float calcularPrecio() {
        return decorado.calcularPrecio() + 12;
    }
}
