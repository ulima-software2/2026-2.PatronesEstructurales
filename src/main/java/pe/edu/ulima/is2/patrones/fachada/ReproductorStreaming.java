package pe.edu.ulima.is2.patrones.fachada;

public class ReproductorStreaming {
    public void encender(){
        System.out.println("Se encendio reproductor");
    }
    public void reproducir(String pelicula) {
        System.out.println("Se reproduce pelicula " + pelicula);
    }
}
