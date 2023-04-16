package co.com.cfa.prueba.enums;

public enum RutaExcel {
    FILE("./src/test/resources/co/com/cfa/prueba/data"),
    SEPARADOR("/"),
    NOMBRE_ARCHIVO("Data.xlsx"),
    SELECT("SELECT * FROM Test"),
    WHERE(" WHERE IdPrueba = ")
    ;

    private String getRutaExcel;
    RutaExcel(String path) {this.getRutaExcel = path;}
    public String getRutaExcel() {return getRutaExcel;}
}
