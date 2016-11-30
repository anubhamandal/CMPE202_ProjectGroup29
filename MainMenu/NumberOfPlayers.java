import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
/**
 * Write a description of class NumberOfPlayers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberOfPlayers extends BaseGraph implements ActionListener
{
    private TextField numberofplayers;
    private Button singleplayer;
    private Button multiplayer;
    private boolean enabled = true;
    BaseGraph activegraph;
    private Button colorfulBtn;
    private Border blueBorder = new LineBorder(Color.BLUE, 3);
    GreenfootImage background = new GreenfootImage("Background.jpg");
    GreenfootImage text;
    int graphnumber;
    /**
     * Constructor for objects of class NumberOfPlayers.
     * 
     */
    public NumberOfPlayers(int n)
    {
        super(800, 500, 1); 
        this.graphnumber=n;
        setBackground(background);
        background = getBackground();
        
        text = new GreenfootImage("Welcome to the Graph"+n+"!!", 40, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 50);
        text = new GreenfootImage("Please Select Single or Multi Player", 32, Color.black, new Color(0, 0, 0, 0));
        background.drawImage(text, 400-text.getWidth()/2, 200);
        singleplayer = new Button("Single Player", 2000);
        singleplayer.addActionListener(this);
        addObject(singleplayer, 350, 300);
        multiplayer = new Button("Multi Player", 1001);
        multiplayer.addActionListener(this);
        addObject(multiplayer, 450, 300);

    }

    public void actionPerformed(GUIComponent c) {
        if(c==singleplayer || c== numberofplayers)
        {
            switch(graphnumber)
            {
                            case 1:
                            activegraph=new Graph1();
                            break;
                            case 2:
                            activegraph=new Graph2();
                            break;
                            case 3:
                            activegraph=new Graph3();
                            break;
                            case 4:
                            activegraph=new Graph4();
                            break;
                            case 5:
                            activegraph=new Graph5();
                            break;
                            case 6:
                            activegraph=new Graph6();
                            break;
        }
        }
        else if(c==multiplayer)
        {
             /*text = new GreenfootImage("Please Enter Number Of Players", 20, Color.black, new Color(0, 0, 0, 0));
             background.drawImage(text,  300, 350);
             numberofplayers = new TextField(10);
             numberofplayers.addActionListener(this);
             numberofplayers.requestFocus();    
             addObject( numberofplayers, 400, 400); */
             String numPlayers = Greenfoot.ask("How many players?");
             desiredPlayers = Integer.parseInt(numPlayers);
             if(desiredPlayers!=0){
               JoinGame g = new JoinGame();
               g.getCurrentGames(graphnumber);
               Greenfoot.setWorld(g);
            }
        }
        

    }

    public void act()
    {
        try{
            if (activegraph != null){
                Greenfoot.setWorld(activegraph);
            }
        }catch (Exception e){
            System.err.println(e);
        }
    }
}

