import java.awt.Color;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedColor extends ColorPallet
{
     private Color color;
    /**
     * Act - do whatever the RedColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();// Add your action code here.
    }    
    public Color getPickedColor(){
        return color;
    }
    public RedColor(){
        color=Color.RED;
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(color);
        img.drawOval(0,0,50,50);
        img.fillOval(0,0,50,50); 
        setImage(img);
    
    }
}
