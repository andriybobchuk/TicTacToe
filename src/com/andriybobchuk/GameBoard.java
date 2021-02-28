package com.andriybobchuk;

import com.andriybobchuk.helpers.ClearScreen;
import com.andriybobchuk.values.Cells;

public class GameBoard extends Cells{


    /**
     * - Converts 1d array of strings to 1d array of chars
     * - Converts 1d array of chars to 2d array of chars
     * - prints it
     */
    public static void update()
    {
        ClearScreen.clear();      // Clear previous stuff


//        char[] tic = new char[9];
//
//        for (int i = 0; i < 9; i++)
//        {
//            if(getFilledCells(i) == "player")
//            {
//                tic[i] = 'O';
//            }
//            else if(getFilledCells(i) == "opponent")
//            {
//                tic[i] = 'X';
//            }
//            else
//            {
//                tic[i] = (char)getFilledCells(i).charAt(0);
//            }
//        }


        char[][] gameBoard = { {' ', getFilledCells(0).charAt(0), ' ', '|', ' ', getFilledCells(1).charAt(0), ' ', '|', ' ', getFilledCells(2).charAt(0), ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', getFilledCells(3).charAt(0), ' ', '|', ' ', getFilledCells(4).charAt(0), ' ', '|', ' ', getFilledCells(5).charAt(0), ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', getFilledCells(6).charAt(0), ' ', '|', ' ', getFilledCells(7).charAt(0), ' ', '|', ' ', getFilledCells(8).charAt(0), ' '}
        };



        // Draw the GameBoard
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 11; j++)
            {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }
}
