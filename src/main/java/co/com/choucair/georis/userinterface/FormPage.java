package co.com.choucair.georis.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static final Target FIRST_NAME = Target.the("Ingresar el primer nombre del usuario")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Ingresar el apellido del usuario")
            .located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS = Target.the("Ingresar el correo del usuario")
            .located(By.id("email"));

    public static final Target BIRTHDAY_MONTH = Target.the("Ingresar el mes de cumpleaños del usuario")
            .located(By.id("birthMonth"));

    public static final Target BIRTHDAY_DAY = Target.the("Ingresar el dia de cumpleaños del usuario")
            .located(By.id("birthDay"));

    public static final Target BIRTHDAY_YEAR = Target.the("Ingresar el año de cumpleaños del usuario")
            .located(By.id("birthYear"));

    public static final Target CONTAINER_LANGUAJE_SPOKEN = Target.the("Agregar idioma hablado")
            .located(By.xpath("//*[@id=\"languages\"]"));

    public static final Target LANGUAJE_SPOKEN = Target.the("Seleccionar español como otro idioma")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));

    public static final Target NEXTLOCATION_BUTTON = Target.the("Boton para seguir con el formulario de ubicacion")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));


}