package graphgame;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage.*;
import java.lang.Object;
import java.awt.Color;
import java.util.*;

/**
 * Shape class for Graph 3
 * 
 * @author (Anubha) 
 * @version (11-08-2016)
 */
public class DrawOval extends DrawShapes
{
    Color colorToFill=null;
    boolean isFilled = false;
    HashMap<DrawOval, Color> hm = new HashMap<DrawOval, Color>();
    
    public DrawOval() 
    {
        GreenfootImage img = new GreenfootImage(51, 51);
        img.setColor(Color.black);
        img.drawOval(0,0,199,99);
        setImage(img);
    } 
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {           
            getImage().setColor(colorToFill);
            getImage().fillOval(0,0,199,99);
        }
    }
}
