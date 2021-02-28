package com.andriybobchuk.battleField;

import com.andriybobchuk.helperFunctions.Helpers;
import com.andriybobchuk.battleField.Cells;

public class GameBoard extends Cells{


    public static void update()
    {
        Helpers.clear();


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
