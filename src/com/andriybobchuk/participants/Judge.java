package com.andriybobchuk.participants;

import com.andriybobchuk.Main;
import com.andriybobchuk.Statistics;
import com.andriybobchuk.helperFunctions.Helpers;
import com.andriybobchuk.battleField.Cells;

import java.util.Scanner;
import java.util.prefs.Preferences;


/**
 * This guy checks who won the game
 */
public class Judge {



    public static void determineWinner(char winner)
    {
        System.out.println("\n'" + winner + "' Won!");

        // Update the statistics for the winner
        //Statistics s = new Statistics();
        Statistics.updateStats(String.valueOf(winner));

        replayQuestion();
    }


    public static void confirmVictory()
    {
        char[][] board = Helpers.toMatrix(Cells.getAllCells());

        //horizontal lines
        for(int i = 0; i<3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                determineWinner(board[i][0]);
            }
        }

        //vertical lines
        for(int i = 0; i<3; i++){
            if(board [0][i] == board[1][i] && board[1][i] == board[2][i]){
                determineWinner(board[0][i]);
            }
        }

        // main diagonal line
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
            determineWinner(board[0][0]);

        // secondary diagonal line
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2])
            determineWinner(board[2][0]);
    }


    public static void replayQuestion()
    {
        System.out.println("Once again? (Y/N)");
        System.out.println("Wanna see statistics? (S)");

        Scanner input = new Scanner(System.in);

        String userDecision = input.next();


        if (userDecision.equalsIgnoreCase("S"))
        {
            Statistics.showStats();
        }
        else if(userDecision.equalsIgnoreCase("Y"))
        {
            Main.main(null);
        }
        else
        {
            System.exit(0);
        }

    }


}
