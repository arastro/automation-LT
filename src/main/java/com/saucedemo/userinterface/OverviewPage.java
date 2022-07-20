package com.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OverviewPage {

    public static final Target PRODUCT_NAME =
            Target.the("product name")
                    .located(By.xpath("//div[@class='inventory_item_name']"));

    public static final Target BTN_FINISH =
            Target.the("finish button")
                    .located(By.id("finish"));
}
