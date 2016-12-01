 

import greenfoot.*;
import java.awt.Color;

public class Menu extends World
{
    private BaseGraph activeGraph;

    Label label;
    // '1' key (Graph1) //Madhuri
    // '2' key (Graph2) //Jon
    // '3' key (Graph3) //Anubha
    //  '4' key (Graph4) //Shilpa

    //  '6' key (Graph6) //Veeresh

    public Menu()
    {
        super(800, 500, 1);   
        init();
    }

    private void init(){
        GreenfootImage background = new GreenfootImage("Background.jpg");
        setBackground(background);
        background = getBackground();
        GreenfootImage text;
        text = new GreenfootImage("Welcome to the Graph Coloring Game!", 40, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 50);
        text = new GreenfootImage("Graph Selection Menu", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 200);
        text = new GreenfootImage("Use '1' key to go to Graph1", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 300);
        text = new GreenfootImage("Use '2' key to go to Graph2", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 330);
        text = new GreenfootImage("Use '3' key to go to Graph3", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 360);
        text = new GreenfootImage("Use '4' key to go to Graph4", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 390);
        text = new GreenfootImage("Use '5' key to go to Graph5", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 420);
        text = new GreenfootImage("Use '6' key to go to Graph6", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 450);
    }

    public void act()
    {
        if (activeGraph != null) {
            return;
        }

        if (Greenfoot.isKeyDown("1"))
        {
            activeGraph = new Graph1();
        }

        if ( Greenfoot.isKeyDown("2"))
        {
            activeGraph = new Graph2(1);
        }

        if ( Greenfoot.isKeyDown("3"))
        {
            activeGraph = new Graph3();
        }

        if ( Greenfoot.isKeyDown("4"))
        {
             activeGraph = new Graph4();
        }

        if (Greenfoot.isKeyDown("5"))
        {
            activeGraph = new Graph5();
        }

        if ( Greenfoot.isKeyDown("6"))
        {
            activeGraph = new Graph6();
        }

        if (Greenfoot.mouseClicked(this)){
            GreenfootImage background = getBackground();
            label = new Label("test", 40);
            addObject(label, 300, 270);

           // activeGraph = new TestWorld();
           Greenfoot.setWorld(new TestWorld());
           return;
        }

        try{
            if (activeGraph != null){
                String playerName = "player";
                activeGraph.setPlayerName(playerName);
                activeGraph.setCurrentPlayer(playerName);
                Greenfoot.setWorld(activeGraph);
            }
        }catch (Exception e){
            System.err.println(e);
        }

    }
    public BaseGraph getActiveGraph() {
        return activeGraph;
    }
}
