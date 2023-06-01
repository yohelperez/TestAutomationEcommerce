package co.edu.udea.certificacion.calidad.teststepdefinition;


import co.edu.udea.certificacion.calidad.questions.ValidationAddCart;
import co.edu.udea.certificacion.calidad.questions.ValidationLandingPage;
import co.edu.udea.certificacion.calidad.questions.ValidationOrderPage;
import co.edu.udea.certificacion.calidad.questions.ValidationProductSaved;
import co.edu.udea.certificacion.calidad.tasks.*;
import co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

@RunWith(Cucumber.class)
public class EditarProductosWebpage {

    @Managed(driver = "chrome")
    public WebDriver driver;

    //Actor que realiza los casos del caso prueba
    private Actor usuario = Actor.named("Dominique");

    @Before(order=1)
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Before(order=2)
    public void preStage(){
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro logueado en el website")
    public void queMeEncuentroLogueadoComoAdmin(){
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
        usuario.attemptsTo(EnterThe.LoginPage());


    }

    @When("agrego un producto")
    public void agregoUnProducto(){
        usuario.attemptsTo(AddProductTo.adminPage());
    }

    @Then("se actualiza la lista de productos")
    public void puedoVerQueSeActualizaLaLista(){
        //todo
        usuario.should(seeThat(ValidationProductSaved.theAdminPage(), equalTo(true)));
    }
}
