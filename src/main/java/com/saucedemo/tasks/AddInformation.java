package com.saucedemo.tasks;

import com.saucedemo.models.UserModel;
import com.saucedemo.userinterface.InformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddInformation implements Task {

    private UserModel userModel;

    public AddInformation(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(userModel.getName()).into(InformationPage.INPUT_FISTNAME),
                Enter.theValue(userModel.getLastname()).into(InformationPage.INPUT_LASTNAME),
                Enter.theValue(userModel.getZip()).into(InformationPage.INPUT_ZIP),
                Click.on(InformationPage.BTN_CONTINUE)
        );

    }


    public static AddInformation inTheFields(UserModel userModel) {
        return Tasks.instrumented(AddInformation.class, userModel);
    }
}
