package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    boolean b3 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)100);
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)(-1));
    lista0.imprime();
    lista0.insere((java.lang.Object)(short)10);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)100);
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(short)1);
    lista0.insere((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)(-1));
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1));

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    lista5.imprime();
    lista5.insere((java.lang.Object)(byte)10);
    lista3.insere((java.lang.Object)lista5);
    lista0.insere((java.lang.Object)lista3);
    lista0.insere((java.lang.Object)"");
    boolean b14 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    lista5.imprime();
    lista5.insere((java.lang.Object)(byte)10);
    lista3.insere((java.lang.Object)lista5);
    lista0.insere((java.lang.Object)lista3);
    lista0.insere((java.lang.Object)"");
    lista0.imprime();

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test8"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    lista0.insere((java.lang.Object)(byte)10);
    lista0.insere((java.lang.Object)(-1.0f));

  }

}
