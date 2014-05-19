/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Cromosoma;

import ga.Gen.Gen;

/**
 *
 * @author antares
 */
public interface Cromosoma {
  
  public Gen get(int i);
  public void set(int i, Gen v);
  public void generateRandom();
  public int size();
  
  public boolean compare(Cromosoma t1);
  
}
