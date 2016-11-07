import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ListIterator;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class Graph6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graph6 extends BaseGraph
{

   
    public Graph6()
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
        /*
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
        
        //Color Picker
        RedColor red = new RedColor(75, 75);
        red.AddRed();
        addObject(red, 400, 150);
        YellowColor yellow = new YellowColor(75, 75);
        yellow.AddYellow();
        addObject(yellow, 500, 150);
        BlueColor blue = new BlueColor(75, 75);
        blue.AddBlue();
        addObject(blue, 600, 150);
        GreenColor green = new GreenColor(75, 75);
        green.AddGree();
        addObject(green, 700, 150);
        
        
        RedColor red = new RedColor(75, 75);
        YellowColor yellow = new YellowColor(75, 75);
        BlueColor blue = new BlueColor(75, 75);
        GreenColor green = new GreenColor(75, 75);
        */
        
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
