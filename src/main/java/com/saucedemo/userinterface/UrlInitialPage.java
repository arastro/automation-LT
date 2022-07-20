package com.saucedemo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class UrlInitialPage extends PageObject {

    public static final Target INPUT_USERNAME = Target
            .the("input username")
            .located(By.id("user-name"));

    public static final Target INPUT_PASSWORD = Target
            .the("input password")
            .located(By.id("password"));

    public static final Target BTN_LOGIN = Target
            .the("login button")
            .located(By.id("login-button"));
}
