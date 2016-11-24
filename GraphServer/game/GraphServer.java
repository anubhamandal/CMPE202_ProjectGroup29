package game; 

import java.util.*;
import org.json.* ;

/**
 * Write a description of class GraphServer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphServer
{

    private volatile static GraphServer gserver;

    private Map<Integer, String> colorMap;

    /**
     * Constructor for objects of class GraphServer
     */
    private GraphServer()
    {
        resetGame();
    }

    public static GraphServer getInstance() {
        if (gserver == null) {
            synchronized (GraphServer.class) {
                gserver = new GraphServer();
            }
        }
        return gserver;
    }

    /**
     * parse Socket commands
     */
    public String parseCommand(String command){
        //Turn into JSON object first
        JSONObject json = new JSONObject(command);
        switch (json.getString("action")) {
            case "getMoves":
            return getMovesString();
            case "insertMove":
            {
                this.insertMove(json.getInt("nodeId"), json.getString("color"));
                return getMovesString();
            }

        }
        return "";
    }

    public void resetGame() {
        colorMap = new HashMap<Integer, String>();
    }

    public void insertMove(Integer nodeId, String color) {
        colorMap.put(nodeId, color);
    }

    public Map getMoves() {  
        return colorMap;
    }

    public String getMovesString(){
        return new JSONObject(colorMap).toString();
    }

    public String getNodeColor(Integer nodeId){
        return colorMap.get(nodeId);
    }
    

}
