import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Image5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image5 extends Graph4Creation
{
    /**
     * Act - do whatever the Image5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */private String title;
    GreenfootImage img= new GreenfootImage(145, 95);
    Color colorToFill=null;
    boolean isFilled = false;
    int count=0;
    public Image5()
    {

        img.drawRect(0,0,140,90);
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
            getImage().fillRect(0,0,140,90);

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
