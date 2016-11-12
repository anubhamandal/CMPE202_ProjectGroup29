
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;

public class Node extends Actor
{
    private String title;
    Color colorToFill=null;
    String filledColorString;
        
    public Node(String pTitle) {
        title = pTitle;
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(Color.black);
        img.drawOval(0,0,50,50);
        setImage(img);
    }

    public String getTitle() {
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
            ((Graph1)getWorld()).colorMap.put(title,filledColorString);    
            validateGraph();
        }
       
       
    }   

    public void getColorToFill(){ 
        BaseGraph world = (BaseGraph)getWorld();
        Color selectedColor = world.selectedColor();
        if(selectedColor !=null){
            colorToFill = selectedColor;
        }
    }
    public void validateGraph(){
        Set<String> filledNodes = ((Graph1)getWorld()).colorMap.keySet();
        for(String node : filledNodes){
            Set<String> connectedNodes = ((Graph1)getWorld()).connectedMap.get(node);
            Iterator iterator = connectedNodes.iterator(); 
            while (iterator.hasNext()){
                String adjNode = (String)iterator.next();
                String adjColor =((Graph1)getWorld()).colorMap.get(adjNode);
                if(adjColor!=null && adjColor.equals(((Graph1)getWorld()).colorMap.get(node))){
                    ((Graph1)getWorld()).validLabel.setValue("Filled Color is invalid");
                    return;
                }
            }
        }
        ((Graph1)getWorld()).validLabel.setValue("");
    }
         
}
