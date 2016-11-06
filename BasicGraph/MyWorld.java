import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        prepare();
    }
    
    private void prepare() {
        GreenfootImage bg = getBackground();
        bg.setColor(Color.white);
        bg.fill();
        //A-2 B-1 c-2 D-5 E-3 F-5 G-3 H-3 I-4J-5  k2 L3 M6 N4 O3 P3
        Map<String,Set<String>> connectedMap = new HashMap();
        Set<String> h1 = new HashSet<String>();
        h1.add("E");
        h1.add("J");
        connectedMap.put("A",h1);
        
        Set<String> h2 = new HashSet<String>();
        h2.add("C");
        connectedMap.put("B",h2);
        
        Set<String> h3 = new HashSet<String>();
        h3.add("B");
        h3.add("D");
        connectedMap.put("C",h3);
        
        Set<String> h4 = new HashSet<String>();
        h4.add("C");
        h4.add("E");
        h4.add("F");
        h4.add("J");
        h4.add("H");
        connectedMap.put("D",h4);
        
        Set<String> h5 = new HashSet<String>();
        h5.add("A");
        h5.add("G");
        h5.add("D");
        connectedMap.put("E",h5);
        
        Set<String> h6 = new HashSet<String>();
        h6.add("I");
        h6.add("G");
        h6.add("H");
        h6.add("D");
        h6.add("J");
        connectedMap.put("F",h6);
        
        Set<String> h7 = new HashSet<String>();
        h7.add("E");
        h7.add("I");
        h7.add("F");
        connectedMap.put("G",h7);
        
        Set<String> h8 = new HashSet<String>();
        h8.add("D");
        h8.add("J");
        h8.add("F");
        connectedMap.put("H",h8);
        
        Set<String> h9 = new HashSet<String>();
        h9.add("G");
        h9.add("F");
        h9.add("M");
        h9.add("N");
        connectedMap.put("I",h9);
        
        Set<String> h10 = new HashSet<String>();
        h10.add("A");
        h10.add("L");
        h10.add("D");
        h10.add("F");
        h10.add("H");
        connectedMap.put("J",h10);
        
        Set<String> h11 = new HashSet<String>();
        h11.add("L");
        h11.add("M");
        connectedMap.put("K",h11);
        
        Set<String> h12 = new HashSet<String>();
        h12.add("K");
        h12.add("J");
        h12.add("M");
        connectedMap.put("L",h12);
        
        Set<String> h13 = new HashSet<String>();
        h13.add("K");
        h13.add("L");
        h13.add("I");
        h13.add("N");
        h13.add("O");
        h13.add("P");
        connectedMap.put("M",h13);
        
        Set<String> h14 = new HashSet<String>();
        h14.add("I");
        h14.add("M");
        h14.add("O");
        h14.add("P");
        connectedMap.put("N",h14);
        
        Set<String> h15 = new HashSet<String>();
        h15.add("M");
        h15.add("N");
        h15.add("O");
        connectedMap.put("O",h15);
        
        Set<String> h16 = new HashSet<String>();
        h16.add("M");
        h16.add("N");
        h16.add("P");
        connectedMap.put("P",h16);
        
        // adding nodes 
        
        addObject(new Node("A"), 43, 545);   //1
        addObject(new Node("B"), 138, 490);
        addObject(new Node("C"), 245, 464);
        addObject(new Node("D"), 355, 347);
        addObject(new Node("E"), 296, 192);
        addObject(new Node("F"), 495, 265);
        addObject(new Node("G"), 588, 172);
        addObject(new Node("H"), 478, 391);
        addObject(new Node("I"), 655, 286);
        addObject(new Node("J"), 541, 562);
        addObject(new Node("K"), 676, 486);
        addObject(new Node("L"), 742, 651);
        addObject(new Node("M"), 837, 566);
        addObject(new Node("N"), 758, 111);
        addObject(new Node("O"), 864, 365);
        addObject(new Node("p"), 957, 260);
        
        // adding edges for the graph 
        addObject(new GraphEdge("A", "E", 2, 400, 35), 157,358);
        addObject(new GraphEdge("A", "J", 2, 452, 90), 290,560);
        addObject(new GraphEdge("J", "L", 2, 175, 120), 640,609);
        addObject(new GraphEdge("L", "M", 2, 100, 30), 789,620);
        addObject(new GraphEdge("M", "K", 2, 132, 120), 754,530);
        addObject(new GraphEdge("L", "K", 2, 150, -10), 704,579);
        addObject(new GraphEdge("B", "C", 2, 65, 80), 193,484);
        addObject(new GraphEdge("C", "D", 2, 115, 35), 299,406);
        addObject(new GraphEdge("E", "G", 2, 250, 90), 445,191);
        addObject(new GraphEdge("I", "G", 2, 85, 145), 623,229);
        addObject(new GraphEdge("I", "F", 2, 120, 90), 573,280);
        addObject(new GraphEdge("G", "F", 2, 100, 40), 550,234);
        addObject(new GraphEdge("D", "E", 2, 120, -20), 331,267);
        addObject(new GraphEdge("D", "F", 2, 120, 70), 427,308);
        addObject(new GraphEdge("D", "J", 2, 245, 145), 447,454);
        addObject(new GraphEdge("F", "J", 2, 255, -10), 529,413);
        addObject(new GraphEdge("H", "J", 2, 135, -15), 511,476);
        addObject(new GraphEdge("H", "D", 2, 88, 100), 421,361);
        addObject(new GraphEdge("H", "F", 2, 80, 10), 486,329);
        addObject(new GraphEdge("I", "M", 2, 290, 145), 752,424);
        addObject(new GraphEdge("I", "N", 2, 155, 30), 706,200);
        addObject(new GraphEdge("P", "N", 2, 218, 120), 871,182);
        addObject(new GraphEdge("P", "O", 2, 90, 40), 910,313);
        addObject(new GraphEdge("P", "M", 2, 300, 20), 913,424);
        addObject(new GraphEdge("M", "N", 2, 415, -10), 799,338);
        addObject(new GraphEdge("M", "O", 2, 160, 10), 862,465);
        addObject(new GraphEdge("N", "O", 2, 230, -20), 811,239);
        
         // add color pallet 
         
         addObject(new RedColor(), 51,65);
         addObject(new BlueColor(), 104,65);
         addObject(new GreenColor(), 159,65);
         addObject(new OrangeColor(), 219,65);
         
        // adding a reset button 
         addObject(new ResetButton(),81,689);
        
      Greenfoot.start();
         
        }
}
