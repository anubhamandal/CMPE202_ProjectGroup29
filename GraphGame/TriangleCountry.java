import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TriangleCountry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleCountry extends Country
{
    //int rotateDeg;
    /**
     * Triangle will always be drawn facing up.  rotateDeg is measured in degee rotation 
     * around the center clockwise.
     */
    public TriangleCountry(int x, int y, int width, int height) {
        this.xPos = x;
        this.yPos = y;
        this.width = width;
        this.height = height;
        //this.rotateDeg = rotateDeg;
        updateImage();
    }
    
    /**
     * Check if mouse click coincides with image.
     * Since this is a triangle, we will split into 2 triangles, based on x position
     */
    boolean isClickInRange() {
        if (! this.addedToWorld) return false;
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (Greenfoot.getMouseInfo() == null) return false;

        int mouseX = mi.getX(); 
        int mouseY = mi.getY(); 
        int triX = this.getX(); 
        int triY = this.getY(); 
        int halfW = this.width/2;
        int halfH = this.height/2;

        System.out.printf("%d, %d, %d, %d\n", mouseX, mouseY, triX, triY);
        
        //Break into left and right half
        if (mouseX < triX) {
            // Left half
            return mouseY > (height/width*(triX-halfW));
        } else {
            return mouseY < (-height/width*(triX-halfW)+(triY+height));
        }

    }
    
    void drawInImage(GreenfootImage image) {
        int halfWidth = this.width / 2;
        int halfHeight = this.height / 2;
        int border = 1;
        image.setColor(lineColor);
        int[] xPoints = {xPos+border, xPos+halfWidth, xPos+width-border};
        int[] yPoints = {yPos+height-border, yPos+border, yPos+height-border};
        image.drawPolygon(xPoints, yPoints, 3);
        image.setColor(fillColor);
        image.fillPolygon(xPoints, yPoints, 3);
        //image.rotate(this.rotateDeg);
    }
}
