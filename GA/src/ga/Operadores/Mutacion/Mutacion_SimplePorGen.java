/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Operadores.Mutacion;

import ga.Gen.Gen;
import ga.Individuo.Individuo;
import java.util.Random;

/**
 *
 * @author antares
 */
public class Mutacion_SimplePorGen implements Mutacion{

  @Override
  public Individuo mutar(Individuo i, double factor_mutacion) {
    Individuo mutante = i.clonar();
    Random aleatorio = new Random();
    for(int a = 0; a < i.getCromosoma().size() ; a++){
      if(aleatorio.nextDouble() < factor_mutacion) mutante.getCromosoma().get(a).generateRandom();
    }
    
    return mutante;
  }
  
}
