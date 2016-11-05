 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

public class GraphEdge extends Actor
{
    private String node1, node2;
    
    public GraphEdge(String pNode1, String pNode2, int width, int height, int rot) {
        node1 = pNode1;
        node2 = pNode2;
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(Color.black);
        img.fill();
        setImage(img);
        setRotation(rot);
    }
    
     
   
        
    public String getNode1() {
        return node1;
    }
    
    public String getNode2() {
        return node2;
    }
}
