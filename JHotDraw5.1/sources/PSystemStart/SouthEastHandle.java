/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PSystemStart;

import CH.ifa.draw.framework.DrawingView;
import CH.ifa.draw.standard.LocatorHandle;
import CH.ifa.draw.standard.RelativeLocator;
import CH.ifa.draw.framework.Figure;

import java.awt.*;

/**
 *
 * @author student
 */
public class SouthEastHandle extends LocatorHandle{
    public SouthEastHandle(Figure owner){
        super(owner, RelativeLocator.southEast() ); 
    }

    @Override
    public void invokeStep(int x, int y, int anchorX, int anchorY, DrawingView view) {
        Rectangle r = owner().displayBox();
        int width = x - r.x;
        int height = y - r.y;
        
        int size = Math.min(120, Math.max(width, height));
        
        owner().displayBox(
                    new Point(r.x, r.y), new Point(Math.max(r.x, r.x + size) , Math.max(r.y, r.y + size) ) 
                );
    }
    
        
    
}
