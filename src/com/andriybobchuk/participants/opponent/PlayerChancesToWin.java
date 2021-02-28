package com.andriybobchuk.participants.opponent;

import com.andriybobchuk.helperFunctions.Helpers;
import com.andriybobchuk.battleField.Cells;

class PlayerChancesToWin extends Cells{


    public static boolean removePlayerWinPossibilities()
    {
        char[][] board = Helpers.toMatrix(getAllCells());

        if (removeVerticalHazards(board)) return true;

        if (removeHorizontalHazards(board)) return true;

        if (removeMainDiagonalHazards(board)) return true;

        if (removeSecondaryDiagonalHazards(board)) return true;


        return false;
    }


    public static boolean removeVerticalHazards(char[][] board)
    {
        //vertical lines
        for(int i = 0; i<3; i++){


            String line = Character.toString(board[i][0]) + Character.toString(board[i][1]) + Character.toString(board[i][2]);

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

                    if(isEmpty(index))
                    {
                        setCell(index, 'X');
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean removeHorizontalHazards(char[][] board)
    {
        // Horizontal lines
        for(int i = 0; i<3; i++){


            String line = Character.toString(board[0][i]) + Character.toString(board[1][i]) + Character.toString(board[2][i]);

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

                    if(isEmpty(index))
                    {
                        setCell(index, 'X');
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static boolean removeMainDiagonalHazards(char[][] board)
    {

        // Main Diagonal
        String line = Character.toString(board[0][0]) + Character.toString(board[1][1]) + Character.toString(board[2][2]);

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

                        if(isEmpty(index))
                        {
                            setCell(index, 'X');
                            return true;
                        }
                    }

                }

            }

        }

        return false;
    }


    public static boolean removeSecondaryDiagonalHazards(char[][] board)
    {

        // Secondary Diagonal
        String line = Character.toString(board[2][0]) + Character.toString(board[1][1]) + Character.toString(board[0][2]);

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

                        if(isEmpty(index))
                        {
                            setCell(index, 'X');
                            return true;
                        }
                    }

                }

            }

        }
        return false;
    }


}
