package pe.edu.ulima.is2.patrones.adapter;

public class TransformadorJSONAdapter implements ConversorAdapter{
    @Override
    public String convert(String msg) {
        TransformadorJSON transformer = new TransformadorJSON();
        return transformer.transform(msg, "UTF-8");
    }
}
