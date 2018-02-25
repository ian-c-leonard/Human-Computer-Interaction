/*
 * This is an illustrative example of a shape we can make. Notice the
 * shape knows how to draw itself. It also adjusts the input data to be in a better
 * format for painting (rather than calculating the width each time)
 */
package i5.painting;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;



/**
 *
 * @author David Sprague / Ian Leonard
 */
public class P5Line implements P5Shape {

    public P5Line(int x1, int y1, int x2, int y2, Color c, BasicStroke bs) {
        xone = x1;
        yone = y1;
        xtwo = x2;
        ytwo = y2;
        color = c;
        stroke = bs;
        
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(stroke);
        g2d.drawLine(xone, yone, xtwo, ytwo);
    }
    
    // Member variables
    private int xone, yone, xtwo, ytwo;
    private Color color;
    private BasicStroke stroke;
    
}
