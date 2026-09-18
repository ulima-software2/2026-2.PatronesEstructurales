package pe.edu.ulima.is2.patrones.decorator;

public abstract class PizzaDecorador implements Pizza {
    protected Pizza decorado;

    public PizzaDecorador(Pizza decorado) {
        this.decorado = decorado;
    }

    public abstract float calcularPrecio();
}
