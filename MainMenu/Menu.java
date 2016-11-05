 

import greenfoot.*;
import java.awt.Color;

public class Menu extends World
{
    boolean Down1; // tracks the down state of the '1' key (Graph1)
    boolean Down2; // tracks the down state of the '2' key (Graph2)
        
    public Menu()
    {
        super(800, 500, 1);
        GreenfootImage background = new GreenfootImage("Background.jpg");
        setBackground(background);
        //     setBackground(new GreenfootImage("Background.jpg"));
        /*GreenfootImage*/ background = getBackground();
       // background.setColor(Color.yellow);
        //background.fill();
        GreenfootImage text;
        text = new GreenfootImage("Welcome to the Graph Coloring Game!", 40, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 50);
        text = new GreenfootImage("Graph Selection Menu", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 200);
        text = new GreenfootImage("Use '1' key to go to Graph1", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 300);
        text = new GreenfootImage("Use '2' key to go to Graph2", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 340);
    }
    
    public void act()
    {
        if (!Down1 && Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new Graph1());
            Down1 = true;
        }

        if (!Down2 && Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new Graph2());
            Down2 = true;
        }
    }
}