package com.andriybobchuk.helpers;

import java.util.Vector;

public class GameBoard {


    /**
     * HA-HA
     * POLYMORPHISM!
     *
     * This method prints empty GameBoard ↓
     */
    public static final void printGameBoard()
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


    /**
     * This method prints GameBoard filled with user's and AI's moves
     * @param cellsToDraw
     */
    public static final void printGameBoard(Vector cellsToDraw)
    {
        new ClearScreen().clear();


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
}
