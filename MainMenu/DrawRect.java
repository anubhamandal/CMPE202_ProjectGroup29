 

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
    private int id;
    Color colorToFill=null;
    boolean isFilled = false;
    String filledColorString;
    boolean isGameOver=false;
    
    public DrawRect(int nodeid) 
    {
        this.id = nodeid;
        GreenfootImage img = new GreenfootImage(130, 90);
        img.setColor(Color.black);
        img.drawRect(0,0,129,89);
        setImage(img);
    }    

    public int getTitle() {
        return id;
    }
    
    public void act()
    {
        getColorToFill();
        if (Greenfoot.mouseClicked(this))
        {
            Graph3 g = new Graph3();
            filledColorString = Utils.getInstance().colorToString(colorToFill);
            for(DrawRect ds : getIntersectingObjects(DrawRect.class))
            {
                if(((Graph3)getWorld()).colorMap.get(ds.getTitle()) == filledColorString)
                {
                    ((Graph3)getWorld()).validLabel.setValue("Cannot fill the node with this color");
                    return;
                }
            }
            ((Graph3)getWorld()).validLabel.setValue("");
            getImage().setColor(colorToFill);
            getImage().fillRect(0,0,129,89);
            ((Graph3)getWorld()).colorMap.put(this.id, filledColorString);
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
        if((((Graph3)getWorld()).colorMap.size() == 18) && !isGameOver){
            ((BaseGraph)getWorld()).stopTime=System.currentTimeMillis();
            int timeTaken = (int)(((BaseGraph)getWorld()).stopTime-((BaseGraph)getWorld()).startTime)/1000;
            isGameOver = true;
            EndGame endgame = new EndGame(timeTaken);
            Greenfoot.setWorld(endgame);
        }
    }
    
}