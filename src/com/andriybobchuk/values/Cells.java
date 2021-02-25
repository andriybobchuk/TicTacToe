package com.andriybobchuk.values;

import com.andriybobchuk.helpers.Trifles;

public class Cells {

    /** This is the array of 9 cells
     * Each of them can be either filled or empty (true or false)
     * Basically this array holds the main game information.
     */
    private static String[] filledCells = new String[9];




    public static String[] getWholeArray() {
        return filledCells;
    }

    public static String getFilledCells(int index) {
        return filledCells[index];
    }


    public static void setFilledCells(int index, String id) {
        filledCells[index] = id;
    }

    public static void resetAllCells() {
        for (int i = 0; i < 9; i++)
        {
            filledCells[i] = String.valueOf(i+1);

        }
    }

    /**
     * Checks if the cell is empty
     * @param index
     * @return
     */
    public static boolean emptyCell(int index)
    {
        if(!Trifles.isNumeric(filledCells[index]))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
