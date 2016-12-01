import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import org.json.* ;
import com.fasterxml.jackson.databind.*;
import org.restlet.resource.*;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.data.* ;
import org.restlet.ext.jackson.*;
import java.util.*;
import game.GraphServer;
import java.awt.Color;
/**
 * Write a description of class JoinGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGame extends World
{
    BaseGraph activegraph;
    List<GameMetaData> gamesList = new ArrayList<GameMetaData>();
    public int graphNumber;
    GreenfootImage background;
    public JoinGame(int graphNumber)
    {    
        super(800, 500, 1); 
        this.graphNumber=graphNumber;
        background= new GreenfootImage("Background.jpg");
        setBackground(background);
        background = getBackground();

    }
    // Prepare the action and send the action to the client 
    
    public void getGamesActionToServer(){
        GraphAction graphAct = new GraphAction();
        graphAct.setAction("getGames");
        GraphClient.getInstance().sendAction(graphAct);
    }
    //receive available games from the server
    
    public boolean receiveMove(String move){
       System.out.println("received " + move); 
        try{
            JSONObject json = new JSONObject(move);
            String err = json.optString("error");
            System.out.println("err is " + err);
            if (err != null && err.length() > 0 ){
                 return (err.indexOf("Bye") < 0);
            }
            JSONArray array = json.getJSONArray("games");
            for(int i = 0 ; i < array.length() ; i++){
                if(array.getJSONObject(i).getInt("graphNum") == graphNumber) {
                    GameMetaData gm =  new GameMetaData();
                    gm.gameid = array.getJSONObject(i).getInt("gameId");
                    gm.numofPlayers = array.getJSONObject(i).getInt("numPlayers");
                    gm.graphnumber = array.getJSONObject(i).getInt("graphNum");
                    gamesList.add(gm);
                }
           }
           showCurrentGames();
        }catch (JSONException e){
            System.out.println(e);
            return false;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    //show currrent games in greenfoot
    public void showCurrentGames(){  
        int datax = 100;
        int datak = 130;
        if(gamesList.size()>0){
            for(int i=0;i<gamesList.size();i++){
                StringBuffer sb = new StringBuffer();
                sb.append("Game Id : ");
                sb.append(gamesList.get(i).gameid);
                sb.append("Number of Players ");
                sb.append(gamesList.get(i).numofPlayers);
                GreenfootImage gd =  new GreenfootImage( sb.toString(),32,Color.black, new Color(0, 0, 0, 0));
                GreenfootImage text = new GreenfootImage("Use"+ (i+1) +" key to Join above Game", 32, Color.black, new Color(0, 0, 0, 0));
                background.drawImage(gd, 400-text.getWidth()/2,datax );
                background.drawImage(text, 400-text.getWidth()/2, datak);
                datax += (30);
                datak += (30);
            }
        }
        else{

            GreenfootImage text = new GreenfootImage("No Present games for selected graph", 32, Color.black, new Color(0, 0, 0, 0));
            background.drawImage(text, 400-text.getWidth()/2, datak);
            Button createGame = new Button("Create Game", 2000);
            addObject(createGame, 392, 241);

        }
    }

    public void act()
    {        
        // add the JoinGame Logic based on the user input

    }
}

class GameMetaData{
    int gameid;
    int numofPlayers;
    int graphnumber;
}

