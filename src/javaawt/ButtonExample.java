/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaawt;

import java.awt.Button;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;

/**
 *
 * @author owner
 */
public class ButtonExample {

   public ButtonExample() {
      Frame f = new Frame("Button Example");
      f.setSize(400, 400);
      //f.setLayout(null);
      f.setLayout(new FlowLayout(FlowLayout.LEFT));
      f.setVisible(true);
      //
      // My additions
      //
      WindowAdapter eoc; 
      eoc = new ExitOnClose(f);
      f.addWindowListener(eoc);
      

      Cursor c = new Cursor(Cursor.CROSSHAIR_CURSOR);
      f.setCursor(c);

      Button b = new Button("Click Here");
      b.setBounds(50, 100, 80, 30);
      //b.setLocation(200, 200);
      f.add(b);

   }

   public static void main(String[] args) {
      ButtonExample be = new ButtonExample();
   }
   
   
}
