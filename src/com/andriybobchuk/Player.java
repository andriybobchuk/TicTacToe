package com.andriybobchuk;


import com.andriybobchuk.values.Cells;

import java.util.Scanner;

class Player {



    public static void move() throws InterruptedException {

        System.out.println("\n (You have to choose the cell)");

        // Get user's decision
        Scanner input = new Scanner(System.in);
        int cell = input.nextInt();


        // Send the chosen cell to array of filled cells
        Cells.setFilledCells(cell);


        // Refresh the gameBoard
        GameBoard.update();

    }

}
