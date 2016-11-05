import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinusColorButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinusColorButton extends Actor
{
    public MinusColorButton() {
        GreenfootImage image = getImage();
        image.scale(50, 50);
    }
    
    /**
     * Act - do whatever the MinusColorButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Graph2 world = (Graph2)getWorld();
            world.decreaseColors();
        }
    }    
}
