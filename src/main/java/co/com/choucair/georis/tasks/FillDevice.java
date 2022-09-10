package co.com.choucair.georis.tasks;

import co.com.choucair.georis.model.DataUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.georis.userinterface.DevicePage.*;

public class FillDevice implements Task {

    private List<DataUtestPage> DataPage;

    public FillDevice(List<DataUtestPage> DataPage) {
        this.DataPage = DataPage;
    }

    public static FillDevice thePage(List<DataUtestPage> DataPage) {
        return Tasks.instrumented(FillDevice.class, DataPage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CONTAINER_COMPUTER),
                Enter.theValue(DataPage.get(0).getStrComputerSo()).into(COMPUTER_SO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_VERSION),
                Enter.theValue(DataPage.get(0).getStrComputerVersion()).into(COMPUTER_VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_LANGUAGE),
                Enter.theValue(DataPage.get(0).getStrLanguaje()).into(COMPUTER_LANGUAGE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_MOVIL),
                Enter.theValue(DataPage.get(0).getStrTypeMovil()).into(TYPE_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_MODEL),
                Enter.theValue(DataPage.get(0).getStrModelMovil()).into(MODEL_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_MOVILSO),
                Enter.theValue(DataPage.get(0).getStrMovilSo()).into(SO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BUTTON_LASTSTEP)
                );

    }
}
