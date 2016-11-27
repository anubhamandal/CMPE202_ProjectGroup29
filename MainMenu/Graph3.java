 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graph3 extends BaseGraph
{
    public HashMap<Integer, String> colorMap = new HashMap<Integer, String>();
    public Label validLabel;
    public Graph3()
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
        
        DrawRect drawrect = new DrawRect(1);
        addObject(drawrect,308,149);
        DrawRect drawrect2 = new DrawRect(2);
        addObject(drawrect2,228,237);
        DrawRect drawrect3 = new DrawRect(3);
        addObject(drawrect3,436,149);
        DrawRect drawrect4 = new DrawRect(4);
        addObject(drawrect4,357,237);
        DrawRect drawrect5 = new DrawRect(5);
        addObject(drawrect5,564,175);
        DrawRect drawrect6 = new DrawRect(6);
        addObject(drawrect6,502,263);
        DrawRect drawrect7 = new DrawRect(7);
        addObject(drawrect7,189,325);
        DrawRect drawrect8 = new DrawRect(8);
        addObject(drawrect8,317,325);
        DrawRect drawrect9 = new DrawRect(9);
        addObject(drawrect9,455,351);
        DrawRect drawrect10 = new DrawRect(10);
        addObject(drawrect10,630,263);
        DrawRect drawrect11 = new DrawRect(11);
        addObject(drawrect11,583,351);
        DrawRect drawrect12 = new DrawRect(12);
        addObject(drawrect12,711,351);
        DrawRect drawrect13 = new DrawRect(13);
        addObject(drawrect13,522,439);
        DrawRect drawrect14 = new DrawRect(14);
        addObject(drawrect14,650,439);
        DrawRect drawrect15 = new DrawRect(15);
        addObject(drawrect15,394,439);
        DrawRect drawrect16 = new DrawRect(16);
        addObject(drawrect16,266,439);
        DrawRect drawrect17 = new DrawRect(17);
        addObject(drawrect17,127,413);
        DrawRect drawrect18 = new DrawRect(18);
        addObject(drawrect18,692,155);
        
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