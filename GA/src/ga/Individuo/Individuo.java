/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Individuo;

import ga.Cromosoma.Cromosoma;
import ga.Fitness.Fitness;

/**
 *
 * @author antares
 */
public interface Individuo {
   
  public Fitness getFitness();
  public Cromosoma getCromosoma();
  
  public Individuo clonar();
  
  
}
