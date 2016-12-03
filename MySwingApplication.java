import javax.swing.*;
import java.awt.*;
public class MySwingApplication implements Runnable{
	JFrame jframe;
	public void run(){
	    CanvasComponent cc = new CanvasComponent(50,50,Color.blue);
		jframe = new JFrame("MySwingApplication");
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(cc);
		jframe.setVisible(true);
		
	}
	public static void main() {
		MySwingApplication mySwingApplicationSwing = new MySwingApplication();
		javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
	}
}
