package com.andriybobchuk;

import com.andriybobchuk.participants.Judge;

import java.util.Scanner;

public class Statistics {

    static java.util.prefs.Preferences pref = java.util.prefs.Preferences.userNodeForPackage(Judge.class);

    public static void updateStats(String winner)
    {
        pref.putInt(winner, pref.getInt(winner, 0) + 1);
    }

    public static void showStats()
    {
        System.out.println("\nSTATISTICS:");
        System.out.println("O - Victories: " + pref.getInt(String.valueOf('O'), 0));
        System.out.println("X - Loses: " + pref.getInt(String.valueOf('X'), 0));
        System.out.println("XO - Draws: " + pref.getInt("XO", 0));
        System.out.println("Total: " + (pref.getInt("XO", 0) + pref.getInt(String.valueOf('X'), 0) + pref.getInt(String.valueOf('O'), 0)));

        System.out.println("\nNew Game? (Y/N)");

        Scanner input = new Scanner(System.in);
        if(input.next().equalsIgnoreCase("Y"))
        {
            Main.main(null);
        }
        else
        {
            System.exit(0);
        }
    }

}
