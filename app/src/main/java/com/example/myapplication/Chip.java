package com.example.myapplication;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class Chip {
    private static Paint lightC;
    private static Paint darkC;
    private static Paint gold;

    static{
        lightC = new Paint();
        lightC.setColor(Color.rgb(250,233,188));
        darkC = new Paint();
        darkC.setColor(Color.rgb(98,78,26));
        gold = new Paint();
        gold.setColor(Color.rgb(202,192,6));
    }

    private int colorNum;
    private Cell cell;
    private boolean isPower;

    public Chip(int colorNum, Cell cell, boolean isPower){
        this.colorNum = colorNum;
        this.cell = cell;
        this.isPower = isPower;
    }

    public void draw(Canvas c){
        RectF absolute = cell.absolute;
        float radius = absolute.width()/2*0.8f;
        float cx = absolute.left +(absolute.left/2);
        float cy = absolute.top +(absolute.top/2);
        if(colorNum == Team.light){
            c.drawCircle(cx,cy,radius,lightC);
        }
        else if(colorNum == Team.dark){
            c.drawCircle(cx,cy,radius,darkC);
        }
        if(isPower){
            c.drawCircle(cx,cy,radius*0.4f,gold);
        }
    }

}
