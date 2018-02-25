/*
 * This interface is used for all shapes drawn on a P5Canvas object. Arc, Rectangle
 * and Line classes should implement all of these methods and thus the shape type
 * handles complexity associated with how the shapes are modified and drawn
 */
package i5.painting;

import java.awt.Graphics;

/**
 *
 * @author David Sprague
 */
public interface P5Shape {
    public void paint(Graphics g);
}
