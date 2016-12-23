/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PSystemStart;

import CH.ifa.draw.figures.EllipseFigure;
import CH.ifa.draw.framework.Handle;
import CH.ifa.draw.standard.BoxHandleKit;
import java.awt.Point;
import java.util.Vector;

/**
 *
 * @author student
 */
public class Planet extends EllipseFigure{
      
    public Planet(){
        super(new Point(0,0), new Point(0,0) );
    }

     
    @Override
    public void basicDisplayBox(Point origin, Point corner) {
        int width = corner.x - origin.x;
        int height = corner.y - origin.y;
        int size = Math.max(width, height);
        corner = new Point(origin.x + size, origin.y + size);
        super.basicDisplayBox(origin, corner);
        
    }

    @Override
    public Vector<Handle> handles() {
        Vector<Handle> handles = new Vector<Handle>();
        //ne radi kao sto je ocekivano
        /*
        handles.add(BoxHandleKit.northEast(this));        
        handles.add(BoxHandleKit.southEast(this));        
        handles.add(BoxHandleKit.southWest(this));        
        handles.add(BoxHandleKit.northWest(this));        
        */
        
        return handles; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
