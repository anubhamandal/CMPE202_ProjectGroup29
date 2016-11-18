package game; 

import java.util.*;

/**
 * Write a description of class GraphServer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphServer
{

    private volatile static GraphServer gserver;

    private Map<Double, String> colorMap;
    
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
    
    public void resetGame() {
        colorMap = new HashMap<Double, String>();
    }
    
    public void insertMove(Double nodeId, String color) {
        colorMap.put(nodeId, color);
    }
    
    public Map getMoves() {
        return colorMap;
    }
    
    public String getNodeColor(Double nodeId){
        return colorMap.get(nodeId);
    }
}