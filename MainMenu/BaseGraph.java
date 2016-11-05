import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BaseGraph here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseGraph extends World
{

    public String selectedColor;
    
    /**
     * Constructor for objects of class BaseGraph.
     * 
     */
    public BaseGraph()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public BaseGraph(int worldWidth, int worldHeight, int cellSize){
        super(worldWidth, worldHeight, cellSize);
    }
    
    
}
