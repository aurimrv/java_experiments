package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj1 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (short)10;
    java.lang.Object obj3 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.imprime();
    fila0.frente = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)0;
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (short)10;
    java.lang.Object[] obj_array6 = fila3.item;
    fila0.item = obj_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (short)10;
    int i3 = fila0.frente;
    ds.Fila fila4 = new ds.Fila();
    int i5 = fila4.tras;
    fila4.imprime();
    java.lang.Object[] obj_array7 = fila4.item;
    fila0.item = obj_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

}
