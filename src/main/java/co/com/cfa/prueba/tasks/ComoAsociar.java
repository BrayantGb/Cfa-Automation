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

import static co.com.cfa.prueba.userinterfaces.ComoAsociarUsuario.TITULO_ASOCIARME;
import static co.com.cfa.prueba.userinterfaces.HomePage.*;

public class ComoAsociar implements Task {

    @Shared
    Informacion informacion;
    private WebDriver webDriver;

    public ComoAsociar(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.visible(COMO_ASOCIAR),
                Click.on(COMO_ASOCIAR),
                WaitElement.visible(TITULO_ASOCIARME)
        );
        String titulo = webDriver.findElement(By.xpath("//h1[contains(.,'Asociarme')]")).getText();
        informacion.setTituloAsociado(titulo);

    }

    public static ComoAsociar usuario(WebDriver webDriver){return Tasks.instrumented(ComoAsociar.class, webDriver);
    }
}
