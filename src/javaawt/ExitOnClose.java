/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaawt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author owner
 */
public class ExitOnClose extends WindowAdapter {

    private Frame f;

   public ExitOnClose(Frame f) {
      this.f = f;
   }

  @Override
   public void windowClosing(WindowEvent e) {
      System.out.println("ExitOnClose.windowClosing called...\n");
      this.f.dispose();
   }

  
}
