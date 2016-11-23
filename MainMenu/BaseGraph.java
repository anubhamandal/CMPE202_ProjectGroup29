 


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;

/*
import java.net.* ;
import java.util.* ;
import java.io.* ;
import org.json.* ;
import com.fasterxml.jackson.databind.*;
import org.restlet.resource.*;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.data.* ;
import org.restlet.ext.jackson.*;
*/
/**
 * Write a description of class BaseGraph here.
 * 
 * @author jonguan
 * @version 11-4-16
 */
public class BaseGraph extends World implements IClientDelegate
{

    private static String url = "http://localhost:8080/graphgame";
    public ColorPicker colorPicker;
    Label validLabel;
    Label colorSelectLabel;
    public long startTime,stopTime;

    // The following is to keep track of the colors of the nodes
    public Map<Double, String> colorMap = new HashMap<Double, String>();

   // private ClientResource client = new ClientResource(url);

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
        //GraphClient.getInstance().reset();
        //GraphClient.getInstance().setDelegate(this);

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
        graphAct.setAction("insertMove");

        //Representation rep = new JacksonRepresentation<GraphAction>(graphAct) ;
        //client.post(rep, MediaType.APPLICATION_JSON);
        /*
        ObjectMapper mapper = new ObjectMapper();
        try{
            String jsonRep = mapper.writeValueAsString(graphAct);
            //System.out.println(jsonRep);
            //GraphClient.getInstance().send(jsonRep);
        }catch (Exception e){
            System.out.println(e);
        }
        */

    }
    /**
     * A method to check if the adjacent colors of the graph nodes are different
     */
    public void checkValid() {
        // Implement this method in children
    }

    public void updateCountries(Map map){

    }

    public void receiveMove(String move){

        // try{
            // JSONObject json = new JSONObject(move);
            // Integer nodeId = json.getInt("nodeId");
            // String color = json.getString("color");
            // colorMap.put(nodeId, color);
            // refreshNodeColors();
        // }catch (JSONException e){
            // System.out.println(e);
        // }

         
    }
    /**
     * Refresh country colors based on color map
     */
    public void refreshNodeColors(){
        List nodes = getObjects(Country.class);
        Iterator it = nodes.iterator();
        while(it.hasNext()){
            Country c = (Country)it.next();
            String colorString = colorMap.get(c.getId());
            if (colorString != null){
                Color color = Utils.getInstance().stringToColor(colorString);
                c.updateColor(color);
            }
        }

    }
}
