package co.com.cfa.prueba.utils;

import co.com.cfa.prueba.exceptions.NoEncuentraData;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObtenerData {

    private ObtenerData(){}

    public static List<Map<String, String>> deExcel(String rutaArchivo, String query) {
        List<Map<String, String>> listaDatos = new ArrayList<>();
        try {
            Fillo fillo = new Fillo();
            Connection connection = fillo.getConnection(rutaArchivo);
            Recordset recordset = connection.executeQuery(query);
            List<String> headers = recordset.getFieldNames();
            while (recordset.next()) {
                Map<String, String> dato = new HashMap<>();
                headers.forEach(value -> {
                    try {
                        dato.put(value, recordset.getField(value));
                    } catch (Exception ex) {
                        throw new NoEncuentraData();
                    }
                });
                listaDatos.add(dato);
            }
            recordset.close();
            connection.close();
        } catch (Exception ex) {
            throw new NoEncuentraData();
        }
        return listaDatos;
    }
}




