
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Image2 here.
 * 
 * @author (Shilpa Chandra) 
 * @version (a version number or a date)
 */
public class Image2 extends Graph4Creation
{
    /**
     * Act - do whatever the Image2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String title;
    Color colorToFill=null;
    String color;
    boolean isFilled = false,isGameOver=false;
    int count=0;
    Image1 image1;
    Image2 image2;
    Image3 image3;
    Image4 image4;
    Image5 image5;
    Image6 image6;
    Image7 image7;
    GreenfootImage img= new GreenfootImage (385, 95);
    public Image2()
    {

    }

    public void setAdjacents(Image1 image1,Image2 image2,Image3 image3,Image4 image4,Image5 image5,Image6 image6,Image7 image7)
    {
        this.image1=image1;
        this.image2=image2;
        this.image3=image3;
        this.image4=image4;
        this.image5=image5;
        this.image6=image6;
        this.image7=image7;
    }

    public void DrawImage()
    {
        isFilled=false;
        img.setColor(java.awt.Color.BLACK);
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
            isFilled=true;
            color=colorToFill.toString();
            getImage().fillRect(0,0,380,90);
            if(image1.getColor().equals(colorToFill.toString()))
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
            else if(image1.isFilled==true&&image3.isFilled==true&&image4.isFilled==true&&image5.isFilled==true&&image6.isFilled==true&&image7.isFilled==true)
            {
                isGameOver=true;
            }

        }
        checkEndGame();
    }

    public String getColor()
    {
        if(isFilled)
            return color;
        else 
            return "PINK";
    }

    public void checkEndGame(){
        if(isGameOver){
            ((BaseGraph)getWorld()).stopTime=System.currentTimeMillis();
            int timeTaken = (int)(((BaseGraph)getWorld()).stopTime-((BaseGraph)getWorld()).startTime)/1000;
            // ((Graph1)getWorld()).validLabel.setValue("Finished the game in "+ timeTaken + " seconds");
            isGameOver = true;
            EndGame endgame = new EndGame(timeTaken);
            Greenfoot.setWorld(endgame);

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
