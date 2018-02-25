/*
 * The controller class for the drawing canvas. Note this needs access
 * to the model/view
 */
package i5.painting;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * An implementation of MouseAdapter so you can handle any mouse events you wish.
 * @author David Sprague
 */
public class P5CanvasController extends MouseAdapter {
    public P5CanvasController(P5Canvas c) {
        canvas = c;
    }
    
    @Override
    public void mousePressed(MouseEvent me) {
        canvas.startDrag(me.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        canvas.endDrag(me.getPoint());
    }
    
    // Member Variables
    P5Canvas canvas;
    
}
