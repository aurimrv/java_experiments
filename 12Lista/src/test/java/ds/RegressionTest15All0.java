package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)0);
    boolean b3 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    lista0.insere((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0d);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    lista0.imprime();
    lista0.insere((java.lang.Object)(short)1);
    lista0.insere((java.lang.Object)false);
    ds.Lista lista8 = new ds.Lista();
    lista8.insere((java.lang.Object)"hi!");
    lista0.insere((java.lang.Object)"hi!");
    lista0.insere((java.lang.Object)10.0d);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test8"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    lista0.imprime();
    lista0.insere((java.lang.Object)(short)1);
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

}
