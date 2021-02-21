package com.andriybobchuk.values;

public class Cells {

    /** This is the array of 9 cells
     * Each of them can be either filled or empty (true or false)
     * Basically this array holds the main game information.
     */
    private static boolean[] filledCells = new boolean[9];


    /**
     * We need it when we want to print the table.
     * @return whole array with all cells data
     */
    public boolean getFilledCells(int index) {
        return filledCells[index];
    }

    /**
     * Sets the chosen cell to filled (TRUE)
     * @param index index of cell to be filled
     */
    public static void setFilledCells(int index) {
        filledCells[index] = true;
    }
}
