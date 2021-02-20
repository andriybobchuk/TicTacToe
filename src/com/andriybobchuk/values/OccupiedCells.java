package com.andriybobchuk.values;

public class OccupiedCells {

    private boolean[] filledCells = new boolean[9];



    public boolean getFilledCells(int index) {
        return filledCells[index];
    }

    public void setFilledCells(int index) {
        this.filledCells[index] = true;
    }
}
