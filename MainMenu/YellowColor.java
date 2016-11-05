import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class YellowColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YellowColor extends ColorPicker
{
    /**
     * Act - do whatever the YellowColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    DrawCircle dc;
    DrawOval dov;
    DrawRectangle dr;
    GreenfootImage image = new GreenfootImage(110,100);

    public YellowColor(int width, int height) {

        super(width, height);
        fillColor = Color.YELLOW;
    }

    public YellowColor(DrawCircle dc,DrawRectangle dr,DrawOval dov)
    {
        super(110,100);
        this.dc = dc;
        this.dov=dov;
        this.dr=dr;
        image.drawRect(0,0,50,50);
        image.setColor(java.awt.Color.YELLOW);
        image.fillRect(0,0,50,50);
        setImage(image);

    }

    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            dc.fillColor("YELLOW");
            dr.fillColor("YELLOW");
            dov.fillColor("YELLOW");

        }

    }    
}
