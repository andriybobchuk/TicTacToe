package com.andriybobchuk;


import com.andriybobchuk.helperFunctions.Helpers;
import com.andriybobchuk.participants.Judge;
import com.andriybobchuk.participants.opponent.Opponent;
import com.andriybobchuk.participants.Player;
import com.andriybobchuk.battleField.Cells;

public class Main extends Helpers {


    public static void main(String[] args) {

        Cells.resetCells();

        String turn = lot();

        if(turn.equals("opponent"))
        {
//            System.out.println("Opponent goes first (X)");

            for(int i = 0; i < 4; i++)
            {
                Opponent.move();
                Player.move();
            }

            Opponent.move();
        }
        else if(turn.equals("player"))
        {
            System.out.println("You go first (O)");

            for(int i = 0; i < 4; i++)
            {
                Player.move();
                Opponent.move();
            }

            Player.move();
        }


        System.out.println("\nDraw XO!");
        Statistics.updateStats("XO");
        Judge.replayQuestion();


    }





}
