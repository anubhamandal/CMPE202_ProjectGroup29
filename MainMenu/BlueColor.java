import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class BlueColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueColor extends ColorPicker
{
    /**
     * Act - do whatever the BlueColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    DrawCircle dc;
    DrawOval dov;
    DrawRectangle dr;
    private Color color;
    GreenfootImage image = new GreenfootImage(110,100);

    public BlueColor(int width, int height) {

        super(width, height);
        fillColor = Color.BLUE;
        updateImage();
    }

    public BlueColor(DrawCircle dc,DrawRectangle dr,DrawOval dov)
    {
        super(110,100);
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
        super.act();// Add your action code here.
    }    
    public Color getPickedColor(){
        return color;
    }
    public BlueColor(){
        color=Color.blue;
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(color);
        img.drawOval(0,0,50,50);
        img.fillOval(0,0,50,50); 
        setImage(img);
    
    }
    

}
