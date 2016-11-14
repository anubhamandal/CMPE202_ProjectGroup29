import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Image1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image7 extends Graph4Creation
{
    /**
     * Act - do whatever the Image1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String title;
    Color colorToFill=null;
    boolean isFilled = false;
    int count=0;
    String color;
    Image2 image2;
    Image3 image3;
    Image4 image4;
    GreenfootImage img= new GreenfootImage(105, 205);
    public Image7()
    {

    }

    public void DrawImage()
    {
        isFilled=false;
        img.setColor(java.awt.Color.BLACK);
        img.drawRect(0,0,100,200);
        setImage(img);
    }

    public void setAdjacents(Image2 image2,Image3 image3,Image4 image4)
    {
        this.image2=image2;
        this.image3=image3;
        this.image4=image4;
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
            isFilled=true;
            color=colorToFill.toString();
            getImage().fillRect(0,0,100,200);
            if(image2.getColor().equals(colorToFill.toString()))
            {
                BaseGraph world = (BaseGraph)getWorld();
                world.addObject(new Alert(" The Color You Picked Match With The Adjacent Color  "),350,300);
                Greenfoot.delay(100);
                img.clear();
                DrawImage();
                world.removeObjects(world.getObjects(Alert.class));
            }
            else if(image3.getColor().equals(colorToFill.toString()))
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
        }
    }

    public String getColor()
    {
        if(isFilled)
            return color;
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
