package com.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target LABEL_PRODUCT_AT_CART =
            Target.the("name of the product")
                    .located(By.xpath("//div[@class='inventory_item_name']"));

    public static final Target BTN_CHECKOUT =
            Target.the("checkout button")
                    .located(By.id("checkout"));

}
