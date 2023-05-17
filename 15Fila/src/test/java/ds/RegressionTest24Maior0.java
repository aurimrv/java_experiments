package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)1;

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    java.lang.Object obj4 = fila0.desenfileira();
    int i5 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 101);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(byte)100);
    boolean b6 = fila0.vazia();
    ds.Fila fila7 = new ds.Fila();
    fila7.frente = (byte)100;
    int i10 = fila7.frente;
    java.lang.Object[] obj_array11 = fila7.item;
    fila0.item = obj_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.tras = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (-1);

  }

}
