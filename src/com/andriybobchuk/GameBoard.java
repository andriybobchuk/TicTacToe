package com.andriybobchuk;

import com.andriybobchuk.helpers.ClearScreen;
import com.andriybobchuk.values.Cells;

public class GameBoard {


    /**
     * - Converts 1d array of strings to 1d array of chars
     * - Converts 1d array of chars to 2d array of chars
     * - prints it
     */
    public static void update()
    {
        ClearScreen.clear();      // Clear previous stuff


        char[] tic = new char[9];

        for (int i = 0; i < 9; i++)
        {
            if(Cells.getFilledCells(i) == "player")
            {
                tic[i] = 'O';
            }
            else if(Cells.getFilledCells(i) == "opponent")
            {
                tic[i] = 'X';
            }
            else
            {
                tic[i] = Character.forDigit(i+1,10);
            }
        }


        char[][] gameBoard = { {' ', tic[0], ' ', '|', ' ', tic[1], ' ', '|', ' ', tic[2], ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', tic[3], ' ', '|', ' ', tic[4], ' ', '|', ' ', tic[5], ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', tic[6], ' ', '|', ' ', tic[7], ' ', '|', ' ', tic[8], ' '}
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
