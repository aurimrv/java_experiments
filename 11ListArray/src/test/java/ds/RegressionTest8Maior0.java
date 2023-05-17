package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.ultimo = (short)10;
    int i4 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    int i2 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    ds.Lista lista2 = new ds.Lista();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 0.0f };
    lista2.item = obj_array4;
    lista0.item = obj_array4;
    java.lang.Object[] obj_array7 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.primeiro = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)1);
    lista0.insere((java.lang.Object)10L);
    boolean b5 = lista0.vazia();
    lista0.primeiro = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

}
