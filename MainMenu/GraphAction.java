 

/**
 * Write a description of class GraphAction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphAction  
{
    private String color;
    private String playerId;
    private Double nodeId;

    /**
     * Constructor for objects of class GraphAction
     */
    public GraphAction()
    {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Double getNodeId(){
        return nodeId;
    }
    
    public void setNodeId(Double nodeid){
        this.nodeId = nodeid;
    }
    
    public String getPlayerId(){
        return playerId;
    }
    
    public void setPlayerId(String playerId){
        this.playerId = playerId;
    }

}
