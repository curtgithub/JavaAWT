/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaawt.tutorials.javatpoint;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javaawt.ExitOnClose;

/**
 *
 * See: https://www.javatpoint.com/java-awt-button
 *
 * @author owner
 */
public class ButtonExample {

   public static void main(String[] args) {
      Frame f = new Frame("Button Example");
      Button b = new Button("Click Here");
      b.setBounds(50, 100, 80, 30);
      f.add(b);
      f.setSize(400, 400);
      f.setLayout(null);
      f.setVisible(true);
      //
      // My additions
      //
      
      
      f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.out.println("In ButtonExample.windowClosing\n");
               System.exit(0);
            }
        }
      );

      Cursor c = new Cursor(Cursor.CROSSHAIR_CURSOR);
      f.setCursor(c);
   }

}
