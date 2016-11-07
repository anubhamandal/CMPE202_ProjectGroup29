import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class RedColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedColor extends ColorPicker
{
    /**
     * Act - do whatever the RedColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    DrawCircle dc;
    DrawOval dov;
    DrawRectangle dr;
    private Color color;
    GreenfootImage image = new GreenfootImage(110,100);

    public RedColor(int width, int height) {
        super(width, height);
        fillColor = Color.RED;
        updateImage();
    }
    public RedColor(DrawCircle dc,DrawRectangle dr,DrawOval dov)
    {
        super(110,100);
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
        super.act();
    }    
    public Color getPickedColor(){
        return color;
    }
    public RedColor(){
        color=Color.RED;
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(color);
        img.drawOval(0,0,50,50);
        img.fillOval(0,0,50,50); 
        setImage(img);
    
    }

}
