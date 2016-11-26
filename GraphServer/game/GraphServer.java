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
    private String currentPlayer;
    private Integer desiredNumPlayers;
    private ArrayList<String> playerArray = new ArrayList<String>();

    // TBD - multi game, multi-player
    // {gameId: {mapId:Integer, numPlayers:Integer, currentPlayer:String}}
    private Map<Integer, Object> gameMap;

    // {nodeId: color}
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
     * Format:
     * {action:getMoves,insertMove,createGame,joinGame,getGames
     *  playerId:String (required),
     *  nodeId:Integer (required for insertMove),
     *  color:String (required for insertMove)
    gameId:String (future feature - multiple concurrent game support),
    numPlayers:Integer (used for createGame - future feature - more than 2 player game),

    }
     */
    public JSONObject parseCommand(String command){
        //Turn into JSON object first
        JSONObject json = new JSONObject(command);
        switch (json.getString("action")) {
            case "getMoves":
            return getMovesJson("");
            case "insertMove":
            {
                if (desiredNumPlayers > playerArray.size()){
                    return getMovesJson("Waiting for players");
                }
                String player = json.getString("playerId");
                if (player.equals(currentPlayer)){
                    this.insertMove(json.getInt("nodeId"), json.getString("color"));
                    // Next player moves
                    int playerIdx = playerArray.indexOf(player);
                    int nextIdx = ++playerIdx % playerArray.size();
                    currentPlayer = playerArray.get(nextIdx);
                }
                return getMovesJson("");
            }
            case "createGame":
            case "getGames":
            case "joinGame":
            {
                String player = json.getString("playerId");
                // Error check player name
                if (playerArray.contains(player)) {
                    return getMovesJson("name exists; try again. Bye");
                }
                // Set current player
                if (currentPlayer == null){
                    desiredNumPlayers = json.getInt("numPlayers");
                }
                playerArray.add(player);
                // Error check multi player
                if (playerArray.size() < desiredNumPlayers) {
                    return getMovesJson("Waiting for players");
                } else if (playerArray.size() == desiredNumPlayers){
                    currentPlayer = player;
                    return getMovesJson("");
                } else {
                    playerArray.remove(playerArray.size()-1);
                    return getMovesJson("Sorry. Game full. Bye");
                }
            }
            default:
            return getMovesJson("");
        }

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

    public JSONObject getMovesJson(String error){
        JSONObject j = new JSONObject();
        j.put("colorMap", new JSONObject(colorMap));
        j.put("currentPlayer", currentPlayer);
        j.put("error", error);
        return j;
    }

    public String getNodeColor(Integer nodeId){
        return colorMap.get(nodeId);
    }

}
