package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.AbrirUrl;
import models.Autenticarse;
import models.Constantes;
import net.serenitybdd.screenplay.actors.OnStage;
import task.AbrirUrlTask;
import task.AutenicarseTask;

public class BuyMacBookHomepageStepDefinitions {


    @Given("user logged")
    public void userLogged(DataTable dataTable){

        OnStage.theActorCalled(Constantes.ACTOR).wasAbleTo(AbrirUrlTask.conUrl(AbrirUrl.setData(dataTable).get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(AutenicarseTask.conCredenciales(Autenticarse.setData(dataTable).get(0)));
    }

   @When("user buy the mac book")
     public void UserBuyMac(DataTable dataTable){

     }

    // @Then("user validate purchase sucess")
    // public void userValidatePurchase(DataTable dataTable){

    //}

}
