 

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
 * @author jonguan 
 * @version 11-4-16
 */
public class Graph2 extends BaseGraph
{
    // int height = 600;
    //int width = 600;
    

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
        TriangleCountry country1 = new TriangleCountry(0, 0, 600, 200, 1);
        TriangleCountry country2 = new TriangleCountry(0, 0, 600, 200, 2);
        TriangleCountry country3 = new TriangleCountry(0, 0, 400, 300, 3);
        TriangleCountry country4 = new TriangleCountry(0, 0, 400, 300, 4);

        addObject( country1, 300, 299);
        country1.setRotation(180);
        addObject( country2, 301, 500);
        addObject(country3, 149, 400);
        country3.setRotation(90);
        addObject(country4, 452, 400);
        country4.setRotation(270);
        validLabel = new Label("Select a color", 40);
        addObject(validLabel, 300, 40);
        
        

        // Color Picker
        
        // Color selected label
        colorSelectLabel = new Label("Color Selected: ", 20);
        addObject(colorSelectLabel, 100, 75);

        //int numCol = Integer.parseInt(Greenfoot.ask("How many colors? (up to 4)"));
        int numCol = 3;
     
        colorPicker = new ColorPicker(300, 75, numCol);
        addObject(colorPicker, 150, 150);

    }

    /**
     * A method to check if the adjacent colors of the graph nodes are different
     */
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