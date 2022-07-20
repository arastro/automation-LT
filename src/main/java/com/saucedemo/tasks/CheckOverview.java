package com.saucedemo.tasks;

import com.saucedemo.questions.ValidateText;
import com.saucedemo.userinterface.CompletePage;
import com.saucedemo.userinterface.OverviewPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CheckOverview implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        Serenity.reportThat("Soft Assertion between name of the product and name of the product added in the overview",
                () -> actor.should(seeThat(ValidateText.inThePage(Serenity.sessionVariableCalled("productName"), OverviewPage.PRODUCT_NAME.resolveFor(actor).getText()))));
        actor.attemptsTo(Click.on(OverviewPage.BTN_FINISH));
        Serenity.setSessionVariable("actualMessage").to(CompletePage.LABEL_SUCCESS_PRODUCT.resolveFor(actor).getText());

    }

    public static CheckOverview ofThePurchase(){
        return Tasks.instrumented(CheckOverview.class);
    }
}
