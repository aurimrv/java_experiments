package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)10.0d);
    lista0.imprime();
    boolean b5 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)10.0d);
    lista0.imprime();
    boolean b5 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista7 = new ds.Lista();
    lista0.insere((java.lang.Object)lista7);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)0.0f);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)10.0d);
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.insere((java.lang.Object)10.0d);
    lista4.imprime();
    boolean b9 = lista4.vazia();
    lista0.insere((java.lang.Object)lista4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    lista1.insere((java.lang.Object)10.0d);
    lista1.imprime();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)10.0d);
    lista0.imprime();
    boolean b5 = lista0.vazia();
    lista0.imprime();
    boolean b7 = lista0.vazia();
    boolean b8 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test8"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)10.0d);
    boolean b4 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test9"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)10.0d);
    lista0.imprime();
    lista0.insere((java.lang.Object)(short)100);

  }

}
