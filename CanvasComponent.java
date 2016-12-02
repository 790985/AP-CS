
/**
 * Write a description of class CanvasComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent //implements MouseListener, MouseMotionListener
{
   int x;
   int y;
   int wid;
   int hgt;
   public CanvasComponent(int width, int height){
       setSize(width,height);
       x = 100;
       y = 100;
       wid = width;
       hgt = height;
    }
   public void paintComponent(Graphics g){
       g.setColor(Color.red);
       g.fillRect(x,y,wid,hgt);
   }
   //public
}
