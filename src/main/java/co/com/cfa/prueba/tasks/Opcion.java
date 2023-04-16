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

import static co.com.cfa.prueba.userinterfaces.Fundacion.TITULO_FUNDACION;
import static co.com.cfa.prueba.userinterfaces.HomePage.*;

public class Opcion implements Task {

    @Shared
    Informacion informacion;
    private WebDriver webDriver;

    public Opcion(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.visible(FUNDACION),
                Click.on(FUNDACION),
                WaitElement.visible(TITULO_FUNDACION)
        );
        String tituloFundacion = webDriver.findElement(By.xpath("//div//h1[contains(.,'Fundación CFA')]")).getText();
        informacion.setTituloFundacion(tituloFundacion);
    }

    public static Opcion fundacion(WebDriver webDriver){return Tasks.instrumented(Opcion.class, webDriver);
    }
}
