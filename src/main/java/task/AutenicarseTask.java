package task;

import models.Autenticarse;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.loginPage;

public class AutenicarseTask implements Task {

    private Autenticarse autenticarse;

    public AutenicarseTask (Autenticarse autenticarse){
        this.autenticarse=autenticarse;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Username: " + autenticarse.getUsername());
        System.out.println("Password: " + autenticarse.getPassword());

        actor.attemptsTo(

                Click.on(loginPage.MyAccount),
                Click.on(loginPage.login),
                Enter.theValue(autenticarse.getUsername()).into(loginPage.username),
                Enter.theValue(autenticarse.getPassword()).into(loginPage.password),
                Click.on(loginPage.buttonLogin)
        );


    }

    public static AutenicarseTask conCredenciales(Autenticarse autenticarse){
        return Instrumented.instanceOf(AutenicarseTask.class).withProperties(autenticarse);
    }
}
