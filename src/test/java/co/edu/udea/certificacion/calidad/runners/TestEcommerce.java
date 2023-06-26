package co.edu.udea.certificacion.calidad.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //features = "src/test/resources/features/consulta_webpage.feature",    //Test1
        //features = "src/test/resources/features/test_login.feature",          //Test2
        //features = "src/test/resources/features/agregar_carrito.feature",     //Test3
        features = "src/test/resources/features/consulta_ordenes.feature",     //Test4
        //features = "src/test/resources/features/editar_productos_webpage.feature",    //Test 5
        glue = "co.edu.udea.certificacion.calidad.stepdefinition",
        snippets = SnippetType.CAMELCASE
)

public class TestEcommerce {


}
