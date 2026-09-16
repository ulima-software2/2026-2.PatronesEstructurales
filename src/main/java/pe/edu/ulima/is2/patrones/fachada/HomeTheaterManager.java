package pe.edu.ulima.is2.patrones.fachada;

public class HomeTheaterManager {
    private EquipoSonido equipoSonido;
    private Luces luces;
    private ReproductorStreaming reproductor;
    private Proyector proyector;

    public void encender() {
        equipoSonido = new EquipoSonido();
        luces = new Luces();
        reproductor = new ReproductorStreaming();
        proyector = new Proyector();

        equipoSonido.prender();
        reproductor.encender();
        proyector.encender();
    }

    public void verPelicula(String pelicula) {
        luces.atenuar(10);

        reproductor.reproducir(pelicula);
    }
}
