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
 * Close AWT Window Example 1: Anonymous class
 * See: https://www.javatpoint.com/java-close-awt-window
 */
public class WindowExample extends Frame {

   WindowExample() {
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            dispose();
         }
      });
      setSize(400, 400);
      setLayout(null);
      setVisible(true);
   }

   public static void main(String[] args) {
      new WindowExample();
   }
}
