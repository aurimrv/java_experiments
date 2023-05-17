package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10.0f);
    lista0.insere((java.lang.Object)(-1));

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.primeiro = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    int i3 = lista0.primeiro;
    java.lang.Object[] obj_array4 = lista0.item;
    int i5 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    int i3 = lista0.primeiro;
    java.lang.Object[] obj_array4 = lista0.item;
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)10.0f);
    java.lang.Object[] obj_array9 = new java.lang.Object[] { lista5, (-1.0d) };
    lista0.item = obj_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    boolean b6 = lista4.vazia();
    int i7 = lista4.primeiro;
    java.lang.Object[] obj_array8 = lista4.item;
    lista0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

}
