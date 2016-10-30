import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedColor extends Actor
{
    /**
     * Act - do whatever the RedColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         GreenfootImage image1 = new GreenfootImage(110,100);
      image1.drawRect(0,0,50,50);
      image1.setColor(java.awt.Color.RED);
      image1.fillRect(0,0,50,50);
      setImage(image1);
    }    
}
