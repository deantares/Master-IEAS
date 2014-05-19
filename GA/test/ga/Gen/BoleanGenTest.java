/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.Gen;

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
public class BoleanGenTest {
  
  public BoleanGenTest() {
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
   * Test of get method, of class Gen_Boolean.
   */
  @Test
  public void testGet() {
    System.out.println("get");
    Gen_Boolean instance = new Gen_Boolean();
    
    Object expResult = false;
    Object result = instance.get();
    
    assertEquals(expResult, result);
  }

  /**
   * Test of set method, of class Gen_Boolean.
   */
  @Test
  public void testSet() {
    System.out.println("set");
    Object o = true;
    Gen_Boolean instance = new Gen_Boolean();
    instance.set(o);
    
    assertEquals(true, instance.get());
    
  }

  /**
   * Test of generateRandom method, of class Gen_Boolean.
   */
  @Test
  public void testGenerateRandom() {
    System.out.println("generateRandom");
    Gen_Boolean instance = new Gen_Boolean();
    int cambios = 0;
    
    for(int i=0 ; i < 20; i++){
    boolean anterior = (Boolean) instance.get();
    
    instance.generateRandom();
    
    if(anterior!=(boolean) instance.get()) cambios++;
    
    }
    
    assertTrue(cambios>0);
    
    
  }

  /**
   * Test of compare method, of class Gen_Boolean.
   */
  @Test
  public void testCompare() {
    System.out.println("compare");
    Gen o = new Gen_Boolean();
    Gen_Boolean instance = new Gen_Boolean();
    boolean expResult = true;
    boolean result = instance.compare(o);
    
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    
  }
}