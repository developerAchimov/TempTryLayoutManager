import java.awt.*;
import java.awt.event.*;

class AppWindow extends Frame {
  AppWindow() {
     setSize(500, 500);
     setVisible(true);
     setLocation (300, 100);

     addWindowListener(new WindowAdapter() {
       
       public void windowClosing(WindowEvent we) {
         System.exit(0);
        }
  
       });
  }

 }
