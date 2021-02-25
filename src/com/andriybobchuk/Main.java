package com.andriybobchuk;


import com.andriybobchuk.helpers.Trifles;
import com.andriybobchuk.participants.Judge;
import com.andriybobchuk.participants.Opponent;
import com.andriybobchuk.participants.Player;
import com.andriybobchuk.values.Cells;

public class Main extends Trifles {


    public static void main(String[] args) {

        Cells.resetAllCells();


        if(lot().equals("opponent"))
        {
            System.out.println("Opponent goes first..");

            for(int i = 0; i < 4; i++)
            {
                Opponent.move();
                Judge.declareVictory();

                Player.move();
                Judge.declareVictory();
            }

            Opponent.move();
            Judge.declareVictory();
        }
        else if(lot().equals("player"))
        {
            System.out.println("You go first");

            for(int i = 0; i < 4; i++)
            {
                Player.move();
                Judge.declareVictory();

                Opponent.move();
                Judge.declareVictory();
            }
            Player.move();
            Judge.declareVictory();

        }

        System.out.println("Draw XO!");


    }





}
