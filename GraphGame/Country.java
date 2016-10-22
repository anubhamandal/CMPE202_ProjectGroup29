import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Country here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Country extends Actor
{
    Color lineColor = Color.YELLOW;
    Color fillColor = Color.GRAY;
    static final Color transparent = new Color(0,0,0,0);
    int width = 600;
    int height = 200;
    int xPos = 0;
    int yPos = 0;
    private int clickCount;
    boolean isClicked = isClickInRange();
    boolean addedToWorld = false;
    
    public void addedToWorld(World world) {
        this.addedToWorld = true;
    }
    
    /**
     * Act - do whatever the Country wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            if (! isClickInRange()) {
            // Forward click to any intersecting objects
            
            }
            this.clickCount += 1;
            this.clickCount %= 3;

            switch(clickCount){
                case 0:
                    fillColor = Color.GRAY;
                    break;
                case 1:
                    fillColor = Color.RED;
                    break;
                case 2:
                    fillColor = Color.BLUE;
                    break;
            }
            updateImage();
        }
    }    
    
    boolean isClickInRange() {
        if (! this.addedToWorld) return false;
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (Greenfoot.getMouseInfo() == null) return false;
        return true;
    }
    
    public Country() {
        updateImage();
    }
    
    public Country(int x, int y, int w, int h) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        updateImage();
    }
    
    void updateColor(Color color){
        fillColor = color;
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
        image.drawRect(0, 0, width-1, height-1);
        image.setColor(fillColor);
        image.fillRect(1, 1, width-2, height-2);
    }
}
