package pe.edu.ulima.is2.patrones.adapter;

public class XMLConversorAdapter implements ConversorAdapter{
    @Override
    public String convert(String msg) {
        XMLConverter converter = new XMLConverter();
        return converter.convert(msg);
    }
}
