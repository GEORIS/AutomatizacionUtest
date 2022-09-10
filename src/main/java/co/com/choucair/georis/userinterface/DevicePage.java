package co.com.choucair.georis.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage  {

    public static final Target CONTAINER_COMPUTER = Target.the("Contenedor SO Computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span"));

    public static final Target COMPUTER_SO = Target.the("Seleccionar SO de computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));

    public static final Target CONTAINER_VERSION = Target.the("Contenedor Version del Computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));

    public static final Target COMPUTER_VERSION = Target.the("Seleccionar la version del computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));

    public static final Target CONTAINER_LANGUAGE = Target.the("Contenedor Lenguaje Computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));

    public static final Target COMPUTER_LANGUAGE = Target.the("Seleccionar el lengiuaje de computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));

    public static final Target CONTAINER_MOVIL = Target.the("Contenedor Telefono celular")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));

    public static final Target TYPE_MOVIL = Target.the("Seleccionar marca de telefono celular")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target CONTAINER_MODEL = Target.the("Contenedor Modelo del celular")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target MODEL_MOVIL = Target.the("Seleccionar el modelo del celular")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target CONTAINER_MOVILSO = Target.the("Contenedor SO del celular")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));

    public static final Target SO_MOVIL = Target.the("Seleccionar sistema operativo del celular")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_LASTSTEP =Target.the("Boton para ultimos pasos")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
