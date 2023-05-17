package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = 0;

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.ultimo = (byte)1;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    lista0.item = obj_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.ultimo = (byte)1;
    int i4 = lista0.pos;
    lista0.ultimo = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (short)1;

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.ultimo = (byte)1;
    int i4 = lista0.primeiro;
    boolean b5 = lista0.vazia();
    lista0.insere((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

}
