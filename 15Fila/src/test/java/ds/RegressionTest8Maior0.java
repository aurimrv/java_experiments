package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    int i2 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = (byte)10;

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    int i7 = fila0.tras;
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = 1;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)false);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    int i7 = fila0.tras;
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila8.item = obj_array13;
    fila0.item = obj_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test8"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();

  }

}
