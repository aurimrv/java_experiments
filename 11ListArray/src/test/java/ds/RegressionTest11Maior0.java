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


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    int i2 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    boolean b3 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    int i2 = lista0.ultimo;
    lista0.ultimo = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    int i3 = lista0.primeiro;
    ds.Lista lista4 = new ds.Lista();
    java.lang.Object[] obj_array5 = null;
    lista4.item = obj_array5;
    boolean b7 = lista4.vazia();
    lista4.imprime();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { lista4 };
    lista0.item = obj_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    lista0.imprime();
    lista0.primeiro = 'a';
    java.lang.Object[] obj_array6 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj_array6);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

}
