package task;

import models.AbrirUrl;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUrlTask implements Task {

    private AbrirUrl abrirUrl;

    public AbrirUrlTask(AbrirUrl abrirUrl){
        this.abrirUrl=abrirUrl;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Open.url(abrirUrl.getUrl()),
                Browser.maximize()
        );

    }
    public static AbrirUrlTask conUrl(AbrirUrl abrirUrl){
        return Instrumented.instanceOf(AbrirUrlTask.class).withProperties(abrirUrl);
    }
}
