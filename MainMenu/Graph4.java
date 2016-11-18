import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class GraphColoringWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graph4 extends BaseGraph
{

    /**
     * Constructor for objects of class GraphColoringWorld.
     * 
     */
    public Graph4()
    {    
        super(800, 600, 1); 
        DrawOval dov=new DrawOval();
        addObject(dov,200,200);
        DrawCircle dc=new DrawCircle();
        addObject(dc,190,150);
        DrawRect dr=new DrawRect();
        addObject(dr, 300,300);
    }
}
