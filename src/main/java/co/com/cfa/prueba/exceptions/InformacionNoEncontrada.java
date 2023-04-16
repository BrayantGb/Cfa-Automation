package co.com.cfa.prueba.exceptions;

public class InformacionNoEncontrada extends AssertionError {
    public static final String MENSAJE = "La informacion encontrada en el Home no hizo match";
    public static final String OFICINA = "La informacion encontrada en el Buscardor de la oficina no hizo match";
    public static final String ASOCIARME = "El titulo de la pagina de Asociados no hizo match";
    public static final String FUNDACIONCFA = "El titulo de la pagina de la fundacion no hizo match";
    public static final String PAGINAEMPLEO = "El titulo de la pagina de empleo no hizo match";
    public InformacionNoEncontrada(String message, Throwable cause){
        super(message, cause);
    }
}
