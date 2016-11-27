 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage.*;
import java.lang.Object;
import java.awt.Color;
import java.util.*;

/**
 * Shape class for Graph 3
 * 
 * @author (Anubha) 
 * @version (11-08-2016)
 */
public class DrawRect extends DrawShapes
{
    Color colorToFill=null;
    boolean isFilled = false;
    HashMap<DrawRect, Color> hm = new HashMap<DrawRect, Color>();
    boolean isGameOver=false;
    public DrawRect() 
    {
        GreenfootImage img = new GreenfootImage(130, 90);
        img.setColor(Color.black);
        img.drawRect(0,0,129,89);
        setImage(img);
    }    

    public void act()
    {
        getColorToFill();
        if (Greenfoot.mouseClicked(this))
        {
            Graph3 g = new Graph3();
            hm = g.getMap();
            //System.out.println(hm);
            for(DrawRect ds : getIntersectingObjects(DrawRect.class))
            {
                if(hm.get(ds) == colorToFill)
                {
                    //System.out.println("invalid color");
                    ((Graph3)getWorld()).validLabel.setValue("Cannot fill the node with this color");
                    return;
                }
            }
            ((Graph3)getWorld()).validLabel.setValue("");
            getImage().setColor(colorToFill);
            getImage().fillRect(0,0,129,89);
            hm.put(this, colorToFill);
            //System.out.println(hm);
            g.setMap(hm);
        }
       checkEndGame();
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
     public void checkEndGame(){
        if((((Graph3)getWorld()).map.size() == 18) && !isGameOver){
            ((BaseGraph)getWorld()).stopTime=System.currentTimeMillis();
            int timeTaken = (int)(((BaseGraph)getWorld()).stopTime-((BaseGraph)getWorld()).startTime)/1000;
            isGameOver = true;
            EndGame endgame = new EndGame(timeTaken);
            Greenfoot.setWorld(endgame);
        }
    }
    
}