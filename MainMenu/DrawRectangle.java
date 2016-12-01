 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage.*;
import java.lang.Object;
import java.awt.Color;
import java.util.*;

/**
 * Shape class for Graph 3
 * 
 * @author (Shilpa) 
 * @version (11-08-2016)
 */
public class DrawRectangle extends Actor
{
    private int id;
    Color colorToFill=null;
    boolean isFilled = false;
    String filledColorString;
    boolean isGameOver=false;
    
    public DrawRectangle(int nodeid) 
    {
        this.id = nodeid;
       
        GreenfootImage img = new GreenfootImage(201, 51);
        img.setColor(Color.black);
        img.drawRect(0,0,200,50);
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
            Graph4 g = new Graph4();
            filledColorString = Utils.getInstance().colorToString(colorToFill);
            for(DrawRectangle ds : getIntersectingObjects(DrawRectangle.class))
            {
                if(((Graph4)getWorld()).colorMap.get(ds.getTitle()) == filledColorString)
                {
                    ((Graph4)getWorld()).validLabel.setValue("Cannot fill the node with this color");
                    return;
                }
            }
            ((Graph4)getWorld()).validLabel.setValue("");
            getImage().setColor(colorToFill);
            getImage().fillRect(0,0,200,50);
            ((Graph4)getWorld()).colorMap.put(this.id, filledColorString);
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
        if((((Graph4)getWorld()).colorMap.size() == 17) && !isGameOver){
            ((BaseGraph)getWorld()).stopTime=System.currentTimeMillis();
            int timeTaken = (int)(((BaseGraph)getWorld()).stopTime-((BaseGraph)getWorld()).startTime)/1000;
            isGameOver = true;
            EndGame endgame = new EndGame(timeTaken);
            Greenfoot.setWorld(endgame);
        }
    }
    
}