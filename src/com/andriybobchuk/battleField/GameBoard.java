package com.andriybobchuk.battleField;

import com.andriybobchuk.helperFunctions.Helpers;
import com.andriybobchuk.battleField.Cells;

public class GameBoard extends Cells{


    public static void update()
    {
        Helpers.clear();


        char[][] gameBoard = { {' ', getFilledCells(0), ' ', '|', ' ', getFilledCells(1), ' ', '|', ' ', getFilledCells(2), ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', getFilledCells(3), ' ', '|', ' ', getFilledCells(4), ' ', '|', ' ', getFilledCells(5), ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', getFilledCells(6), ' ', '|', ' ', getFilledCells(7), ' ', '|', ' ', getFilledCells(8), ' '}
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
