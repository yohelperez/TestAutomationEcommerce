package co.edu.udea.certificacion.calidad.tasks;

import co.edu.udea.certificacion.calidad.interactions.AdminPage;
import co.edu.udea.certificacion.calidad.interactions.EcommercePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddProductTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AdminPage.addProduct());
    }

    public static AddProductTo adminPage(){
        return Tasks.instrumented(AddProductTo.class);
    }
}
