package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1));
    lista0.insere((java.lang.Object)(byte)1);
    lista0.imprime();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1));
    lista0.imprime();
    boolean b4 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)1);
    lista0.insere((java.lang.Object)(-1));
    lista0.insere((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    ds.Lista lista2 = new ds.Lista();
    lista2.insere((java.lang.Object)(-1));
    boolean b5 = lista2.vazia();
    lista0.insere((java.lang.Object)lista2);
    lista2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)1);
    lista0.imprime();
    lista0.imprime();
    java.lang.Object obj8 = new java.lang.Object();
    lista0.insere(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1));
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    java.lang.Object obj6 = new java.lang.Object();
    lista0.insere(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

}
