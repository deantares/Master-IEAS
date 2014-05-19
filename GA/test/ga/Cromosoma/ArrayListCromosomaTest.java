/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Cromosoma;

import ga.Gen.Gen_Boolean;
import ga.Gen.Gen;
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
public class ArrayListCromosomaTest {
  
  
  
  
  public ArrayListCromosomaTest() {
    Cromosoma_ArrayList._GEN = Gen_Boolean.class;
    Cromosoma_ArrayList._CROMOSOMA_SIZE = 10;
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
   * Test of get method, of class Cromosoma_ArrayList.
   */
  @Test
  public void testChangeSize() {
    System.out.println("get");
    int i = 0;
    
    Cromosoma_ArrayList._CROMOSOMA_SIZE = 20;
    
    Cromosoma_ArrayList instance = new Cromosoma_ArrayList();
    
    System.out.println("Los valores" + instance.size());
    
    assertEquals(20, instance.size());
    // TODO review the generated test code and remove the default call to fail.
    
  }

  /**
   * Test of get method, of class Cromosoma_ArrayList.
   */
  @Test
  public void testGet() {
    System.out.println("get");
    int i = 0;
    Cromosoma_ArrayList instance = new Cromosoma_ArrayList(20);
    
    System.out.println("Los valores" + instance.size());
    
    Gen expResult = null;
    Gen result = instance.get(i);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of set method, of class Cromosoma_ArrayList.
   */
  @Test
  public void testSet() {
    System.out.println("set");
    int i = 0;
    Gen v = null;
    Cromosoma_ArrayList instance = null;
    instance.set(i, v);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of generateRandom method, of class Cromosoma_ArrayList.
   */
  @Test
  public void testGenerateRandom() {
    System.out.println("generateRandom");
    Cromosoma_ArrayList instance = null;
    instance.generateRandom();
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of size method, of class Cromosoma_ArrayList.
   */
  @Test
  public void testSize() {
    System.out.println("size");
    Cromosoma_ArrayList instance = null;
    int expResult = 0;
    int result = instance.size();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of compare method, of class Cromosoma_ArrayList.
   */
  @Test
  public void testCompare() {
    System.out.println("compare");
    Cromosoma t1 = null;
    Cromosoma_ArrayList instance = null;
    boolean expResult = false;
    boolean result = instance.compare(t1);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}