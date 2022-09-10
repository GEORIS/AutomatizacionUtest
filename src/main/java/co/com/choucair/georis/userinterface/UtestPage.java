package co.com.choucair.georis.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;




@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Boton para empezar el registro de un nuevo usuario")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));


}
