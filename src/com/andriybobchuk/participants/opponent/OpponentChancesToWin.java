package com.andriybobchuk.participants.opponent;

import com.andriybobchuk.battleField.Cells;
import com.andriybobchuk.helperFunctions.Helpers;

public class OpponentChancesToWin extends Cells {


    public static boolean useWinPossibilities()
    {
        char[][] board = Helpers.toMatrix(getAllCells());

        if (tryVertical(board)) return true;

        if (tryHorizontal(board)) return true;

        if (tryMainDiagonal(board)) return true;

        if (trySecondaryDiagonal(board)) return true;


        return false;
    }


    public static boolean tryVertical(char[][] board)
    {
        //vertical lines
        for(int i = 0; i<3; i++){


            String line = Character.toString(board[i][0]) + Character.toString(board[i][1]) + Character.toString(board[i][2]);

            int opponentCounter = 0;

            for(int g = 0; g < line.length(); g++)
            {
                if(line.charAt(g) == 'X')
                {
                    opponentCounter++;
                }
            }

            if (opponentCounter == 2)
            {
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

    public static boolean tryHorizontal(char[][] board)
    {
        // Horizontal lines
        for(int i = 0; i<3; i++){


            String line = Character.toString(board[0][i]) + Character.toString(board[1][i]) + Character.toString(board[2][i]);

            int opponentCounter = 0;

            for(int g = 0; g < line.length(); g++)
            {
                if(line.charAt(g) == 'X')
                {
                    opponentCounter++;
                }
            }

            if (opponentCounter == 2)
            {
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


    public static boolean tryMainDiagonal(char[][] board)
    {

        // Main Diagonal
        String line = Character.toString(board[0][0]) + Character.toString(board[1][1]) + Character.toString(board[2][2]);

        int opponentCounter = 0;

        for(int g = 0; g < line.length(); g++)
        {
            if(line.charAt(g) == 'X')
            {
                opponentCounter++;
            }
        }

        if (opponentCounter == 2)
        {
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


    public static boolean trySecondaryDiagonal(char[][] board)
    {

        // Secondary Diagonal
        String line = Character.toString(board[2][0]) + Character.toString(board[1][1]) + Character.toString(board[0][2]);

        int opponentCounter = 0;

        for(int g = 0; g < line.length(); g++)
        {
            if(line.charAt(g) == 'X')
            {
                opponentCounter++;
            }
        }

        if (opponentCounter == 2)
        {
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
