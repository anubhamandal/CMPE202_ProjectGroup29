import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * Write a description of class Utils here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utils  
{
    // instance variables - replace the example below with your own
    private volatile static Utils uniqueInstance;
    public Map<Color, String> colorMap = new HashMap<Color, String>();
    /**
     * Constructor for objects of class Utils
     */
    private Utils()
    {
       colorMap.put(Color.BLACK, "Black");
       colorMap.put(Color.RED, "Red");
       colorMap.put(Color.GREEN, "Green");
       colorMap.put(Color.BLUE, "Blue");
       colorMap.put(Color.YELLOW, "Yellow");
       colorMap.put(Color.ORANGE, "Orange");
    }
    
    public static Utils getInstance() {
        if (uniqueInstance == null) {
            synchronized(Utils.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Utils();
                }
            }
        }
        return uniqueInstance;
    }
    
    /**
     * Converts a java Color into the string representation
     */
    public String colorToString(Color color){
        return colorMap.get(color);
    }
    
    public Color stringToColor(String string){
        switch (string){
            case "Red":
            return Color.RED;
            case "Yellow":
            return Color.YELLOW;
            case "Orange":
            return Color.ORANGE;
            case "Green":
            return Color.GREEN;
            case "Blue":
            return Color.BLUE;
            case "Black":
            return Color.BLACK;
        }
        return Color.WHITE;
    }

}
