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
                Judge.confirmVictory();

                Player.move();
                Judge.confirmVictory();
            }

            Opponent.move();
            Judge.confirmVictory();
        }
        if(lot().equals("player"))
        {
            System.out.println("You go first");

            for(int i = 0; i < 4; i++)
            {
                Player.move();
                Judge.confirmVictory();

                Opponent.move();
                Judge.confirmVictory();
            }
            Player.move();
            Judge.confirmVictory();

        }
        else
        {
            System.out.println("Lot was \"" + lot() + "\" ");
        }

        System.out.println("Draw XO!");


    }





}
