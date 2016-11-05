import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BlueColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueColor extends ColorPallet
{
     private Color color;
    /**
     * Act - do whatever the BlueColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public Color getColor(){
        return color;
    }
    public BlueColor(){
        color=Color.blue;
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(color);
        img.drawOval(0,0,50,50);
        img.fillOval(0,0,50,50); 
        setImage(img);
    
    }
}
