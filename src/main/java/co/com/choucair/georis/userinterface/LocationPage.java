package co.com.choucair.georis.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {

    public static final Target CITY_NAME = Target.the("Ingresar el nombre de la ciudad de residencia del usuario")
            .located(By.id("city"));

    public static final Target POSTAL_CODE = Target.the("Ingresar el codigo postal de la ciudad de residencia del usuario")
            .located(By.id("zip"));

    public static final Target CONTAINER_COUNTRY_NAME = Target.the("Contenedor del pais de residencia del usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));

    public static final Target COUNTRY_NAME = Target.the("Seleccionar pais de residencia del usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target DEVICE_BUTTON =Target.the("Boton next Devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
