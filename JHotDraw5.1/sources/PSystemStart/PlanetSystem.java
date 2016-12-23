/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PSystemStart;

import CH.ifa.draw.application.*;

import java.awt.*;
import java.util.*;
import java.io.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.figures.*;
import CH.ifa.draw.util.*;
import PSystemStart.Planet;

/**
 *
 * @author student
 */
public class PlanetSystem extends DrawApplication {
     PlanetSystem(){
         super("Planet System");
     }
     
     
     @Override
     public void createTools(Panel palette){
         super.createTools(palette);
         
         CreationTool ellipseTool = new CreationTool(view(), new EllipseFigure() );
         ToolButton ellipseButton = new ToolButton(this, IMAGES+"ELLIPSE", "Ellipse Tool", ellipseTool);
         palette.add(ellipseButton);
         
         CreationTool planetTool = new CreationTool(view(), new Planet());
         ToolButton planetButton = new ToolButton(this,IMAGES+"DIAMOND", "Planet", planetTool);
         palette.add(planetButton);
     
     }
     
     public static void main(String[] args){
         PlanetSystem ps = new PlanetSystem();
         ps.open();
         
         
     }
    
}
