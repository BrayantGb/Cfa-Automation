package co.com.cfa.prueba.tasks;

import co.com.cfa.prueba.interactions.Click;
import co.com.cfa.prueba.interactions.Type;
import co.com.cfa.prueba.interactions.WaitElement;
import co.com.cfa.prueba.models.DatosOficinas;
import co.com.cfa.prueba.models.Informacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.cfa.prueba.userinterfaces.HomePage.*;
import static co.com.cfa.prueba.userinterfaces.Oficinas.*;

public class Oficina implements Task {

    @Shared
    Informacion informacion;

    private DatosOficinas datosOficinas;
    private WebDriver webDriver;

    public Oficina(DatosOficinas datosOficinas,WebDriver webDriver){
        this.datosOficinas = datosOficinas;
        this.webDriver = webDriver;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.visible(OFICINAS),
                Click.on(OFICINAS),
                Click.on(OFICINAS),
                WaitElement.visible(INPUT_BUSCAR),
                Click.on(INPUT_BUSCAR),
                Type.on(INPUT_BUSCAR,datosOficinas.getOficinas()),
                WaitElement.visible(INFORMACION_OFICINA)
        );
        String oficina = webDriver.findElement(By.xpath("//div//div//span[contains(.,\"Oficina CFA ·\")]")).getText();
        informacion.setInformacionOficina(oficina);
    }

    public static Oficina deOpcion(DatosOficinas datosOficinas, WebDriver webDriver){
        return Tasks.instrumented(Oficina.class, datosOficinas, webDriver);
    }
}
