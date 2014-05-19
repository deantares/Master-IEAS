/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ga.GASimple;
import com.jamonapi.*;





/**
 *
 * @author antares
 */
public class main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    GASimple ga = new GASimple();
    
    
    Monitor mon=MonitorFactory.start("myFirstMonitor");
    
    
    ga.run();
    
    mon.stop();    
    
    System.out.println("Hola mundo");
    
    
  }
}
