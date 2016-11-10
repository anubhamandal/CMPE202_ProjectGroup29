import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class BaseGraph here.
 * 
 * @author jonguan
 * @version 11-4-16
 */
public class BaseGraph extends World
{

    public ColorPicker colorPicker;
    Label validLabel;
    Label colorSelectLabel;

    /**
     * Constructor for objects of class BaseGraph.
     * 
     */
    public BaseGraph()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }

    public BaseGraph(int worldWidth, int worldHeight, int cellSize){
        super(worldWidth, worldHeight, cellSize);
    }

    public Color selectedColor() {
        return colorPicker.selectedColor();
    }

    public void updateColor(Color color) {
        String colString = "Color Selected: " + Utils.getInstance().colorToString(color);
        if (this.colorSelectLabel != null) {

            this.colorSelectLabel.setValue( colString);
        }
        if (this.validLabel != null) {

            this.validLabel.setValue("Click a country");
        }
    }

}
