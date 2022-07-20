package com.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage {

    public static final Target BTN_ADD_PRODUCT =
            Target.the("button add product")
                    .locatedBy("(//div[@class='inventory_item']//descendant::button[contains(@class,'btn_inventory')])[{0}]");

    public static final Target LABEL_PRODUCT =
            Target.the("label of product")
                    .locatedBy("(//div[@class='inventory_item']//descendant::div[contains(@class,'inventory_item_name')])[{0}]");

    public static final Target BTN_CART =
            Target.the("go to the cart button")
                    .located(By.xpath("//div[@id='shopping_cart_container']/a"));
}
