package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)100.0d);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.ultimo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 0.0d, (byte)10 };
    lista0.item = obj_array6;
    lista0.primeiro = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (short)1;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista5 = new ds.Lista();
    lista5.ultimo = (short)1;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { lista5, false, (-1.0d) };
    lista0.item = obj_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    lista0.ultimo = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (short)1;
    lista0.insere((java.lang.Object)"hi!");
    lista0.insere((java.lang.Object)(short)100);
    ds.Lista lista7 = new ds.Lista();
    lista7.ultimo = (short)1;
    lista0.insere((java.lang.Object)lista7);

  }

}
