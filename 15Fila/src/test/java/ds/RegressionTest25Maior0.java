package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.frente = (byte)100;
    java.lang.Object obj5 = fila0.desenfileira();
    boolean b6 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    int i3 = fila0.frente;
    java.lang.Object[] obj_array4 = fila0.item;
    java.lang.Object obj10 = new java.lang.Object();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte)10, 1.0d, 10, 0.0f, 10, obj10 };
    fila0.item = obj_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.frente = 0;
    fila0.frente = 0;
    int i7 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)1;

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    fila3.frente = (byte)100;
    ds.Fila fila8 = new ds.Fila();
    fila8.frente = (byte)(-1);
    fila8.frente = 0;
    fila8.frente = 0;
    int i15 = fila8.frente;
    ds.Fila fila17 = new ds.Fila();
    fila17.frente = (byte)(-1);
    int i20 = fila17.frente;
    java.lang.Object[] obj_array21 = fila17.item;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { fila3, fila8, (-1.0d), fila17 };
    fila0.item = obj_array22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

}
