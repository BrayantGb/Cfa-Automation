package co.com.cfa.prueba.exceptions;

public class NoEncuentraData extends AssertionError {
    public static final String NOT_DATA = "No se encuentra la data";
    public NoEncuentraData(){
        super(NOT_DATA);
    }
}
