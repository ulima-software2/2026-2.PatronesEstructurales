package pe.edu.ulima.is2.patrones.bridge;

public abstract class Comprobante {
    protected Canal canal;

    public abstract void imprimir();

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }
}
