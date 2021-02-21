package com.andriybobchuk;


public class Main {

    /**
     * The TicTacToe game
     * Andrii Bobchuk
     * NOTE 0: (I don't care)
     *
     * So at first we print empty field, numerical table on the right, and terminal UI on the bottom:
     *      "- Make your move > _"
     * Player chooses num between 1-9;
     *
     * Program clears empty table (clrscr);
     * Prints gameBoard again but with 'O' in the chosen place
     *
     * HOW?
     *
     * - Easy
     * There are 9 possible to fill empty spaces in the gameBoard
     * Simply calculated I knew they're:
     *      gameBoard[0][1],[0][5],[0][9]
     *      gameBoard[2][1],[2][5],[2][9]
     *      gameBoard[4][1],[4][5],[4][9]
     *
     *      I spent on it 30 seconds so it's an optimal solution. (see NOTE 0)
     *
     * After we know it we have to make the switch-case with user input and filling the corresponding cell
     *
     * Sounds quite easy
     * ...
     * But that's only the user part.......
     *
     * */


    public static void main(String[] args) throws InterruptedException {

        GameBoard.drawEmpty();

        Player.move();
        Player.move();
        Player.move();
    }





}
