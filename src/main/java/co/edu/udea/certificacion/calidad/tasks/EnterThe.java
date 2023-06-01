package co.edu.udea.certificacion.calidad.tasks;

import co.edu.udea.certificacion.calidad.interactions.EcommercePage;
import co.edu.udea.certificacion.calidad.interactions.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

//Task for login test
public class EnterThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginPage.findItAndLogin());
    }

    public static EnterThe LoginPage(){
        return Tasks.instrumented(EnterThe.class);
    }
}