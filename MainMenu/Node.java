
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
        if(isFilled){
            int x = this.getX();
            int y = this.getY();
            getImage().setColor(colorToFill);
            getImage().fillOval(0,0,50,50);
            /*
            if(count==0){
                if(colorToFill == Color.RED){

                    getWorld().addObject(new RedColor(), 51,65);
                }
                else if(colorToFill == Color.blue){

                    getWorld().addObject(new BlueColor(), 104,65);
                }
                else if(colorToFill == Color.green){

                    getWorld().addObject(new GreenColor(), 159,65);
                }
                else if(colorToFill == Color.orange){

                    getWorld().addObject(new OrangeColor(), 219,65);
                }
                count++;
            }*/
        }
    }   

    public void getColorToFill(){ 

        ColorPicker selectedColor = (ColorPicker)getOneObjectAtOffset(0,0,ColorPicker.class);
        if(selectedColor !=null){
            count=0;
            isFilled = true;
            colorToFill = selectedColor.getPickedColor();
            getWorld().removeObject(selectedColor);
        }
    }
}
