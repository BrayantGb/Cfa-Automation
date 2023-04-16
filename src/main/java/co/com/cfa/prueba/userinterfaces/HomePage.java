package co.com.cfa.prueba.userinterfaces;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target HOME_PAGE = Target.the("Elemento de la pagina principal").located(By.xpath("//h2[contains(.,'Somos CFA de corazón')]"));
    public static final Target OFICINAS = Target.the("Elemento de la opcion Oficinas").located(By.xpath("//div//h3//a[contains(.,'Oficinas')]"));
    public static final Target COMO_ASOCIAR = Target.the("Opcion de Como asociar").located(By.xpath("//a[contains(.,'¿Cómo asociarme?')]"));
    public static final Target FUNDACION = Target.the("Opcion de fundacion").located(By.xpath("//div//h3//a[contains(.,'Fundación CFA')]"));
}
