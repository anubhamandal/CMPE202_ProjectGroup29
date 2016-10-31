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
        GreenfootImage bg = getBackground();
        bg.setColor(Color.white);
        bg.fill();
        
        createColorPalette();
        createGraph();
    }
    
    private void createColorPalette() {
        RedColor rc=new RedColor();
        rc.act();
        addObject(rc,550,150);
        BlueColor bc=new BlueColor();
        bc.act();
        addObject(bc,600,150);
        GreenColor gc=new GreenColor();
        gc.act();
        addObject(gc,650,150);
        YellowColor yc=new YellowColor();
        yc.act();
        addObject(yc,700,150);
    }
    
    private void createGraph() {
        addObject(new Node("A"), 50, 300);
        addObject(new Node("B"), 200, 300);
        addObject(new Node("C"), 350, 300);
        addObject(new Node("D"), 500, 300);
        addObject(new Node("E"), 650, 300);
        addObject(new Node("F"), 50, 600);
        addObject(new Node("G"), 200, 600);
        addObject(new Node("H"), 350, 600);
        addObject(new Node("I"), 500, 600);
        addObject(new Node("F"), 125, 450);
            
        addObject(new Edge(5, 100, 90), 125,300);
        addObject(new Edge(5, 100, 90), 275,300);
        addObject(new Edge(5, 100, 90), 425,300);
        addObject(new Edge(5, 100, 90), 575,300);
        addObject(new Edge(5, 100, 90), 125,600);
        addObject(new Edge(5, 100, 90), 275,600);
        addObject(new Edge(5, 100, 90), 425,600);
        addObject(new Edge(5, 250, 0), 50, 450);
        addObject(new Edge(5, 250, 0), 200, 450);
        addObject(new Edge(5, 250, 0), 350, 450);
        addObject(new Edge(5, 250, 0), 500, 450);
        
        addObject(new Edge(5, 120, -30), 90,375);
        addObject(new Edge(5, 290, -25), 267,454);
        addObject(new Edge(5, 120, 30), 90, 525);
        addObject(new Edge(5, 120, 30), 158,375);
        addObject(new Edge(5, 120, -30), 158,525);
        
        
       
        
       
        
    }
}
