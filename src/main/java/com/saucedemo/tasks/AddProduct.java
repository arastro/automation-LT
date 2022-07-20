package com.saucedemo.tasks;

import com.saucedemo.questions.ValidateText;
import com.saucedemo.userinterface.CartPage;
import com.saucedemo.userinterface.HomePage;
import com.saucedemo.utils.LogicUtil;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AddProduct implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        String product = LogicUtil.ramdonValue();
        Serenity.setSessionVariable("productName").to(HomePage.LABEL_PRODUCT.of(product).resolveFor(actor).getText());

        actor.attemptsTo(
                Click.on(HomePage.BTN_ADD_PRODUCT.of(product)),
                Click.on(HomePage.BTN_CART)
        );

        Serenity.reportThat("Soft Assertion between name of the product and name of the product added to the cart",
                () -> actor.should(seeThat(ValidateText.inThePage(Serenity.sessionVariableCalled("productName"), CartPage.LABEL_PRODUCT_AT_CART.resolveFor(actor).getText()))));

        actor.attemptsTo(Click.on(CartPage.BTN_CHECKOUT));
    }

    public static AddProduct toACar() {
        return Tasks.instrumented(AddProduct.class);
    }
}
