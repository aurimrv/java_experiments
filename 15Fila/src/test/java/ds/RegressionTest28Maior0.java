package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object obj3 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test2"); }


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
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila0.item = obj_array6;
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    int i3 = fila0.tras;
    int i4 = fila0.tras;
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    int i3 = fila0.tras;
    fila0.enfileira((java.lang.Object)100L);
    fila0.tras = (short)(-1);
    java.lang.Object obj8 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila0.item = obj_array6;
    fila0.frente = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    int i3 = fila0.tras;
    ds.Fila fila4 = new ds.Fila();
    fila4.frente = '#';
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila4.item = obj_array10;
    fila0.item = obj_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

}
