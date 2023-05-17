package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista0.insere((java.lang.Object)lista1);
    lista1.imprime();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object obj1 = new java.lang.Object();
    lista0.insere(obj1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)' ');

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista0.insere((java.lang.Object)lista1);
    lista1.insere((java.lang.Object)"");
    boolean b5 = lista1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista0.insere((java.lang.Object)lista1);
    boolean b3 = lista1.vazia();
    lista1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)(short)0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    lista3.imprime();
    boolean b6 = lista3.vazia();
    lista0.insere((java.lang.Object)b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    java.lang.Object obj2 = null;
    lista0.insere(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

}
