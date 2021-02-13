/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaawt.tutorials.javatpoint;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * See: https://www.javatpoint.com/event-handling-in-java
 *
 * @author owner
 */
class AEvent3 extends Frame {

   TextField tf;

   AEvent3() {
      tf = new TextField();
      tf.setBounds(60, 50, 170, 20);
      Button b = new Button("click me");
      b.setBounds(50, 120, 80, 30);

      b.addActionListener(new ActionListener() {
         public void actionPerformed() {
            tf.setText("hello");
         }

         @Override
         public void actionPerformed(ActionEvent e) {
            tf.setText("hello");
         }
      });
      add(b);
      add(tf);
      setSize(300, 300);
      setLayout(null);
      setVisible(true);
   }

   public static void main(String args[]) {
      new AEvent3();
   }
}
