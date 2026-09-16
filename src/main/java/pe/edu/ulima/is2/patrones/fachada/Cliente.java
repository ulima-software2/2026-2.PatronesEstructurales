package pe.edu.ulima.is2.patrones.fachada;

public class Cliente {
    static void main() {
        verPelicula("Paw Patrol");
    }

    static void verPelicula(String pelicula) {
        HomeTheaterManager manager = new HomeTheaterManager();
        manager.encender();
        manager.verPelicula(pelicula);
    }
}
