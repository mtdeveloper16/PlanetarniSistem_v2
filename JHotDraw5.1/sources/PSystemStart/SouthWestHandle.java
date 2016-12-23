/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSystemStart;
import CH.ifa.draw.standard.LocatorHandle;
import CH.ifa.draw.standard.RelativeLocator;
import CH.ifa.draw.framework.DrawingView;
import CH.ifa.draw.framework.Figure;

import java.awt.*;
/**
 *
 * @author Misa
 */
public class SouthWestHandle extends LocatorHandle {
    public SouthWestHandle(Figure owner) {
        super(owner, RelativeLocator.southWest() );
    }
    
    public void invokeStep(int x, int y, int anchorX, int anchorY, DrawingView view){
        Rectangle r = owner().displayBox();
        int width = r.x + r.width - x;
        int height = y - r.y;
        
        int size = Math.min(120, Math.max(width, height));
        owner().displayBox( new Point(Math.min((r.x + r.width) - size, r.x + r.width), r.y), new
Point(r.x + r.width, Math.max(r.y, r.y + size))
        );
    }
    
}
