 

/**
 * Write a description of class GraphAction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphAction  
{
    private String color;
    private String playerid;
    private Integer nodeid;
    private String action;

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
    
    public Integer getNodeId(){
        return nodeid;
    }
    
    public void setNodeId(Integer nodeid){
        this.nodeid = nodeid;
    }
    
    public String getPlayerId(){
        return playerid;
    }
    
    public void setPlayerId(String playerId){
        this.playerid = playerId;
    }
    
    public void setAction(String action){
        this.action = action;
    }
    public String getAction() {
        return action;
    }

}
