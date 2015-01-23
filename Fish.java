//********************************************************************
//  Fish.java       Author: Pedro Garate        Date: Jan. 28th, 2013
//
// This program draws 3 fish in water and the sky with the sun above 
// it. It draws the water, the sky, the waves, the sun and the fish
// in that specific order. 
//********************************************************************

import javax.swing.JApplet;
import java.awt.*;

public class Fish extends JApplet
{
   public void paint (Graphics page)
   {
      page.setColor (Color.blue);
      page.fillRect (0, 150, 500, 350);  // water
      
      page.setColor (Color.cyan);
      page.fillRect (0, 0, 500, 150);  // sky
      
      final byte WAVESIZE = 50;
      for (short wavestart = 0; wavestart < 500; wavestart += WAVESIZE)
      {	      
      	      page.fillOval (wavestart, 110, WAVESIZE, WAVESIZE);  // waves
      }
           
      page.setColor (Color.yellow);
      page.drawString ("Pedro's Fish",400,450);  // my name
      page.fillOval (-70, -70, 140, 140);  // sun
      page.drawLine (0,0,20,100);
      page.drawLine (0,0,50,90);
      page.drawLine (0,0,90,70);
      page.drawLine (0,0,110,25);
      
      //--------------------------------------------------------------
      //The fish
      //--------------------------------------------------------------
      // fish location xLoc & yLoc are the center of the fish head,
      // rad is the radius of the head and endFish is where the tail ends.
      // Remember the fish are 115 long from the center of the head until
      // tail.
      
      // First fish
      int xLoc = 75, yLoc = 275, RAD = 35, endFish = xLoc + 115;
      page.setColor (Color.green); // first fish is green
      
      page.fillOval (xLoc-RAD, yLoc-RAD, RAD*2, RAD*2);  // fish's head
      
      int[] xBody = {xLoc,xLoc,endFish};
      int[] yBody = {yLoc-RAD,yLoc+RAD,yLoc};
      page.fillPolygon(xBody, yBody, 3);  // fish's body
     
      xBody = new int[] {endFish,endFish,xLoc};
      yBody = new int[] {yLoc-26,yLoc+26,yLoc};
      page.fillPolygon(xBody, yBody, 3); // the tail using xBody & yBody
   
      page.setColor (Color.black);
      
      page.fillOval (xLoc-15,yLoc-15,10,10); // eye
      
      page.drawArc (xLoc-60,yLoc-45,70,70,270,60); // mouth
      
      page.drawLine (xLoc+25,yLoc-9,xLoc+40,yLoc-3);
      page.drawLine (xLoc+25,yLoc+3,xLoc+40,yLoc-3);
      page.drawLine (xLoc+25,yLoc+3,xLoc+40,yLoc+9);
      page.drawLine (xLoc+25,yLoc+15,xLoc+40,yLoc+9); // fins
   
      // Second fish
      xLoc = 175; 
      yLoc = 400;
      endFish = xLoc + 115;
      page.setColor (Color.orange); // second fish is orange
      
      page.fillOval (xLoc-RAD, yLoc-RAD, RAD*2, RAD*2);  // fish's head
      
      xBody = new int[] {xLoc,xLoc,endFish};
      yBody = new int[] {yLoc-RAD,yLoc+RAD,yLoc};
      page.fillPolygon(xBody, yBody, 3);  // fish's body
     
      xBody = new int[] {endFish,endFish,xLoc};
      yBody = new int[] {yLoc-26,yLoc+26,yLoc};
      page.fillPolygon(xBody, yBody, 3); // the tail using xBody & yBody
   
      page.setColor (Color.black);
      
      page.fillOval (xLoc-15,yLoc-15,10,10);  // eye
      
      page.drawArc (xLoc-60,yLoc-45,70,70,270,60);  // mouth

      page.drawLine (xLoc+25,yLoc-9,xLoc+40,yLoc-3);
      page.drawLine (xLoc+25,yLoc+3,xLoc+40,yLoc-3);
      page.drawLine (xLoc+25,yLoc+3,xLoc+40,yLoc+9);
      page.drawLine (xLoc+25,yLoc+15,xLoc+40,yLoc+9);  // fins
      
      // Third fish
      xLoc = 350; 
      yLoc = 250;
      endFish = xLoc + 115;
      page.setColor (Color.red); // second fish is red
      
      page.fillOval (xLoc-RAD, yLoc-RAD, RAD*2, RAD*2);  // fish's head
      
      xBody = new int[] {xLoc,xLoc,endFish};
      yBody = new int[] {yLoc-RAD,yLoc+RAD,yLoc};
      page.fillPolygon(xBody, yBody, 3);  // fish's body
     
      xBody = new int[] {endFish,endFish,xLoc};
      yBody = new int[] {yLoc-26,yLoc+26,yLoc};
      page.fillPolygon(xBody, yBody, 3); // the tail using xBody & yBody
   
      page.setColor (Color.black);
      
      page.fillOval (xLoc-15,yLoc-15,10,10);  // eye
      
      page.drawArc (xLoc-60,yLoc-45,70,70,270,60);  // mouth

      page.drawLine (xLoc+25,yLoc-9,xLoc+40,yLoc-3);
      page.drawLine (xLoc+25,yLoc+3,xLoc+40,yLoc-3);
      page.drawLine (xLoc+25,yLoc+3,xLoc+40,yLoc+9);
      page.drawLine (xLoc+25,yLoc+15,xLoc+40,yLoc+9);  // fins
   }
}
