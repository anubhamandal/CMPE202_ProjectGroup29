import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ListIterator;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphOneWorld extends World
{
    int height = 400;
    int width = 600;
    Label validLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GraphOneWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare() {
        //Country country1 = new Country(0, 100, 600, 200);
        //Country country2 = new Country(0, 300, 600, 200);
        //Country country3 = new Country(0, 100, 600, 200);
        //Country country4 = new Country(0, 300, 600, 200);
        TriangleCountry country1 = new TriangleCountry(0, 0, 600, 200);
        TriangleCountry country2 = new TriangleCountry(0, 0, 600, 200);
        TriangleCountry country3 = new TriangleCountry(0, 0, 400, 300);
        TriangleCountry country4 = new TriangleCountry(0, 0, 400, 300);

        addObject( country1, 300, 99);
        country1.setRotation(180);
        addObject( country2, 301, 300);
        addObject(country3, 149, 200);
        country3.setRotation(90);
        addObject(country4, 452, 200);
        country4.setRotation(270);
        validLabel = new Label("hello", 40);
        addObject(validLabel, 300, 40);
        checkValid();
    }
    
    public void checkValid() {
        
        List<Country> objList = getObjects(Country.class);
        ListIterator<Country> li = objList.listIterator();
        
        while(li.hasNext()){
            Country c = li.next();
            if (! c.checkColor()){
                this.validLabel.setValue("invalid");
                return;
            }
        }
        this.validLabel.setValue("valid");
    }
}
