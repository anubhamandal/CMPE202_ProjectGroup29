 

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
    public static HashMap<DrawRect, Color> map = new HashMap<DrawRect, Color>();
    public Label validLabel;
    public Graph3()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    public void act()
    {
        if(map.size() == 18)
        {
            //System.out.println(map);
            validLabel.setValue("You Won"); 
        }
    }
    
    private void prepare() 
    {
        
        DrawRect drawrect = new DrawRect();
        addObject(drawrect,308,149);
        DrawRect drawrect2 = new DrawRect();
        addObject(drawrect2,228,237);
        DrawRect drawrect3 = new DrawRect();
        addObject(drawrect3,436,149);
        DrawRect drawrect4 = new DrawRect();
        addObject(drawrect4,357,237);
        DrawRect drawrect5 = new DrawRect();
        addObject(drawrect5,564,175);
        DrawRect drawrect6 = new DrawRect();
        addObject(drawrect6,502,263);
        DrawRect drawrect7 = new DrawRect();
        addObject(drawrect7,189,325);
        DrawRect drawrect8 = new DrawRect();
        addObject(drawrect8,317,325);
        DrawRect drawrect9 = new DrawRect();
        addObject(drawrect9,455,351);
        DrawRect drawrect10 = new DrawRect();
        addObject(drawrect10,630,263);
        DrawRect drawrect11 = new DrawRect();
        addObject(drawrect11,583,351);
        DrawRect drawrect12 = new DrawRect();
        addObject(drawrect12,711,351);
        DrawRect drawrect13 = new DrawRect();
        addObject(drawrect13,522,439);
        DrawRect drawrect14 = new DrawRect();
        addObject(drawrect14,650,439);
        DrawRect drawrect15 = new DrawRect();
        addObject(drawrect15,394,439);
        DrawRect drawrect16 = new DrawRect();
        addObject(drawrect16,266,439);
        DrawRect drawrect17 = new DrawRect();
        addObject(drawrect17,127,413);
        DrawRect drawrect18 = new DrawRect();
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
    
    public HashMap<DrawRect, Color> getMap()
    {
        return map;
    }
    
    public void setMap(HashMap<DrawRect, Color> hm)
    {
        map = hm;
    }
}