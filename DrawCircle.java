import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DrawCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawCircle extends Actor
{
    /**
     * Act - do whatever the DrawCircle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage(110,100);
    public DrawCircle()
    {
        image.drawOval(0,0,109,99);
        setImage(image);
    }

    public void act()
    {

        if(Greenfoot.mouseClicked(image))
        {
            image.setColor(java.awt.Color.RED);
            image.drawOval(10,10,109,99);
            image.fillOval(0,0,109,99);
            setImage(image);
        }
    }

}
