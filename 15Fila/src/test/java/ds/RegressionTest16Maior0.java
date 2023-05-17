package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila2 = new ds.Fila();
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array7 = fila6.item;
    java.lang.Object[] obj_array8 = new java.lang.Object[] { (short)0, fila2, (short)(-1), 1.0f, true, obj_array7 };
    fila0.item = obj_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(-1));
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(-1));
    boolean b6 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    int i4 = fila0.tras;
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

}
