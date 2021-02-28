package com.andriybobchuk;


import com.andriybobchuk.helpers.Trifles;
import com.andriybobchuk.participants.Opponent;
import com.andriybobchuk.participants.Player;
import com.andriybobchuk.values.Cells;

public class Main extends Trifles {


    public static void main(String[] args) {

        Cells.resetAllCells();

        String turn = lot();

        if(turn.equals("opponent"))
        {
            System.out.println("Opponent goes first..");

            for(int i = 0; i < 4; i++)
            {
                Opponent.move();
                Player.move();
            }

            Opponent.move();
        }
        if(turn.equals("player"))
        {
            System.out.println("You go first");

            for(int i = 0; i < 4; i++)
            {
                Player.move();
                Opponent.move();
            }

            Player.move();
        }
        else
        {
            System.out.println("Lot was \"" + turn + "\" ");
        }

        System.out.println("\nDraw XO!");


    }





}
