package co.com.cfa.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeRespuesta implements Question<String> {

    private String element;
    MensajeRespuesta(String element){this.element = element;}

    @Override
    public String answeredBy(Actor actor) {
        return this.element;
    }
    public static MensajeRespuesta es(String element){return new MensajeRespuesta(element);}
}

