import java.awt.*;
import java.awt.event.*;

class frameTest {
   public static void main(String[] args){
      Frame f = new Frame("ex window");
      f.setSize(300, 200);
      WindowDestroyer listener = new WindowDestroyer();  
      f.addWindowListener(listener);
      f.setVisible(true);
   }
}

class WindowDestroyer extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
