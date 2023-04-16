package co.com.cfa.prueba.tasks;

import co.com.cfa.prueba.interactions.Click;
import co.com.cfa.prueba.interactions.WaitElement;
import co.com.cfa.prueba.models.Informacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.cfa.prueba.userinterfaces.Empleo.TITULO_EMPLEO;
import static co.com.cfa.prueba.userinterfaces.Fundacion.OPCION_EMPLEO;

public class Empleo implements Task {
    @Shared
    Informacion informacion;
    private WebDriver webDriver;

    public Empleo(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.visible(OPCION_EMPLEO),
                Click.on(OPCION_EMPLEO),
                WaitElement.visible(TITULO_EMPLEO)
        );
        String titulo = webDriver.findElement(By.xpath("//h1//span[contains(.,'Apoyo al empleo')]")).getText();
        informacion.setTituloEmpleo(titulo);
    }
    public static Empleo fundacion(WebDriver webDriver){return Tasks.instrumented(Empleo.class, webDriver);
    }
}
