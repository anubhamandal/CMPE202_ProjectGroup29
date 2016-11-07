import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DrawCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawCircle extends DrawShapes
{
    /**
     * Act - do whatever the DrawCircle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage(110,100);
    int n=0;
    public DrawCircle()
    {
        image.drawOval(0,0,109,99);
        setImage(image);
    }

    public void act()
    {

        
        if(Greenfoot.mouseClicked(this))
        {
            
                      if(n == 1){
            image.fillOval(0,0,109,99);
            setImage(image);
            }
        
        }
        
        }
        
    
    public void fillColor(String color)
    {
        n=1;
        if(color=="RED")
        image.setColor(java.awt.Color.RED);
        else if(color=="BLUE")
        image.setColor(java.awt.Color.BLUE);
        else if(color=="YELLOW")
        image.setColor(java.awt.Color.YELLOW);
        else if(color=="GREEN")
        image.setColor(java.awt.Color.GREEN);
    

}
}
