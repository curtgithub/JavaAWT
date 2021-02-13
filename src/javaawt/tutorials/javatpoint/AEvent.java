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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * See: https://www.javatpoint.com/event-handling-in-java
 *
 * @author owner
 */
class AEvent extends Frame implements ActionListener {

   TextField tf;

   AEvent() {

//create components  
      tf = new TextField();
      tf.setBounds(60, 50, 170, 20);
      Button b = new Button("click me");
      b.setBounds(100, 120, 80, 30);

//register listener  
      b.addActionListener(this);//passing current instance  

//add components and set size, layout and visibility  
      add(b);
      add(tf);
      setSize(300, 300);
      setLayout(null);
      setVisible(true);
      
      //
      // My Addition
      //
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.out.println("In AEvent.addWindowListener\n");
            System.exit(0);
         }
      }
      );
   }

   public void actionPerformed(ActionEvent e) {
      tf.setText("Welcome");
   }

   public static void main(String args[]) {
      new AEvent();
   }
}
