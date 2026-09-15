package pe.edu.ulima.is2.patrones.adapter;

public class TransformadorJSON {
    public String transform(String msg, String encoding) {
        return "{ 'mensaje' : '" + msg + "' }";
    }
}
