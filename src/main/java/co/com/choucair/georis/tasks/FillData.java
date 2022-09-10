package co.com.choucair.georis.tasks;

import co.com.choucair.georis.model.DataUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;


import static co.com.choucair.georis.userinterface.FormPage.*;

public class FillData implements Task {

    private List<DataUtestPage> DataPage;

    public FillData(List<DataUtestPage> DataPage) {
        this.DataPage = DataPage;
    }

    public static FillData thePage(List<DataUtestPage> DataPage) {
        return Tasks.instrumented(FillData.class, DataPage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(DataPage.get(0).getStrFirstName()).into(FIRST_NAME),
                Enter.theValue(DataPage.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(DataPage.get(0).getStrEmail()).into(EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(DataPage.get(0).getStrBirthDayMonth()).from(BIRTHDAY_MONTH),
                        SelectFromOptions.byVisibleText(DataPage.get(0).getGetStrBirthDayDay()).from(BIRTHDAY_DAY),
                                SelectFromOptions.byVisibleText(DataPage.get(0).getGetStrBirthDayYear()).from(BIRTHDAY_YEAR),
                Click.on(CONTAINER_LANGUAJE_SPOKEN),
                Enter.theValue(DataPage.get(0).getStrLanguajesSpoken()).into(LANGUAJE_SPOKEN).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(NEXTLOCATION_BUTTON)

                );
    }
}
