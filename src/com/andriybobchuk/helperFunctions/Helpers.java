package com.andriybobchuk.helperFunctions;

import java.io.IOException;
import java.util.Random;

public class Helpers {

    /**
     * Randomly picks either Player or Opponent to start the game
     * @return opponent or player
     */
    public static String lot ()
    {
        Random rand = new Random();

        return (rand.nextInt(2) == 0) ? "opponent" : "player";
    }


    /**
    Checks if the string can be converted to number
     */
    public static boolean isNumeric(char c) {

        return (Character.isDigit(c)) ? true : false;
    }


    /**
     * Converts 1D array to 2D array
     * @param array1d
     * @return array2d
     */
    public static char[][] toMatrix(char[] array1d)
    {
        char array2d[][] = new char[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                array2d[i][j] = array1d[(j*3) + i];

        return array2d;
    }


    /**
     * Clears screen
     */
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
