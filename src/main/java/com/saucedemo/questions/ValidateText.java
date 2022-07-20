package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateText implements Question<Boolean> {

    private final String expected;
    private final String actual;

    public ValidateText(String expected, String actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (expected.equals(actual)) {
            return true;
        }
        return false;
    }


    public static ValidateText inThePage(String expected, String actual) {
        return new ValidateText(expected, actual);
    }
}
