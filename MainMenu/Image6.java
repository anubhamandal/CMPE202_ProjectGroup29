package graphgame;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Image5 here.
 * 
 * @author (Shilpa Chandra) 
 * @version (a version number or a date)
 */
public class Image6 extends Graph4Creation
{
    /**
     * Act - do whatever the Image5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */private String title;
    GreenfootImage img= new GreenfootImage(145, 115);
    Color colorToFill=null;
    boolean isFilled = false;
    int count=0;
    String color;
    Image1 image1;
    Image4 image4;
    Image5 image5;
    Image7 image7;
    public Image6()
    {

        
    }
    public void DrawImage()
    {
        isFilled=false;
        img.setColor(java.awt.Color.BLACK);
    img.drawRect(0,0,140,110);
        setImage(img);
    }
 public void setAdjacents(Image1 image1,Image4 image4,Image5 image5,Image7 image7)
    {
     this.image1=image1;
        this.image4=image4;
        this.image5=image5;
        this.image7=image7;

    }
    public void act() 
    {
        // Add your action code here.

        getColorToFill();
        if (Greenfoot.mouseClicked(this)){
            int x = this.getX();
            int y = this.getY();
            getImage().setColor(colorToFill);
            isFilled=true;
            color=colorToFill.toString();
            //if(getImage().equals(img))
            getImage().fillRect(0,0,140,110);
if(image1.getColor().equals(colorToFill.toString()))
            {
                BaseGraph world = (BaseGraph)getWorld();
                world.addObject(new Alert(" The Color You Picked Match With The Adjacent Color  "),350,300);
                Greenfoot.delay(100);
                img.clear();
                DrawImage();
                world.removeObjects(world.getObjects(Alert.class));
            }
            else if(image4.getColor().equals(colorToFill.toString()))
            {
                BaseGraph world = (BaseGraph)getWorld();
                world.addObject(new Alert(" The Color You Picked Match With The Adjacent Color  "),350,300);
                Greenfoot.delay(100);
                img.clear();
                DrawImage();
                world.removeObjects(world.getObjects(Alert.class));
            }
            else if(image5.getColor().equals(colorToFill.toString()))
            {
                              
                BaseGraph world = (BaseGraph)getWorld();
                world.addObject(new Alert(" The Color You Picked Match With The Adjacent Color  "),350,300);
                Greenfoot.delay(100);
                img.clear();
                DrawImage();
                world.removeObjects(world.getObjects(Alert.class));
            }
            else if(image7.getColor().equals(colorToFill.toString()))
            {
                BaseGraph world = (BaseGraph)getWorld();
                world.addObject(new Alert(" The Color You Picked Match With The Adjacent Color  "),350,300);
                Greenfoot.delay(100);
                img.clear();
                DrawImage();
                world.removeObjects(world.getObjects(Alert.class));
            }

        }
    }  
public String getColor()
{
if(isFilled)
{
return color;
}
else
return "PINK";
}
    public void getColorToFill(){ 

        BaseGraph world = (BaseGraph)getWorld();
        Color selectedColor = world.selectedColor();
        if(selectedColor !=null){
            colorToFill = selectedColor;
        }
    }
}
