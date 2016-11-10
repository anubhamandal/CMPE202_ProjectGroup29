import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Image1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image1 extends Graph4Creation
{
    /**
     * Act - do whatever the Image1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String title;
    Color colorToFill=null;
    boolean isFilled = false;
    int count=0;

    GreenfootImage img= new GreenfootImage(145, 295);
    public Image1()
    {
        img.drawRect(0,0,140,290);
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
            //if(getImage().equals(img))
            getImage().fillRect(0,0,140,290);

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
