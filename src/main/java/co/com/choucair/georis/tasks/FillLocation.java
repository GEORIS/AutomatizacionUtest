package co.com.choucair.georis.tasks;

import co.com.choucair.georis.model.DataUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.georis.userinterface.LocationPage.*;

public class FillLocation implements Task {

    private List<DataUtestPage> DataPage;

    public FillLocation(List<DataUtestPage> DataPage) {
        this.DataPage = DataPage;
    }

    public static FillLocation thePage(List<DataUtestPage> DataPage) {
        return Tasks.instrumented(FillLocation.class, DataPage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(DataPage.get(0).getStrCityName()).into(CITY_NAME),
                Hit.the(Keys.ARROW_DOWN).into(CITY_NAME),
                Hit.the(Keys.ENTER).into(CITY_NAME),
                Enter.theValue(DataPage.get(0).getStrPostalCode()).into(POSTAL_CODE),
                Click.on(CONTAINER_COUNTRY_NAME),
                Enter.theValue(DataPage.get(0).getStrCountryName()).into(COUNTRY_NAME).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(DEVICE_BUTTON)
                );

    }
}
