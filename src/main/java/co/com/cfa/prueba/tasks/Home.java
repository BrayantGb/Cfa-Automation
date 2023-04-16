package co.com.cfa.prueba.tasks;

import co.com.cfa.prueba.interactions.WaitElement;
import co.com.cfa.prueba.models.Informacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.cfa.prueba.userinterfaces.HomePage.HOME_PAGE;

public class Home implements Task {
    @Shared
    Informacion informacion;
    private WebDriver webDriver;

    public Home(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HOME_PAGE),
                WaitElement.visible(HOME_PAGE)
        );
        String mensajeHome = webDriver.findElement(By.xpath("//h2[contains(.,'Somos CFA de corazón')]")).getText();
        informacion.setMensajeHome(mensajeHome);
    }

    public static Home pagina(WebDriver webDriver) {
        return Tasks.instrumented(Home.class, webDriver);
    }
}
