package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    boolean b2 = lista1.vazia();
    lista1.imprime();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista1.vazia();
    lista1.imprime();
    lista1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    boolean b2 = lista1.vazia();
    lista1.imprime();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    boolean b7 = lista6.vazia();
    lista6.imprime();
    lista5.insere((java.lang.Object)lista6);
    lista6.imprime();
    lista1.insere((java.lang.Object)lista6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)0.0d);
    boolean b4 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    boolean b2 = lista1.vazia();
    lista1.imprime();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    boolean b2 = lista1.vazia();
    lista1.imprime();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test8"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)100);
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    boolean b6 = lista5.vazia();
    lista5.imprime();
    lista4.insere((java.lang.Object)lista5);
    lista5.imprime();
    lista0.insere((java.lang.Object)lista5);
    ds.Lista lista11 = new ds.Lista();
    ds.Lista lista12 = new ds.Lista();
    boolean b13 = lista12.vazia();
    lista12.imprime();
    lista11.insere((java.lang.Object)lista12);
    lista12.imprime();
    lista0.insere((java.lang.Object)lista12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

}
