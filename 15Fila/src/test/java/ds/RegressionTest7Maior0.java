package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    fila0.item = obj_array11;
    boolean b13 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    ds.Fila fila12 = new ds.Fila();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila12.item = obj_array19;
    fila0.item = obj_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    boolean b13 = fila0.vazia();
    fila0.frente = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    java.lang.Object[] obj_array13 = fila0.item;
    fila0.enfileira((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

}
