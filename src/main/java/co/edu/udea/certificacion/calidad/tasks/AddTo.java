package co.edu.udea.certificacion.calidad.tasks;

import co.edu.udea.certificacion.calidad.interactions.EcommercePage;
import co.edu.udea.certificacion.calidad.interactions.LandingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LandingCartPage.findItandAdd());
    }

    public static AddTo ecommerceLandingPage(){
        return Tasks.instrumented(AddTo.class);
    }
}
