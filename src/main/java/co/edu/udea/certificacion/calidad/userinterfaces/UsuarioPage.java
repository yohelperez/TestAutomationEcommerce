package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage extends PageObject {

     //Interfaces for test 1: Consulta_webpage.feature
     public static final Target INPUT_TEXT = Target.the("INPUT TEXT").locatedBy("//*[@id=\"idProfesor\"]");

     public static final Target TEXT_RESULTS_PAGE = Target.the("Texto de pagina del website").locatedBy("/html/body/nav/a");

     //Interfaces for test 1: Consulta_webpage.feature
     public static  final Target BUTTON_LOGIN = Target.the("Boton login").locatedBy("//*[@id=\"navbarSupportedContent\"]/div/a[1]");
     public static final Target INPUT_USERNAME = Target.the("INPUT USERNAME").locatedBy("//*[@id=\"id_username\"]");
     public static final Target INPUT_PASSWORD = Target.the("INPUT PASSWORD").locatedBy("//*[@id=\"id_password\"]");
     public static  final Target BUTTON_LOG_IN = Target.the("Boton LOG IN").locatedBy("//*[@id=\"login-form\"]/div[3]/input");
     public static final Target TEXT_RESULT_LOGIN_PAGE = Target.the("Texto de login").locatedBy("//*[@id=\"site-name\"]/a");


}
