package co.com.cfa.prueba.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComoAsociarUsuario extends PageObject {
    public static final Target TITULO_ASOCIARME = Target.the("Titulo de la pagina de asociados").located(By.xpath("//h1[contains(.,'Asociarme')]"));
}
