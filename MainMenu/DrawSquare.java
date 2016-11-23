package graphgame;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage.*;
import java.lang.Object;
import java.awt.Color;
import java.util.*;

/**
 * Shape class for Graph 5
 * 
 * @author (Anubha) 
 * @version (11-08-2016)
 */
public class DrawSquare extends DrawShapes
{
    Color colorToFill=null;
    boolean isFilled = false;
    HashMap<DrawSquare, Color> hm = new HashMap<DrawSquare, Color>();
    
    public DrawSquare() 
    {
        GreenfootImage img = new GreenfootImage(51, 51);
        img.setColor(Color.black);
        img.drawRect(0,0,50,50);
        setImage(img);
    }    

    public void act()
    {
        getColorToFill();
        if (Greenfoot.mouseClicked(this))
        {
            Graph5 g = new Graph5();
            hm = g.getMap();
            //System.out.println(hm);
            for(DrawSquare ds : getIntersectingObjects(DrawSquare.class))
            {
                if(hm.get(ds) == colorToFill)
                {
                    //System.out.println("invalid color");
                    ((Graph5)getWorld()).validLabel.setValue("Cannot fill the node with this color");
                    return;
                }
            }
            ((Graph5)getWorld()).validLabel.setValue("");
            getImage().setColor(colorToFill);
            getImage().fillRect(0,0,50,50);
            hm.put(this, colorToFill);
            //System.out.println(hm);
            g.setMap(hm);
        }
    }
 
    public void getColorToFill()
    { 
        BaseGraph world = (BaseGraph)getWorld();
        Color selectedColor = world.selectedColor();
        if(selectedColor !=null)
        {
            colorToFill = selectedColor;
        }
    }    
}
