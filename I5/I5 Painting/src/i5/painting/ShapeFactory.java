/*
 * A simple factory class enabling us to create objects of different types without
 * the canvas knowing how the data is stored. We simply provide mouse values 
 * and button states
 */
package i5.painting;

import java.awt.Color;
import java.awt.BasicStroke;

/**
 *
 * @author David Sprague / Ian Leonard
 */
public class ShapeFactory {
    public static final String P5_GREEN = "Green";
    public static final String P5_RED = "Red";
    public static final String P5_BLACK = "Black";
    public static final String P5_BLUE = "Blue";
    public static final String P5_RECT = "Rectangle";
    public static final String P5_OVAL = "Oval";
    public static final String P5_CURVE = "Curve";
    public static final String P5_LINE = "Line";
    
    
    public static P5Shape getShape(int x1, int y1, int x2, int y2, int thickness, 
                                   String colorTxt, String shapeType){
      if(shapeType == null || colorTxt == null){
         return null;
      }
      Color color = Color.BLACK;
      if (colorTxt.equalsIgnoreCase(P5_RED)) {
          color = Color.RED;
      }
      else if (colorTxt.equalsIgnoreCase(P5_GREEN)) {
          color = Color.GREEN;
      }
      else if (colorTxt.equalsIgnoreCase(P5_BLUE)) {
          color = Color.BLUE;
      }
      
      BasicStroke stroke = new BasicStroke(1F);
      if (thickness == 1){
          stroke = new BasicStroke(1F);
      }
      if (thickness == 2){
          stroke = new BasicStroke(2F);
      }
      if (thickness == 3){
          stroke = new BasicStroke(3F);
      }
      if (thickness == 4){
          stroke = new BasicStroke(4F);
      }
      if (thickness == 5){
          stroke = new BasicStroke(5F);
      }
      
      if(shapeType.equalsIgnoreCase(P5_CURVE)){
          System.out.println("Should be drawing a curve");
         return new P5Curve(x1, y1, x2, y2, color);
         
      } else if(shapeType.equalsIgnoreCase(P5_RECT)){
         return new P5Rectangle(x1, y1, x2, y2, color);
         
      } else if(shapeType.equalsIgnoreCase(P5_LINE)){
          System.out.println("Should be drawing a line");
         return new P5Line(x1, y1, x2, y2, color, stroke);
      } else if(shapeType.equalsIgnoreCase(P5_OVAL)){
          System.out.println("Should be drwaing an oval");
          return new P5Oval(x1, y1, x2, y2, color);
      }
      
      
      return null;
   }
}
