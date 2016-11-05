import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class FillNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillNode  extends Actor
{
    /**
     * Act - do whatever the FillNode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public FillNode(Color col){
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(col);
        img.drawOval(0,0,50,50);
        img.fillOval(0,0,50,50); 
        setImage(img);
    }
}

