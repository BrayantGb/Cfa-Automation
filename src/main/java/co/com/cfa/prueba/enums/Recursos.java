package co.com.cfa.prueba.enums;

public enum Recursos {

    USER("user"),
    URL_PAGE("url_home_page"),
    ELEMENTO_ENCONTRADO("Somos CFA de corazón"),
    OFICINA_CFA("Oficina CFA ·"),
    ASOCIADO("Asociarme"),
    FUNDACION("Fundación CFA"),
    EMPLEO(""),
    CIUDAD("ciudad"),
    ;

    private String recursos;
    Recursos(String recursos){this.recursos = recursos;}
    public String getRecursos(){return  recursos;}


}
