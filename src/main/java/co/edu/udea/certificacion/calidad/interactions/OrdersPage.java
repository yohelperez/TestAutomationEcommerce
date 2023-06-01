package co.edu.udea.certificacion.calidad.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;


import java.util.Random;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.BUTTON_ORDERS;
import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.INPUT_TEXT;

public class OrdersPage implements Interaction {
    Random random = new Random();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("http://127.0.0.1:8000"));
        actor.attemptsTo(Click.on(BUTTON_ORDERS));
        //actor.attemptsTo(Enter.theValue("1").into(INPUT_TEXT).thenHit(Keys.RETURN));
        //actor.attemptsTo(Click.on(BUTTON_BUSCAR));

    }

    public static OrdersPage findItAndGo(){
        return Tasks.instrumented(OrdersPage.class);
    }
}
