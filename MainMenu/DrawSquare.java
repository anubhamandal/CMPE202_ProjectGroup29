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
    Color colorToFill=null;
    boolean isFilled = false;
    int count=0;
    
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
            //System.out.println(this.getX());
            //System.out.println(this.getY());
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
