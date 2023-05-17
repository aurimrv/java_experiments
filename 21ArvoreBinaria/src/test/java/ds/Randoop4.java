package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test001"); }


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
    arvoreBinaria0.insere(item17);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test002"); }


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
    arvoreBinaria0.retira(item20);
    
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

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test003"); }


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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test004"); }


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
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test005"); }


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
    arvoreBinaria0.retira(item21);
    arvoreBinaria0.testa();
    ds.Item item24 = null;
    arvoreBinaria0.insere(item24);
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
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test006"); }


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
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test007"); }


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
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test008"); }


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
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    arvoreBinaria0.retira(item11);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test009"); }


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
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test010"); }


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
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test011"); }


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
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test012"); }


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
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    
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
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test013"); }


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
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test014"); }


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
      arvoreBinaria0.retira(item7);
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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test015"); }


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
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test016"); }


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

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test017"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test018"); }


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
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test019"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test020"); }


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
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test021"); }


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
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test022"); }


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
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
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
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test023"); }


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
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test024"); }


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
    arvoreBinaria0.insere(item14);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test025"); }


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
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test026"); }


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
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test027"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    ds.Item item7 = arvoreBinaria0.pesquisa(item6);
    ds.Item item8 = null;
    arvoreBinaria0.insere(item8);
    arvoreBinaria0.testa();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test028"); }


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
    arvoreBinaria0.retira(item32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test029"); }


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
    arvoreBinaria0.insere(item18);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test030"); }


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
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    ds.Item item25 = null;
    arvoreBinaria0.insere(item25);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item30 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item30);
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
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test031"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
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
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test032"); }


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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test033"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
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
    ds.Item item16 = null;
    ds.Item item17 = arvoreBinaria0.pesquisa(item16);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test034"); }


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
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test035"); }


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
    arvoreBinaria0.retira(item16);
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
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test036"); }


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

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test037"); }


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
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test038"); }


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
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test039"); }


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
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item11);
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
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test040"); }


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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test041"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test042"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test043"); }


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
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    
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
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test044"); }


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
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    
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
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test045"); }


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
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    arvoreBinaria0.insere(item21);
    
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test046"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
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
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test047"); }


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
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    ds.Item item22 = arvoreBinaria0.pesquisa(item21);
    
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
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test048"); }


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
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test049"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test050"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test051"); }


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
    ds.Item item28 = null;
    arvoreBinaria0.retira(item28);
    ds.Item item30 = null;
    arvoreBinaria0.retira(item30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test052"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    ds.Item item8 = null;
    ds.Item item9 = arvoreBinaria0.pesquisa(item8);
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    arvoreBinaria0.insere(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test053"); }


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
      arvoreBinaria0.retira(item12);
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
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test054"); }


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
    arvoreBinaria0.retira(item20);
    ds.Item item22 = null;
    arvoreBinaria0.retira(item22);
    
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test055"); }


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
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test056"); }


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
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test057"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
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
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test058"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test059"); }


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
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test060"); }


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
    ds.Item item16 = null;
    arvoreBinaria0.retira(item16);
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
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test061"); }


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
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    ds.Item item19 = null;
    arvoreBinaria0.retira(item19);
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test062"); }


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
    arvoreBinaria0.retira(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test063"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
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
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test064"); }


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
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test065"); }


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
    arvoreBinaria0.insere(item11);
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

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test066"); }


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
    arvoreBinaria0.testa();
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
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test067"); }


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

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test068"); }


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
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test069"); }


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
    ds.Item item11 = arvoreBinaria0.pesquisa(item10);
    ds.Item item12 = null;
    arvoreBinaria0.insere(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test070"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    arvoreBinaria0.insere(item18);
    arvoreBinaria0.testa();
    
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
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test071"); }


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
    arvoreBinaria0.insere(item12);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test072"); }


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
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test073"); }


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
    arvoreBinaria0.insere(item25);
    ds.Item item27 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.retira(item27);
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
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test074"); }


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
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test075"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test076"); }


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
    ds.Item item13 = null;
    arvoreBinaria0.insere(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test077"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.retira(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test078"); }


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
    arvoreBinaria0.testa();
    
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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test079"); }


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
    ds.Item item10 = null;
    arvoreBinaria0.insere(item10);
    arvoreBinaria0.testa();

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test080"); }


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
    arvoreBinaria0.testa();
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

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test081"); }


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
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
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
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test082"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
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
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test083"); }


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
    arvoreBinaria0.testa();
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test084"); }


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
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    arvoreBinaria0.testa();
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.insere(item20);
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
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test085"); }


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
    ds.Item item15 = null;
    ds.Item item16 = arvoreBinaria0.pesquisa(item15);
    ds.Item item17 = null;
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test086"); }


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
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test087"); }


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
    ds.Item item13 = null;
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    ds.Item item15 = null;
    arvoreBinaria0.retira(item15);
    ds.Item item17 = null;
    arvoreBinaria0.insere(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test088"); }


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
    ds.Item item15 = null;
    arvoreBinaria0.insere(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test089"); }


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
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    arvoreBinaria0.testa();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test090"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.insere(item7);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test091"); }


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
    arvoreBinaria0.retira(item20);
    arvoreBinaria0.testa();
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    ds.Item item25 = null;
    arvoreBinaria0.retira(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test092"); }


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
    arvoreBinaria0.insere(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test093"); }


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
    arvoreBinaria0.retira(item17);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
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
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test094"); }


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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test095"); }


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
    arvoreBinaria0.testa();
    ds.Item item17 = null;
    ds.Item item18 = arvoreBinaria0.pesquisa(item17);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item21 = null;
    arvoreBinaria0.retira(item21);
    
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
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test096"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    arvoreBinaria0.retira(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test097"); }


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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test098"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item27 = null;
    arvoreBinaria0.insere(item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test099"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test100"); }


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
    ds.Item item14 = arvoreBinaria0.pesquisa(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test101"); }


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
    ds.Item item27 = null;
    arvoreBinaria0.insere(item27);
    ds.Item item29 = null;
    // The following exception was thrown during execution in test generation
    try {
      arvoreBinaria0.insere(item29);
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
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test102"); }


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
      arvoreBinaria0.retira(item20);
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
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test103"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.insere(item6);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
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

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test104"); }


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
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test105"); }


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
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    arvoreBinaria0.testa();
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
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test106"); }


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
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test107"); }


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
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test108"); }


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
    arvoreBinaria0.retira(item20);
    arvoreBinaria0.testa();
    ds.Item item23 = null;
    arvoreBinaria0.retira(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test109"); }


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
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test110"); }


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
    arvoreBinaria0.testa();
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test111"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    ds.Item item9 = null;
    ds.Item item10 = arvoreBinaria0.pesquisa(item9);
    ds.Item item11 = null;
    ds.Item item12 = arvoreBinaria0.pesquisa(item11);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test112"); }


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

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test113"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test114"); }


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
    ds.Item item12 = null;
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test115"); }


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
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test116"); }


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
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test117"); }


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
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test118"); }


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
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    ds.Item item16 = null;
    arvoreBinaria0.insere(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test119"); }


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
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test120"); }


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
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test121"); }


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
    arvoreBinaria0.retira(item12);
    ds.Item item14 = null;
    arvoreBinaria0.insere(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test122"); }


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
    arvoreBinaria0.insere(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test123"); }


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
    arvoreBinaria0.retira(item16);
    ds.Item item18 = null;
    ds.Item item19 = arvoreBinaria0.pesquisa(item18);
    ds.Item item20 = null;
    arvoreBinaria0.retira(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test124"); }


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
    ds.Item item12 = null;
    ds.Item item13 = arvoreBinaria0.pesquisa(item12);
    ds.Item item14 = null;
    ds.Item item15 = arvoreBinaria0.pesquisa(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test125"); }


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
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test126"); }


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
    arvoreBinaria0.retira(item16);
    arvoreBinaria0.testa();
    ds.Item item19 = null;
    ds.Item item20 = arvoreBinaria0.pesquisa(item19);
    arvoreBinaria0.testa();
    ds.Item item22 = null;
    ds.Item item23 = arvoreBinaria0.pesquisa(item22);
    ds.Item item24 = null;
    ds.Item item25 = arvoreBinaria0.pesquisa(item24);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test127"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);
    ds.Item item6 = null;
    arvoreBinaria0.insere(item6);
    arvoreBinaria0.testa();
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

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test128"); }


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
    ds.Item item24 = arvoreBinaria0.pesquisa(item23);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item27 = null;
    arvoreBinaria0.retira(item27);
    ds.Item item29 = null;
    arvoreBinaria0.retira(item29);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test129"); }


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
    arvoreBinaria0.retira(item15);
    
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

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test130"); }


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
    ds.Item item18 = null;
    arvoreBinaria0.retira(item18);
    ds.Item item20 = null;
    ds.Item item21 = arvoreBinaria0.pesquisa(item20);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test131"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
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
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test132"); }


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
    arvoreBinaria0.insere(item14);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test133"); }


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
    arvoreBinaria0.testa();
    ds.Item item14 = null;
    arvoreBinaria0.retira(item14);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

}
