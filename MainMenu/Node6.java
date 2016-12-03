 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;

public class Node6 extends Actor
{
    private Integer title;
    Color colorToFill=null;
    String filledColorString;
    boolean isGameOver=false;
        
    public Node6(Integer pTitle) {
        title = pTitle;
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(Color.black);
        img.drawOval(0,0,50,50);
        setImage(img);
    }

    public Integer getTitle() {
        return title;
    }

    public void act() 
    {
        
        getColorToFill();
        if (Greenfoot.mouseClicked(this)){
            int x = this.getX();
            int y = this.getY();
            getImage().setColor(colorToFill);
            getImage().fillOval(0,0,50,50);
            filledColorString = Utils.getInstance().colorToString(colorToFill);
            ((Graph6)getWorld()).colorMap.put(title,filledColorString);    
            validateGraph();
        }
        checkEndGame();
       
    }   

    public void getColorToFill(){ 
        BaseGraph world = (BaseGraph)getWorld();
        Color selectedColor = world.selectedColor();
        if(selectedColor !=null){
            colorToFill = selectedColor;
        }
    }
    
    public void validateGraph(){
        Set<Integer> filledNodes = ((Graph6)getWorld()).colorMap.keySet();
        for(Integer node : filledNodes){
            Set<Integer> connectedNodes = ((Graph6)getWorld()).connectedMap.get(node);
            Iterator iterator = connectedNodes.iterator(); 
            while (iterator.hasNext()){
                Integer adjNode = (Integer)iterator.next();
                String adjColor =((Graph6)getWorld()).colorMap.get(adjNode);
                if(adjColor!=null && adjColor.equals(((Graph6)getWorld()).colorMap.get(node))){
                    ((Graph6)getWorld()).validLabel.setValue("Filled Color is invalid");
                    return;
                }
            }
        }
        ((Graph6)getWorld()).validLabel.setValue("");
    }
    
     public void checkEndGame(){
       if((((Graph6)getWorld()).colorMap.size() == 10) && !isGameOver  && !((Graph6)getWorld()).validLabel.getValue().equals("Filled Color is invalid") ){
            ((BaseGraph)getWorld()).stopTime=System.currentTimeMillis();
            int timeTaken = (int)(((BaseGraph)getWorld()).stopTime-((BaseGraph)getWorld()).startTime)/1000;
           // ((Graph1)getWorld()).validLabel.setValue("Finished the game in "+ timeTaken + " seconds");
           isGameOver = true;
           EndGame endgame = new EndGame(timeTaken);
           Greenfoot.setWorld(endgame);
            
        }
    }
}
