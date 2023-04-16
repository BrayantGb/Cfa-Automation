package co.com.cfa.prueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class WaitElement implements Interaction {

    private Target element;

    public WaitElement(Target element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(this.element, WebElementStateMatchers.isVisible()));
    }

    public static WaitElement visible(Target element) {
        return new WaitElement(element);
    }
}
