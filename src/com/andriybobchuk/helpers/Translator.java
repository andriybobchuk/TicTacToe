package com.andriybobchuk.helpers;

public class Translator {


    /**
     * Converts 1D array to 2D array
     * @param array1d
     * @return array2d
     */
    public static String[][] matrixFrom(String[] array1d)
    {
        String array2d[][] = new String[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                array2d[i][j] = array1d[(j*3) + i];

        return array2d;
    }
}
