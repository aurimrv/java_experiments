package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 100, 10, (short)0 };
    fila0.item = obj_array4;
    int i6 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 100, 10, (short)0 };
    fila0.item = obj_array4;
    int i6 = fila0.frente;
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
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 100, 10, (short)0 };
    fila0.item = obj_array4;
    int i6 = fila0.frente;
    int i7 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    ds.Fila fila2 = new ds.Fila();
    java.lang.Object[] obj_array3 = fila2.item;
    fila0.item = obj_array3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 100, 10, (short)0 };
    fila3.item = obj_array7;
    fila0.item = obj_array7;
    boolean b10 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 100, 10, (short)0 };
    fila3.item = obj_array7;
    fila0.item = obj_array7;
    int i10 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = (byte)1;
    fila0.enfileira((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

}
