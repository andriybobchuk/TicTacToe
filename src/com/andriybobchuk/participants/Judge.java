package com.andriybobchuk.participants;

import com.andriybobchuk.helpers.Translator;
import com.andriybobchuk.values.Cells;


/**
 * This guy checks who won the game
 */
public class Judge {


    public static void determineWinner(String winner)
    {
        System.out.println(winner + " has won!");
        System.exit(0);
    }


    public static void confirmVictory()
    {
        String[][] board = Translator.matrixFrom(Cells.getWholeArray());

        //horizontal lines
        for(int i = 0; i<3; i++){
            if(board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])){
                determineWinner(board[i][0]);
            }
        }

        //vertical lines
        for(int i = 0; i<3; i++){
            if(board [0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])){
                determineWinner(board[0][i]);
            }
        }

        // main diagonal line
        if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
            determineWinner(board[0][0]);

        // secondary diagonal line
        if(board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]))
            determineWinner(board[2][0]);
    }

}
