package co.com.cfa.prueba.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Oficinas extends PageObject {
    public static final Target INPUT_BUSCAR = Target.the("Input Buscar").located(By.xpath("//div//input[@class=\"eapps-google-maps-bar-search-input\"]"));
    public static final Target INFORMACION_OFICINA = Target.the("Informacion de oficina").located(By.xpath("//div//div//span[contains(.,\"Oficina CFA ·\")]"));
}
