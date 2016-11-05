import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

public class Node extends Actor
{
    private String title;
    Color colorToFill=null;
    boolean isFilled = false;

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
        img.fillOval(0, 0, 30, 30);
        setImage(img);        
    }

    public String getTitle() {
        return title;
    }
    
     public void act() 
    {
        getColorToFill();
        if(isFilled){
              System.out.println("123");
            int x = this.getX();
            int y = this.getY();
            getWorld().addObject(new FillNode(colorToFill), x, y);
             if(colorToFill == Color.RED){
                 getWorld().addObject(new RedColor(), 51,65);
             }
             else if(colorToFill == Color.blue)
                getWorld().addObject(new BlueColor(), 104,65);
             else if(colorToFill == Color.green)
                getWorld().addObject(new GreenColor(), 159,65);
             else if(colorToFill == Color.orange)
                getWorld().addObject(new OrangeColor(), 219,65);
            
        }
    }   
    
    public void getColorToFill(){ 
            System.out.println("insideget");
            Actor selectedColor = getOneObjectAtOffset(0,0,ColorPallet.class);
            if(selectedColor !=null){
                System.out.println("inside");
                isFilled = true;
                if(selectedColor instanceof RedColor){ 
                   colorToFill = Color.RED;
                }
                else if(selectedColor instanceof BlueColor){ 
                    colorToFill = Color.blue;
                }
                else if(selectedColor instanceof GreenColor){ 
                   colorToFill = Color.green;
                }
                else if(selectedColor instanceof OrangeColor){ 
                    colorToFill = Color.orange;
                }
             
            }
    }
}


    
    
    
