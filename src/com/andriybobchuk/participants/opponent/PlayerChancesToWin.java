package com.andriybobchuk.participants.opponent;

import com.andriybobchuk.helperFunctions.Helpers;
import com.andriybobchuk.battleField.Cells;

class PlayerChancesToWin extends Cells{


    public static boolean removePlayerWinPossibilities()
    {
        String[][] board = Helpers.toMatrix(getWholeArray());

        if (removeVerticalHazards(board)) return true;

        if (removeHorizontalHazards(board)) return true;

        if (removeMainDiagonalHazards(board)) return true;

        if (removeSecondaryDiagonalHazards(board)) return true;


        return false;
    }


    public static boolean removeVerticalHazards(String[][] board)
    {
        //vertical lines
        for(int i = 0; i<3; i++){


            String line = board[i][0] + board[i][1] + board[i][2];

            int playerCounter = 0;

            for(int g = 0; g < line.length(); g++)
            {
                if(line.charAt(g) == 'O')
                {
                    playerCounter++;
                }
            }

            if (playerCounter == 2)
            {
                // System.out.println("Vertical hazard");
                // Remove that hazard by placing the 'X' in danger line

                for(int j = 0; j < 3; j++)
                {
                    int index = (j*3) + i;

                    if(emptyCell(index))
                    {
                        setFilledCells(index, "X");
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
                if(line.charAt(g) == 'O')
                {
                    playerCounter++;
                }
            }

            if (playerCounter == 2)
            {
                // System.out.println("Horizontal hazard");
                // Remove that hazard by placing the 'X' in danger line

                for(int j = 0; j < 3; j++)
                {
                    int index = (i*3) + j;

                    if(emptyCell(index))
                    {
                        setFilledCells(index, "X");
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
            if(line.charAt(g) == 'O')
            {
                playerCounter++;
            }
        }

        if (playerCounter == 2)
        {
            // System.out.println("Main diagonal hazard");
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
                            setFilledCells(index, "X");
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
            if(line.charAt(g) == 'O')
            {
                playerCounter++;
            }
        }

        if (playerCounter == 2)
        {
            // System.out.println("Secondary diagonal hazard");
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
                            setFilledCells(index, "X");
                            return true;
                        }
                    }

                }

            }

        }
        return false;
    }


}
