/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Operadores.Mutacion;

import ga.Individuo.Individuo;
import ga.Individuo.Individuo_Simple;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antares
 */
public class MutacionSimplePorGenTest {
  
  public MutacionSimplePorGenTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of mutar method, of class Mutacion_SimplePorGen.
   */
  @Test
  public void testMutarConProbabilidadCero() {
    System.out.println("mutar");
    Individuo i = new Individuo_Simple();
    i.getCromosoma().generateRandom();
    
    double factor_mutacion = 0.0;
    
    Mutacion_SimplePorGen instance = new Mutacion_SimplePorGen();
    Individuo expResult = null;
    Individuo result = instance.mutar(i, factor_mutacion);
    
    
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}