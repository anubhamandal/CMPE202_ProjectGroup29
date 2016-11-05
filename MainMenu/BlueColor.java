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
    DrawCircle dc;
    DrawOval dov;
    DrawRectangle dr;
    GreenfootImage image = new GreenfootImage(110,100);
    public BlueColor(DrawCircle dc,DrawRectangle dr,DrawOval dov)
    {
        this.dc = dc;
        this.dov=dov;
        this.dr=dr;
        image.setColor(java.awt.Color.BLUE);
        image.drawRect(0,0,50,50);
        image.fillRect(0,0,50,50);
        setImage(image);

    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            dc.fillColor("BLUE");
            dr.fillColor("BLUE");
            dov.fillColor("BLUE");

        }

    }    
}
