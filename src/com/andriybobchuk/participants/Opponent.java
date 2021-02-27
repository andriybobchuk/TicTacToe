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


    public static void move()  {



        //TODO: check if removed hazards
        removePlayerPossibilities();

        while(true) // Runs until we fill the cell
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




        // Refresh the gameBoard
        GameBoard.update();

    }


    public static boolean removePlayerPossibilities()
    {
        String[][] board = Translator.matrixFrom(Cells.getWholeArray());


        //vertical lines
        for(int i = 0; i<3; i++){
            /**
             * in each row we have row. If 2 cells of that row are the same and they are equal to player
             * than the third one should be taken by us to prevent player from the win.
             * We don't know where we have to put the cross cuz every time it will be different.
             * With that in mind I will just try to fill each cell of that row with 'X' and after all, the one I
             * really need will be filled.
             * I am so smart
             */

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
                    }
                }
                return true;
            }
        }



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
                    }
                }
                return true;
            }
        }


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


        // Secondary Diagonal

        // Main Diagonal
        String line1 = board[2][0] + board[1][1] + board[0][2];

        int playerCounter1 = 0;

        for(int g = 0; g < line1.length(); g++)
        {
            if(line1.charAt(g) == 'p' && line1.charAt(g+1) == 'l')
            {
                playerCounter1++;
            }
            // if we have our 'X' in the line with potential hazard than it is not a hazard ↓
            if(line1.charAt(g) == 'o' && line1.charAt(g+1) == 'p')
            {
                playerCounter1 = 0;
            }

        }

        if (playerCounter1 == 2)
        {
            System.out.println("Main diagonal hazard");
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






}
