/**
 * A very simple Swing application
 * 
 * @Chris Campos 
 * @1.0
 */
import javax.swing.*;
public class MySwingApplication implements Runnable
{
   JFrame jframe;
   CanvasComponent cc = new CanvasComponent(50,50);
   public void run(){
            jframe = new JFrame("FrameDemo");
            jframe.setSize(600,600);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.add(cc);
            jframe.setVisible(true);
    }
   public static void main() {
            MySwingApplication mySwingApplicationSwing = new MySwingApplication();
            javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
        }
}
