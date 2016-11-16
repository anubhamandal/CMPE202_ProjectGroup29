 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;
import java.util.ListIterator;

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
    private double id;

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
                List<Country> countries = this.getIntersectingObjects(Country.class);
                ListIterator<Country> li = countries.listIterator();
                while (li.hasNext()){
                    Country c = li.next();
                    c.mouseClicked();
                }
            } else {
                mouseClicked();
            }
        }
    }    

    void mouseClicked() {

        if (! isClickInRange()){
            return;
        }
     
        BaseGraph world = (BaseGraph)getWorld();
        fillColor = world.selectedColor();
        world.setCountryColor(id);
        updateImage();
        world.checkValid();
    }

    boolean isClickInRange() {
        if (! this.addedToWorld) return false;
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (Greenfoot.getMouseInfo() == null) return false;
        int selfx = getX();
        int selfy = getY();
        int clickx = mi.getX();
        int clicky = mi.getY();

        int x = clickx - selfx;
        int y = clicky - selfy;
        int rot = getRotation();
        System.out.printf("rot %d, x %d, y %d\n", rot, Math.abs(x), Math.abs(y));
        return Math.abs(x) < width/2.0 && Math.abs(y) < height/2.0;
    }

    /**
     * A function to check the validity of country color.  
     * true if adjacent colors do not match this country color
     * false if adjacent countries have color that match this country color
     * Ignores GRAY, which is uninitialized color
     */
    public boolean checkColor(){
        // If uninitialized, quick exit
        if (this.fillColor == Color.GRAY) {
            return true;
        }
        
        List<Country> countries = getIntersectingObjects(Country.class);
        ListIterator<Country> it = countries.listIterator();
        while (it.hasNext()){
            Country c = it.next();
            if (c.fillColor == this.fillColor){
                return false;
            }
        }
        return true;
    }
    
    public Country() {
        id = Math.floor(Math.random()*99999999);
        updateImage();
    }

    public Country(int x, int y, int w, int h) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        updateImage();
    }

    /**
     * Method used to update color of country
     */
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
    
    public Color getColor() {
        return fillColor;
    }
}