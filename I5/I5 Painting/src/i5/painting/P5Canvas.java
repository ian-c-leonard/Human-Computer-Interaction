/*
 * This is the main drawing class for the project.  A P5Canvas object should
 * be able how to draw all lines, rectangles and ovals indicated by the user
 * each time the paint method is called.
 */
package i5.painting;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author David Sprague / Ian Leonard
 */
public class P5Canvas extends JPanel {

    public P5Canvas() {
        this.shapeList = new ArrayList();
        mouseStart = null;
        color = ShapeFactory.P5_BLACK;
        shape = ShapeFactory.P5_RECT;
        thickness = 1;
    }
    
    public void startDrag(Point p) {
        mouseStart = p;
    }
    // Note: You need additional set methods for thickness and color
    public void setShape(String shape) {
        this.shape = shape;
    }
    
    //Ian Leonard
    public void setColor(String color) {
        this.color = color;
    }
    
    //Ian Leonard
    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
    
    public void endDrag(Point p) {
        P5Shape newShape = ShapeFactory.getShape( mouseStart.x, mouseStart.y, 
                                             p.x, p.y, thickness, color, shape);
        if (newShape != null) {
            shapeList.add(newShape);
        }
        repaint();
    }
    
    public void clearCanvas() {
        shapeList.clear();
        repaint();
    }
    
    public void addShape(P5Shape shape) {
        if (shape != null) {
            shapeList.add(shape);
        }
    }
    
    @Override
    public void paint(Graphics g) {
       super.paint(g);
       // Paint each of the paint objects
       for(P5Shape shape : shapeList) {
           shape.paint(g);
       }
    }
    
    // Member Variables
    ArrayList<P5Shape> shapeList;
    Point mouseStart;
    int thickness;
    String color;
    String shape;

}
