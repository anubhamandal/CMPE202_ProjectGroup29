import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*; 
/**
 * This is a class which draws the nodes
 */
public class Node extends Actor
{
    private String countryName;
    
    public Node(String name) {
        countryName = name;
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(Color.black);
        img.drawOval(0,0,50,50);
        setImage(img);
    }
}
