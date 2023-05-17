package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)10;
    lista0.primeiro = 10;

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)1.0f);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)10;
    lista0.primeiro = '#';
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.pos = (byte)10;
    lista5.insere((java.lang.Object)lista6);
    java.lang.Object[] obj_array10 = lista6.item;
    lista0.item = obj_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    lista1.ultimo = (byte)1;
    lista1.insere((java.lang.Object)'#');

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    java.lang.Object[] obj_array5 = null;
    lista0.item = obj_array5;
    lista0.pos = ' ';

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    java.lang.Object[] obj_array5 = lista1.item;
    int i6 = lista1.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    lista1.ultimo = (byte)0;

  }

}
