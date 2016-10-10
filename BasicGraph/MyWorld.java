import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.*;

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
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    private void prepare() {
        GreenfootImage bg = getBackground();
        bg.setColor(Color.white);
        bg.fill();
        
        // adding nodes 
        
        addObject(new Node("A"), 175, 400);
        addObject(new Node("B"), 325, 400);
        addObject(new Node("C"), 450, 400);
        addObject(new Node("D"), 220, 250);
        addObject(new Node("E"), 370, 250);
        addObject(new Node("F"), 275, 100);
        
        // adding edges for the graph 
         addObject(new GraphEdge("A", "B", 2, 102, 90), 248,400);
         addObject(new GraphEdge("B", "C", 2, 78, 90), 385,400);
         addObject(new GraphEdge("A", "D", 2, 120, 20), 210,325);
         addObject(new GraphEdge("C", "E", 2, 130, -25), 420,320);
         addObject(new GraphEdge("B", "F", 2, 262, -8), 290,253);
         
        }
}