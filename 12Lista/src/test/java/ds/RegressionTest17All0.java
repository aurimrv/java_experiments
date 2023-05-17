package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)'#');
    lista0.imprime();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista0.insere((java.lang.Object)lista1);
    lista1.insere((java.lang.Object)(-1));
    lista1.insere((java.lang.Object)(byte)0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    boolean b3 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0f);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)'#');
    boolean b3 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)'#');
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista0.insere((java.lang.Object)lista1);
    boolean b3 = lista1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista3 = new ds.Lista();
    ds.Lista lista4 = new ds.Lista();
    lista3.insere((java.lang.Object)lista4);
    lista3.imprime();
    java.lang.Object obj7 = new java.lang.Object();
    lista3.insere(obj7);
    lista0.insere((java.lang.Object)lista3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista0.insere((java.lang.Object)lista1);
    lista1.insere((java.lang.Object)0.0f);
    boolean b5 = lista1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

}
