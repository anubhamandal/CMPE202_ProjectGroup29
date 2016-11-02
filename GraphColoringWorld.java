import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class GraphColoringWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphColoringWorld extends World
{

    /**
     * Constructor for objects of class GraphColoringWorld.
     * 
     */
    public GraphColoringWorld()
    {    
        super(800, 600, 1); 
        DrawRectangle dr=new DrawRectangle();
        addObject(dr,290,150);
        DrawOval dov=new DrawOval();
        addObject(dov,200,200);
        DrawCircle dc=new DrawCircle();
        addObject(dc,190,150);
        RedColor rc=new RedColor(dc,dr,dov);
        addObject(rc,550,150);
        BlueColor bc=new BlueColor(dc,dr,dov);
        addObject(bc,600,150);
        GreenColor gc=new GreenColor(dc,dr,dov);
        addObject(gc,650,150);
        YellowColor yc=new YellowColor(dc,dr,dov);
        addObject(yc,700,150);
        //setPaintOrder(DrawRectangle.class, DrawOval.class);

    }
}
