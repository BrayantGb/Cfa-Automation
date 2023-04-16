package co.com.cfa.prueba.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co/com/cfa/prueba/features/",
        glue = {"co.com.cfa.prueba.stepdefinition", "co.com.cfa.prueba.set.hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@BusquedaOficina"
)
public class TestRunner {
}
