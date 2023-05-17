package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.insere((java.lang.Object)'#');
    boolean b6 = lista3.vazia();
    lista0.insere((java.lang.Object)lista3);
    ds.Lista lista8 = new ds.Lista();
    lista0.insere((java.lang.Object)lista8);
    lista8.insere((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.insere((java.lang.Object)'#');
    boolean b6 = lista3.vazia();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.insere((java.lang.Object)'#');
    boolean b6 = lista3.vazia();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    lista0.insere((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)'#');
    lista0.imprime();
    boolean b4 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)'#');
    lista0.insere((java.lang.Object)"hi!");
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.insere((java.lang.Object)'#');
    boolean b6 = lista3.vazia();
    lista0.insere((java.lang.Object)lista3);
    ds.Lista lista8 = new ds.Lista();
    lista0.insere((java.lang.Object)lista8);
    boolean b10 = lista8.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test8"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)'#');
    lista0.insere((java.lang.Object)(short)100);

  }

}
