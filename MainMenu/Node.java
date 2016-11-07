
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

public class Node extends Actor
{
    private String title;
    Color colorToFill=null;
    boolean isFilled = false;
    int count=0;

    public Node(String pTitle) {
        title = pTitle;
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(Color.black);
        img.drawOval(0,0,50,50);
        setImage(img);
    }

    public void mark() {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.green);
        img.fillOval(0, 0, 50, 50);
        setImage(img);        
    }

    public String getTitle() {
        return title;
    }

    public void act() 
    {
        getColorToFill();
        if (Greenfoot.mouseClicked(this)){
            int x = this.getX();
            int y = this.getY();
            getImage().setColor(colorToFill);
            getImage().fillOval(0,0,50,50);
            
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
