 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graph1 extends BaseGraph
{
    public Graph1()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        prepare();
    }
    
    private void prepare() {
        GreenfootImage bg = getBackground();
        bg.setColor(Color.white);
        bg.fill();
        
        
        
        // adding  16 nodes 
        
        addObject(new Node("A"), 43, 545);   
        addObject(new Node("B"), 138, 490);
        addObject(new Node("C"), 245, 464);
        addObject(new Node("D"), 355, 347);
        addObject(new Node("E"), 296, 192);
        addObject(new Node("F"), 495, 265);
        addObject(new Node("G"), 588, 172);
        addObject(new Node("H"), 478, 391);
        addObject(new Node("I"), 655, 286);
        addObject(new Node("J"), 541, 562);
        addObject(new Node("K"), 676, 486);
        addObject(new Node("L"), 742, 651);
        addObject(new Node("M"), 837, 566);
        addObject(new Node("N"), 758, 111);
        addObject(new Node("O"), 864, 365);
        addObject(new Node("p"), 957, 260);
        
        // adding edges for the graph 
        addObject(new GraphEdge("A", "E", 2, 400, 35), 157,358);
        addObject(new GraphEdge("A", "J", 2, 452, 90), 290,560);
        addObject(new GraphEdge("J", "L", 2, 175, 120), 640,609);
        addObject(new GraphEdge("L", "M", 2, 100, 30), 789,620);
        addObject(new GraphEdge("M", "K", 2, 132, 120), 754,530);
        addObject(new GraphEdge("L", "K", 2, 150, -10), 704,579);
        addObject(new GraphEdge("B", "C", 2, 65, 80), 193,484);
        addObject(new GraphEdge("C", "D", 2, 115, 35), 299,406);
        addObject(new GraphEdge("E", "G", 2, 250, 90), 445,191);
        addObject(new GraphEdge("I", "G", 2, 85, 145), 623,229);
        addObject(new GraphEdge("I", "F", 2, 120, 90), 573,280);
        addObject(new GraphEdge("G", "F", 2, 100, 40), 550,234);
        addObject(new GraphEdge("D", "E", 2, 120, -20), 331,267);
        addObject(new GraphEdge("D", "E", 2, 120, -20), 331,267);
        addObject(new GraphEdge("D", "F", 2, 120, 70), 427,308);
        addObject(new GraphEdge("D", "J", 2, 245, 145), 447,454);
        addObject(new GraphEdge("F", "J", 2, 255, -10), 529,413);
        addObject(new GraphEdge("H", "J", 2, 135, -15), 511,476);
        addObject(new GraphEdge("H", "D", 2, 88, 100), 421,361);
        addObject(new GraphEdge("H", "F", 2, 80, 10), 486,329);
        addObject(new GraphEdge("I", "M", 2, 290, 145), 752,424);
        addObject(new GraphEdge("I", "N", 2, 155, 30), 706,200);
        addObject(new GraphEdge("P", "N", 2, 218, 120), 871,182);
        addObject(new GraphEdge("P", "O", 2, 90, 40), 910,313);
        addObject(new GraphEdge("P", "N", 2, 300, 20), 913,424);
        addObject(new GraphEdge("M", "N", 2, 415, -10), 799,338);
        addObject(new GraphEdge("M", "O", 2, 160, 10), 862,465);
        addObject(new GraphEdge("N", "O", 2, 230, -20), 811,239);
         
        }
}