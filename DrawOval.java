import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DrawOval here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawOval extends Actor
{
    /**
     * Act - do whatever the DrawOval wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void draw() 
    {
        GreenfootImage image = new GreenfootImage(200,100);
        //image.setColor(java.awt.Color.PINK);
        image.drawOval(0,0,199,99);
        //image.fillOval(0,0,199,99);
        setImage(image);
       
    }       
}
