package com.andriybobchuk.participants;


import com.andriybobchuk.battleField.GameBoard;
import com.andriybobchuk.battleField.Cells;

import java.util.Scanner;

public class Player {



    public static void move() {

        System.out.println("\n You have to choose the cell: ");

        // Get user's decision
        Scanner input = new Scanner(System.in);
        int cell = input.nextInt();


        if(Cells.isEmpty((cell-1)))
        {
            // Send the chosen cell to array of filled cells
            Cells.setCell((cell-1), 'O');

            // Refresh the gameBoard
            GameBoard.update();
        }
        else
        {
            System.out.println("Cell is already occupied, choose another one!");
            move();
        }

        Judge.confirmVictory();

    }

}
