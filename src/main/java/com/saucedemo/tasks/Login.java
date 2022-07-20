package com.saucedemo.tasks;

import com.saucedemo.models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterface.UrlInitialPage.*;

public class Login implements Task {

    private final LoginModel loginModel;

    public Login(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(loginModel.getUsername()).into(INPUT_USERNAME),
                Enter.theValue(loginModel.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static Login inPage(LoginModel loginModel) {
        return Tasks.instrumented(Login.class, loginModel);
    }
}
