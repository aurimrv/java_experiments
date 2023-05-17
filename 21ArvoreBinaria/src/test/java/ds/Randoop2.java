package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test001"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test002"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = arvoreBinaria0.pesquisa(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test003"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test004"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test005"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.insere(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test006"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test007"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    ds.Item item22 = null;
    arvoreBinaria0.retira(item22);
    ds.Item item24 = null;
    arvoreBinaria0.retira(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test008"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.insere(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
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

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test009"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test010"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    arvoreBinaria0.insere(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = arvoreBinaria0.pesquisa(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test011"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test012"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test013"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test014"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = arvoreBinaria0.pesquisa(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test015"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = arvoreBinaria0.pesquisa(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test016"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test017"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test018"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.insere(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = arvoreBinaria0.pesquisa(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test019"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    ds.Item item26 = arvoreBinaria0.pesquisa(item25);
    ds.Item item27 = null;
    ds.Item item28 = arvoreBinaria0.pesquisa(item27);
    ds.Item item29 = null;
    arvoreBinaria0.insere(item29);
    ds.Item item31 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item31);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item28);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test020"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test021"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test022"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test023"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    arvoreBinaria0.testa();
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item25 = arvoreBinaria0.pesquisa(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test024"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test025"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test026"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    ds.Item item23 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test027"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test028"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test029"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test030"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test031"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test032"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test033"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.insere(item23);
    arvoreBinaria0.testa();
    ds.Item item26 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test034"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.insere(item8);
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test035"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test036"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    arvoreBinaria0.retira(item22);
    ds.Item item24 = null;
    ds.Item item25 = arvoreBinaria0.pesquisa(item24);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test037"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test038"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test039"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test040"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.insere(item5);
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test041"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test042"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    ds.Item item23 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item24 = arvoreBinaria0.pesquisa(item23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test043"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test044"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    arvoreBinaria0.testa();
    ds.Item item26 = null;
    arvoreBinaria0.retira(item26);
    ds.Item item28 = null;
    ds.Item item29 = arvoreBinaria0.pesquisa(item28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item29);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test045"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test046"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test047"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test048"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = arvoreBinaria0.pesquisa(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test049"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test050"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test051"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test052"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    arvoreBinaria0.testa();
    ds.Item item24 = null;
    ds.Item item25 = arvoreBinaria0.pesquisa(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test053"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = arvoreBinaria0.pesquisa(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test054"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.insere(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test055"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test056"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test057"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test058"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test059"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test060"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test061"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test062"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test063"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test064"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = arvoreBinaria0.pesquisa(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test065"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test066"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test067"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test068"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test069"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test070"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test071"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    arvoreBinaria0.testa();
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    arvoreBinaria0.retira(item25);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test072"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item15 = arvoreBinaria0.pesquisa(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test073"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test074"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test075"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test076"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test077"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.insere(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = arvoreBinaria0.pesquisa(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test078"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test079"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test080"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item25 = arvoreBinaria0.pesquisa(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test081"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    arvoreBinaria0.insere(item6);
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test082"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test083"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = arvoreBinaria0.pesquisa(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test084"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test085"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test086"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test087"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test088"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.insere(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = arvoreBinaria0.pesquisa(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test089"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test090"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item15 = arvoreBinaria0.pesquisa(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test091"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test092"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test093"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test094"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test095"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test096"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = arvoreBinaria0.pesquisa(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test097"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    arvoreBinaria0.insere(item6);
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = arvoreBinaria0.pesquisa(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test098"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test099"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = arvoreBinaria0.pesquisa(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test100"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test101"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test102"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test103"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test104"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test105"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test106"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.insere(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test107"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test108"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test109"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test110"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test111"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test112"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = arvoreBinaria0.pesquisa(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test113"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test114"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test115"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test116"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = arvoreBinaria0.pesquisa(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test117"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = arvoreBinaria0.pesquisa(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test118"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test119"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test120"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test121"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test122"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test123"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    arvoreBinaria0.testa();
    ds.Item item24 = null;
    arvoreBinaria0.retira(item24);
    arvoreBinaria0.testa();
    ds.Item item27 = null;
    ds.Item item28 = arvoreBinaria0.pesquisa(item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item28);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test124"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test125"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test126"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test127"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test128"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.insere(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = arvoreBinaria0.pesquisa(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test129"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test130"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test131"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.insere(item7);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test132"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test133"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test134"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test135"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test136"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test137"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test138"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = arvoreBinaria0.pesquisa(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test139"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test140"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test141"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test142"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test143"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test144"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    ds.Item item22 = null;
    arvoreBinaria0.retira(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test145"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test146"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test147"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.insere(item8);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test148"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test149"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test150"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    ds.Item item26 = arvoreBinaria0.pesquisa(item25);
    arvoreBinaria0.testa();
    ds.Item item28 = null;
    arvoreBinaria0.retira(item28);
    arvoreBinaria0.testa();
    ds.Item item31 = null;
    ds.Item item32 = arvoreBinaria0.pesquisa(item31);
    ds.Item item33 = null;
    ds.Item item34 = arvoreBinaria0.pesquisa(item33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item34);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test151"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test152"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test153"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test154"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = arvoreBinaria0.pesquisa(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test155"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test156"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test157"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test158"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.insere(item7);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test159"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test160"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test161"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test162"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test163"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test164"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test165"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test166"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test167"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test168"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test169"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test170"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test171"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test172"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test173"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test174"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test175"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test176"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = arvoreBinaria0.pesquisa(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test177"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    arvoreBinaria0.testa();
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test178"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test179"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test180"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = arvoreBinaria0.pesquisa(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test181"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test182"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test183"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test184"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.insere(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test185"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test186"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test187"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test188"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test189"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    ds.Item item26 = arvoreBinaria0.pesquisa(item25);
    ds.Item item27 = null;
    arvoreBinaria0.retira(item27);
    ds.Item item29 = null;
    arvoreBinaria0.retira(item29);
    ds.Item item31 = null;
    arvoreBinaria0.insere(item31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test190"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    arvoreBinaria0.testa();
    ds.Item item24 = null;
    arvoreBinaria0.retira(item24);
    arvoreBinaria0.testa();
    ds.Item item27 = null;
    arvoreBinaria0.retira(item27);
    ds.Item item29 = null;
    arvoreBinaria0.retira(item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test191"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test192"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test193"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test194"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.insere(item5);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test195"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test196"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test197"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = arvoreBinaria0.pesquisa(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test198"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test199"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test200"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test201"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test202"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test203"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test204"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test205"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test206"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    ds.Item item23 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test207"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test208"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test209"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test210"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.insere(item8);
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test211"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test212"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.retira(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test213"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test214"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test215"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test216"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test217"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test218"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    arvoreBinaria0.testa();
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    ds.Item item26 = arvoreBinaria0.pesquisa(item25);
    ds.Item item27 = null;
    arvoreBinaria0.retira(item27);
    ds.Item item29 = null;
    arvoreBinaria0.insere(item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test219"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.insere(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test220"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test221"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    ds.Item item24 = null;
    arvoreBinaria0.retira(item24);
    ds.Item item26 = null;
    ds.Item item27 = arvoreBinaria0.pesquisa(item26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test222"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test223"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test224"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test225"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test226"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test227"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    ds.Item item26 = arvoreBinaria0.pesquisa(item25);
    arvoreBinaria0.testa();
    ds.Item item28 = null;
    arvoreBinaria0.retira(item28);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item32 = null;
    arvoreBinaria0.insere(item32);
    ds.Item item34 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item35 = arvoreBinaria0.pesquisa(item34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test228"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test229"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test230"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test231"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test232"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test233"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test234"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.insere(item6);
    arvoreBinaria0.testa();

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test235"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test236"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test237"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test238"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test239"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test240"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test241"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item23 = arvoreBinaria0.pesquisa(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test242"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test243"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test244"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test245"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test246"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test247"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    ds.Item item24 = null;
    ds.Item item25 = arvoreBinaria0.pesquisa(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test248"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test249"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test250"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test251"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test252"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test253"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test254"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.insere(item23);
    arvoreBinaria0.testa();
    ds.Item item26 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item27 = arvoreBinaria0.pesquisa(item26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test255"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test256"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test257"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test258"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test259"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test260"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test261"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test262"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    ds.Item item24 = null;
    arvoreBinaria0.retira(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test263"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test264"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test265"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test266"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test267"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.insere(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = arvoreBinaria0.pesquisa(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test268"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test269"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test270"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test271"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test272"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test273"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = arvoreBinaria0.pesquisa(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test274"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test275"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = arvoreBinaria0.pesquisa(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test276"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test277"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test278"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = arvoreBinaria0.pesquisa(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test279"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test280"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test281"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test282"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test283"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    ds.Item item25 = null;
    ds.Item item26 = arvoreBinaria0.pesquisa(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test284"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test285"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = arvoreBinaria0.pesquisa(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test286"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    arvoreBinaria0.testa();
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test287"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item26 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test288"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = arvoreBinaria0.pesquisa(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test289"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test290"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test291"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    arvoreBinaria0.testa();
    ds.Item item26 = null;
    arvoreBinaria0.retira(item26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test292"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test293"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test294"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test295"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test296"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test297"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item25 = arvoreBinaria0.pesquisa(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test298"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item15 = arvoreBinaria0.pesquisa(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test299"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = arvoreBinaria0.pesquisa(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test300"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test301"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test302"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test303"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = arvoreBinaria0.pesquisa(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test304"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = arvoreBinaria0.pesquisa(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test305"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test306"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test307"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test308"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.insere(item23);
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test309"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test310"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.insere(item7);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = arvoreBinaria0.pesquisa(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test311"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test312"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test313"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test314"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test315"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test316"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test317"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test318"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test319"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test320"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = arvoreBinaria0.pesquisa(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test321"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test322"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.insere(item8);
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test323"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test324"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test325"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = arvoreBinaria0.pesquisa(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test326"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test327"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = arvoreBinaria0.pesquisa(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test328"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    arvoreBinaria0.testa();
    ds.Item item24 = null;
    arvoreBinaria0.retira(item24);
    ds.Item item26 = null;
    arvoreBinaria0.retira(item26);
    ds.Item item28 = null;
    arvoreBinaria0.retira(item28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test329"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test330"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test331"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test332"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test333"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test334"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    arvoreBinaria0.testa();
    ds.Item item26 = null;
    ds.Item item27 = arvoreBinaria0.pesquisa(item26);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test335"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test336"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test337"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    ds.Item item23 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item24 = arvoreBinaria0.pesquisa(item23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test338"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test339"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test340"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test341"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    arvoreBinaria0.testa();
    ds.Item item26 = null;
    arvoreBinaria0.retira(item26);
    arvoreBinaria0.testa();
    ds.Item item29 = null;
    ds.Item item30 = arvoreBinaria0.pesquisa(item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item30);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test342"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test343"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test344"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test345"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test346"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = arvoreBinaria0.pesquisa(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test347"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test348"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test349"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item23 = null;
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test350"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test351"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = arvoreBinaria0.pesquisa(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test352"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test353"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.insere(item23);
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item26 = arvoreBinaria0.pesquisa(item25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test354"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test355"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test356"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test357"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test358"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test359"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test360"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test361"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test362"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test363"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test364"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item26 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item27 = arvoreBinaria0.pesquisa(item26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test365"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test366"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test367"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    ds.Item item26 = arvoreBinaria0.pesquisa(item25);
    ds.Item item27 = null;
    ds.Item item28 = arvoreBinaria0.pesquisa(item27);
    ds.Item item29 = null;
    arvoreBinaria0.insere(item29);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item28);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test368"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test369"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test370"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test371"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    arvoreBinaria0.testa();
    ds.Item item23 = null;
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test372"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test373"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test374"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    arvoreBinaria0.testa();
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test375"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test376"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test377"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    arvoreBinaria0.testa();
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item26 = arvoreBinaria0.pesquisa(item25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test378"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test379"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = arvoreBinaria0.pesquisa(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test380"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = arvoreBinaria0.pesquisa(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test381"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test382"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test383"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test384"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test385"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test386"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test387"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test388"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test389"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test390"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test391"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.insere(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test392"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test393"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    ds.Item item23 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test394"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test395"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test396"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test397"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test398"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test399"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test400"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test401"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    ds.Item item22 = null;
    arvoreBinaria0.retira(item22);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test402"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    arvoreBinaria0.retira(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test403"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test404"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test405"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    ds.Item item26 = arvoreBinaria0.pesquisa(item25);
    arvoreBinaria0.testa();
    ds.Item item28 = null;
    arvoreBinaria0.retira(item28);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item32 = null;
    arvoreBinaria0.insere(item32);
    ds.Item item34 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test406"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item23 = arvoreBinaria0.pesquisa(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test407"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test408"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test409"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    arvoreBinaria0.insere(item7);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = arvoreBinaria0.pesquisa(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test410"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test411"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test412"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test413"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test414"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test415"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test416"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test417"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test418"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test419"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test420"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.insere(item8);
    arvoreBinaria0.testa();

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test421"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test422"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test423"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test424"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = arvoreBinaria0.pesquisa(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test425"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test426"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test427"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test428"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    arvoreBinaria0.testa();
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    ds.Item item26 = arvoreBinaria0.pesquisa(item25);
    ds.Item item27 = null;
    ds.Item item28 = arvoreBinaria0.pesquisa(item27);
    ds.Item item29 = null;
    arvoreBinaria0.retira(item29);
    ds.Item item31 = null;
    arvoreBinaria0.insere(item31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item28);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test429"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test430"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test431"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test432"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test433"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = arvoreBinaria0.pesquisa(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test434"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test435"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    ds.Item item23 = null;
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    ds.Item item25 = null;
    arvoreBinaria0.retira(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test436"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test437"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test438"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test439"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test440"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    ds.Item item23 = null;
    arvoreBinaria0.insere(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test441"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test442"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    arvoreBinaria0.testa();
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test443"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test444"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test445"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    arvoreBinaria0.insere(item22);
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item25 = arvoreBinaria0.pesquisa(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test446"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    arvoreBinaria0.testa();
    ds.Item item24 = null;
    arvoreBinaria0.retira(item24);
    ds.Item item26 = null;
    arvoreBinaria0.retira(item26);
    ds.Item item28 = null;
    ds.Item item29 = arvoreBinaria0.pesquisa(item28);
    ds.Item item30 = null;
    arvoreBinaria0.retira(item30);
    ds.Item item32 = null;
    arvoreBinaria0.insere(item32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item29);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test447"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test448"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test449"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    ds.Item item23 = null;
    arvoreBinaria0.insere(item23);
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item26 = arvoreBinaria0.pesquisa(item25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test450"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test451"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test452"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test453"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test454"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test455"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test456"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test457"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test458"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test459"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test460"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test461"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item15 = arvoreBinaria0.pesquisa(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test462"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test463"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test464"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = arvoreBinaria0.pesquisa(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test465"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    arvoreBinaria0.testa();
    ds.Item item23 = null;
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test466"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test467"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test468"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = arvoreBinaria0.pesquisa(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test469"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    ds.Item item23 = null;
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    ds.Item item25 = null;
    arvoreBinaria0.insere(item25);
    ds.Item item27 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item28 = arvoreBinaria0.pesquisa(item27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test470"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    ds.Item item23 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test471"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.insere(item5);
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test472"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = arvoreBinaria0.pesquisa(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test473"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test474"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = arvoreBinaria0.pesquisa(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test475"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test476"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test477"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test478"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test479"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test480"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test481"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    arvoreBinaria0.retira(item25);
    ds.Item item27 = null;
    ds.Item item28 = arvoreBinaria0.pesquisa(item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item28);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test482"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test483"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test484"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item23 = arvoreBinaria0.pesquisa(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test485"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test486"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test487"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test488"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test489"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test490"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test491"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = arvoreBinaria0.pesquisa(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test492"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test493"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    ds.Item item13 = null;
    arvoreBinaria0.retira(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test494"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test495"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test496"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test497"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test498"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    arvoreBinaria0.retira(item8);
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = arvoreBinaria0.pesquisa(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test499"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.insere(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test500"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    arvoreBinaria0.retira(item5);
    arvoreBinaria0.testa();
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    ds.Item item10 = null;
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

}
