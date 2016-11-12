import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage.*;
import java.lang.Object;
import java.awt.*;
/**
 * Shape class for Graph 5
 * 
 * @author (Anubha) 
 * @version (11-08-2016)
 */
public class DrawSquare extends DrawShapes
{
    GreenfootImage image = new GreenfootImage(100,100);
    Color colorToFill=null;
    boolean isFilled = false;
    int count=0;
    
    public DrawSquare() 
    {
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(Color.black);
        image.drawRect(0,0,50,50);
        setImage(image);
    }    

    public void act()
    {
        getColorToFill();
        if (Greenfoot.mouseClicked(this))
        {
            getImage().setColor(colorToFill);
            getImage().fillRect(0,0,50,50);
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