/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Cromosoma;

import ga.Gen.Gen;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antares
 */
public class Cromosoma_ArrayList implements Cromosoma{
  public static Class _GEN;
  public static int _CROMOSOMA_SIZE;
  List<Gen> cromosoma;
  
  public Cromosoma_ArrayList() {
    cromosoma = new ArrayList<>(_CROMOSOMA_SIZE);
    
    for(int a = 0; a < _CROMOSOMA_SIZE; a++){
      try {
        cromosoma.add((Gen) _GEN.newInstance());
      } catch (InstantiationException | IllegalAccessException ex) {
        Logger.getLogger(Cromosoma_ArrayList.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    }
  }
  
  public Cromosoma_ArrayList(int size) {
    _CROMOSOMA_SIZE = size;
    cromosoma = new ArrayList<>(size);
    
    for(int a = 0; a < size; a++){
      try {
        cromosoma.add((Gen) _GEN.newInstance());
      } catch (InstantiationException | IllegalAccessException ex) {
        Logger.getLogger(Cromosoma_ArrayList.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    }
  }

  public Cromosoma_ArrayList(int size, Class gen) {
    cromosoma = new ArrayList<>(size);
    Cromosoma_ArrayList._GEN = gen;
    
    for(int a = 0; a < size; a++){
      try {
        cromosoma.add((Gen) _GEN.newInstance());
      } catch (InstantiationException | IllegalAccessException ex) {
        Logger.getLogger(Cromosoma_ArrayList.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    }
  }
  
  @Override
    public Gen get(int i) {
    return (Gen)cromosoma.get(i);
  }

  @Override
  public void set(int i, Gen v) {
    ((Gen)cromosoma.get(i)).set(v);
  }

  @Override
  public void generateRandom() {
    for(Gen a : cromosoma){
      ((Gen)a).generateRandom();
    }
  }

  @Override
  public int size() {
    return cromosoma.size();
  }

  @Override
  public boolean compare(Cromosoma t1) {
    Boolean resultado = true;
    for(int a = 0; a<cromosoma.size();a++){
      if(!((Gen)t1.get(a)).compare((Gen)cromosoma.get(a))){
        resultado = false;
      }
    }
    
    return resultado;
  }

  
  
}
