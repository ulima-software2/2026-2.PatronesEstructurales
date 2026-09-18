package pe.edu.ulima.is2.patrones.decorator;

public class Main {
    static void main(String[] args) {
        var pizzaBase = new PizzaBasica();
        var pizzaDecoradaConPepperoni =new Pepperoni(pizzaBase);
        var pizzConPepperoniExtraQueso = new ExtraQueso(pizzaDecoradaConPepperoni);

        float costo = pizzConPepperoniExtraQueso.calcularPrecio();
        System.out.println("Costo pizza: " + costo);
    }
}
