package com.saucedemo.utils;

import java.util.Random;

public class LogicUtil {

    /**
     * get random number
     * @return a string between 1 and 6
     */
    public static String ramdonValue(){
        Random random = new Random();
        return String.valueOf(random.nextInt(5) + 1);
    }

}
