import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class ColorPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ColorPicker extends Actor
{
    int width, height = 0;
    Color lineColor = Color.WHITE;
    Color fillColor = Color.GRAY;

    public Color getPickedColor(){
        return null;
    }
    
    /**
     * Act - do whatever the ColorPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            //Change line color to black
            this.lineColor = Color.black;

            // Tell BaseGraph that this color selected
            Graph2 world = (Graph2)getWorld();
            world.setSelectedColor(fillColor);

            // Update outline to show selected
            world.updatePicker();
            //updateImage();
        }
        
        if (Greenfoot.mouseDragged(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
    }   

    public boolean isSelected(){
        BaseGraph world = (BaseGraph)getWorld();
        if (world == null) return false;
        return fillColor == world.selectedColor;
    }
    public ColorPicker(){
         //do nothing 
     }
    public ColorPicker(int width, int height){
        this.width = width;
        this.height = height;

        updateImage();
    }

    /**
     * Update the image on screen to show the current value.
     */
    void updateImage()
    {
        GreenfootImage image = new GreenfootImage(width, height);
        drawInImage(image);
        setImage(image);
    }

    void drawInImage(GreenfootImage image) {
        image.setColor(lineColor);
        image.drawRect(0, 0, width, height);
        image.setColor(fillColor);
        image.fillRect(0, 0, width, height);
        if (isSelected()){
            image.setColor(lineColor);
            image.drawLine(0, 0, width, height);
        }
    }
}
