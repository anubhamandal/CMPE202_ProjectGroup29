
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ListIterator;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graph2 extends BaseGraph
{
    // int height = 600;
    //int width = 600;
    Label validLabel;
    Label colorSelectLabel;

    ColorPicker[] colors;
    int numColors = 0;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Graph2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    private void prepare() {
        //Country country1 = new Country(0, 100, 600, 200);
        //Country country2 = new Country(0, 300, 600, 200);
        //Country country3 = new Country(0, 100, 600, 200);
        //Country country4 = new Country(0, 300, 600, 200);
        TriangleCountry country1 = new TriangleCountry(0, 0, 600, 200);
        TriangleCountry country2 = new TriangleCountry(0, 0, 600, 200);
        TriangleCountry country3 = new TriangleCountry(0, 0, 400, 300);
        TriangleCountry country4 = new TriangleCountry(0, 0, 400, 300);

        addObject( country1, 300, 299);
        country1.setRotation(180);
        addObject( country2, 301, 500);
        addObject(country3, 149, 400);
        country3.setRotation(90);
        addObject(country4, 452, 400);
        country4.setRotation(270);
        validLabel = new Label("Select a color", 40);
        addObject(validLabel, 300, 40);
        //checkValid();

        // Color Picker
        RedColor red = new RedColor(75, 75);
        YellowColor yellow = new YellowColor(75, 75);
        BlueColor blue = new BlueColor(75, 75);
        GreenColor green = new GreenColor(75, 75);
        colors = new ColorPicker[]{red, yellow, blue, green};
        /*
        addObject(red, 100, 150);
        addObject(yellow, 200, 150);
        addObject(blue, 300, 150);
        addObject(green, 400, 150);
        numColors = 4;
*/
        // Color selected label
        colorSelectLabel = new Label("Color Selected: ", 20);
        addObject(colorSelectLabel, 100, 75);

        // Increase or decrease colors
        addObject(new MinusColorButton(), 50, 25);
        addObject(new PlusColorButton(), 100, 25);
        
        int numCol = Integer.parseInt(Greenfoot.ask("How many colors? (up to 4)"));
        for (int i = 0; i < numCol && i<4; i++){
            increaseColors();
        }            

    }
    public void increaseColors() {
        if (numColors >= 4){
            return;
        }
        numColors++;
        addObject(colors[numColors-1], numColors*100, 150);

    }

    public void decreaseColors() {
        if (numColors <= 1) {
            return;
        }
        numColors--;
        removeObject(colors[numColors]);

    }

    public void setSelectedColor(Color color) {
        this.selectedColor = color;
        String colString = "Color Selected: " + Utils.getInstance().colorToString(color);
        this.colorSelectLabel.setValue( colString);
        this.validLabel.setValue("Click a country");
    }

    public void checkValid() {

        List<Country> objList = getObjects(Country.class);
        ListIterator<Country> li = objList.listIterator();

        while(li.hasNext()){
            Country c = li.next();
            if (! c.checkColor()){
                this.validLabel.setValue("invalid");
                return;
            }
        }
        this.validLabel.setValue("valid");
    }
}