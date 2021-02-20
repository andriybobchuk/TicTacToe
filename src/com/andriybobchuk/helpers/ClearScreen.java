package com.andriybobchuk.helpers;

import java.io.IOException;

/**
 * So this thing just clears the console
 */
public class ClearScreen {

    public static void clear()
    {
        try
        {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}

        System.out.println();
    }

}
