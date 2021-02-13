/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaawt.tutorials.javatpoint;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author owner
 */

/*
 * Close AWT Window Example 2: extending WindowAdapter
 * See: https://www.javatpoint.com/java-close-awt-window
 */
public class AdapterExample extends WindowAdapter {

   Frame f;

   AdapterExample() {
      f = new Frame();
      f.addWindowListener(this);

      f.setSize(400, 400);
      f.setLayout(null);
      f.setVisible(true);
   }

   public void windowClosing(WindowEvent e) {
      f.dispose();
   }

   public static void main(String[] args) {
      new AdapterExample();
   }
}
