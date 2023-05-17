package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)1.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test8"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

}
