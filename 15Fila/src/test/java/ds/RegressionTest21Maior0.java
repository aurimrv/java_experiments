package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object obj1 = null;
    fila0.enfileira(obj1);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila1);
    fila1.tras = (short)1;
    fila1.frente = '4';

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila1);
    fila1.tras = (short)1;
    int i5 = fila1.tras;
    fila1.enfileira((java.lang.Object)1.0d);
    fila1.enfileira((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila6 = new ds.Fila();
    ds.Fila fila7 = new ds.Fila();
    fila6.enfileira((java.lang.Object)fila7);
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (short)0, 10.0d, (byte)(-1), fila6, (-1.0f) };
    fila0.item = obj_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

}
