/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaawt.tutorials.javatpoint;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author owner
 */

/*
 * Close AWT Window Example 3: implementing WindowListener
 * See: https://www.javatpoint.com/java-close-awt-window
 */
public class WindowListenerExample extends Frame implements WindowListener {

   public WindowListenerExample() {
      addWindowListener(this);

      setSize(400, 400);
      setLayout(null);
      setVisible(true);
   }
  

   public static void main(String[] args) {
      new WindowExample();
   }

   public void windowActivated(WindowEvent e) {
   }

   public void windowClosed(WindowEvent e) {
   }

   public void windowClosing(WindowEvent e) {
      dispose();
   }

   public void windowDeactivated(WindowEvent e) {
   }

   public void windowDeiconified(WindowEvent e) {
   }

   public void windowIconified(WindowEvent e) {
   }

   public void windowOpened(WindowEvent arg0) {
   }
   
}
