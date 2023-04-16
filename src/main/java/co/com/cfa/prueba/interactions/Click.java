package co.com.cfa.prueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;


public class Click implements Interaction {

    private Target element;

    public Click(Target element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElement.visible(this.element));
        net.serenitybdd.screenplay.actions.Click.on(this.element);
    }

    public static Click on(Target element) {
        return new Click(element);
    }
}