import java.awt.Color;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ColorPallet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ColorPallet extends Actor
{
    /**
     * Act - do whatever the ColorPallet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int mouseX, mouseY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
        } 
    }    
    
    
}
