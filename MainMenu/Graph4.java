 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class GraphColoringWorld here.
 * 
 * @author (Shilpa Chandra) 
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
        Image2 image2=new Image2();
        Image3 image3=new Image3();
        Image4 image4=new Image4();
        Image5 image5=new Image5();
        Image6 image6=new Image6();
        Image7 image7=new Image7();
        Image1 image1=new Image1();
        image1.drawImage();
        image1.setAdjacents(image2,image4,image5,image6);
        addObject(image1,200,300);
        image2.DrawImage();
        image2.setAdjacents(image1, image3, image5, image7);
        addObject(image2,460,200);
        image3.DrawImage();
        image3.setAdjacents(image2, image4, image7);
        addObject(image3,580,390);
        image4.DrawImage();
        image4.setAdjacents(image1,image3, image6, image7);
        addObject(image4,325,490);
        image5.DrawImage();
        image5.setAdjacents(image1, image2, image6, image7);
        addObject(image5,340,290);
        image6.DrawImage();
        image6.setAdjacents(image1,image4, image5, image7);
        addObject(image6,340,390);
        image7.DrawImage();
        image7.setAdjacents(image2, image3, image4);
        addObject(image7,460,345);
        colorPicker = new ColorPicker(300, 65, 4);
        addObject (colorPicker, 150, 50);
        Greenfoot.start();
    }

   public void act()
   {
        
   }
}