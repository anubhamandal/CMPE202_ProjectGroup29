import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YellowColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YellowColor extends Actor
{
    /**
     * Act - do whatever the YellowColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image4 = new GreenfootImage(110,100);
      image4.drawRect(0,0,50,50);
      image4.setColor(java.awt.Color.YELLOW);
      image4.fillRect(0,0,50,50);
      setImage(image4);
    }    
}
