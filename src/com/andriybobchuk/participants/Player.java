package com.andriybobchuk.participants;


import com.andriybobchuk.GameBoard;
import com.andriybobchuk.values.Cells;

import java.util.Scanner;

public class Player {



    public static void move() throws InterruptedException {

        System.out.println("\n You have to choose the cell: ");

        // Get user's decision
        Scanner input = new Scanner(System.in);
        int cell = input.nextInt();


        if(Cells.emptyCell((cell-1)))
        {
            // Send the chosen cell to array of filled cells
            Cells.setFilledCells((cell-1), "player");

            // Refresh the gameBoard
            GameBoard.update();
        }
        else
        {
            System.out.println("Cell is already occupied, choose another one!");
            move();
        }

    }

}
