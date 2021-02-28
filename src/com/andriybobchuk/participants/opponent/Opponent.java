package com.andriybobchuk.participants.opponent;

import com.andriybobchuk.battleField.GameBoard;
import com.andriybobchuk.participants.Judge;
import com.andriybobchuk.battleField.Cells;

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



        if(PlayerChancesToWin.removePlayerWinPossibilities() == false) defMove();


        GameBoard.update();
        Judge.confirmVictory();

    }



    public static void defMove ()
    {
        while(true) // Runs until we fill any empty cell
        {
            if(nextEmptyCornerIndex() != -1)
            {
                setFilledCells(nextEmptyCornerIndex(), 'X');
                break;
            }
            else // no empty corners
            {
                Random rand = new Random();
                int cell = rand.nextInt(9);

                if(emptyCell(cell))
                {
                    setFilledCells(cell, 'X');
                    break;
                }
            }

        }
    }




}
