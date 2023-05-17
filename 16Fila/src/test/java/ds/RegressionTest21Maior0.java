package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test1"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(-1L));
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(-1L));
    java.lang.Object obj4 = fila0.desenfileira();
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1L)+ "'", obj4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(-1L));
    boolean b4 = fila0.vazia();
    java.lang.Object obj5 = null;
    fila0.enfileira(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();

  }

}
