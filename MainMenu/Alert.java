import greenfoot.*;
import java.awt.Color;
 
public class Alert extends Graph4Creation
{
   
    public Alert(String str)
    {
        setImage(new GreenfootImage(str, 17, Color.black, Color.white));
    }
 
    // create a gameover image the size of the world
    
 
    // the following is optional
    // remove pop-up when clicked on
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
             getWorld().removeObject(this);
        }
    }
}