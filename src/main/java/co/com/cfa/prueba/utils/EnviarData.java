package co.com.cfa.prueba.utils;

import java.util.List;
import java.util.Map;

import static co.com.cfa.prueba.enums.RutaExcel.*;

public class EnviarData {

    public EnviarData() {}

    public static List<Map<String, String>> dePrueba(int fila) {
        List<Map<String, String>> datos;
        String ruta = FILE.getRutaExcel();
        String rutaAbsoluta = ruta + SEPARADOR.getRutaExcel() + NOMBRE_ARCHIVO.getRutaExcel();
        datos = ObtenerData.deExcel(rutaAbsoluta, SELECT.getRutaExcel() + WHERE.getRutaExcel() + fila);
        return datos;
    }
}
