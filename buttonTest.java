import java.awt.*;
import java.awt.event.*;

public class buttonTest extends Frame {
	public buttonTest (String str) { 
		super(str); 
		}
  
	public static void main(String args[]) {
		buttonTest f = new buttonTest("Simple FlowLayout Example");
		f.setLayout(new FlowLayout());
      
		Button b1 = new Button("Press Me");
		Button b2 = new Button("Don't Press Me");
		f.add(b1);
		f.add(b2);
		f.pack();
		WindowDestroyer listener = new WindowDestroyer();  // window destroy button
		f.addWindowListener(listener);
		
		f.setVisible(true);
		} 
	}

class WindowDestroyer extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}