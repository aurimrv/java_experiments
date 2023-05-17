package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0d);
    lista0.insere((java.lang.Object)(byte)100);
    boolean b7 = lista0.vazia();
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0d);
    lista0.insere((java.lang.Object)(byte)100);
    lista0.imprime();
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(byte)(-1));
    lista0.imprime();
    ds.Lista lista4 = new ds.Lista();
    lista0.insere((java.lang.Object)lista4);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(short)1);
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    boolean b6 = lista5.vazia();
    lista5.imprime();
    lista5.insere((java.lang.Object)1.0d);
    lista5.insere((java.lang.Object)"hi!");
    lista5.insere((java.lang.Object)(byte)10);
    lista0.insere((java.lang.Object)lista5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0d);
    lista0.insere((java.lang.Object)(byte)100);
    boolean b7 = lista0.vazia();
    lista0.insere((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test8"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0d);
    lista0.insere((java.lang.Object)(byte)100);
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

}
