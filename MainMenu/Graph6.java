import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.*;


/**
 * Write a description of class Graph6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graph6 extends BaseGraph
{
    public Map<String, Set<String>> connectedMap;

    public Label validLabel;
   
    public Graph6()
    {
        //Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        GreenfootImage bg = getBackground();
        bg.setColor(Color.white);
        bg.fill();
        
        createGraph();
    }
    
       
    private void createGraph() {
        
        
        connectedMap = new HashMap();
        Set<String> h1 = new HashSet<String>();
        h1.add("B");
        h1.add("C");
        h1.add("E");
        connectedMap.put("A", h1);
        
        Set<String> h2 = new HashSet<String>();
        h2.add("C");
        h2.add("G");
        h2.add("H");
        h2.add("I");
        connectedMap.put("B", h2);
        
        Set<String> h3 = new HashSet<String>();
        h3.add("B");
        h3.add("D");
        h3.add("H");
        connectedMap.put("C", h3);
        
        Set<String> h4 = new HashSet<String>();
        h4.add("C");
        h4.add("E");
        h4.add("I");
        connectedMap.put("D", h4);
        
        Set<String> h5 = new HashSet<String>();
        h5.add("D");
        connectedMap.put("E", h5);
        
        Set<String> h6 = new HashSet<String>();
        h6.add("A");
        h6.add("F");
        h6.add("G");
        connectedMap.put("F", h6);
        
        Set<String> h7 = new HashSet<String>();
        h7.add("B");
        h7.add("F");
        h7.add("H");
        h7.add("I");
        connectedMap.put("G", h7);
        
        Set<String> h8 = new HashSet<String>();
        h8.add("B");
        h8.add("C");
        h8.add("G");
        h8.add("I");
        connectedMap.put("H", h8);
         
        Set<String> h9 = new HashSet<String>();
        h9.add("D");
        h9.add("H");
        connectedMap.put("I", h9);
                
        Set<String> h10 = new HashSet<String>();
        h10.add("A");
        h10.add("B");
        h10.add("F");
        h10.add("G");
        connectedMap.put("J", h10);
        
        
        
        addObject(new Node("A"), 50, 300);
        addObject(new Node("B"), 200, 300);
        addObject(new Node("C"), 350, 300);
        addObject(new Node("D"), 500, 300);
        addObject(new Node("E"), 650, 300);
        addObject(new Node("F"), 50, 600);
        addObject(new Node("G"), 200, 600);
        addObject(new Node("H"), 350, 600);
        addObject(new Node("I"), 500, 600);
        addObject(new Node("J"), 125, 450);
            
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
        
        colorPicker = new ColorPicker(300, 65, 6);
        addObject (colorPicker, 150, 50);
        validLabel = new Label("Select a color", 40);
        addObject(validLabel, 190, 111);          
        Greenfoot.start();
        
    }
}    
