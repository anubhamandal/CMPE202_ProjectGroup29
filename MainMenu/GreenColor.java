import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class GreenColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenColor extends ColorPicker
{
    /**
     * Act - do whatever the GreenColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    DrawCircle dc;
    DrawOval dov;
    DrawRectangle dr;
    GreenfootImage image = new GreenfootImage(110,100);

    public GreenColor(int width, int height) {

        super(width, height);
        fillColor = Color.GREEN;
        updateImage();
    }

    public GreenColor(DrawCircle dc,DrawRectangle dr,DrawOval dov)
    {
        super(110,100);
        this.dc = dc;
        this.dov=dov;
        this.dr=dr;
        image.drawRect(0,0,50,50);
        image.setColor(java.awt.Color.GREEN);
        image.fillRect(0,0,50,50);
        setImage(image);
    }

}
