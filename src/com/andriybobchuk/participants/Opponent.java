package com.andriybobchuk.participants;

import com.andriybobchuk.GameBoard;
import com.andriybobchuk.helpers.Translator;
import com.andriybobchuk.values.Cells;

import java.util.Random;

public class Opponent extends Cells {


    /**
     * MAIN IDEA
     * On Opponent.move() we do the following actions:
     *
     *      - Check if player has any possibilities to win in the next step, if yes - remove it;
     *      - Check if opponent has any possibilities to win in the next step, if yes - do it;
     *      - if neither player nor opponent has any possibilities than put 'X' in random CORNER
     *      - if corners are full, put 'X' in ANY other cell, doesn't matter much at this point.
     *
     */

    public static void defMove ()
    {
        while(true) // Runs until we fill any empty cell
        {
            if(nextEmptyCornerIndex() != -1)
            {
                setFilledCells(nextEmptyCornerIndex(), "opponent");
                break;
            }
            else // no empty corners
            {
                Random rand = new Random();
                int cell = rand.nextInt(9);

                if(emptyCell(cell))
                {
                    setFilledCells(cell, "opponent");
                    break;
                }
            }

        }
    }

    public static void move()  {



        if(removePlayerWinPossibilities() == false) defMove();




        // Refresh the gameBoard
        GameBoard.update();

        Judge.confirmVictory();

    }

    public static boolean removeVerticalHazards(String[][] board)
    {
        //vertical lines
        for(int i = 0; i<3; i++){


            String line = board[i][0] + board[i][1] + board[i][2];

            int playerCounter = 0;

            for(int g = 0; g < line.length(); g++)
            {
                if(line.charAt(g) == 'p' && line.charAt(g+1) == 'l')
                {
                    playerCounter++;
                }
                // if we have our 'X' in the line with potential hazard than it is not a hazard ↓
                if(line.charAt(g) == 'o' && line.charAt(g+1) == 'p')
                {
                    playerCounter = 0;
                }

            }

            if (playerCounter == 2)
            {
                System.out.println("Vertical hazard");
                //&
                // Remove that hazard by placing the 'X' in danger line

                for(int j = 0; j < 3; j++)
                {
                    int index = (j*3) + i;

                    if(emptyCell(index))
                    {
                        setFilledCells(index, "opponent");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean removeHorizontalHazards(String[][] board)
    {
        // Horizontal lines
        for(int i = 0; i<3; i++){


            String line = board[0][i] + board[1][i] + board[2][i];

            int playerCounter = 0;

            for(int g = 0; g < line.length(); g++)
            {
                if(line.charAt(g) == 'p' && line.charAt(g+1) == 'l')
                {
                    playerCounter++;
                }
                // if we have our 'X' in the line with potential hazard than it is not a hazard ↓
                if(line.charAt(g) == 'o' && line.charAt(g+1) == 'p')
                {
                    playerCounter = 0;
                }

            }

            if (playerCounter == 2)
            {
                System.out.println("Horizontal hazard");
                //&
                // Remove that hazard by placing the 'X' in danger line

                for(int j = 0; j < 3; j++)
                {
                    int index = (i*3) + j;

                    if(emptyCell(index))
                    {
                        setFilledCells(index, "opponent");
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static boolean removeMainDiagonalHazards(String[][] board)
    {

        // Main Diagonal
        String line = board[0][0] + board[1][1] + board[2][2];

        int playerCounter = 0;

        for(int g = 0; g < line.length(); g++)
        {
            if(line.charAt(g) == 'p' && line.charAt(g+1) == 'l')
            {
                playerCounter++;
            }
            // if we have our 'X' in the line with potential hazard than it is not a hazard ↓
            if(line.charAt(g) == 'o' && line.charAt(g+1) == 'p')
            {
                playerCounter = 0;
            }

        }

        if (playerCounter == 2)
        {
            System.out.println("Main diagonal hazard");
            //&
            // Remove that hazard by placing the 'X' in danger line

            for (int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    if( i == j )
                    {
                        int index = (i*3) + j;

                        if(emptyCell(index))
                        {
                            setFilledCells(index, "opponent");
                            return true;
                        }
                    }

                }

            }

        }

        return false;
    }


    public static boolean removeSecondaryDiagonalHazards(String[][] board)
    {

        // Secondary Diagonal
        String line = board[2][0] + board[1][1] + board[0][2];

        int playerCounter = 0;

        for(int g = 0; g < line.length(); g++)
        {
            if(line.charAt(g) == 'p' && line.charAt(g+1) == 'l')
            {
                playerCounter++;
            }
            // if we have our 'X' in the line with potential hazard than it is not a hazard ↓
            if(line.charAt(g) == 'o' && line.charAt(g+1) == 'p')
            {
                playerCounter = 0;
            }

        }

        if (playerCounter == 2)
        {
            System.out.println("Secondary diagonal hazard");
            //&
            // Remove that hazard by placing the 'X' in danger line

            for (int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    if( i + j == 2 )
                    {
                        int index = (i*3) + j;

                        if(emptyCell(index))
                        {
                            setFilledCells(index, "opponent");
                            return true;
                        }
                    }

                }

            }

        }
        return false;
    }


    public static boolean removePlayerWinPossibilities()
    {
        String[][] board = Translator.matrixFrom(Cells.getWholeArray());

        if (removeVerticalHazards(board)) return true;

        if (removeHorizontalHazards(board)) return true;

        if (removeMainDiagonalHazards(board)) return true;

        if (removeSecondaryDiagonalHazards(board)) return true;


        return false;
    }






}
