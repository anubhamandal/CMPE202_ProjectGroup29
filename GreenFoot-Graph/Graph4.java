import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class GraphColoringWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graph4 extends BaseGraph
{

    /**
     * Constructor for objects of class GraphColoringWorld.
     * 
     */
    public Graph4()
    {    
        super(800, 600, 1); 

        prepare();
    }

    public void prepare()
    {

        Image1 image1=new Image1();
        addObject(image1,200,300);
        Image2 image2=new Image2();
        addObject(image2,460,200);
        Image3 image3=new Image3();
        addObject(image3,580,390);
        Image4 image4=new Image4();
        addObject(image4,325,490);
        Image5 image5=new Image5();
        addObject(image5,340,290);
        Image6 image6=new Image6();
        addObject(image6,340,390);
        Image7 image7=new Image7();
        addObject(image7,460,345);

        colorPicker = new ColorPicker(300, 65, 4);
        addObject (colorPicker, 150, 50);

        Greenfoot.start();
    }
}
