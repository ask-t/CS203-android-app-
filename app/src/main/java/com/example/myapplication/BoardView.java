package com.example.myapplication;

import android.content.Context;
import android.graphics.*;
import android.view.View;

import java.util.ArrayList;

public class BoardView extends View {
    private Cell[][] board  = new Cell[9][10];
    private ArrayList<Chip> chips = new ArrayList<>();
    public Paint dark;
    public Paint light;
    public Paint neutral;
    public Paint boarder;
    public RectF rect;
    public BoardView(Context c){
        super(c);
        dark = new Paint();
        dark.setColor(Color.rgb(247, 63, 7));
        light = new Paint();
        light.setColor(Color.rgb(7,247,239));
        neutral = new Paint();
        neutral.setColor(Color.rgb(247, 163, 7));
        boarder = new Paint();
        boarder.setColor(Color.BLACK);
        boarder.setStyle(Paint.Style.STROKE);
        int w = getWidth();
        int h = w/9*10;
        float cellW = (float)w/9;
        float cellH = (float)w/10;
        System.out.println("This is w and h "+w +" " +h);
        System.out.println(cellH +" " +cellW);

        for(int x=0; x<9; x++){
            for(int y=0; y<10;y++){
                int colorNum = Team.neuatral;
                rect = new RectF(cellW*x,cellH*y,cellW*(x+1), cellH*(y+1));
                board[x][y] =new Cell(x,y,rect,colorNum);
//                System.out.println("This is absolute " +rect);
            }
        }


    }

    @Override
    public void onDraw(Canvas c){
//        int w = getWidth();
//        int h = w/9*10;
//        float cellW = (float)w/9;
//        float cellH = (float)w/10;
//
//
//        for(int x=0;x<9;x++){
//            for(int y=0;y<10;y++){
//                RectF f = new RectF(cellW*x,cellH*y,cellW*(x+1), cellH*(y+1));
//                if(5<x && y<3){
//                 c.drawRect(f,light);
//                }
//                if(x<3 && 6<y){
//                    c.drawRect(f,dark);
//                }
//                if(y==6){
//                    c.drawCircle(cellW*x+(cellW/2),cellH*y+(cellH/2),cellW/2*0.8f,light);
//                    if(x==4){
//                        c.drawCircle(cellW*x+(cellW/2),cellH*y+(cellH/2),cellW/2*0.4f,dark);
//                    }
//                }
//
//                c.drawRect(f,boarder);
//
//            }
//        }

        for(int x=0; x<9; x++){
            for(int y=0; y<10; y++){
                Cell cell = board[x][y];
                c.drawRect(cell.absolute,boarder);
//                System.out.println(cell.absolute);
            }
        }
    }
}
