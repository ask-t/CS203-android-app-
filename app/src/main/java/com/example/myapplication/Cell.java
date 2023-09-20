package com.example.myapplication;

import android.graphics.RectF;

public class Cell {
    public int x;
    public int y;
    public RectF absolute;
    public int colorNum;

    public Cell(int x, int y, RectF absolute, int colorNum){
        this.x = x;
        this.y = y;
        this.absolute = absolute;
        this.colorNum = colorNum;
    }
}
