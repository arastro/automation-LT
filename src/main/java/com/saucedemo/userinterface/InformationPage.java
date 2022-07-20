package com.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformationPage {

    public static final Target INPUT_FISTNAME =
            Target.the("firstname input")
                    .located(By.id("first-name"));

    public static final Target INPUT_LASTNAME =
            Target.the("lastname input")
                    .located(By.id("last-name"));

    public static final Target INPUT_ZIP =
            Target.the("zip input")
                    .located(By.id("postal-code"));

    public static final Target BTN_CONTINUE =
            Target.the("continue button")
                    .located(By.id("continue"));

}
