import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Image4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image4 extends Graph4Creation
{
    /**
     * Act - do whatever the Image4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String title;
    Color colorToFill=null;
    boolean isFilled = false;
    int count=0;

    public Image4()
    {
        GreenfootImage img= new GreenfootImage(395, 95);
        img.drawRect(0,0,380,90);
        setImage(img);
    }

    public void act() 
    {
        // Add your action code here.

        getColorToFill();
        if (Greenfoot.mouseClicked(this)){
            int x = this.getX();
            int y = this.getY();
            getImage().setColor(colorToFill);
            //if(x>450 && y<350)
            getImage().fillRect(0,0,380,90);

        }
    }    

    public void getColorToFill(){ 

        BaseGraph world = (BaseGraph)getWorld();
        Color selectedColor = world.selectedColor();
        if(selectedColor !=null){
            colorToFill = selectedColor;
        }
    }
}
