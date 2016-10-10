import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        createGraph();
    }
    
    private void createGraph() {
        GreenfootImage bg = getBackground();
        bg.setColor(Color.white);
        bg.fill();
       
        
        addObject(new Node("A"), 100, 400);
        addObject(new Node("B"), 280, 230);
        addObject(new Node("C"), 280, 570);
        addObject(new Node("D"), 460, 400);
        addObject(new Node("E"), 700, 400);
        
        
        
        addObject(new Edge(5, 200, 45), 190,315);
        addObject(new Edge(5, 200, -45), 190,485);
        addObject(new Edge(5, 290, 0), 280,400);
        addObject(new Edge(5, 200, 135), 370,315);
        addObject(new Edge(5, 200, -135), 370,485);
        addObject(new Edge(5, 190, 90), 579,400);
    }
}
