package co.com.cfa.prueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Type implements Interaction {

    private Target element;
    private String text;

    public Type(Target element, String text) {
        this.element = element;
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.visible(this.element),
                Enter.keyValues(this.text).into(this.element)
        );
    }

    public static Type on(Target element, String text) {
        return new Type(element, text);
    }
}
