package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10.0f);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)0;
    lista0.ultimo = (short)0;
    lista0.imprime();

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    int i3 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)0;
    lista0.ultimo = (short)0;
    java.lang.Object obj5 = new java.lang.Object();
    lista0.insere(obj5);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    lista0.pos = 10;
    ds.Lista lista5 = new ds.Lista();
    java.lang.Object[] obj_array6 = lista5.item;
    lista0.item = obj_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    lista0.pos = 10;
    lista0.ultimo = (short)0;
    lista0.imprime();

  }

}
