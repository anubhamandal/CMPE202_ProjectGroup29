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
public class DrawRect extends Country
{
    private int id;
    
    public DrawRect(int nodeid) 
    {
        this.id = nodeid;
        GreenfootImage img = new GreenfootImage(130, 90);
        img.setColor(Color.black);
        img.drawRect(0,0,129,89);
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
        for(DrawRect ds : getIntersectingObjects(DrawRect.class))
        {
            if(((BaseGraph)getWorld()).colorMap.get(ds.getId()) == filledColorString)
            {
                ((BaseGraph)getWorld()).validLabel.setValue("Cannot fill the node with this color");
                return false;
            }
        }
        ((BaseGraph)getWorld()).validLabel.setValue("");
        getImage().setColor(color);
        getImage().fillRect(0,0,129,89);
        ((BaseGraph)getWorld()).colorMap.put(this.id, filledColorString);
        return true;
    }
    
}