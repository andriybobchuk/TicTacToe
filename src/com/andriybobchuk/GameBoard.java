package com.andriybobchuk;

import com.andriybobchuk.helpers.ClearScreen;
import com.andriybobchuk.values.Cells;

public class GameBoard {



    public static final void drawEmpty()
    {
        char[][] gameBoard = { {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '}
        };

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 11; j++)
            {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }


    public static final void update()
    {
        ClearScreen.clear();      // Clear previous stuff


        char[] tic = new char[9];

        for (int i = 0; i < 9; i++)
        {
            if(new Cells().getFilledCells(i) == true)
            {
                tic[i] = 'O';
            }
            else
            {
                tic[i] = ' ';
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
