package co.com.cfa.prueba.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Fundacion extends PageObject {
    public static final Target TITULO_FUNDACION = Target.the("Titulo de la pagina de la fundacion").located(By.xpath("//div//h1[contains(.,'Fundación CFA')]"));
    public static final Target OPCION_EMPLEO = Target.the("Opcion empleo").located(By.xpath("//h3//a[contains(.,'Apoyo al empleo')]"));
}
