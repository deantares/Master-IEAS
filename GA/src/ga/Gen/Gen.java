/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Gen;

import java.util.Random;

/**
 *
 * @author antares
 */
public interface Gen{
  static Random aleatorio = new Random();
  
  public abstract Object get();
  public abstract void set(Object o);  
  public abstract void generateRandom();
  
  public abstract boolean compare(Gen o);
  
  
}
