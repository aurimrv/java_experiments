package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = 0;

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    boolean b4 = fila0.vazia();
    java.lang.Object[] obj_array5 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.tras;
    ds.Fila fila5 = new ds.Fila();
    boolean b6 = fila5.vazia();
    fila5.tras = 0;
    ds.Fila fila9 = new ds.Fila();
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    fila12.tras = 0;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { fila9, 10.0f, (byte)(-1), 0, (byte)(-1) };
    fila5.item = obj_array17;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { true, (short)100, obj_array17 };
    fila0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.tras;
    java.lang.Object[] obj_array3 = fila0.item;
    int i4 = fila0.frente;
    int i5 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    ds.Fila fila4 = new ds.Fila();
    ds.Fila fila7 = new ds.Fila();
    boolean b8 = fila7.vazia();
    fila7.tras = 0;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { fila4, 10.0f, (byte)(-1), 0, (byte)(-1) };
    fila0.item = obj_array12;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj14 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

}
