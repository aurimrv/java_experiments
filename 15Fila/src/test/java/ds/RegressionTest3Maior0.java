package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    int i9 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.frente = (short)100;
    int i4 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.frente = (byte)100;

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.frente = (short)100;
    java.lang.Object obj4 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.tras;
    java.lang.Object[] obj_array5 = fila3.item;
    fila0.item = obj_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj9 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array2 = fila0.item;
    fila0.enfileira((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

}
