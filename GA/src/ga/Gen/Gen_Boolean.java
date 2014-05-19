/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Gen;


/**
 *
 * @author antares
 */
public class Gen_Boolean implements Gen{
  private Boolean v;

  public Gen_Boolean() {
    v = false;
  }

  public Gen_Boolean(Boolean v) {
    this.v = v;
  }
  
  @Override
  public Object get() {
      return (Boolean) v;
  }

  @Override
  public void set(Object o) {
    v = (Boolean) o;
  }

  @Override
  public void generateRandom() {
    v = aleatorio.nextBoolean();
  }

  @Override
  public boolean compare(Gen o) {
    return v == o.get();
  }

  
}
