package com.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletePage {

    public static final Target LABEL_SUCCESS_PRODUCT =
            Target.the("finish product label")
                    .located(By.xpath("//div[@id='header_container']/div[2]/span"));
}
