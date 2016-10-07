import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphOneWorld extends World
{
    int height = 400;
    int width = 600;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GraphOneWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare() {
        Country country1 = new Country(0, 100, 600, 200);
        Country country2 = new Country(0, 300, 600, 200);
        addObject( country1, 300, 100);
        addObject( country2, 300, 300);
    }
}
