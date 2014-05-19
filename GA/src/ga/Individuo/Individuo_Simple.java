/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Individuo;

import ga.Cromosoma.Cromosoma;
import ga.Cromosoma.Cromosoma_ArrayList;
import ga.Fitness.Fitness;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antares
 */
public class Individuo_Simple implements Individuo{
  public static Class _FITNESS;
  public static Class _CROMOSOMA;
  public static Class _GEN;
  public static int _CROMOSOMA_SIZE;
  
  private Cromosoma cromosoma;
  private Fitness fitness;
 
  public Individuo_Simple(){
    try {
      cromosoma = (Cromosoma) _CROMOSOMA.newInstance();
    } catch (InstantiationException | IllegalAccessException ex) {
      Logger.getLogger(Individuo_Simple.class.getName()).log(Level.SEVERE, null, ex);
    }
    
  }
  
  @Override
  public Fitness getFitness() {
    return fitness;
  }

  @Override
  public Cromosoma getCromosoma() {
    return cromosoma;
  }

  @Override
  public Individuo clonar() {
    try {
      return (Individuo) ((Object) this.clone());
    } catch (CloneNotSupportedException ex) {
      Logger.getLogger(Individuo_Simple.class.getName()).log(Level.SEVERE, null, ex);
      return null;
    }
    
  }
  
}
