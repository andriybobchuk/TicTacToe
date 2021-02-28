package com.andriybobchuk.battleField;

import com.andriybobchuk.helperFunctions.Helpers;

import java.util.ArrayList;
import java.util.Random;

public class Cells {


    private static char[] cells = new char[9];


    /**
     * Returns all at once
     * @return whole cells array
     */
    public static char[] getAllCells() {
        return cells;
    }


    /**
     * Returns the required cell
     * @param index of cell you need
     * @return cell
     */
    public static char getCell(int index) {
        return cells[index];
    }


    /**
     * Fill the required cell by 'X' or 'O'
     * @param index cell you require
     * @param id sign to fill the cell with (X\O)
     */
    public static void setCell(int index, char id) {
        cells[index] = id;
    }


    /**
     * Fills cells with consecutive numbers on start
     */
    public static void resetCells() {
        for (int i = 0; i < 9; i++)
        {
            cells[i] = Character.forDigit(i+1,10);
        }
    }


    /**
     * Checks if the cell is empty.
     * @param index
     * @return
     */
    public static boolean isEmpty(int index)
    {
        return (!Helpers.isNumeric(cells[index])) ? false : true;
    }


    /**
     * Fills random corner.
     * @return true if execution finished successfully.
     */
    public static boolean fillRandomCorner()
    {
        int[] CORNERS_INDICES = {0, 2, 6, 8};
        ArrayList<Integer> emptyCorners = new ArrayList<Integer>(4);  // Capacity != Size

        // First check if we have any empty corner:
        for(int i = 0; i < 4; i++)
        {
            if(isEmpty(CORNERS_INDICES[i]))
            {
                emptyCorners.add(CORNERS_INDICES[i]);
            }
        }



        // Then fill any of the EMPTY corners
        if(!emptyCorners.isEmpty())
        {
            Random rand = new Random();

            int cell = emptyCorners.get(rand.nextInt(emptyCorners.size()));

            if(isEmpty(cell))
            {
                setCell(cell, 'X');
                return true;
            }
        }

        return false;
    }
}
