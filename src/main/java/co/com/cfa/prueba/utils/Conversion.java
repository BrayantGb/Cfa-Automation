package co.com.cfa.prueba.utils;

import co.com.cfa.prueba.models.DataExcel;
import co.com.cfa.prueba.models.DatosOficinas;

import static co.com.cfa.prueba.enums.Recursos.CIUDAD;

public class Conversion {
    private Conversion(){

    }

    public static DatosOficinas dePagina(DataExcel dataExcel){
        DatosOficinas datosOficinas = new DatosOficinas();
        datosOficinas.setOficinas(dataExcel.getSetDeDatos().get(0).get(CIUDAD.getRecursos()));
        return datosOficinas;
    }
}
