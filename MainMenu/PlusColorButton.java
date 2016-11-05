import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlusColorButton extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlusColorButton(){
        GreenfootImage image = getImage();
        image.scale(50, 50);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Graph2 world = (Graph2)getWorld();
            world.increaseColors();
        }
    }    
}
