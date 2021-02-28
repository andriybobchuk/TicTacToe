package com.andriybobchuk.battleField;

import com.andriybobchuk.helperFunctions.Helpers;

public class Cells {



    private static String[] filledCells = new String[9];

    // Cell groups:
    static int[] CORNERS_INDICES = {0, 2, 6, 8};





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
        if(!Helpers.isNumeric(filledCells[index]))
        {
            return false;
        }
        else
        {
            return true;
        }
    }


    public static int nextEmptyCornerIndex()
    {
        int nextEmptyCornerIndex = -1;

        for (int i = 0; i < CORNERS_INDICES.length; i++)
        {
            if(emptyCell(CORNERS_INDICES[i]))
            {
                nextEmptyCornerIndex = CORNERS_INDICES[i];
            }
        }
        return nextEmptyCornerIndex;
    }
}
