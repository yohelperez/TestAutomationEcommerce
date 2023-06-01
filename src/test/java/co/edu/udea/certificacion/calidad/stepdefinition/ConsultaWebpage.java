package co.edu.udea.certificacion.calidad.stepdefinition;


import co.edu.udea.certificacion.calidad.questions.ValidationLandingPage;
import co.edu.udea.certificacion.calidad.tasks.FindThe;
import co.edu.udea.certificacion.calidad.tasks.OpenThe;
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
public class ConsultaWebpage {

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

    @Given("que me encuentro en la pagina principal de google")
    public void queMeEncuentroPaginaUdea(){
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @When("busco el link del website")
    public void buscoElIdDeUnProfesor(){
        usuario.attemptsTo(FindThe.ecommercePage());
    }

    @Then("puedo ver los items del sitio")
    public void puedoVerInformacion(){
        //todo
        usuario.should(seeThat(ValidationLandingPage.theEcommercePage(), equalTo(true)));
    }
}
