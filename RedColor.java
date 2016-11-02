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
    DrawCircle dc;
    DrawOval dov;
    DrawRectangle dr;
    GreenfootImage image = new GreenfootImage(110,100);
    public RedColor(DrawCircle dc,DrawRectangle dr,DrawOval dov)
    {
        this.dc = dc;
        this.dov=dov;
        this.dr=dr;
        image.drawRect(0,0,50,50);
        image.setColor(java.awt.Color.RED);
        image.fillRect(0,0,50,50);
        setImage(image);
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            dc.fillColor("RED");
            dr.fillColor("RED");
            dov.fillColor("RED");

        } 

    }    
}
