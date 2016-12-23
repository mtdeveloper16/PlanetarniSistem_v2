/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PSystemStart;
import CH.ifa.draw.standard.LocatorHandle;
import CH.ifa.draw.standard.RelativeLocator;
import CH.ifa.draw.framework.Figure;
import CH.ifa.draw.framework.DrawingView;

import java.awt.*;
/**
 *
 * @author Misa
 */
public class NorthEastHandle extends LocatorHandle{
    public NorthEastHandle(Figure owner) {
        super(owner, RelativeLocator.northEast() );
    }
    public void invokeStep(int x, int y, int anchorX, int anchorY, DrawingView view) {
        Rectangle r = owner().displayBox();
        int width = x - r.x;
        int height = r.y + r.height - y;
        
        int size = Math.min(120, Math.max(width, height));
        
        owner().displayBox(
                new Point(r.x, Math.min( (r.y + r.height) - size, r.y + r.height)), new
               Point(Math.max(r.x, r.x + size) ,r.y + r.height)
        );
    }
}
