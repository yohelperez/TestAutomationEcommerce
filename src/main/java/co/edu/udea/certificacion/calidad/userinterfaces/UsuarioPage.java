package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage extends PageObject {

     //Interfaces for test 1: Consulta_webpage.feature
     public static final Target INPUT_TEXT = Target.the("INPUT TEXT").locatedBy("//*[@id=\"idProfesor\"]");

     public static final Target TEXT_RESULTS_PAGE = Target.the("Texto de pagina del website").locatedBy("/html/body/nav/a");

     //Interfaces for test 2: tes_login.feature
     public static  final Target BUTTON_LOGIN = Target.the("Boton login").locatedBy("//*[@id=\"navbarSupportedContent\"]/div/a[1]");
     public static final Target INPUT_USERNAME = Target.the("INPUT USERNAME").locatedBy("//*[@id=\"id_username\"]");
     public static final Target INPUT_PASSWORD = Target.the("INPUT PASSWORD").locatedBy("//*[@id=\"id_password\"]");
     public static  final Target BUTTON_LOG_IN = Target.the("Boton LOG IN").locatedBy("//*[@id=\"login-form\"]/div[3]/input");
     public static final Target TEXT_RESULT_LOGIN_PAGE = Target.the("Texto de login").locatedBy("//*[@id=\"site-name\"]/a");

     //Interfaces for test 3: tes_login.feature

     public static  final Target BUTTON_ADD_CART = Target.the("Boton Add to cart").locatedBy("//html/body/div/div/div[2]/div/button");
     public static  final Target BUTTON_CART = Target.the("Boton cart").locatedBy("//*[@id=\"cart-icon\"]");
     public static final Target TEXT_RESULT_ADD_CART = Target.the("Texto Price").locatedBy("/html/body/div/div/div/div[2]/div[1]/div[3]/strong");

     //Interfaces for test 4: consulta_ordenes.feature

     public static  final Target BUTTON_ORDERS = Target.the("Boton orders").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");
     public static final Target TEXT_RESULT_SEARCH_ORDERS = Target.the("Texto Price").locatedBy("//html/body/div/div/div/div[2]/div[1]/div[4]/strong");


     //Interfaces for test 5: editar_productos_webpage.feature

     public static  final Target BUTTON_PRODUCTS = Target.the("Boton Products").locatedBy("//*[@id=\"content-main\"]/div[2]/table/tbody/tr[4]/th/a");
     public static  final Target BUTTON_ADD_PRODUCTS = Target.the("Boton Add products").locatedBy("//*[@id=\"content-main\"]/ul/li/a");
     public static  final Target INPUT_PRODUCT_NAME = Target.the("Input product name").locatedBy("//*[@id=\"id_name\"]");
     public static  final Target INPUT_PRODUCT_PRICE = Target.the("Input product price").locatedBy("//*[@id=\"id_price\"]");

     public static  final Target BUTTON_SAVE = Target.the("Boton save product").locatedBy("//*[@id=\"product_form\"]/div/div/input[1]");

     public static final Target TEXT_RESULT_SAVE_NEW_PRODUCTO = Target.the("Texto product saved").locatedBy("//*[@id=\"content-start\"]/ul/li");

}
