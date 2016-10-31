import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenColor extends Actor
{
    /**
     * Act - do whatever the GreenColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
      GreenfootImage image3 = new GreenfootImage(110,100);
      image3.drawRect(0,0,50,50);
      image3.setColor(java.awt.Color.GREEN);
      image3.fillRect(0,0,50,50);
      setImage(image3);
    }    
}
