package co.com.cfa.prueba.stepdefinition;

import co.com.cfa.prueba.exceptions.InformacionNoEncontrada;
import co.com.cfa.prueba.models.DataExcel;
import co.com.cfa.prueba.models.Informacion;
import co.com.cfa.prueba.questions.MensajeRespuesta;
import co.com.cfa.prueba.tasks.*;
import co.com.cfa.prueba.utils.Conversion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.cfa.prueba.enums.Recursos.*;
import static co.com.cfa.prueba.exceptions.InformacionNoEncontrada.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PaginaCfaSteps {

    @Managed(driver = "firefox")
    WebDriver herBrowser;
    Actor user = Actor.named(USER.getRecursos());

    @Shared
    Informacion informacion;
    @Shared
    DataExcel dataExcel;
    @Dado("El usuario ingresa a la pagina")
    public void ElUsuarioIngresaALaPagina(){
        user.can(BrowseTheWeb.with(herBrowser));
    }

    @Cuando("el usuario se encuentra en el Home de la pagina")
    public void elUsuarioSeEncuentraEnElHomeDeLaPagina() {
        user.attemptsTo(Home.pagina(herBrowser));
        
    }

    @Cuando("el usuario busca la opcion de oficina {int}")
    public void elUsuarioBuscaLaOpcionDeOficinaIdPrueba(Integer IdPrueba) {
        user.attemptsTo(ObtenerData.deUsuario(IdPrueba));
        user.attemptsTo(Oficina.deOpcion(Conversion.dePagina(dataExcel),herBrowser));
    }

    @Cuando("el usuario busca la opcion de Como asociarme")
    public void elUsuarioBuscaLaOpcionDeComoAsociarme() {
        user.attemptsTo(ComoAsociar.usuario(herBrowser));

    }

    @Cuando("el usuario busca la opcion de Fundacion")
    public void elUsuarioBuscaLaOpcionDeFundacion() {
        user.attemptsTo(Opcion.fundacion(herBrowser));
    }

    @Entonces("se valida que la pagina responda correctamente")
    public void seValidaQueLaPaginaRespondaCorrectamente() {
        user.should(seeThat(MensajeRespuesta.es(informacion.getMensajeHome()), Matchers.equalTo(ELEMENTO_ENCONTRADO.getRecursos()))
                .orComplainWith(InformacionNoEncontrada.class,MENSAJE));
    }

    @Entonces("se valida que la pagina nos muestre la oficina")
    public void seValidaQueLaPaginaNosMuestreLaOficina() {
        user.should(seeThat(MensajeRespuesta.es(informacion.getInformacionOficina()), Matchers.equalTo(OFICINA_CFA.getRecursos()))
                .orComplainWith(InformacionNoEncontrada.class,OFICINA));
    }

    @Entonces("se valida que la pagina nos muestre la informacion como asociarme")
    public void seValidaQueLaPaginaNosMuestreLaInformacionComoAsociarme() {
        user.should(seeThat(MensajeRespuesta.es(informacion.getTituloAsociado()), Matchers.equalTo(ASOCIADO.getRecursos()))
                .orComplainWith(InformacionNoEncontrada.class,ASOCIARME));
    }

    @Entonces("se valida que la pagina nos muestre la informacion de la fundacion")
    public void seValidaQueLaPaginaNosMuestreLaInformacionDeLaFundacion() {
        user.should(seeThat(MensajeRespuesta.es(informacion.getTituloFundacion()), Matchers.equalTo(FUNDACION.getRecursos()))
                .orComplainWith(InformacionNoEncontrada.class,FUNDACIONCFA));
    }

    @Entonces("se valida que la pagina nos muestre la informacion empleo")
    public void seValidaQueLaPaginaNosMuestreLaInformacionEmpleo() {
        user.should(seeThat(MensajeRespuesta.es(informacion.getTituloEmpleo()), Matchers.equalTo(EMPLEO.getRecursos()))
                .orComplainWith(InformacionNoEncontrada.class,PAGINAEMPLEO));
    }

    @Y("ingresa en la opcion de Empleo")
    public void ingresaEnLaOpcionDeEmpleo() {
        user.attemptsTo(Empleo.fundacion(herBrowser));
    }
}
