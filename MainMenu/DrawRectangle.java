import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage.*;
import java.lang.Object;
/**
 * Write a description of class DrawRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawRectangle extends DrawShapes
{
    /**
     * Act - do whatever the DrawRectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage(200,100);
    int n=0;
    public DrawRectangle() 
    {
        image.drawRect(0,0,199,99);
        setImage(image);
    }    

    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {

            if(n == 1){
                image.fillRect(0,0,199,99);
                setImage(image);
            }

        }
    }

    public void fillColor(String color)
    {
        n=1;
        if(color=="RED")
            image.setColor(java.awt.Color.RED);
        else if(color=="BLUE")
            image.setColor(java.awt.Color.BLUE);
        else if(color=="YELLOW")
            image.setColor(java.awt.Color.YELLOW);
        else if(color=="GREEN")
            image.setColor(java.awt.Color.GREEN);

    }
}

