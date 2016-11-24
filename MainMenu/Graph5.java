 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Anubha) 
 * @version (a version number or a date)
 */
public class Graph5 extends BaseGraph
{
    public static HashMap<DrawSquare, Color> map = new HashMap<DrawSquare, Color>();
    public Label validLabel;
    
    public Graph5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }

    public void act()
    {
        if(map.size() == 44)
        {
            //System.out.println(map);
            validLabel.setValue("You Won"); 
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        DrawSquare drawsquare1=new DrawSquare();
        addObject(drawsquare1,419,116);
        DrawSquare drawsquare2 = new DrawSquare();
        addObject(drawsquare2,392,165);
        DrawSquare drawsquare3 = new DrawSquare();
        addObject(drawsquare3,441,165);
        DrawSquare drawsquare4 = new DrawSquare();
        addObject(drawsquare4,418,214);
        DrawSquare drawsquare5 = new DrawSquare();
        addObject(drawsquare5,369,214);
        DrawSquare drawsquare6 = new DrawSquare();
        addObject(drawsquare6,469,214);
        DrawSquare drawsquare7 = new DrawSquare();
        addObject(drawsquare7,394,263);
        DrawSquare drawsquare8 = new DrawSquare();
        addObject(drawsquare8,443,263);
        DrawSquare drawsquare9 = new DrawSquare();
        addObject(drawsquare9,492,263);
        DrawSquare drawsquare10 = new DrawSquare();
        addObject(drawsquare10,345,263);
        DrawSquare drawsquare11 = new DrawSquare();
        addObject(drawsquare11,420,312);
        DrawSquare drawsquare12 = new DrawSquare();
        addObject(drawsquare12,469,312);
        DrawSquare drawsquare13 = new DrawSquare();
        addObject(drawsquare13,371,312);
        DrawSquare drawsquare14 = new DrawSquare();
        addObject(drawsquare14,518,312);
        DrawSquare drawsquare15 = new DrawSquare();
        addObject(drawsquare15,322,312);
        DrawSquare drawsquare16 = new DrawSquare();
        addObject(drawsquare16,395,361);
        DrawSquare drawsquare17 = new DrawSquare();
        addObject(drawsquare17,444,361);
        DrawSquare drawsquare18 = new DrawSquare();
        addObject(drawsquare18,493,361);
        DrawSquare drawsquare19 = new DrawSquare();
        addObject(drawsquare19,346,361);
        DrawSquare drawsquare20 = new DrawSquare();
        addObject(drawsquare20,420,410);
        DrawSquare drawsquare21 = new DrawSquare();
        addObject(drawsquare21,469,410);
        DrawSquare drawsquare22 = new DrawSquare();
        addObject(drawsquare22,371,410);
        DrawSquare drawsquare23 = new DrawSquare();
        addObject(drawsquare23,400,459);
        DrawSquare drawsquare24 = new DrawSquare();
        addObject(drawsquare24,451,459);
        DrawSquare drawsquare25 = new DrawSquare();
        addObject(drawsquare25,273,312);
        DrawSquare drawsquare26 = new DrawSquare();
        addObject(drawsquare26,567,312);
        DrawSquare drawsquare27 = new DrawSquare();
        addObject(drawsquare27,591,405);
        DrawSquare drawsquare28 = new DrawSquare();
        addObject(drawsquare28,541,255);
        DrawSquare drawsquare29 = new DrawSquare();
        addObject(drawsquare29,542,376);
        DrawSquare drawsquare30 = new DrawSquare();
        addObject(drawsquare30,297,378);
        DrawSquare drawsquare31 = new DrawSquare();
        addObject(drawsquare31,224,331);
        DrawSquare drawsquare32 = new DrawSquare();
        addObject(drawsquare32,518,189);
        DrawSquare drawsquare33 = new DrawSquare();
        addObject(drawsquare33,320,177);
        DrawSquare drawsquare34 = new DrawSquare();
        addObject(drawsquare34,271,192);
        DrawSquare drawsquare35 = new DrawSquare();
        addObject(drawsquare35,224,282);
        DrawSquare drawsquare36 = new DrawSquare();
        addObject(drawsquare36,590,233);
        DrawSquare drawsquare37 = new DrawSquare();
        addObject(drawsquare37,500,474);
        DrawSquare drawsquare38 = new DrawSquare();
        addObject(drawsquare38,639,233);
        DrawSquare drawsquare39 = new DrawSquare();
        addObject(drawsquare39,627,282);
        DrawSquare drawsquare40 = new DrawSquare();
        addObject(drawsquare40,222,192);
        DrawSquare drawsquare41 = new DrawSquare();
        addObject(drawsquare41,248,143);
        DrawSquare drawsquare42 = new DrawSquare();
        addObject(drawsquare42,518,140);
        DrawSquare drawsquare43 = new DrawSquare();
        addObject(drawsquare43,567,164);
        DrawSquare drawsquare44 = new DrawSquare();
        addObject(drawsquare44,175,307);
        
        colorSelectLabel = new Label("Color Selected: ", 20);
        addObject(colorSelectLabel, 100, 100);
        validLabel = new Label("Select a Color", 25);
        addObject(validLabel, 511, 55);        
        validLabel.setValue("");

        int numCol = 4;
        colorPicker = new ColorPicker(300, 75, numCol);
        addObject(colorPicker, 150, 30);
    }
    
    public HashMap<DrawSquare, Color> getMap()
    {
        return map;
    }
    
    public void setMap(HashMap<DrawSquare, Color> hm)
    {
        map = hm;
    }
}