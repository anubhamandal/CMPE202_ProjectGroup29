import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Map;
import java.util.HashMap;

import java.net.* ;
import java.util.* ;
import java.io.* ;
import org.json.* ;
import org.restlet.resource.*;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.data.* ;
import org.restlet.ext.jackson.*;


/**
 * Write a description of class BaseGraph here.
 * 
 * @author jonguan
 * @version 11-4-16
 */
public class BaseGraph extends World
{

    private static String url = "http://localhost:8080/graphgame";
    public ColorPicker colorPicker;
    Label validLabel;
    Label colorSelectLabel;
    public long startTime,stopTime;

    // The following is to keep track of the colors of the nodes
    public Map<Double, String> colorMap = new HashMap<Double, String>();

    private ClientResource client = new ClientResource(url);
    
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
        startTime = System.currentTimeMillis();
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

    public void setCountryColor(Double id){
        // Local
        colorMap.put(id, Utils.getInstance().colorToString(selectedColor()));
        // Server
        GraphAction graphAct = new GraphAction();
        graphAct.setColor(Utils.getInstance().colorToString(selectedColor()));
        graphAct.setNodeId(id);
        
        Representation rep = new JacksonRepresentation<GraphAction>(graphAct) ;
        client.post(rep, MediaType.APPLICATION_JSON);
    }
    
    /**
     * A method to check if the adjacent colors of the graph nodes are different
     */
    public void checkValid() {
        // Implement this method in children
    }
    
    public void updateCountries(Map map){
    
    }
}
