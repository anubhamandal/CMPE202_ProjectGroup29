import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
/**
 * Write a description of class Image1 here.
 * 
 * @author (Shilpa Chandra) 
 * @version (a version number or a date)
 */
public class Image1 extends Graph4Creation
{
    /**
     * Act - do whatever the Image1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String title;
    Color colorToFill=null,colorToValidate;
    boolean isFilled = false;
    int count=0;
    String color;
    Image2 image2;
    Image4 image4;
    Image5 image5;
    Image6 image6;
    GreenfootImage img= new GreenfootImage(145, 295);
    public Image1()
    {

    }

    public void setAdjacents(Image2 image2,Image4 image4,Image5 image5,Image6 image6)
    {
        this.image2=image2;
        this.image4=image4;
        this.image5=image5;
        this.image6=image6;

    }

    public void drawImage()
    {
        isFilled=false;
        img.setColor(java.awt.Color.BLACK);
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
            isFilled=true;
            color=colorToFill.toString();
            getImage().setColor(colorToFill);
            getImage().fillRect(0,0,140,290);
            if(image2.getColor().equals(colorToFill.toString()))
            {
                BaseGraph world = (BaseGraph)getWorld();
                world.addObject(new Alert(" The Color You Picked Match With The Adjacent Color  "),350,300);
                Greenfoot.delay(100);
                img.clear();
                drawImage();
                world.removeObjects(world.getObjects(Alert.class));
            }
            else if(image4.getColor().equals(colorToFill.toString()))
            {
                BaseGraph world = (BaseGraph)getWorld();
                world.addObject(new Alert(" The Color You Picked Match With The Adjacent Color  "),350,300);
                Greenfoot.delay(100);
                img.clear();
                drawImage();
                world.removeObjects(world.getObjects(Alert.class));
            }
            else if(image5.getColor().equals(colorToFill.toString()))
            {
                BaseGraph world = (BaseGraph)getWorld();
                world.addObject(new Alert(" The Color You Picked Match With The Adjacent Color  "),350,300);
                Greenfoot.delay(100);
                img.clear();
                drawImage();
                world.removeObjects(world.getObjects(Alert.class));
            }
            else if(image6.getColor().equals(colorToFill.toString()))
            {
                BaseGraph world = (BaseGraph)getWorld();
                world.addObject(new Alert(" The Color You Picked Match With The Adjacent Color  "),350,300);
                Greenfoot.delay(100);
                img.clear();
                drawImage();
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
