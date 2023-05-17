package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.pos;
    lista0.primeiro = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    lista0.pos = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    int i4 = lista0.ultimo;
    ds.Lista lista5 = new ds.Lista();
    int i6 = lista5.primeiro;
    lista5.imprime();
    int i8 = lista5.pos;
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 10, lista10, lista11 };
    lista5.item = obj_array13;
    lista0.item = obj_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    lista0.pos = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

}
