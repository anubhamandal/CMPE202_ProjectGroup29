import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueColor extends Actor
{
    /**
     * Act - do whatever the BlueColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
      GreenfootImage image2 = new GreenfootImage(110,100);
      image2.drawRect(0,0,50,50);
      image2.setColor(java.awt.Color.BLUE);
      image2.fillRect(0,0,50,50);
      setImage(image2);
    }    
}
