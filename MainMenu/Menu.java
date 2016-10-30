import greenfoot.*;
import java.awt.Color;

public class Menu extends World
{
    //PIP pip; // keeps reference to graph 1
    //PIP pip2; // keeps a reference on another PIP object
    boolean wDown; // tracks the down state of the '1' key (wombat PIP control)
    boolean sDown; // tracks the down state of the '2' key (ship PIP control)
    //Actor mouseActor; // holds the actor being dragged
    //int mouseOffX, mouseOffY; // holds the offsets of mouse location from center of object being dragged
    
    public Menu()
    {
        super(800, 500, 1);
        // paint background of this world with color green
        GreenfootImage background = getBackground();
        background.setColor(Color.red);
        background.fill();
        // add instruction text to background of this world
        GreenfootImage text;
        //text = new GreenfootImage("Use mouse to drag the Picture-in-picture objects", 32, Color.black, new Color(0, 0, 0, 0));
        //background.drawImage(text, 400-text.getWidth()/2, 260);
        text = new GreenfootImage("Use '1' key to go to Graph1", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 300);
        text = new GreenfootImage("Use '2' key to go to Graph2", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 340);
    }
    
    public void act()
    {
        // control running state the wombat PIP objects
        if (!wDown && Greenfoot.isKeyDown("1"))
        {
            //pip.setActiveState(!pip.getActiveState());
            Greenfoot.setWorld(new Graph1());
            wDown = true;
        }

        // control running state the ship PIP objects
        if (!sDown && Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new Graph2());
            //pip2.setActiveState(!pip2.getActiveState());
            sDown = true;
        }

        /*
        // control dragging of PIP objects
        if (Greenfoot.mousePressed(null) && mouseActor == null)
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse.getActor() == null || mouse.getActor().getClass() != PIP.class) return;
            mouseActor = mouse.getActor();
            mouseOffX = mouseActor.getX()-mouse.getX();
            mouseOffY = mouseActor.getY()-mouse.getY();
            removeObject(mouseActor);
            addObject(mouseActor, mouse.getX()+mouseOffX, mouse.getY()+mouseOffY);
        }
        if (mouseActor != null && Greenfoot.mouseDragged(mouseActor))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            mouseActor.setLocation(mouse.getX()+mouseOffX, mouse.getY()+mouseOffY);
        }
        if (mouseActor != null && Greenfoot.mouseClicked(mouseActor)) mouseActor = null;*/
    }
}