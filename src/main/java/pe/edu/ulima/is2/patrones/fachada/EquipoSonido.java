package pe.edu.ulima.is2.patrones.fachada;

public class EquipoSonido {
    public void prender() {
        System.out.println("Se prende el equipo de sonigo");
    }
    public void setVolumen(int nivel) {
        System.out.println("Se setea el volumen a:" + nivel);
    }
}
