package co.edu.udea.certificacion.calidad.tasks;

import co.edu.udea.certificacion.calidad.interactions.EcommercePage;
import co.edu.udea.certificacion.calidad.interactions.OrdersPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeeThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(OrdersPage.findItAndGo());
    }

    public static SeeThe ordersPage(){
        return Tasks.instrumented(SeeThe.class);
    }
}
