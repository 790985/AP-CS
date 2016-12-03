import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener{
    int rectX;
    int rectY;
    int rectWidth;
    int rectHeight;
    Color rectColor;
    int mouseFromY;
    int mouseFromX;
    boolean shapeSelected;
    int mouseToX;
    int mouseToY;
    public CanvasComponent(int width, int height, Color c){
        setSize(width,height);
        rectWidth = width;
        rectHeight = height;
        rectColor = c;
        rectX = 200;
        rectY = 200;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    public void paintComponent(Graphics g){
        g.setColor(rectColor);
        g.fillRect(rectX,rectY,rectWidth,rectHeight);
    }
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseDragged(MouseEvent e){
        mouseToX = e.getX();
        mouseToY = e.getY();
        rectX = rectX - mouseToX;
        rectY = rectY - mouseToY;
        repaint();
    }
    public void mouseMoved(MouseEvent e){}
}
