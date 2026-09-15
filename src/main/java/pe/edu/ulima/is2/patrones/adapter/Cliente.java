package pe.edu.ulima.is2.patrones.adapter;

public class Cliente {

    static void main() {
        String mensaje = "Esto es una prueba";
        enviarMensaje(mensaje, new TransformadorJSONAdapter());
    }

    static void enviarMensaje(String msg, ConversorAdapter adapter) {
        System.out.println(adapter.convert(msg));
    }
}
