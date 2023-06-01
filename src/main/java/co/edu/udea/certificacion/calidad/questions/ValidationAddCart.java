package co.edu.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.TEXT_RESULTS_PAGE;
import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.TEXT_RESULT_ADD_CART;

//Test for consulta_webpage.feature
public class ValidationAddCart implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        //trae el texto TEXT_RESULTS_PAGE si lo esta viendo el usuario en ese momento
        String temp = Text.of(TEXT_RESULT_ADD_CART).viewedBy(actor).asString();
        if (temp.contains("Price")) {
            return true;
        } else {
            return false;
        }
    }

    public static ValidationAddCart theCartAdded(){
        return new ValidationAddCart();
    }
}
