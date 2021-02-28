package com.andriybobchuk.battleField;

import com.andriybobchuk.helperFunctions.Helpers;

public class GameBoard extends Cells{


    public static void update()
    {
        Helpers.clear();


        char[][] gameBoard = { {' ', getCell(0), ' ', '|', ' ', getCell(1), ' ', '|', ' ', getCell(2), ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', getCell(3), ' ', '|', ' ', getCell(4), ' ', '|', ' ', getCell(5), ' '},
                {' ', '-', ' ', '+', ' ', '-', ' ', '+', ' ', '-', ' '},
                {' ', getCell(6), ' ', '|', ' ', getCell(7), ' ', '|', ' ', getCell(8), ' '}
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
