package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test1"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test2"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.insere(item2);
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test3"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    arvoreBinaria0.insere(item3);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test4"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.insere(item2);
    arvoreBinaria0.testa();

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test5"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test6"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.insere(item4);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test7"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    arvoreBinaria0.insere(item3);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    arvoreBinaria0.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
