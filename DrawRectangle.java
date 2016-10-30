import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage.*;
import java.lang.Object;
/**
 * Write a description of class DrawRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawRectangle extends Actor
{
    /**
     * Act - do whatever the DrawRectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void draw() 
    {
        GreenfootImage image = new GreenfootImage(200,100);
        image.setColor(java.awt.Color.BLACK);
        image.drawRect(0,0,199,99);
        //image.fillRect(0,0,199,99);
        image.setTransparency(255);
        setImage(image);
    }    
}
