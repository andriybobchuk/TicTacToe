package com.andriybobchuk.helpers;

import java.util.Random;

public class Trifles {

    public static String lot ()
    {
        Random rand = new Random();
        int whoFirst = rand.nextInt(2);
        String result = (whoFirst == 0) ? "opponent" : "player";

        return result;
    }


    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }


}
