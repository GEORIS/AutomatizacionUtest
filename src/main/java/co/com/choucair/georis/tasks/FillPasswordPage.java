package co.com.choucair.georis.tasks;

import co.com.choucair.georis.model.DataUtestPage;
import co.com.choucair.georis.userinterface.PasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.choucair.georis.userinterface.PasswordPage.*;

public class FillPasswordPage implements Task {

    private List<DataUtestPage> DataPage;

    public FillPasswordPage(List<DataUtestPage> DataPage) {
        this.DataPage = DataPage;
    }

    public static FillPasswordPage thePage(List<DataUtestPage> DataPage) {
        return Tasks.instrumented(FillPasswordPage.class, DataPage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(DataPage.get(0).getStrPassword()).into(CREATED_PASSWORD),
                Enter.theValue(DataPage.get(0).getStrPassword()).into(CONFIRM_PASSWORD),
                Click.on(STAY_INFORMED),
                Click.on(TERMS_OF_USE),
                Click.on(PRIVACITY_SEGURITY),
                Click.on(BUTTON_COMPLETE_SETUP)

        );

    }
}
