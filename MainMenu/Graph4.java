 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graph4 extends BaseGraph
{
    public HashMap<Integer, String> colorMap = new HashMap<Integer, String>();
    public Label validLabel;
    public Graph4()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    public void act()
    {
        
    }
    
    private void prepare() 
    {
        
        DrawRectangle drawrect = new DrawRectangle(1);
        addObject(drawrect,240,150);
        DrawRectangle drawrect2 = new DrawRectangle(2);
        addObject(drawrect2,170,200);
        DrawRectangle drawrect3 = new DrawRectangle(3);
        addObject(drawrect3,370,200);
        DrawRectangle drawrect4 = new DrawRectangle(4);
        addObject(drawrect4,500,150);
        DrawRectangle drawrect5 = new DrawRectangle(5);
        addObject(drawrect5,570,200);
        DrawRectangle drawrect6 = new DrawRectangle(6);
        addObject(drawrect6,300,250);
        DrawRectangle drawrect7 = new DrawRectangle(7);
        addObject(drawrect7,200,300);
        DrawRectangle drawrect8 = new DrawRectangle(8);
        addObject(drawrect8,325,350);
        DrawRectangle drawrect9 = new DrawRectangle(9);
        addObject(drawrect9,525,350);
        DrawRectangle drawrect10 = new DrawRectangle(10);
        addObject(drawrect10,600,250);
        DrawRectangle drawrect11 = new DrawRectangle(11);
        addObject(drawrect11,250,400);
        DrawRectangle drawrect12 = new DrawRectangle(12);
        addObject(drawrect12,450,400);
        DrawRectangle drawrect13 = new DrawRectangle(13);
        addObject(drawrect13,650,400);
        DrawRectangle drawrect14 = new DrawRectangle(14);
        addObject(drawrect14,150,450);
        DrawRectangle drawrect15 = new DrawRectangle(15);
        addObject(drawrect15,350,450);
        DrawRectangle drawrect16 = new DrawRectangle(16);
        addObject(drawrect16,600,450);
        DrawRectangle drawrect17 = new DrawRectangle(17);
        addObject(drawrect17,650,300);
        colorSelectLabel = new Label("Color Selected: ", 20);
        addObject(colorSelectLabel, 100, 100);
        validLabel = new Label("Select a Color", 25);
        addObject(validLabel, 511, 55);        
        validLabel.setValue("");

        int numCol = 4;
        colorPicker = new ColorPicker(300, 75, numCol);
        addObject(colorPicker, 150, 30);
    }
}