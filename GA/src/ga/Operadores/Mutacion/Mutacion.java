/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Operadores.Mutacion;

import ga.Individuo.Individuo;

/**
 *
 * @author antares
 */
public interface Mutacion {
  public Individuo mutar(Individuo i, double factor_mutacion);
}
