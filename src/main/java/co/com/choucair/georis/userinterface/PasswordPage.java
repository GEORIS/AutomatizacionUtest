package co.com.choucair.georis.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordPage {

    public static final Target CREATED_PASSWORD = Target.the("Crear la contraseña del usuario en Utest")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("Confirmacion de contraseña creada")
            .located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED = Target.the("Opcion por si el usuario quiere mantenerse informado de proyectos de Utest")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target TERMS_OF_USE = Target.the("Opcion para aceptar terminos de uso de utest")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target PRIVACITY_SEGURITY = Target.the("Opcion para aceptar politicas de seguridad y privacidad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Boton para confirmar la creacion de usuario")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));

}
