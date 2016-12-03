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
public class DrawSquare extends Country
{
    private int id;
    
    public DrawSquare(int nodeid) 
    {
        this.id = nodeid;
        GreenfootImage img = new GreenfootImage(51, 51);
        img.setColor(Color.black);
        img.drawRect(0,0,50,50);
        setImage(img);
    }    

    public Integer getId(){
        return id;
    }
    
    public void act()
    {
       if (Greenfoot.mouseClicked(this))
        {
            BaseGraph world = (BaseGraph)getWorld();
            fillColor = world.selectedColor();
            world.setCountryColor(id);
        }
    }

    boolean updateColor(Color color)
    {
        String filledColorString = Utils.getInstance().colorToString(color);
        for(DrawSquare ds : getIntersectingObjects(DrawSquare.class))
        {
            if(((BaseGraph)getWorld()).colorMap.get(ds.getId()) == filledColorString)
            {
                ((BaseGraph)getWorld()).validLabel.setValue("Cannot fill the node with this color");
                return false;
            }
        }
        ((BaseGraph)getWorld()).validLabel.setValue("");
        getImage().setColor(color);
        getImage().fillRect(0,0,50,50);
        ((BaseGraph)getWorld()).colorMap.put(this.id, filledColorString);
        return true;
    }
}