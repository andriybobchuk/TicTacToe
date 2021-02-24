package com.andriybobchuk.values;

public class Cells {

    /** This is the array of 9 cells
     * Each of them can be either filled or empty (true or false)
     * Basically this array holds the main game information.
     */
    private static String[] filledCells = new String[9];


    /**
     * We need it when we want to print the table.
     * @return whole array with all cells data
     */
    public static String getFilledCells(int index) {
        return filledCells[index];
    }

    /**
     * Sets the chosen cell to filled (TRUE)
     * @param index index of cell to be filled
     */
    public static void setFilledCells(int index, String id) {
        filledCells[index] = id;
    }


    public static boolean emptyCell(int index)
    {
        if(filledCells[index] != null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
