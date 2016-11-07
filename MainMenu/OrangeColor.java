import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class OrangeColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrangeColor extends ColorPicker
{
    private Color color;
    
    public void act() 
    {
        super.act();// Add your action code here.
    }    
    public Color getPickedColor(){
        return color;
    }
    public OrangeColor(){
        color=Color.orange;
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(color);
        img.drawOval(0,0,50,50);
        img.fillOval(0,0,50,50); 
        setImage(img);
    
    }
}
