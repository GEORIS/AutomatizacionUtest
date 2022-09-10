package co.com.choucair.georis.questions;

import co.com.choucair.georis.model.DataUtestPage;
import co.com.choucair.georis.userinterface.PasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Response implements Question<Boolean> {

    private List<DataUtestPage> DataPage;

    public Response(List<DataUtestPage> DataPage) {
        this.DataPage = DataPage;
    }

    public static Response thePage(List<DataUtestPage> DataPage) {
        return new Response(DataPage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String BUTTON_COMPLETE = Text.of(PasswordPage.BUTTON_COMPLETE_SETUP).viewedBy(actor).asString();
        return DataPage.get(0).getStrFinalText().equals(BUTTON_COMPLETE);
    }
}
