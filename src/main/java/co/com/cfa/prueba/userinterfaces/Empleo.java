package co.com.cfa.prueba.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Empleo extends PageObject {
    public static final Target TITULO_EMPLEO = Target.the("Titulo empleo").located(By.xpath("//h1//span[contains(.,'Apoyo al empleo')]"));
}
