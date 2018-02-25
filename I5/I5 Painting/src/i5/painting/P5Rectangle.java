/*
 * This is an illustrative example of a shape we can make. Notice the
 * shape knows how to draw itself. It also adjusts the input data to be in a better
 * format for painting (rather than calculating the width each time)
 */
package i5.painting;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author David Sprague
 */
public class P5Rectangle implements P5Shape {

    public P5Rectangle(int x1, int y1, int x2, int y2, Color c) {
        if( x1 < x2) {
            x = x1;
            width = x2 - x1;
        }
        else {
            x = x2;
            width = x1 - x2;
        }
        if( y1 < y2) {
            y = y1;
            height = y2 - y1;
        }
        else {
            y = y2;
            height = y1 - y2;
        }
        color = c;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    // Member variables
    private int x, y, width, height;
    private Color color;
    
}
