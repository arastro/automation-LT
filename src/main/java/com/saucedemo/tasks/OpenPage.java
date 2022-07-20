package com.saucedemo.tasks;

import com.saucedemo.userinterface.UrlInitialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {

    private UrlInitialPage urlInitialPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(urlInitialPage));

    }

    public static OpenPage inTheBrowser(){
        return Tasks.instrumented(OpenPage.class);
    }
}
