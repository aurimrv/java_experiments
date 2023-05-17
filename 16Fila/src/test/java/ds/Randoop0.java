package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test001"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj2 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test002"); }


    ds.Fila fila0 = new ds.Fila();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj1 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test003"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    // The following exception was thrown during execution in test generation
    try {
      fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test004"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj4 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test005"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj5 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test006"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj5 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test007"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj5 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test008"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj4 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test009"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    boolean b5 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj6 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test010"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj6 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test011"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj14 = fila10.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test012"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + true+ "'", obj8.equals(true));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test013"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj7 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test014"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    java.lang.Object obj10 = fila5.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj11 = fila5.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "hi!"+ "'", obj10.equals("hi!"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test015"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj9 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test016"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj5 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test017"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    java.lang.Object obj7 = fila0.desenfileira();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj9 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short)0+ "'", obj7.equals((short)0));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test018"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj3 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test019"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    // The following exception was thrown during execution in test generation
    try {
      fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test020"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    boolean b4 = fila0.vazia();
    fila0.enfileira((java.lang.Object)1.0d);
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test021"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    boolean b5 = fila0.vazia();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj7 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test022"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    java.lang.Object obj7 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj8 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1+ "'", obj7.equals(1));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test023"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj3 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test024"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)fila7);
    java.lang.Object obj13 = fila7.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj14 = fila7.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!"+ "'", obj13.equals("hi!"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test025"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    boolean b7 = fila5.vazia();
    fila5.imprime();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)1);
    boolean b12 = fila5.vazia();
    fila5.imprime();
    ds.Fila fila14 = new ds.Fila();
    boolean b15 = fila14.vazia();
    fila14.imprime();
    boolean b17 = fila14.vazia();
    fila14.imprime();
    fila5.enfileira((java.lang.Object)fila14);
    fila0.enfileira((java.lang.Object)fila5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test026"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    // The following exception was thrown during execution in test generation
    try {
      fila6.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test027"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    java.lang.Object obj7 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)100.0d);
    fila0.imprime();
    java.lang.Object obj11 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1+ "'", obj7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0d+ "'", obj11.equals(100.0d));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test028"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test029"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    boolean b29 = fila25.vazia();
    fila25.imprime();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    fila31.imprime();
    fila31.enfileira((java.lang.Object)1);
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    fila38.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj42 = fila38.desenfileira();
    fila31.enfileira(obj42);
    ds.Fila fila44 = new ds.Fila();
    fila44.imprime();
    ds.Fila fila46 = new ds.Fila();
    fila46.imprime();
    boolean b48 = fila46.vazia();
    fila46.imprime();
    boolean b50 = fila46.vazia();
    fila44.enfileira((java.lang.Object)b50);
    fila31.enfileira((java.lang.Object)fila44);
    fila25.enfileira((java.lang.Object)fila44);
    fila6.enfileira((java.lang.Object)fila44);
    fila44.imprime();
    boolean b56 = fila44.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!"+ "'", obj42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test030"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    boolean b14 = fila10.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj15 = fila10.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test031"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = null;
    fila15.enfileira(obj19);
    fila15.enfileira((java.lang.Object)10);
    fila0.enfileira((java.lang.Object)fila15);
    boolean b24 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test032"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    boolean b32 = fila30.vazia();
    fila30.imprime();
    fila30.imprime();
    fila30.enfileira((java.lang.Object)(short)0);
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    fila37.enfileira((java.lang.Object)"hi!");
    boolean b41 = fila37.vazia();
    fila30.enfileira((java.lang.Object)fila37);
    boolean b43 = fila30.vazia();
    java.lang.Object obj44 = fila30.desenfileira();
    fila0.enfileira(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short)0+ "'", obj44.equals((short)0));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test033"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(byte)100);
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test034"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    boolean b11 = fila6.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj12 = fila6.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test035"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)1);
    fila0.imprime();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test036"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    fila22.imprime();
    fila22.imprime();
    fila22.enfileira((java.lang.Object)1);
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    fila29.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj33 = fila29.desenfileira();
    fila22.enfileira(obj33);
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    boolean b37 = fila35.vazia();
    fila35.imprime();
    boolean b39 = fila35.vazia();
    fila22.enfileira((java.lang.Object)fila35);
    fila13.enfileira((java.lang.Object)fila35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!"+ "'", obj33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test037"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)1);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj17 = fila13.desenfileira();
    fila6.enfileira(obj17);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila19.enfileira((java.lang.Object)b25);
    fila6.enfileira((java.lang.Object)fila19);
    fila0.enfileira((java.lang.Object)fila19);
    boolean b29 = fila19.vazia();
    java.lang.Object obj30 = fila19.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj31 = fila19.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!"+ "'", obj17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true+ "'", obj30.equals(true));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test038"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    boolean b14 = fila12.vazia();
    fila12.imprime();
    boolean b16 = fila12.vazia();
    fila10.enfileira((java.lang.Object)b16);
    java.lang.Object obj18 = null;
    fila10.enfileira(obj18);
    ds.Fila fila20 = new ds.Fila();
    boolean b21 = fila20.vazia();
    fila20.imprime();
    fila10.enfileira((java.lang.Object)fila20);
    java.lang.Object obj24 = new java.lang.Object();
    fila10.enfileira(obj24);
    fila0.enfileira(obj24);
    java.lang.Object obj27 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test039"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    boolean b11 = fila6.vazia();
    fila6.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj13 = fila6.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test040"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    boolean b14 = fila12.vazia();
    fila12.imprime();
    boolean b16 = fila12.vazia();
    fila10.enfileira((java.lang.Object)b16);
    java.lang.Object obj18 = null;
    fila10.enfileira(obj18);
    ds.Fila fila20 = new ds.Fila();
    boolean b21 = fila20.vazia();
    fila20.imprime();
    fila10.enfileira((java.lang.Object)fila20);
    java.lang.Object obj24 = new java.lang.Object();
    fila10.enfileira(obj24);
    fila0.enfileira(obj24);
    ds.Fila fila27 = new ds.Fila();
    boolean b28 = fila27.vazia();
    fila27.imprime();
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    boolean b32 = fila30.vazia();
    boolean b33 = fila30.vazia();
    fila30.enfileira((java.lang.Object)false);
    fila27.enfileira((java.lang.Object)fila30);
    fila30.enfileira((java.lang.Object)10.0d);
    fila0.enfileira((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test041"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    fila3.imprime();
    fila3.enfileira((java.lang.Object)1);
    boolean b10 = fila3.vazia();
    ds.Fila fila11 = new ds.Fila();
    fila11.enfileira((java.lang.Object)(byte)1);
    fila11.imprime();
    fila3.enfileira((java.lang.Object)fila11);
    fila0.enfileira((java.lang.Object)fila3);
    fila0.imprime();
    java.lang.Object obj18 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test042"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0f);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)1);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj18 = fila14.desenfileira();
    fila7.enfileira(obj18);
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    fila22.imprime();
    boolean b26 = fila22.vazia();
    fila20.enfileira((java.lang.Object)b26);
    fila7.enfileira((java.lang.Object)fila20);
    fila0.enfileira((java.lang.Object)fila7);
    java.lang.Object obj30 = fila7.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!"+ "'", obj18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1+ "'", obj30.equals(1));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test043"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    boolean b10 = fila5.vazia();
    fila5.imprime();
    ds.Fila fila12 = new ds.Fila();
    fila12.enfileira((java.lang.Object)(byte)1);
    fila12.imprime();
    boolean b16 = fila12.vazia();
    boolean b17 = fila12.vazia();
    java.lang.Object obj18 = fila12.desenfileira();
    fila5.enfileira((java.lang.Object)fila12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte)1+ "'", obj18.equals((byte)1));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test044"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    boolean b14 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    boolean b21 = fila19.vazia();
    fila19.imprime();
    boolean b23 = fila19.vazia();
    fila17.enfileira((java.lang.Object)b23);
    java.lang.Object obj25 = null;
    fila17.enfileira(obj25);
    ds.Fila fila27 = new ds.Fila();
    boolean b28 = fila27.vazia();
    fila27.imprime();
    fila17.enfileira((java.lang.Object)fila27);
    fila27.imprime();
    boolean b32 = fila27.vazia();
    fila10.enfileira((java.lang.Object)b32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test045"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    boolean b14 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj17 = fila10.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test046"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    fila0.imprime();
    java.lang.Object obj23 = fila0.desenfileira();
    fila0.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    boolean b29 = fila27.vazia();
    fila27.imprime();
    boolean b31 = fila27.vazia();
    fila25.enfileira((java.lang.Object)b31);
    java.lang.Object obj33 = null;
    fila25.enfileira(obj33);
    ds.Fila fila35 = new ds.Fila();
    boolean b36 = fila35.vazia();
    fila35.imprime();
    fila25.enfileira((java.lang.Object)fila35);
    java.lang.Object obj39 = new java.lang.Object();
    fila25.enfileira(obj39);
    fila0.enfileira((java.lang.Object)fila25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1+ "'", obj23.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test047"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    boolean b4 = fila3.vazia();
    fila3.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    boolean b9 = fila6.vazia();
    fila6.enfileira((java.lang.Object)false);
    fila3.enfileira((java.lang.Object)fila6);
    java.lang.Object obj13 = fila3.desenfileira();
    fila0.enfileira((java.lang.Object)fila3);
    boolean b15 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test048"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj5 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test049"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    fila3.imprime();
    fila3.enfileira((java.lang.Object)1);
    boolean b10 = fila3.vazia();
    ds.Fila fila11 = new ds.Fila();
    fila11.enfileira((java.lang.Object)(byte)1);
    fila11.imprime();
    fila3.enfileira((java.lang.Object)fila11);
    fila0.enfileira((java.lang.Object)fila3);
    java.lang.Object obj17 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test050"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)1);
    fila0.imprime();
    fila0.enfileira((java.lang.Object)10);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test051"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    boolean b12 = fila9.vazia();
    fila9.enfileira((java.lang.Object)false);
    boolean b15 = fila9.vazia();
    boolean b16 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    boolean b21 = fila19.vazia();
    fila19.imprime();
    fila19.imprime();
    fila19.enfileira((java.lang.Object)1);
    java.lang.Object obj26 = fila19.desenfileira();
    boolean b27 = fila19.vazia();
    fila0.enfileira((java.lang.Object)fila19);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj29 = fila19.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1+ "'", obj26.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test052"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = fila15.desenfileira();
    fila8.enfileira(obj19);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila21.enfileira((java.lang.Object)b27);
    fila8.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila8);
    fila8.enfileira((java.lang.Object)'a');
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    boolean b35 = fila33.vazia();
    fila33.imprime();
    fila33.imprime();
    fila33.enfileira((java.lang.Object)1);
    boolean b40 = fila33.vazia();
    java.lang.Object obj41 = fila33.desenfileira();
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    boolean b44 = fila42.vazia();
    boolean b45 = fila42.vazia();
    fila42.enfileira((java.lang.Object)false);
    boolean b48 = fila42.vazia();
    boolean b49 = fila42.vazia();
    fila42.imprime();
    fila33.enfileira((java.lang.Object)fila42);
    fila8.enfileira((java.lang.Object)fila42);
    fila42.imprime();
    java.lang.Object obj54 = fila42.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1+ "'", obj41.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj54 + "' != '" + false+ "'", obj54.equals(false));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test053"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    boolean b6 = fila0.vazia();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    fila7.enfileira((java.lang.Object)false);
    boolean b13 = fila7.vazia();
    fila7.imprime();
    fila0.enfileira((java.lang.Object)fila7);
    // The following exception was thrown during execution in test generation
    try {
      fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test054"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)1);
    java.lang.Object obj3 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj4 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte)1+ "'", obj3.equals((byte)1));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test055"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    fila0.imprime();
    fila0.imprime();
    java.lang.Object obj12 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj13 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test056"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0f);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)1);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj18 = fila14.desenfileira();
    fila7.enfileira(obj18);
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    fila22.imprime();
    boolean b26 = fila22.vazia();
    fila20.enfileira((java.lang.Object)b26);
    fila7.enfileira((java.lang.Object)fila20);
    fila0.enfileira((java.lang.Object)fila7);
    java.lang.Object obj30 = null;
    fila0.enfileira(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!"+ "'", obj18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test057"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    boolean b21 = fila17.vazia();
    fila17.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)1);
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    fila30.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj34 = fila30.desenfileira();
    fila23.enfileira(obj34);
    ds.Fila fila36 = new ds.Fila();
    fila36.imprime();
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    boolean b40 = fila38.vazia();
    fila38.imprime();
    boolean b42 = fila38.vazia();
    fila36.enfileira((java.lang.Object)b42);
    fila23.enfileira((java.lang.Object)fila36);
    fila17.enfileira((java.lang.Object)fila36);
    fila17.imprime();
    ds.Fila fila47 = new ds.Fila();
    fila47.imprime();
    ds.Fila fila49 = new ds.Fila();
    fila49.imprime();
    boolean b51 = fila49.vazia();
    fila49.imprime();
    boolean b53 = fila49.vazia();
    fila47.enfileira((java.lang.Object)b53);
    java.lang.Object obj55 = null;
    fila47.enfileira(obj55);
    ds.Fila fila57 = new ds.Fila();
    boolean b58 = fila57.vazia();
    fila57.imprime();
    fila47.enfileira((java.lang.Object)fila57);
    java.lang.Object obj61 = fila47.desenfileira();
    fila47.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila64 = new ds.Fila();
    fila64.imprime();
    fila47.enfileira((java.lang.Object)fila64);
    fila17.enfileira((java.lang.Object)fila64);
    fila0.enfileira((java.lang.Object)fila17);
    boolean b69 = fila0.vazia();
    ds.Fila fila70 = new ds.Fila();
    fila70.imprime();
    ds.Fila fila72 = new ds.Fila();
    fila72.imprime();
    boolean b74 = fila72.vazia();
    fila72.imprime();
    boolean b76 = fila72.vazia();
    fila70.enfileira((java.lang.Object)b76);
    java.lang.Object obj78 = null;
    fila70.enfileira(obj78);
    boolean b80 = fila70.vazia();
    java.lang.Object obj81 = fila70.desenfileira();
    fila0.enfileira(obj81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!"+ "'", obj34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj61 + "' != '" + true+ "'", obj61.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj81 + "' != '" + true+ "'", obj81.equals(true));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test058"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.imprime();
    boolean b6 = fila0.vazia();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj8 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test059"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(byte)100);
    fila0.imprime();
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test060"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    boolean b14 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    fila10.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test061"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    boolean b19 = fila14.vazia();
    fila10.enfileira((java.lang.Object)b19);
    boolean b21 = fila10.vazia();
    fila10.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test062"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test063"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    fila0.imprime();
    fila0.imprime();
    boolean b12 = fila0.vazia();
    ds.Fila fila13 = new ds.Fila();
    boolean b14 = fila13.vazia();
    fila13.imprime();
    boolean b16 = fila13.vazia();
    fila13.imprime();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.enfileira((java.lang.Object)"hi!");
    fila13.enfileira((java.lang.Object)fila18);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila23.imprime();
    fila13.enfileira((java.lang.Object)fila23);
    fila23.enfileira((java.lang.Object)(-1.0d));
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    fila23.enfileira((java.lang.Object)fila32);
    fila0.enfileira((java.lang.Object)fila32);
    java.lang.Object obj36 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj36);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test064"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)fila7);
    boolean b13 = fila0.vazia();
    java.lang.Object obj14 = fila0.desenfileira();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)1);
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    fila22.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj26 = fila22.desenfileira();
    fila15.enfileira(obj26);
    java.lang.Object obj28 = fila15.desenfileira();
    fila0.enfileira(obj28);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short)0+ "'", obj14.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "hi!"+ "'", obj26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1+ "'", obj28.equals(1));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test065"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila9 = new ds.Fila();
    boolean b10 = fila9.vazia();
    fila9.imprime();
    boolean b12 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    boolean b15 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test066"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj6 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test067"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila9 = new ds.Fila();
    boolean b10 = fila9.vazia();
    fila9.imprime();
    boolean b12 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test068"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    boolean b19 = fila14.vazia();
    fila10.enfileira((java.lang.Object)b19);
    boolean b21 = fila10.vazia();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    fila22.imprime();
    fila22.imprime();
    fila22.enfileira((java.lang.Object)(short)0);
    fila22.imprime();
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    boolean b32 = fila30.vazia();
    fila30.imprime();
    fila30.imprime();
    fila30.enfileira((java.lang.Object)1);
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    fila37.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj41 = fila37.desenfileira();
    fila30.enfileira(obj41);
    ds.Fila fila43 = new ds.Fila();
    fila43.imprime();
    ds.Fila fila45 = new ds.Fila();
    fila45.imprime();
    boolean b47 = fila45.vazia();
    fila45.imprime();
    boolean b49 = fila45.vazia();
    fila43.enfileira((java.lang.Object)b49);
    fila30.enfileira((java.lang.Object)fila43);
    fila22.enfileira((java.lang.Object)fila30);
    fila30.enfileira((java.lang.Object)'a');
    fila10.enfileira((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "hi!"+ "'", obj41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test069"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila9 = new ds.Fila();
    boolean b10 = fila9.vazia();
    fila9.imprime();
    boolean b12 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    ds.Fila fila15 = new ds.Fila();
    boolean b16 = fila15.vazia();
    fila15.imprime();
    boolean b18 = fila15.vazia();
    fila15.imprime();
    boolean b20 = fila15.vazia();
    fila9.enfileira((java.lang.Object)b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test070"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.imprime();
    fila6.imprime();
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    boolean b15 = fila13.vazia();
    fila13.imprime();
    boolean b17 = fila13.vazia();
    fila6.enfileira((java.lang.Object)b17);
    java.lang.Object obj19 = new java.lang.Object();
    fila6.enfileira(obj19);
    fila0.enfileira(obj19);
    boolean b22 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test071"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    boolean b14 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    fila10.enfileira((java.lang.Object)(-1.0d));
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    fila10.enfileira((java.lang.Object)fila19);
    fila10.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj27 = null;
    fila23.enfileira(obj27);
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    fila23.enfileira((java.lang.Object)fila29);
    boolean b34 = fila29.vazia();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)"hi!");
    boolean b39 = fila35.vazia();
    fila35.enfileira((java.lang.Object)1.0d);
    fila35.imprime();
    fila29.enfileira((java.lang.Object)fila35);
    fila10.enfileira((java.lang.Object)fila35);
    java.lang.Object obj45 = fila35.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!"+ "'", obj45.equals("hi!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test072"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    boolean b14 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    fila10.enfileira((java.lang.Object)(-1.0d));
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    fila10.enfileira((java.lang.Object)fila19);
    fila10.imprime();
    java.lang.Object obj23 = fila10.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (-1.0d)+ "'", obj23.equals((-1.0d)));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test073"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    boolean b7 = fila3.vazia();
    fila1.enfileira((java.lang.Object)b7);
    java.lang.Object obj9 = null;
    fila1.enfileira(obj9);
    ds.Fila fila11 = new ds.Fila();
    boolean b12 = fila11.vazia();
    fila11.imprime();
    fila1.enfileira((java.lang.Object)fila11);
    java.lang.Object obj15 = fila1.desenfileira();
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj20 = null;
    fila16.enfileira(obj20);
    fila16.enfileira((java.lang.Object)10);
    fila1.enfileira((java.lang.Object)fila16);
    fila0.enfileira((java.lang.Object)fila1);
    fila0.imprime();
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    boolean b29 = fila27.vazia();
    boolean b30 = fila27.vazia();
    fila27.enfileira((java.lang.Object)false);
    boolean b33 = fila27.vazia();
    boolean b34 = fila27.vazia();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    boolean b37 = fila35.vazia();
    fila35.imprime();
    boolean b39 = fila35.vazia();
    fila27.enfileira((java.lang.Object)b39);
    fila0.enfileira((java.lang.Object)b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test074"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.enfileira((java.lang.Object)false);
    boolean b6 = fila0.vazia();
    boolean b7 = fila0.vazia();
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test075"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.enfileira((java.lang.Object)10.0d);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    boolean b17 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    fila19.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj23 = null;
    fila19.enfileira(obj23);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila19.enfileira((java.lang.Object)fila25);
    boolean b30 = fila25.vazia();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    fila31.enfileira((java.lang.Object)"hi!");
    boolean b35 = fila31.vazia();
    fila31.enfileira((java.lang.Object)1.0d);
    fila31.imprime();
    fila25.enfileira((java.lang.Object)fila31);
    fila0.enfileira((java.lang.Object)fila25);
    fila25.imprime();
    fila25.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test076"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test077"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0f);
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test078"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.imprime();
    java.lang.Object obj14 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1+ "'", obj14.equals(1));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test079"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = fila15.desenfileira();
    fila8.enfileira(obj19);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila21.enfileira((java.lang.Object)b27);
    fila8.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila8);
    fila8.enfileira((java.lang.Object)'a');
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    boolean b35 = fila33.vazia();
    fila33.imprime();
    fila33.imprime();
    fila33.enfileira((java.lang.Object)1);
    boolean b40 = fila33.vazia();
    java.lang.Object obj41 = fila33.desenfileira();
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    boolean b44 = fila42.vazia();
    boolean b45 = fila42.vazia();
    fila42.enfileira((java.lang.Object)false);
    boolean b48 = fila42.vazia();
    boolean b49 = fila42.vazia();
    fila42.imprime();
    fila33.enfileira((java.lang.Object)fila42);
    fila8.enfileira((java.lang.Object)fila42);
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    boolean b55 = fila53.vazia();
    fila53.imprime();
    fila53.imprime();
    fila53.enfileira((java.lang.Object)1);
    boolean b60 = fila53.vazia();
    ds.Fila fila61 = new ds.Fila();
    fila61.enfileira((java.lang.Object)(byte)1);
    fila61.imprime();
    fila53.enfileira((java.lang.Object)fila61);
    fila53.imprime();
    fila8.enfileira((java.lang.Object)fila53);
    fila53.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1+ "'", obj41.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test080"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    boolean b7 = fila5.vazia();
    fila5.imprime();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)(short)0);
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    fila12.enfileira((java.lang.Object)"hi!");
    boolean b16 = fila12.vazia();
    fila5.enfileira((java.lang.Object)fila12);
    boolean b18 = fila5.vazia();
    java.lang.Object obj19 = fila5.desenfileira();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    boolean b22 = fila20.vazia();
    fila20.imprime();
    fila20.imprime();
    fila20.enfileira((java.lang.Object)1);
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    fila27.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj31 = fila27.desenfileira();
    fila20.enfileira(obj31);
    java.lang.Object obj33 = fila20.desenfileira();
    fila5.enfileira(obj33);
    fila0.enfileira(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short)0+ "'", obj19.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!"+ "'", obj31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1+ "'", obj33.equals(1));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test081"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)1);
    boolean b28 = fila21.vazia();
    java.lang.Object obj29 = fila21.desenfileira();
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    boolean b32 = fila30.vazia();
    boolean b33 = fila30.vazia();
    fila30.enfileira((java.lang.Object)false);
    boolean b36 = fila30.vazia();
    boolean b37 = fila30.vazia();
    fila30.imprime();
    fila21.enfileira((java.lang.Object)fila30);
    ds.Fila fila40 = new ds.Fila();
    fila40.imprime();
    boolean b42 = fila40.vazia();
    fila40.imprime();
    fila40.imprime();
    fila40.enfileira((java.lang.Object)1);
    java.lang.Object obj47 = fila40.desenfileira();
    boolean b48 = fila40.vazia();
    fila21.enfileira((java.lang.Object)fila40);
    fila21.imprime();
    fila6.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila6);
    // The following exception was thrown during execution in test generation
    try {
      fila6.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1+ "'", obj29.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1+ "'", obj47.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test082"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    boolean b17 = fila0.vazia();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    boolean b22 = fila20.vazia();
    fila20.imprime();
    boolean b24 = fila20.vazia();
    fila18.enfileira((java.lang.Object)b24);
    java.lang.Object obj26 = null;
    fila18.enfileira(obj26);
    ds.Fila fila28 = new ds.Fila();
    boolean b29 = fila28.vazia();
    fila28.imprime();
    fila18.enfileira((java.lang.Object)fila28);
    java.lang.Object obj32 = fila18.desenfileira();
    fila18.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila18.enfileira((java.lang.Object)fila35);
    fila0.enfileira((java.lang.Object)fila35);
    // The following exception was thrown during execution in test generation
    try {
      fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + true+ "'", obj32.equals(true));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test083"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    fila0.imprime();
    fila0.imprime();
    java.lang.Object obj10 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + true+ "'", obj10.equals(true));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test084"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    java.lang.Object obj7 = fila0.desenfileira();
    boolean b8 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1+ "'", obj7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test085"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)(short)0);
    fila6.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)1);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj25 = fila21.desenfileira();
    fila14.enfileira(obj25);
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    boolean b33 = fila29.vazia();
    fila27.enfileira((java.lang.Object)b33);
    fila14.enfileira((java.lang.Object)fila27);
    fila6.enfileira((java.lang.Object)fila14);
    fila0.enfileira((java.lang.Object)fila14);
    // The following exception was thrown during execution in test generation
    try {
      fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!"+ "'", obj25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test086"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    boolean b6 = fila5.vazia();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    fila9.imprime();
    boolean b13 = fila9.vazia();
    fila7.enfileira((java.lang.Object)b13);
    java.lang.Object obj15 = null;
    fila7.enfileira(obj15);
    ds.Fila fila17 = new ds.Fila();
    boolean b18 = fila17.vazia();
    fila17.imprime();
    fila7.enfileira((java.lang.Object)fila17);
    java.lang.Object obj21 = fila7.desenfileira();
    fila7.enfileira((java.lang.Object)(short)(-1));
    boolean b24 = fila7.vazia();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    boolean b29 = fila27.vazia();
    fila27.imprime();
    boolean b31 = fila27.vazia();
    fila25.enfileira((java.lang.Object)b31);
    java.lang.Object obj33 = null;
    fila25.enfileira(obj33);
    ds.Fila fila35 = new ds.Fila();
    boolean b36 = fila35.vazia();
    fila35.imprime();
    fila25.enfileira((java.lang.Object)fila35);
    java.lang.Object obj39 = fila25.desenfileira();
    fila25.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    fila25.enfileira((java.lang.Object)fila42);
    fila7.enfileira((java.lang.Object)fila42);
    fila5.enfileira((java.lang.Object)fila7);
    fila0.enfileira((java.lang.Object)fila7);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + true+ "'", obj21.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj39 + "' != '" + true+ "'", obj39.equals(true));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test087"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100);
    boolean b8 = fila0.vazia();
    java.lang.Object obj9 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100+ "'", obj9.equals(100));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test088"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj6 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test089"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test090"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj25 = null;
    fila21.enfileira(obj25);
    fila21.enfileira((java.lang.Object)10);
    fila6.enfileira((java.lang.Object)fila21);
    fila5.enfileira((java.lang.Object)fila6);
    fila0.enfileira((java.lang.Object)fila6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test091"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)1);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj17 = fila13.desenfileira();
    fila6.enfileira(obj17);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila19.enfileira((java.lang.Object)b25);
    fila6.enfileira((java.lang.Object)fila19);
    fila0.enfileira((java.lang.Object)fila19);
    boolean b29 = fila19.vazia();
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    fila30.enfileira((java.lang.Object)"hi!");
    boolean b34 = fila30.vazia();
    fila30.imprime();
    fila19.enfileira((java.lang.Object)fila30);
    java.lang.Object obj37 = fila19.desenfileira();
    fila19.imprime();
    java.lang.Object obj39 = fila19.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!"+ "'", obj17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj37 + "' != '" + true+ "'", obj37.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj39);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test092"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    java.lang.Object obj25 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj26 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test093"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    boolean b9 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test094"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    boolean b21 = fila17.vazia();
    fila17.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)1);
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    fila30.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj34 = fila30.desenfileira();
    fila23.enfileira(obj34);
    ds.Fila fila36 = new ds.Fila();
    fila36.imprime();
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    boolean b40 = fila38.vazia();
    fila38.imprime();
    boolean b42 = fila38.vazia();
    fila36.enfileira((java.lang.Object)b42);
    fila23.enfileira((java.lang.Object)fila36);
    fila17.enfileira((java.lang.Object)fila36);
    fila17.imprime();
    ds.Fila fila47 = new ds.Fila();
    fila47.imprime();
    ds.Fila fila49 = new ds.Fila();
    fila49.imprime();
    boolean b51 = fila49.vazia();
    fila49.imprime();
    boolean b53 = fila49.vazia();
    fila47.enfileira((java.lang.Object)b53);
    java.lang.Object obj55 = null;
    fila47.enfileira(obj55);
    ds.Fila fila57 = new ds.Fila();
    boolean b58 = fila57.vazia();
    fila57.imprime();
    fila47.enfileira((java.lang.Object)fila57);
    java.lang.Object obj61 = fila47.desenfileira();
    fila47.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila64 = new ds.Fila();
    fila64.imprime();
    fila47.enfileira((java.lang.Object)fila64);
    fila17.enfileira((java.lang.Object)fila64);
    fila0.enfileira((java.lang.Object)fila17);
    java.lang.Object obj69 = fila17.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!"+ "'", obj34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj61 + "' != '" + true+ "'", obj61.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj69);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test095"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)1);
    fila0.imprime();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    java.lang.Object obj6 = fila0.desenfileira();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    fila9.imprime();
    boolean b13 = fila9.vazia();
    fila7.enfileira((java.lang.Object)b13);
    java.lang.Object obj15 = null;
    fila7.enfileira(obj15);
    ds.Fila fila17 = new ds.Fila();
    boolean b18 = fila17.vazia();
    fila17.imprime();
    fila7.enfileira((java.lang.Object)fila17);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    fila21.imprime();
    boolean b26 = fila21.vazia();
    fila17.enfileira((java.lang.Object)b26);
    boolean b28 = fila17.vazia();
    ds.Fila fila29 = new ds.Fila();
    boolean b30 = fila29.vazia();
    fila29.imprime();
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    boolean b34 = fila32.vazia();
    boolean b35 = fila32.vazia();
    fila32.enfileira((java.lang.Object)false);
    fila29.enfileira((java.lang.Object)fila32);
    fila17.enfileira((java.lang.Object)fila32);
    ds.Fila fila40 = new ds.Fila();
    fila40.imprime();
    fila40.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj44 = null;
    fila40.enfileira(obj44);
    ds.Fila fila46 = new ds.Fila();
    fila46.imprime();
    boolean b48 = fila46.vazia();
    fila46.imprime();
    fila40.enfileira((java.lang.Object)fila46);
    fila32.enfileira((java.lang.Object)fila40);
    fila0.enfileira((java.lang.Object)fila32);
    boolean b53 = fila32.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte)1+ "'", obj6.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test096"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    boolean b14 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    fila10.enfileira((java.lang.Object)(-1.0d));
    ds.Fila fila19 = new ds.Fila();
    boolean b20 = fila19.vazia();
    fila19.imprime();
    fila19.imprime();
    fila19.imprime();
    fila19.imprime();
    fila10.enfileira((java.lang.Object)fila19);
    fila19.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test097"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    boolean b19 = fila14.vazia();
    fila10.enfileira((java.lang.Object)b19);
    fila10.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test098"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    boolean b14 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    fila10.enfileira((java.lang.Object)(-1.0d));
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    fila10.enfileira((java.lang.Object)fila19);
    fila10.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj27 = null;
    fila23.enfileira(obj27);
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    fila23.enfileira((java.lang.Object)fila29);
    boolean b34 = fila29.vazia();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)"hi!");
    boolean b39 = fila35.vazia();
    fila35.enfileira((java.lang.Object)1.0d);
    fila35.imprime();
    fila29.enfileira((java.lang.Object)fila35);
    fila10.enfileira((java.lang.Object)fila35);
    java.lang.Object obj45 = null;
    fila35.enfileira(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test099"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    boolean b17 = fila0.vazia();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    boolean b22 = fila20.vazia();
    fila20.imprime();
    boolean b24 = fila20.vazia();
    fila18.enfileira((java.lang.Object)b24);
    java.lang.Object obj26 = null;
    fila18.enfileira(obj26);
    ds.Fila fila28 = new ds.Fila();
    boolean b29 = fila28.vazia();
    fila28.imprime();
    fila18.enfileira((java.lang.Object)fila28);
    java.lang.Object obj32 = fila18.desenfileira();
    fila18.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila18.enfileira((java.lang.Object)fila35);
    fila0.enfileira((java.lang.Object)fila35);
    boolean b39 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + true+ "'", obj32.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test100"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    fila30.imprime();
    boolean b33 = fila30.vazia();
    fila30.imprime();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)"hi!");
    fila30.enfileira((java.lang.Object)fila35);
    fila25.enfileira((java.lang.Object)fila35);
    fila35.enfileira((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test101"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    boolean b10 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test102"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test103"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    boolean b10 = fila0.vazia();
    java.lang.Object obj11 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test104"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    ds.Fila fila4 = new ds.Fila();
    fila4.imprime();
    boolean b6 = fila4.vazia();
    fila4.imprime();
    boolean b8 = fila4.vazia();
    fila2.enfileira((java.lang.Object)b8);
    java.lang.Object obj10 = null;
    fila2.enfileira(obj10);
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    fila12.imprime();
    fila2.enfileira((java.lang.Object)fila12);
    java.lang.Object obj16 = fila2.desenfileira();
    fila2.enfileira((java.lang.Object)(short)(-1));
    boolean b19 = fila2.vazia();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    fila22.imprime();
    boolean b26 = fila22.vazia();
    fila20.enfileira((java.lang.Object)b26);
    java.lang.Object obj28 = null;
    fila20.enfileira(obj28);
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    fila30.imprime();
    fila20.enfileira((java.lang.Object)fila30);
    java.lang.Object obj34 = fila20.desenfileira();
    fila20.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    fila20.enfileira((java.lang.Object)fila37);
    fila2.enfileira((java.lang.Object)fila37);
    fila0.enfileira((java.lang.Object)fila2);
    java.lang.Object obj42 = fila2.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true+ "'", obj16.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true+ "'", obj34.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test105"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    fila10.imprime();
    fila10.enfileira((java.lang.Object)1);
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj21 = fila17.desenfileira();
    fila10.enfileira(obj21);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    boolean b29 = fila25.vazia();
    fila23.enfileira((java.lang.Object)b29);
    fila10.enfileira((java.lang.Object)fila23);
    fila10.imprime();
    java.lang.Object obj33 = fila10.desenfileira();
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    boolean b36 = fila34.vazia();
    fila34.imprime();
    fila34.imprime();
    fila34.enfileira((java.lang.Object)1);
    boolean b41 = fila34.vazia();
    java.lang.Object obj42 = fila34.desenfileira();
    ds.Fila fila43 = new ds.Fila();
    fila43.imprime();
    boolean b45 = fila43.vazia();
    boolean b46 = fila43.vazia();
    fila43.enfileira((java.lang.Object)false);
    boolean b49 = fila43.vazia();
    boolean b50 = fila43.vazia();
    fila43.imprime();
    fila34.enfileira((java.lang.Object)fila43);
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    boolean b55 = fila53.vazia();
    fila53.imprime();
    fila53.imprime();
    fila53.enfileira((java.lang.Object)1);
    java.lang.Object obj60 = fila53.desenfileira();
    boolean b61 = fila53.vazia();
    fila34.enfileira((java.lang.Object)fila53);
    fila10.enfileira((java.lang.Object)fila53);
    fila0.enfileira((java.lang.Object)fila53);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj65 = fila53.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!"+ "'", obj21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1+ "'", obj33.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1+ "'", obj42.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1+ "'", obj60.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test106"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)1);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj17 = fila13.desenfileira();
    fila6.enfileira(obj17);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila19.enfileira((java.lang.Object)b25);
    fila6.enfileira((java.lang.Object)fila19);
    fila0.enfileira((java.lang.Object)fila19);
    fila0.imprime();
    boolean b30 = fila0.vazia();
    java.lang.Object obj31 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!"+ "'", obj17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test107"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    fila25.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj31 = fila25.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test108"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    boolean b21 = fila17.vazia();
    fila17.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)1);
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    fila30.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj34 = fila30.desenfileira();
    fila23.enfileira(obj34);
    ds.Fila fila36 = new ds.Fila();
    fila36.imprime();
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    boolean b40 = fila38.vazia();
    fila38.imprime();
    boolean b42 = fila38.vazia();
    fila36.enfileira((java.lang.Object)b42);
    fila23.enfileira((java.lang.Object)fila36);
    fila17.enfileira((java.lang.Object)fila36);
    fila17.imprime();
    ds.Fila fila47 = new ds.Fila();
    fila47.imprime();
    ds.Fila fila49 = new ds.Fila();
    fila49.imprime();
    boolean b51 = fila49.vazia();
    fila49.imprime();
    boolean b53 = fila49.vazia();
    fila47.enfileira((java.lang.Object)b53);
    java.lang.Object obj55 = null;
    fila47.enfileira(obj55);
    ds.Fila fila57 = new ds.Fila();
    boolean b58 = fila57.vazia();
    fila57.imprime();
    fila47.enfileira((java.lang.Object)fila57);
    java.lang.Object obj61 = fila47.desenfileira();
    fila47.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila64 = new ds.Fila();
    fila64.imprime();
    fila47.enfileira((java.lang.Object)fila64);
    fila17.enfileira((java.lang.Object)fila64);
    fila0.enfileira((java.lang.Object)fila17);
    boolean b69 = fila0.vazia();
    java.lang.Object obj70 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!"+ "'", obj34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj61 + "' != '" + true+ "'", obj61.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj70);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test109"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)1);
    java.lang.Object obj3 = fila0.desenfileira();
    ds.Fila fila4 = new ds.Fila();
    fila4.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    boolean b10 = fila6.vazia();
    fila4.enfileira((java.lang.Object)b10);
    java.lang.Object obj12 = null;
    fila4.enfileira(obj12);
    ds.Fila fila14 = new ds.Fila();
    boolean b15 = fila14.vazia();
    fila14.imprime();
    fila4.enfileira((java.lang.Object)fila14);
    java.lang.Object obj18 = fila4.desenfileira();
    fila4.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila21.imprime();
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    boolean b29 = fila27.vazia();
    fila27.imprime();
    fila27.imprime();
    fila27.enfileira((java.lang.Object)1);
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    fila34.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj38 = fila34.desenfileira();
    fila27.enfileira(obj38);
    ds.Fila fila40 = new ds.Fila();
    fila40.imprime();
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    boolean b44 = fila42.vazia();
    fila42.imprime();
    boolean b46 = fila42.vazia();
    fila40.enfileira((java.lang.Object)b46);
    fila27.enfileira((java.lang.Object)fila40);
    fila21.enfileira((java.lang.Object)fila40);
    fila21.imprime();
    ds.Fila fila51 = new ds.Fila();
    fila51.imprime();
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    boolean b55 = fila53.vazia();
    fila53.imprime();
    boolean b57 = fila53.vazia();
    fila51.enfileira((java.lang.Object)b57);
    java.lang.Object obj59 = null;
    fila51.enfileira(obj59);
    ds.Fila fila61 = new ds.Fila();
    boolean b62 = fila61.vazia();
    fila61.imprime();
    fila51.enfileira((java.lang.Object)fila61);
    java.lang.Object obj65 = fila51.desenfileira();
    fila51.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila68 = new ds.Fila();
    fila68.imprime();
    fila51.enfileira((java.lang.Object)fila68);
    fila21.enfileira((java.lang.Object)fila68);
    fila4.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte)1+ "'", obj3.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + true+ "'", obj18.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!"+ "'", obj38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj65 + "' != '" + true+ "'", obj65.equals(true));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test110"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100);
    boolean b8 = fila0.vazia();
    boolean b9 = fila0.vazia();
    boolean b10 = fila0.vazia();
    boolean b11 = fila0.vazia();
    java.lang.Object obj12 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100+ "'", obj12.equals(100));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test111"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    boolean b25 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test112"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    fila30.imprime();
    boolean b33 = fila30.vazia();
    fila30.imprime();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)"hi!");
    fila30.enfileira((java.lang.Object)fila35);
    fila25.enfileira((java.lang.Object)fila35);
    ds.Fila fila41 = new ds.Fila();
    fila41.imprime();
    boolean b43 = fila41.vazia();
    boolean b44 = fila41.vazia();
    fila41.enfileira((java.lang.Object)false);
    boolean b47 = fila41.vazia();
    fila25.enfileira((java.lang.Object)b47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test113"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    fila10.imprime();
    fila10.enfileira((java.lang.Object)1);
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj21 = fila17.desenfileira();
    fila10.enfileira(obj21);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    boolean b29 = fila25.vazia();
    fila23.enfileira((java.lang.Object)b29);
    fila10.enfileira((java.lang.Object)fila23);
    fila10.imprime();
    java.lang.Object obj33 = fila10.desenfileira();
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    boolean b36 = fila34.vazia();
    fila34.imprime();
    fila34.imprime();
    fila34.enfileira((java.lang.Object)1);
    boolean b41 = fila34.vazia();
    java.lang.Object obj42 = fila34.desenfileira();
    ds.Fila fila43 = new ds.Fila();
    fila43.imprime();
    boolean b45 = fila43.vazia();
    boolean b46 = fila43.vazia();
    fila43.enfileira((java.lang.Object)false);
    boolean b49 = fila43.vazia();
    boolean b50 = fila43.vazia();
    fila43.imprime();
    fila34.enfileira((java.lang.Object)fila43);
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    boolean b55 = fila53.vazia();
    fila53.imprime();
    fila53.imprime();
    fila53.enfileira((java.lang.Object)1);
    java.lang.Object obj60 = fila53.desenfileira();
    boolean b61 = fila53.vazia();
    fila34.enfileira((java.lang.Object)fila53);
    fila10.enfileira((java.lang.Object)fila53);
    fila0.enfileira((java.lang.Object)fila53);
    ds.Fila fila65 = new ds.Fila();
    boolean b66 = fila65.vazia();
    fila65.imprime();
    boolean b68 = fila65.vazia();
    fila65.imprime();
    ds.Fila fila70 = new ds.Fila();
    fila70.imprime();
    fila70.enfileira((java.lang.Object)"hi!");
    fila65.enfileira((java.lang.Object)fila70);
    ds.Fila fila75 = new ds.Fila();
    fila75.imprime();
    boolean b77 = fila75.vazia();
    fila75.imprime();
    boolean b79 = fila75.vazia();
    fila75.imprime();
    fila65.enfileira((java.lang.Object)fila75);
    java.lang.Object obj82 = fila65.desenfileira();
    fila53.enfileira((java.lang.Object)fila65);
    java.lang.Object obj84 = fila53.desenfileira();
    ds.Fila fila85 = new ds.Fila();
    fila85.imprime();
    boolean b87 = fila85.vazia();
    boolean b88 = fila85.vazia();
    fila85.enfileira((java.lang.Object)false);
    fila85.imprime();
    fila53.enfileira((java.lang.Object)fila85);
    fila53.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!"+ "'", obj21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1+ "'", obj33.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1+ "'", obj42.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1+ "'", obj60.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test114"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    boolean b11 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test115"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    boolean b14 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test116"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)1);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj17 = fila13.desenfileira();
    fila6.enfileira(obj17);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila19.enfileira((java.lang.Object)b25);
    fila6.enfileira((java.lang.Object)fila19);
    fila0.enfileira((java.lang.Object)fila19);
    boolean b29 = fila19.vazia();
    fila19.imprime();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    fila31.imprime();
    fila31.enfileira((java.lang.Object)1);
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    fila38.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj42 = fila38.desenfileira();
    fila31.enfileira(obj42);
    ds.Fila fila44 = new ds.Fila();
    fila44.imprime();
    ds.Fila fila46 = new ds.Fila();
    fila46.imprime();
    boolean b48 = fila46.vazia();
    fila46.imprime();
    boolean b50 = fila46.vazia();
    fila44.enfileira((java.lang.Object)b50);
    fila31.enfileira((java.lang.Object)fila44);
    fila44.imprime();
    boolean b54 = fila44.vazia();
    fila19.enfileira((java.lang.Object)b54);
    fila19.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!"+ "'", obj17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!"+ "'", obj42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test117"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    // The following exception was thrown during execution in test generation
    try {
      fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test118"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    fila0.imprime();
    ds.Fila fila23 = new ds.Fila();
    boolean b24 = fila23.vazia();
    fila23.imprime();
    boolean b26 = fila23.vazia();
    fila23.imprime();
    ds.Fila fila28 = new ds.Fila();
    fila28.imprime();
    fila28.enfileira((java.lang.Object)"hi!");
    fila23.enfileira((java.lang.Object)fila28);
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    boolean b35 = fila33.vazia();
    fila33.imprime();
    boolean b37 = fila33.vazia();
    fila33.imprime();
    fila23.enfileira((java.lang.Object)fila33);
    fila33.enfileira((java.lang.Object)(-1.0d));
    fila0.enfileira((java.lang.Object)fila33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test119"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(byte)100);
    java.lang.Object obj7 = fila0.desenfileira();
    boolean b8 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj9 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte)100+ "'", obj7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test120"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    boolean b29 = fila25.vazia();
    fila25.imprime();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    fila31.imprime();
    fila31.enfileira((java.lang.Object)1);
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    fila38.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj42 = fila38.desenfileira();
    fila31.enfileira(obj42);
    ds.Fila fila44 = new ds.Fila();
    fila44.imprime();
    ds.Fila fila46 = new ds.Fila();
    fila46.imprime();
    boolean b48 = fila46.vazia();
    fila46.imprime();
    boolean b50 = fila46.vazia();
    fila44.enfileira((java.lang.Object)b50);
    fila31.enfileira((java.lang.Object)fila44);
    fila25.enfileira((java.lang.Object)fila44);
    fila6.enfileira((java.lang.Object)fila44);
    fila44.imprime();
    ds.Fila fila56 = new ds.Fila();
    boolean b57 = fila56.vazia();
    fila56.imprime();
    boolean b59 = fila56.vazia();
    boolean b60 = fila56.vazia();
    fila56.enfileira((java.lang.Object)(byte)100);
    fila56.imprime();
    java.lang.Object obj64 = fila56.desenfileira();
    fila56.imprime();
    fila44.enfileira((java.lang.Object)fila56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!"+ "'", obj42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (byte)100+ "'", obj64.equals((byte)100));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test121"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    fila0.imprime();
    fila0.imprime();
    boolean b12 = fila0.vazia();
    ds.Fila fila13 = new ds.Fila();
    boolean b14 = fila13.vazia();
    fila13.imprime();
    boolean b16 = fila13.vazia();
    fila13.imprime();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.enfileira((java.lang.Object)"hi!");
    fila13.enfileira((java.lang.Object)fila18);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila23.imprime();
    fila13.enfileira((java.lang.Object)fila23);
    fila23.enfileira((java.lang.Object)(-1.0d));
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    fila23.enfileira((java.lang.Object)fila32);
    fila0.enfileira((java.lang.Object)fila32);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj36 = fila32.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test122"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    boolean b7 = fila5.vazia();
    fila5.imprime();
    boolean b9 = fila5.vazia();
    fila5.imprime();
    ds.Fila fila11 = new ds.Fila();
    fila11.imprime();
    boolean b13 = fila11.vazia();
    fila11.imprime();
    fila11.imprime();
    fila11.enfileira((java.lang.Object)1);
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj22 = fila18.desenfileira();
    fila11.enfileira(obj22);
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    boolean b28 = fila26.vazia();
    fila26.imprime();
    boolean b30 = fila26.vazia();
    fila24.enfileira((java.lang.Object)b30);
    fila11.enfileira((java.lang.Object)fila24);
    fila5.enfileira((java.lang.Object)fila24);
    java.lang.Object obj34 = fila24.desenfileira();
    fila0.enfileira(obj34);
    fila0.imprime();
    ds.Fila fila37 = new ds.Fila();
    boolean b38 = fila37.vazia();
    fila37.imprime();
    fila0.enfileira((java.lang.Object)fila37);
    boolean b41 = fila0.vazia();
    ds.Fila fila42 = new ds.Fila();
    fila42.enfileira((java.lang.Object)(byte)1);
    fila42.imprime();
    boolean b46 = fila42.vazia();
    boolean b47 = fila42.vazia();
    java.lang.Object obj48 = fila42.desenfileira();
    ds.Fila fila49 = new ds.Fila();
    fila49.imprime();
    ds.Fila fila51 = new ds.Fila();
    fila51.imprime();
    boolean b53 = fila51.vazia();
    fila51.imprime();
    boolean b55 = fila51.vazia();
    fila49.enfileira((java.lang.Object)b55);
    java.lang.Object obj57 = null;
    fila49.enfileira(obj57);
    ds.Fila fila59 = new ds.Fila();
    boolean b60 = fila59.vazia();
    fila59.imprime();
    fila49.enfileira((java.lang.Object)fila59);
    ds.Fila fila63 = new ds.Fila();
    fila63.imprime();
    boolean b65 = fila63.vazia();
    fila63.imprime();
    fila63.imprime();
    boolean b68 = fila63.vazia();
    fila59.enfileira((java.lang.Object)b68);
    boolean b70 = fila59.vazia();
    ds.Fila fila71 = new ds.Fila();
    boolean b72 = fila71.vazia();
    fila71.imprime();
    ds.Fila fila74 = new ds.Fila();
    fila74.imprime();
    boolean b76 = fila74.vazia();
    boolean b77 = fila74.vazia();
    fila74.enfileira((java.lang.Object)false);
    fila71.enfileira((java.lang.Object)fila74);
    fila59.enfileira((java.lang.Object)fila74);
    ds.Fila fila82 = new ds.Fila();
    fila82.imprime();
    fila82.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj86 = null;
    fila82.enfileira(obj86);
    ds.Fila fila88 = new ds.Fila();
    fila88.imprime();
    boolean b90 = fila88.vazia();
    fila88.imprime();
    fila82.enfileira((java.lang.Object)fila88);
    fila74.enfileira((java.lang.Object)fila82);
    fila42.enfileira((java.lang.Object)fila74);
    fila0.enfileira((java.lang.Object)fila42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!"+ "'", obj22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true+ "'", obj34.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (byte)1+ "'", obj48.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test123"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(byte)100);
    fila0.imprime();
    java.lang.Object obj8 = fila0.desenfileira();
    boolean b9 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte)100+ "'", obj8.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test124"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    boolean b8 = fila0.vazia();
    boolean b9 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test125"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    ds.Fila fila13 = new ds.Fila();
    boolean b14 = fila13.vazia();
    fila13.imprime();
    boolean b16 = fila13.vazia();
    fila13.imprime();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.enfileira((java.lang.Object)"hi!");
    fila13.enfileira((java.lang.Object)fila18);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    boolean b29 = fila25.vazia();
    fila23.enfileira((java.lang.Object)b29);
    java.lang.Object obj31 = null;
    fila23.enfileira(obj31);
    ds.Fila fila33 = new ds.Fila();
    boolean b34 = fila33.vazia();
    fila33.imprime();
    fila23.enfileira((java.lang.Object)fila33);
    java.lang.Object obj37 = new java.lang.Object();
    fila23.enfileira(obj37);
    fila13.enfileira(obj37);
    fila0.enfileira((java.lang.Object)fila13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test126"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    fila3.imprime();
    fila3.enfileira((java.lang.Object)1);
    boolean b10 = fila3.vazia();
    ds.Fila fila11 = new ds.Fila();
    fila11.enfileira((java.lang.Object)(byte)1);
    fila11.imprime();
    fila3.enfileira((java.lang.Object)fila11);
    fila0.enfileira((java.lang.Object)fila3);
    fila0.imprime();
    boolean b18 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test127"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila17 = new ds.Fila();
    boolean b18 = fila17.vazia();
    fila17.imprime();
    boolean b20 = fila17.vazia();
    fila17.imprime();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    fila22.enfileira((java.lang.Object)"hi!");
    fila17.enfileira((java.lang.Object)fila22);
    fila0.enfileira((java.lang.Object)fila22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test128"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)(short)0);
    fila6.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)1);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj25 = fila21.desenfileira();
    fila14.enfileira(obj25);
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    boolean b33 = fila29.vazia();
    fila27.enfileira((java.lang.Object)b33);
    fila14.enfileira((java.lang.Object)fila27);
    fila6.enfileira((java.lang.Object)fila14);
    fila0.enfileira((java.lang.Object)fila14);
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    boolean b40 = fila38.vazia();
    fila38.imprime();
    fila38.imprime();
    fila38.imprime();
    fila38.imprime();
    ds.Fila fila45 = new ds.Fila();
    fila45.imprime();
    boolean b47 = fila45.vazia();
    fila45.imprime();
    boolean b49 = fila45.vazia();
    fila38.enfileira((java.lang.Object)b49);
    java.lang.Object obj51 = new java.lang.Object();
    fila38.enfileira(obj51);
    java.lang.Object obj53 = fila38.desenfileira();
    ds.Fila fila54 = new ds.Fila();
    fila54.imprime();
    fila54.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj58 = fila54.desenfileira();
    fila54.enfileira((java.lang.Object)10.0f);
    ds.Fila fila61 = new ds.Fila();
    fila61.imprime();
    boolean b63 = fila61.vazia();
    fila61.imprime();
    fila61.imprime();
    fila61.enfileira((java.lang.Object)1);
    ds.Fila fila68 = new ds.Fila();
    fila68.imprime();
    fila68.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj72 = fila68.desenfileira();
    fila61.enfileira(obj72);
    ds.Fila fila74 = new ds.Fila();
    fila74.imprime();
    ds.Fila fila76 = new ds.Fila();
    fila76.imprime();
    boolean b78 = fila76.vazia();
    fila76.imprime();
    boolean b80 = fila76.vazia();
    fila74.enfileira((java.lang.Object)b80);
    fila61.enfileira((java.lang.Object)fila74);
    fila54.enfileira((java.lang.Object)fila61);
    fila38.enfileira((java.lang.Object)fila61);
    fila14.enfileira((java.lang.Object)fila61);
    boolean b86 = fila61.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!"+ "'", obj25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj53 + "' != '" + true+ "'", obj53.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!"+ "'", obj58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "hi!"+ "'", obj72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test129"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(byte)100);
    fila0.imprime();
    java.lang.Object obj8 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte)100+ "'", obj8.equals((byte)100));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test130"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    boolean b12 = fila9.vazia();
    fila9.enfileira((java.lang.Object)false);
    boolean b15 = fila9.vazia();
    boolean b16 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test131"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = new java.lang.Object();
    fila0.enfileira(obj13);
    java.lang.Object obj15 = fila0.desenfileira();
    boolean b16 = fila0.vazia();
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)1);
    boolean b24 = fila17.vazia();
    ds.Fila fila25 = new ds.Fila();
    fila25.enfileira((java.lang.Object)(byte)1);
    fila25.imprime();
    fila17.enfileira((java.lang.Object)fila25);
    fila0.enfileira((java.lang.Object)fila17);
    java.lang.Object obj31 = fila0.desenfileira();
    boolean b32 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test132"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    boolean b7 = fila5.vazia();
    fila5.imprime();
    boolean b9 = fila5.vazia();
    fila5.imprime();
    ds.Fila fila11 = new ds.Fila();
    fila11.imprime();
    boolean b13 = fila11.vazia();
    fila11.imprime();
    fila11.imprime();
    fila11.enfileira((java.lang.Object)1);
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj22 = fila18.desenfileira();
    fila11.enfileira(obj22);
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    boolean b28 = fila26.vazia();
    fila26.imprime();
    boolean b30 = fila26.vazia();
    fila24.enfileira((java.lang.Object)b30);
    fila11.enfileira((java.lang.Object)fila24);
    fila5.enfileira((java.lang.Object)fila24);
    java.lang.Object obj34 = fila24.desenfileira();
    fila0.enfileira(obj34);
    fila0.imprime();
    ds.Fila fila37 = new ds.Fila();
    boolean b38 = fila37.vazia();
    fila37.imprime();
    fila0.enfileira((java.lang.Object)fila37);
    java.lang.Object obj41 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!"+ "'", obj22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true+ "'", obj34.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true+ "'", obj41.equals(true));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test133"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    boolean b10 = fila0.vazia();
    boolean b11 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test134"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)(short)0);
    fila6.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)1);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj25 = fila21.desenfileira();
    fila14.enfileira(obj25);
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    boolean b33 = fila29.vazia();
    fila27.enfileira((java.lang.Object)b33);
    fila14.enfileira((java.lang.Object)fila27);
    fila6.enfileira((java.lang.Object)fila14);
    fila0.enfileira((java.lang.Object)fila14);
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    boolean b40 = fila38.vazia();
    fila38.imprime();
    boolean b42 = fila38.vazia();
    fila38.imprime();
    ds.Fila fila44 = new ds.Fila();
    fila44.imprime();
    ds.Fila fila46 = new ds.Fila();
    fila46.imprime();
    boolean b48 = fila46.vazia();
    fila46.imprime();
    boolean b50 = fila46.vazia();
    fila44.enfileira((java.lang.Object)b50);
    java.lang.Object obj52 = null;
    fila44.enfileira(obj52);
    ds.Fila fila54 = new ds.Fila();
    boolean b55 = fila54.vazia();
    fila54.imprime();
    fila44.enfileira((java.lang.Object)fila54);
    java.lang.Object obj58 = fila44.desenfileira();
    fila44.enfileira((java.lang.Object)(short)(-1));
    boolean b61 = fila44.vazia();
    fila38.enfileira((java.lang.Object)fila44);
    ds.Fila fila63 = new ds.Fila();
    fila63.imprime();
    boolean b65 = fila63.vazia();
    fila63.imprime();
    fila38.enfileira((java.lang.Object)fila63);
    ds.Fila fila68 = new ds.Fila();
    boolean b69 = fila68.vazia();
    fila68.imprime();
    boolean b71 = fila68.vazia();
    fila68.imprime();
    ds.Fila fila73 = new ds.Fila();
    fila73.imprime();
    fila73.enfileira((java.lang.Object)"hi!");
    fila68.enfileira((java.lang.Object)fila73);
    fila63.enfileira((java.lang.Object)fila73);
    fila63.imprime();
    java.lang.Object obj80 = fila63.desenfileira();
    fila14.enfileira((java.lang.Object)fila63);
    java.lang.Object obj82 = fila14.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!"+ "'", obj25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + true+ "'", obj58.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 1+ "'", obj82.equals(1));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test135"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    boolean b14 = fila10.vazia();
    boolean b15 = fila10.vazia();
    boolean b16 = fila10.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test136"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    boolean b19 = fila14.vazia();
    fila10.enfileira((java.lang.Object)b19);
    boolean b21 = fila10.vazia();
    ds.Fila fila22 = new ds.Fila();
    boolean b23 = fila22.vazia();
    fila22.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    boolean b28 = fila25.vazia();
    fila25.enfileira((java.lang.Object)false);
    fila22.enfileira((java.lang.Object)fila25);
    fila10.enfileira((java.lang.Object)fila25);
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    fila33.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj37 = null;
    fila33.enfileira(obj37);
    ds.Fila fila39 = new ds.Fila();
    fila39.imprime();
    boolean b41 = fila39.vazia();
    fila39.imprime();
    fila33.enfileira((java.lang.Object)fila39);
    fila25.enfileira((java.lang.Object)fila33);
    boolean b45 = fila25.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test137"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = new java.lang.Object();
    fila0.enfileira(obj13);
    java.lang.Object obj15 = fila0.desenfileira();
    boolean b16 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    boolean b19 = fila0.vazia();
    java.lang.Object obj20 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test138"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    ds.Fila fila4 = new ds.Fila();
    fila4.imprime();
    boolean b6 = fila4.vazia();
    fila4.imprime();
    boolean b8 = fila4.vazia();
    fila2.enfileira((java.lang.Object)b8);
    java.lang.Object obj10 = null;
    fila2.enfileira(obj10);
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    fila12.imprime();
    fila2.enfileira((java.lang.Object)fila12);
    java.lang.Object obj16 = fila2.desenfileira();
    fila2.enfileira((java.lang.Object)(short)(-1));
    boolean b19 = fila2.vazia();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    fila22.imprime();
    boolean b26 = fila22.vazia();
    fila20.enfileira((java.lang.Object)b26);
    java.lang.Object obj28 = null;
    fila20.enfileira(obj28);
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    fila30.imprime();
    fila20.enfileira((java.lang.Object)fila30);
    java.lang.Object obj34 = fila20.desenfileira();
    fila20.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    fila20.enfileira((java.lang.Object)fila37);
    fila2.enfileira((java.lang.Object)fila37);
    fila0.enfileira((java.lang.Object)fila2);
    fila0.imprime();
    java.lang.Object obj43 = fila0.desenfileira();
    boolean b44 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true+ "'", obj16.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true+ "'", obj34.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test139"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    boolean b6 = fila3.vazia();
    fila3.enfileira((java.lang.Object)false);
    fila0.enfileira((java.lang.Object)fila3);
    fila3.enfileira((java.lang.Object)10.0d);
    fila3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test140"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    fila30.imprime();
    boolean b33 = fila30.vazia();
    fila30.imprime();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)"hi!");
    fila30.enfileira((java.lang.Object)fila35);
    fila25.enfileira((java.lang.Object)fila35);
    fila25.imprime();
    fila25.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test141"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.imprime();
    ds.Fila fila14 = new ds.Fila();
    boolean b15 = fila14.vazia();
    fila14.imprime();
    boolean b17 = fila14.vazia();
    fila14.imprime();
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    fila19.enfileira((java.lang.Object)"hi!");
    fila14.enfileira((java.lang.Object)fila19);
    fila14.imprime();
    fila14.imprime();
    boolean b26 = fila14.vazia();
    fila0.enfileira((java.lang.Object)b26);
    java.lang.Object obj28 = fila0.desenfileira();
    boolean b29 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1+ "'", obj28.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test142"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    boolean b30 = fila25.vazia();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    fila31.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj35 = null;
    fila31.enfileira(obj35);
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    boolean b39 = fila37.vazia();
    fila37.imprime();
    fila31.enfileira((java.lang.Object)fila37);
    fila25.enfileira((java.lang.Object)fila31);
    java.lang.Object obj43 = fila25.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj43);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test143"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = fila15.desenfileira();
    fila8.enfileira(obj19);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila21.enfileira((java.lang.Object)b27);
    fila8.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila8);
    fila8.enfileira((java.lang.Object)'a');
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    boolean b35 = fila33.vazia();
    fila33.imprime();
    fila33.imprime();
    fila33.enfileira((java.lang.Object)1);
    boolean b40 = fila33.vazia();
    java.lang.Object obj41 = fila33.desenfileira();
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    boolean b44 = fila42.vazia();
    boolean b45 = fila42.vazia();
    fila42.enfileira((java.lang.Object)false);
    boolean b48 = fila42.vazia();
    boolean b49 = fila42.vazia();
    fila42.imprime();
    fila33.enfileira((java.lang.Object)fila42);
    fila8.enfileira((java.lang.Object)fila42);
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    boolean b55 = fila53.vazia();
    fila53.imprime();
    fila53.imprime();
    fila53.enfileira((java.lang.Object)1);
    boolean b60 = fila53.vazia();
    ds.Fila fila61 = new ds.Fila();
    fila61.enfileira((java.lang.Object)(byte)1);
    fila61.imprime();
    fila53.enfileira((java.lang.Object)fila61);
    fila53.imprime();
    fila8.enfileira((java.lang.Object)fila53);
    java.lang.Object obj68 = fila53.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1+ "'", obj41.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 1+ "'", obj68.equals(1));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test144"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    boolean b11 = fila6.vazia();
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    fila12.enfileira((java.lang.Object)"hi!");
    boolean b16 = fila12.vazia();
    fila12.enfileira((java.lang.Object)1.0d);
    fila12.imprime();
    fila6.enfileira((java.lang.Object)fila12);
    java.lang.Object obj21 = fila6.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test145"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    fila10.imprime();
    fila10.enfileira((java.lang.Object)1);
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj21 = fila17.desenfileira();
    fila10.enfileira(obj21);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    boolean b29 = fila25.vazia();
    fila23.enfileira((java.lang.Object)b29);
    fila10.enfileira((java.lang.Object)fila23);
    fila10.imprime();
    java.lang.Object obj33 = fila10.desenfileira();
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    boolean b36 = fila34.vazia();
    fila34.imprime();
    fila34.imprime();
    fila34.enfileira((java.lang.Object)1);
    boolean b41 = fila34.vazia();
    java.lang.Object obj42 = fila34.desenfileira();
    ds.Fila fila43 = new ds.Fila();
    fila43.imprime();
    boolean b45 = fila43.vazia();
    boolean b46 = fila43.vazia();
    fila43.enfileira((java.lang.Object)false);
    boolean b49 = fila43.vazia();
    boolean b50 = fila43.vazia();
    fila43.imprime();
    fila34.enfileira((java.lang.Object)fila43);
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    boolean b55 = fila53.vazia();
    fila53.imprime();
    fila53.imprime();
    fila53.enfileira((java.lang.Object)1);
    java.lang.Object obj60 = fila53.desenfileira();
    boolean b61 = fila53.vazia();
    fila34.enfileira((java.lang.Object)fila53);
    fila10.enfileira((java.lang.Object)fila53);
    fila0.enfileira((java.lang.Object)fila53);
    ds.Fila fila65 = new ds.Fila();
    boolean b66 = fila65.vazia();
    fila65.imprime();
    boolean b68 = fila65.vazia();
    fila65.imprime();
    ds.Fila fila70 = new ds.Fila();
    fila70.imprime();
    fila70.enfileira((java.lang.Object)"hi!");
    fila65.enfileira((java.lang.Object)fila70);
    ds.Fila fila75 = new ds.Fila();
    fila75.imprime();
    boolean b77 = fila75.vazia();
    fila75.imprime();
    boolean b79 = fila75.vazia();
    fila75.imprime();
    fila65.enfileira((java.lang.Object)fila75);
    java.lang.Object obj82 = fila65.desenfileira();
    fila53.enfileira((java.lang.Object)fila65);
    boolean b84 = fila53.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!"+ "'", obj21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1+ "'", obj33.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1+ "'", obj42.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1+ "'", obj60.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test146"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)1);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj17 = fila13.desenfileira();
    fila6.enfileira(obj17);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila19.enfileira((java.lang.Object)b25);
    fila6.enfileira((java.lang.Object)fila19);
    fila0.enfileira((java.lang.Object)fila19);
    fila19.enfileira((java.lang.Object)(-1L));
    fila19.imprime();
    fila19.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!"+ "'", obj17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test147"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    boolean b17 = fila0.vazia();
    java.lang.Object obj18 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test148"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila9 = new ds.Fila();
    boolean b10 = fila9.vazia();
    fila9.imprime();
    boolean b12 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj15 = fila9.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test149"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    fila3.imprime();
    fila3.enfileira((java.lang.Object)1);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    fila10.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj14 = fila10.desenfileira();
    fila3.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    boolean b20 = fila18.vazia();
    fila18.imprime();
    boolean b22 = fila18.vazia();
    fila16.enfileira((java.lang.Object)b22);
    fila3.enfileira((java.lang.Object)fila16);
    fila16.imprime();
    fila0.enfileira((java.lang.Object)fila16);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "hi!"+ "'", obj14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test150"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)1);
    boolean b22 = fila15.vazia();
    java.lang.Object obj23 = fila15.desenfileira();
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    fila24.enfileira((java.lang.Object)false);
    boolean b30 = fila24.vazia();
    boolean b31 = fila24.vazia();
    fila24.imprime();
    fila15.enfileira((java.lang.Object)fila24);
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    boolean b36 = fila34.vazia();
    fila34.imprime();
    fila34.imprime();
    fila34.enfileira((java.lang.Object)1);
    java.lang.Object obj41 = fila34.desenfileira();
    boolean b42 = fila34.vazia();
    fila15.enfileira((java.lang.Object)fila34);
    fila15.imprime();
    fila0.enfileira((java.lang.Object)fila15);
    fila15.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1+ "'", obj23.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1+ "'", obj41.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test151"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    ds.Fila fila4 = new ds.Fila();
    fila4.imprime();
    boolean b6 = fila4.vazia();
    fila4.imprime();
    boolean b8 = fila4.vazia();
    fila2.enfileira((java.lang.Object)b8);
    java.lang.Object obj10 = null;
    fila2.enfileira(obj10);
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    fila12.imprime();
    fila2.enfileira((java.lang.Object)fila12);
    java.lang.Object obj16 = fila2.desenfileira();
    fila2.enfileira((java.lang.Object)(short)(-1));
    boolean b19 = fila2.vazia();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    fila22.imprime();
    boolean b26 = fila22.vazia();
    fila20.enfileira((java.lang.Object)b26);
    java.lang.Object obj28 = null;
    fila20.enfileira(obj28);
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    fila30.imprime();
    fila20.enfileira((java.lang.Object)fila30);
    java.lang.Object obj34 = fila20.desenfileira();
    fila20.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    fila20.enfileira((java.lang.Object)fila37);
    fila2.enfileira((java.lang.Object)fila37);
    fila0.enfileira((java.lang.Object)fila2);
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true+ "'", obj16.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true+ "'", obj34.equals(true));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test152"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    java.lang.Object obj10 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj11 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test153"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    fila13.imprime();
    boolean b23 = fila13.vazia();
    boolean b24 = fila13.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test154"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    boolean b6 = fila3.vazia();
    fila3.enfileira((java.lang.Object)false);
    fila0.enfileira((java.lang.Object)fila3);
    java.lang.Object obj10 = fila0.desenfileira();
    fila0.imprime();
    boolean b12 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test155"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    boolean b12 = fila9.vazia();
    fila9.enfileira((java.lang.Object)false);
    boolean b15 = fila9.vazia();
    boolean b16 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    ds.Fila fila19 = new ds.Fila();
    boolean b20 = fila19.vazia();
    fila19.imprime();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    boolean b25 = fila22.vazia();
    fila22.enfileira((java.lang.Object)false);
    fila19.enfileira((java.lang.Object)fila22);
    java.lang.Object obj29 = fila19.desenfileira();
    fila19.imprime();
    fila0.enfileira((java.lang.Object)fila19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test156"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)1);
    boolean b28 = fila21.vazia();
    java.lang.Object obj29 = fila21.desenfileira();
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    boolean b32 = fila30.vazia();
    boolean b33 = fila30.vazia();
    fila30.enfileira((java.lang.Object)false);
    boolean b36 = fila30.vazia();
    boolean b37 = fila30.vazia();
    fila30.imprime();
    fila21.enfileira((java.lang.Object)fila30);
    ds.Fila fila40 = new ds.Fila();
    fila40.imprime();
    boolean b42 = fila40.vazia();
    fila40.imprime();
    fila40.imprime();
    fila40.enfileira((java.lang.Object)1);
    java.lang.Object obj47 = fila40.desenfileira();
    boolean b48 = fila40.vazia();
    fila21.enfileira((java.lang.Object)fila40);
    fila21.imprime();
    fila6.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila6);
    boolean b53 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1+ "'", obj29.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1+ "'", obj47.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test157"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    boolean b7 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test158"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    fila3.imprime();
    fila3.enfileira((java.lang.Object)1);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    fila10.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj14 = fila10.desenfileira();
    fila3.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    boolean b20 = fila18.vazia();
    fila18.imprime();
    boolean b22 = fila18.vazia();
    fila16.enfileira((java.lang.Object)b22);
    fila3.enfileira((java.lang.Object)fila16);
    fila16.imprime();
    fila0.enfileira((java.lang.Object)fila16);
    ds.Fila fila27 = new ds.Fila();
    fila27.enfileira((java.lang.Object)(byte)1);
    fila27.imprime();
    boolean b31 = fila27.vazia();
    fila0.enfileira((java.lang.Object)fila27);
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "hi!"+ "'", obj14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test159"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    ds.Fila fila9 = new ds.Fila();
    boolean b10 = fila9.vazia();
    fila9.imprime();
    boolean b12 = fila9.vazia();
    fila9.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)"hi!");
    fila9.enfileira((java.lang.Object)fila14);
    boolean b19 = fila14.vazia();
    fila0.enfileira((java.lang.Object)fila14);
    ds.Fila fila21 = new ds.Fila();
    boolean b22 = fila21.vazia();
    fila21.imprime();
    boolean b24 = fila21.vazia();
    fila21.imprime();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    fila26.enfileira((java.lang.Object)"hi!");
    fila21.enfileira((java.lang.Object)fila26);
    boolean b31 = fila26.vazia();
    fila26.imprime();
    fila26.imprime();
    java.lang.Object obj34 = null;
    fila26.enfileira(obj34);
    fila14.enfileira(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test160"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)fila7);
    fila0.imprime();
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.imprime();
    boolean b16 = fila0.vazia();
    boolean b17 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short)0+ "'", obj14.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test161"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)(short)0);
    fila7.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)1);
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    fila22.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj26 = fila22.desenfileira();
    fila15.enfileira(obj26);
    ds.Fila fila28 = new ds.Fila();
    fila28.imprime();
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    boolean b32 = fila30.vazia();
    fila30.imprime();
    boolean b34 = fila30.vazia();
    fila28.enfileira((java.lang.Object)b34);
    fila15.enfileira((java.lang.Object)fila28);
    fila7.enfileira((java.lang.Object)fila15);
    boolean b38 = fila7.vazia();
    ds.Fila fila39 = new ds.Fila();
    boolean b40 = fila39.vazia();
    fila39.imprime();
    boolean b42 = fila39.vazia();
    fila39.imprime();
    ds.Fila fila44 = new ds.Fila();
    fila44.imprime();
    fila44.enfileira((java.lang.Object)"hi!");
    fila39.enfileira((java.lang.Object)fila44);
    ds.Fila fila49 = new ds.Fila();
    fila49.imprime();
    boolean b51 = fila49.vazia();
    fila49.imprime();
    boolean b53 = fila49.vazia();
    fila49.imprime();
    fila39.enfileira((java.lang.Object)fila49);
    fila49.enfileira((java.lang.Object)(-1.0d));
    java.lang.Object obj58 = fila49.desenfileira();
    fila7.enfileira((java.lang.Object)fila49);
    fila0.enfileira((java.lang.Object)fila49);
    boolean b61 = fila49.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "hi!"+ "'", obj26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (-1.0d)+ "'", obj58.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test162"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    fila30.imprime();
    boolean b33 = fila30.vazia();
    fila30.imprime();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)"hi!");
    fila30.enfileira((java.lang.Object)fila35);
    fila25.enfileira((java.lang.Object)fila35);
    fila25.imprime();
    java.lang.Object obj42 = fila25.desenfileira();
    ds.Fila fila43 = new ds.Fila();
    fila43.imprime();
    boolean b45 = fila43.vazia();
    fila43.imprime();
    fila43.imprime();
    fila43.imprime();
    fila43.imprime();
    ds.Fila fila50 = new ds.Fila();
    fila50.imprime();
    boolean b52 = fila50.vazia();
    fila50.imprime();
    boolean b54 = fila50.vazia();
    fila43.enfileira((java.lang.Object)b54);
    java.lang.Object obj56 = new java.lang.Object();
    fila43.enfileira(obj56);
    java.lang.Object obj58 = fila43.desenfileira();
    fila43.imprime();
    fila25.enfileira((java.lang.Object)fila43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + true+ "'", obj58.equals(true));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test163"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)fila7);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    boolean b15 = fila13.vazia();
    fila13.imprime();
    boolean b17 = fila13.vazia();
    fila13.imprime();
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    boolean b21 = fila19.vazia();
    fila19.imprime();
    fila19.imprime();
    fila19.enfileira((java.lang.Object)1);
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    fila26.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj30 = fila26.desenfileira();
    fila19.enfileira(obj30);
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    boolean b36 = fila34.vazia();
    fila34.imprime();
    boolean b38 = fila34.vazia();
    fila32.enfileira((java.lang.Object)b38);
    fila19.enfileira((java.lang.Object)fila32);
    fila13.enfileira((java.lang.Object)fila32);
    boolean b42 = fila32.vazia();
    java.lang.Object obj43 = fila32.desenfileira();
    fila0.enfileira(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "hi!"+ "'", obj30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + true+ "'", obj43.equals(true));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test164"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = new java.lang.Object();
    fila0.enfileira(obj13);
    java.lang.Object obj15 = fila0.desenfileira();
    boolean b16 = fila0.vazia();
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)1);
    boolean b24 = fila17.vazia();
    ds.Fila fila25 = new ds.Fila();
    fila25.enfileira((java.lang.Object)(byte)1);
    fila25.imprime();
    fila17.enfileira((java.lang.Object)fila25);
    fila0.enfileira((java.lang.Object)fila17);
    java.lang.Object obj31 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test165"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    boolean b11 = fila6.vazia();
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    fila12.enfileira((java.lang.Object)"hi!");
    boolean b16 = fila12.vazia();
    fila12.enfileira((java.lang.Object)1.0d);
    fila12.imprime();
    fila6.enfileira((java.lang.Object)fila12);
    boolean b21 = fila6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test166"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = null;
    fila15.enfileira(obj19);
    fila15.enfileira((java.lang.Object)10);
    fila0.enfileira((java.lang.Object)fila15);
    boolean b24 = fila15.vazia();
    java.lang.Object obj25 = fila15.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!"+ "'", obj25.equals("hi!"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test167"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.enfileira((java.lang.Object)false);
    boolean b6 = fila0.vazia();
    java.lang.Object obj7 = fila0.desenfileira();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj12 = null;
    fila8.enfileira(obj12);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila8.enfileira((java.lang.Object)fila14);
    boolean b19 = fila14.vazia();
    fila0.enfileira((java.lang.Object)fila14);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)1);
    ds.Fila fila28 = new ds.Fila();
    fila28.imprime();
    fila28.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj32 = fila28.desenfileira();
    fila21.enfileira(obj32);
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    ds.Fila fila36 = new ds.Fila();
    fila36.imprime();
    boolean b38 = fila36.vazia();
    fila36.imprime();
    boolean b40 = fila36.vazia();
    fila34.enfileira((java.lang.Object)b40);
    fila21.enfileira((java.lang.Object)fila34);
    boolean b43 = fila34.vazia();
    fila34.imprime();
    fila14.enfileira((java.lang.Object)fila34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false+ "'", obj7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!"+ "'", obj32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test168"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100);
    boolean b8 = fila0.vazia();
    boolean b9 = fila0.vazia();
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    boolean b14 = fila10.vazia();
    fila10.imprime();
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    boolean b18 = fila16.vazia();
    fila16.imprime();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)1);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj27 = fila23.desenfileira();
    fila16.enfileira(obj27);
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    boolean b35 = fila31.vazia();
    fila29.enfileira((java.lang.Object)b35);
    fila16.enfileira((java.lang.Object)fila29);
    fila10.enfileira((java.lang.Object)fila29);
    boolean b39 = fila29.vazia();
    fila0.enfileira((java.lang.Object)b39);
    boolean b41 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!"+ "'", obj27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test169"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila4 = new ds.Fila();
    fila4.imprime();
    boolean b6 = fila4.vazia();
    fila4.imprime();
    fila4.imprime();
    fila4.imprime();
    fila4.enfileira((java.lang.Object)100);
    boolean b12 = fila4.vazia();
    boolean b13 = fila4.vazia();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    boolean b18 = fila14.vazia();
    fila14.imprime();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    boolean b22 = fila20.vazia();
    fila20.imprime();
    fila20.imprime();
    fila20.enfileira((java.lang.Object)1);
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    fila27.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj31 = fila27.desenfileira();
    fila20.enfileira(obj31);
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    boolean b37 = fila35.vazia();
    fila35.imprime();
    boolean b39 = fila35.vazia();
    fila33.enfileira((java.lang.Object)b39);
    fila20.enfileira((java.lang.Object)fila33);
    fila14.enfileira((java.lang.Object)fila33);
    boolean b43 = fila33.vazia();
    fila4.enfileira((java.lang.Object)b43);
    fila0.enfileira((java.lang.Object)b43);
    java.lang.Object obj46 = fila0.desenfileira();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!"+ "'", obj31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false+ "'", obj46.equals(false));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test170"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test171"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    fila0.imprime();
    fila0.imprime();

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test172"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)1);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj17 = fila13.desenfileira();
    fila6.enfileira(obj17);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila19.enfileira((java.lang.Object)b25);
    fila6.enfileira((java.lang.Object)fila19);
    fila0.enfileira((java.lang.Object)fila19);
    java.lang.Object obj29 = fila19.desenfileira();
    fila19.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!"+ "'", obj17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + true+ "'", obj29.equals(true));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test173"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    java.lang.Object obj10 = fila0.desenfileira();
    java.lang.Object obj11 = new java.lang.Object();
    fila0.enfileira(obj11);
    boolean b13 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test174"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    boolean b17 = fila0.vazia();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    boolean b22 = fila20.vazia();
    fila20.imprime();
    boolean b24 = fila20.vazia();
    fila18.enfileira((java.lang.Object)b24);
    java.lang.Object obj26 = null;
    fila18.enfileira(obj26);
    ds.Fila fila28 = new ds.Fila();
    boolean b29 = fila28.vazia();
    fila28.imprime();
    fila18.enfileira((java.lang.Object)fila28);
    java.lang.Object obj32 = fila18.desenfileira();
    fila18.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila18.enfileira((java.lang.Object)fila35);
    fila0.enfileira((java.lang.Object)fila35);
    boolean b39 = fila35.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + true+ "'", obj32.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test175"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    boolean b4 = fila3.vazia();
    fila3.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    boolean b9 = fila6.vazia();
    fila6.enfileira((java.lang.Object)false);
    fila3.enfileira((java.lang.Object)fila6);
    java.lang.Object obj13 = fila3.desenfileira();
    fila0.enfileira((java.lang.Object)fila3);
    fila3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test176"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = new java.lang.Object();
    fila0.enfileira(obj13);
    java.lang.Object obj15 = fila0.desenfileira();
    boolean b16 = fila0.vazia();
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)1);
    boolean b24 = fila17.vazia();
    ds.Fila fila25 = new ds.Fila();
    fila25.enfileira((java.lang.Object)(byte)1);
    fila25.imprime();
    fila17.enfileira((java.lang.Object)fila25);
    fila0.enfileira((java.lang.Object)fila17);
    boolean b31 = fila17.vazia();
    fila17.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test177"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    boolean b30 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test178"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = fila15.desenfileira();
    fila8.enfileira(obj19);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila21.enfileira((java.lang.Object)b27);
    fila8.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila8);
    fila8.enfileira((java.lang.Object)'a');
    boolean b33 = fila8.vazia();
    java.lang.Object obj34 = fila8.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1+ "'", obj34.equals(1));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test179"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    boolean b10 = fila0.vazia();
    boolean b11 = fila0.vazia();
    boolean b12 = fila0.vazia();
    java.lang.Object obj13 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + true+ "'", obj13.equals(true));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test180"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    fila7.imprime();
    fila7.imprime();
    fila7.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    boolean b18 = fila14.vazia();
    fila7.enfileira((java.lang.Object)b18);
    java.lang.Object obj20 = new java.lang.Object();
    fila7.enfileira(obj20);
    java.lang.Object obj22 = fila7.desenfileira();
    boolean b23 = fila7.vazia();
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    boolean b26 = fila24.vazia();
    fila24.imprime();
    fila24.imprime();
    fila24.enfileira((java.lang.Object)1);
    boolean b31 = fila24.vazia();
    ds.Fila fila32 = new ds.Fila();
    fila32.enfileira((java.lang.Object)(byte)1);
    fila32.imprime();
    fila24.enfileira((java.lang.Object)fila32);
    fila7.enfileira((java.lang.Object)fila24);
    java.lang.Object obj38 = fila7.desenfileira();
    fila0.enfileira((java.lang.Object)fila7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + true+ "'", obj22.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj38);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test181"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.enfileira((java.lang.Object)false);
    boolean b6 = fila0.vazia();
    java.lang.Object obj7 = fila0.desenfileira();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    boolean b15 = fila8.vazia();
    java.lang.Object obj16 = fila8.desenfileira();
    ds.Fila fila17 = new ds.Fila();
    boolean b18 = fila17.vazia();
    fila17.imprime();
    boolean b20 = fila17.vazia();
    fila17.imprime();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    fila22.enfileira((java.lang.Object)"hi!");
    fila17.enfileira((java.lang.Object)fila22);
    boolean b27 = fila22.vazia();
    fila8.enfileira((java.lang.Object)fila22);
    fila0.enfileira((java.lang.Object)fila8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false+ "'", obj7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1+ "'", obj16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test182"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = new java.lang.Object();
    fila0.enfileira(obj13);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test183"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0f);
    fila0.imprime();
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test184"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila4 = new ds.Fila();
    fila4.imprime();
    boolean b6 = fila4.vazia();
    fila4.imprime();
    fila4.imprime();
    fila4.imprime();
    fila4.enfileira((java.lang.Object)100);
    boolean b12 = fila4.vazia();
    boolean b13 = fila4.vazia();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    boolean b18 = fila14.vazia();
    fila14.imprime();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    boolean b22 = fila20.vazia();
    fila20.imprime();
    fila20.imprime();
    fila20.enfileira((java.lang.Object)1);
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    fila27.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj31 = fila27.desenfileira();
    fila20.enfileira(obj31);
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    boolean b37 = fila35.vazia();
    fila35.imprime();
    boolean b39 = fila35.vazia();
    fila33.enfileira((java.lang.Object)b39);
    fila20.enfileira((java.lang.Object)fila33);
    fila14.enfileira((java.lang.Object)fila33);
    boolean b43 = fila33.vazia();
    fila4.enfileira((java.lang.Object)b43);
    fila0.enfileira((java.lang.Object)b43);
    java.lang.Object obj46 = fila0.desenfileira();
    ds.Fila fila47 = new ds.Fila();
    fila47.imprime();
    boolean b49 = fila47.vazia();
    fila47.imprime();
    fila47.imprime();
    fila47.imprime();
    fila47.imprime();
    ds.Fila fila54 = new ds.Fila();
    fila54.imprime();
    boolean b56 = fila54.vazia();
    fila54.imprime();
    boolean b58 = fila54.vazia();
    fila47.enfileira((java.lang.Object)b58);
    java.lang.Object obj60 = new java.lang.Object();
    fila47.enfileira(obj60);
    java.lang.Object obj62 = fila47.desenfileira();
    boolean b63 = fila47.vazia();
    ds.Fila fila64 = new ds.Fila();
    fila64.imprime();
    boolean b66 = fila64.vazia();
    fila64.imprime();
    fila64.imprime();
    fila64.enfileira((java.lang.Object)1);
    boolean b71 = fila64.vazia();
    ds.Fila fila72 = new ds.Fila();
    fila72.enfileira((java.lang.Object)(byte)1);
    fila72.imprime();
    fila64.enfileira((java.lang.Object)fila72);
    fila47.enfileira((java.lang.Object)fila64);
    fila0.enfileira((java.lang.Object)fila64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!"+ "'", obj31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false+ "'", obj46.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj62 + "' != '" + true+ "'", obj62.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test185"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    java.lang.Object obj22 = fila13.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + true+ "'", obj22.equals(true));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test186"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    boolean b22 = fila13.vazia();
    boolean b23 = fila13.vazia();
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    boolean b28 = fila26.vazia();
    fila26.imprime();
    boolean b30 = fila26.vazia();
    fila24.enfileira((java.lang.Object)b30);
    fila24.imprime();
    fila13.enfileira((java.lang.Object)fila24);
    ds.Fila fila34 = new ds.Fila();
    boolean b35 = fila34.vazia();
    fila34.imprime();
    boolean b37 = fila34.vazia();
    fila34.imprime();
    ds.Fila fila39 = new ds.Fila();
    fila39.imprime();
    fila39.enfileira((java.lang.Object)"hi!");
    fila34.enfileira((java.lang.Object)fila39);
    fila34.imprime();
    fila34.imprime();
    boolean b46 = fila34.vazia();
    ds.Fila fila47 = new ds.Fila();
    boolean b48 = fila47.vazia();
    fila47.imprime();
    boolean b50 = fila47.vazia();
    fila47.imprime();
    ds.Fila fila52 = new ds.Fila();
    fila52.imprime();
    fila52.enfileira((java.lang.Object)"hi!");
    fila47.enfileira((java.lang.Object)fila52);
    ds.Fila fila57 = new ds.Fila();
    fila57.imprime();
    boolean b59 = fila57.vazia();
    fila57.imprime();
    boolean b61 = fila57.vazia();
    fila57.imprime();
    fila47.enfileira((java.lang.Object)fila57);
    fila57.enfileira((java.lang.Object)(-1.0d));
    ds.Fila fila66 = new ds.Fila();
    fila66.imprime();
    fila57.enfileira((java.lang.Object)fila66);
    fila34.enfileira((java.lang.Object)fila66);
    fila34.imprime();
    fila13.enfileira((java.lang.Object)fila34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test187"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = fila15.desenfileira();
    fila8.enfileira(obj19);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila21.enfileira((java.lang.Object)b27);
    fila8.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila8);
    java.lang.Object obj31 = fila8.desenfileira();
    boolean b32 = fila8.vazia();
    boolean b33 = fila8.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1+ "'", obj31.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test188"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    boolean b19 = fila14.vazia();
    fila10.enfileira((java.lang.Object)b19);
    boolean b21 = fila10.vazia();
    ds.Fila fila22 = new ds.Fila();
    boolean b23 = fila22.vazia();
    fila22.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    boolean b28 = fila25.vazia();
    fila25.enfileira((java.lang.Object)false);
    fila22.enfileira((java.lang.Object)fila25);
    fila10.enfileira((java.lang.Object)fila25);
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    fila33.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj37 = null;
    fila33.enfileira(obj37);
    ds.Fila fila39 = new ds.Fila();
    fila39.imprime();
    boolean b41 = fila39.vazia();
    fila39.imprime();
    fila33.enfileira((java.lang.Object)fila39);
    fila25.enfileira((java.lang.Object)fila33);
    java.lang.Object obj45 = fila33.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!"+ "'", obj45.equals("hi!"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test189"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    ds.Fila fila22 = new ds.Fila();
    boolean b23 = fila22.vazia();
    fila22.imprime();
    boolean b25 = fila22.vazia();
    fila22.imprime();
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    fila27.enfileira((java.lang.Object)"hi!");
    fila22.enfileira((java.lang.Object)fila27);
    fila22.imprime();
    fila22.imprime();
    java.lang.Object obj34 = fila22.desenfileira();
    fila13.enfileira(obj34);
    fila13.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj34);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test190"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    java.lang.Object obj10 = fila0.desenfileira();
    java.lang.Object obj11 = new java.lang.Object();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    boolean b15 = fila13.vazia();
    fila13.imprime();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)1);
    boolean b20 = fila13.vazia();
    ds.Fila fila21 = new ds.Fila();
    fila21.enfileira((java.lang.Object)(byte)1);
    fila21.imprime();
    fila13.enfileira((java.lang.Object)fila21);
    fila13.enfileira((java.lang.Object)10.0d);
    fila13.enfileira((java.lang.Object)(byte)(-1));
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test191"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    boolean b12 = fila9.vazia();
    fila9.enfileira((java.lang.Object)false);
    boolean b15 = fila9.vazia();
    boolean b16 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    java.lang.Object obj19 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test192"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    fila0.imprime();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    fila9.imprime();
    fila9.imprime();
    fila9.enfileira((java.lang.Object)1);
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj20 = fila16.desenfileira();
    fila9.enfileira(obj20);
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    boolean b26 = fila24.vazia();
    fila24.imprime();
    boolean b28 = fila24.vazia();
    fila22.enfileira((java.lang.Object)b28);
    fila9.enfileira((java.lang.Object)fila22);
    fila9.imprime();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    boolean b34 = fila9.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!"+ "'", obj20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test193"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.enfileira((java.lang.Object)10.0d);
    boolean b15 = fila0.vazia();
    java.lang.Object obj16 = fila0.desenfileira();
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)1);
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    fila24.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj28 = fila24.desenfileira();
    fila17.enfileira(obj28);
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    boolean b34 = fila32.vazia();
    fila32.imprime();
    boolean b36 = fila32.vazia();
    fila30.enfileira((java.lang.Object)b36);
    fila17.enfileira((java.lang.Object)fila30);
    fila0.enfileira((java.lang.Object)fila30);
    boolean b40 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1+ "'", obj16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "hi!"+ "'", obj28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test194"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    java.lang.Object obj10 = fila5.desenfileira();
    fila5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "hi!"+ "'", obj10.equals("hi!"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test195"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.enfileira((java.lang.Object)false);
    boolean b6 = fila0.vazia();
    boolean b7 = fila0.vazia();
    fila0.imprime();
    boolean b9 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test196"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    fila30.imprime();
    boolean b33 = fila30.vazia();
    fila30.imprime();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)"hi!");
    fila30.enfileira((java.lang.Object)fila35);
    fila25.enfileira((java.lang.Object)fila35);
    fila25.imprime();
    java.lang.Object obj42 = fila25.desenfileira();
    fila25.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj42);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test197"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    boolean b11 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test198"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    boolean b6 = fila0.vazia();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    fila7.enfileira((java.lang.Object)false);
    boolean b13 = fila7.vazia();
    fila7.imprime();
    fila0.enfileira((java.lang.Object)fila7);
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    boolean b18 = fila16.vazia();
    fila16.imprime();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)1);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj27 = fila23.desenfileira();
    fila16.enfileira(obj27);
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    boolean b35 = fila31.vazia();
    fila29.enfileira((java.lang.Object)b35);
    fila16.enfileira((java.lang.Object)fila29);
    boolean b38 = fila29.vazia();
    boolean b39 = fila29.vazia();
    java.lang.Object obj40 = fila29.desenfileira();
    fila0.enfileira((java.lang.Object)fila29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!"+ "'", obj27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj40 + "' != '" + true+ "'", obj40.equals(true));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test199"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)1);
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test200"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = null;
    fila15.enfileira(obj19);
    fila15.enfileira((java.lang.Object)10);
    fila0.enfileira((java.lang.Object)fila15);
    boolean b24 = fila15.vazia();
    boolean b25 = fila15.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test201"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    boolean b10 = fila5.vazia();
    boolean b11 = fila5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test202"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test203"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)(short)0);
    fila8.imprime();
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    boolean b18 = fila16.vazia();
    fila16.imprime();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)1);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj27 = fila23.desenfileira();
    fila16.enfileira(obj27);
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    boolean b35 = fila31.vazia();
    fila29.enfileira((java.lang.Object)b35);
    fila16.enfileira((java.lang.Object)fila29);
    fila8.enfileira((java.lang.Object)fila16);
    fila16.enfileira((java.lang.Object)'a');
    ds.Fila fila41 = new ds.Fila();
    fila41.imprime();
    boolean b43 = fila41.vazia();
    fila41.imprime();
    fila41.imprime();
    fila41.enfileira((java.lang.Object)1);
    boolean b48 = fila41.vazia();
    java.lang.Object obj49 = fila41.desenfileira();
    ds.Fila fila50 = new ds.Fila();
    fila50.imprime();
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    fila50.enfileira((java.lang.Object)false);
    boolean b56 = fila50.vazia();
    boolean b57 = fila50.vazia();
    fila50.imprime();
    fila41.enfileira((java.lang.Object)fila50);
    fila16.enfileira((java.lang.Object)fila50);
    fila0.enfileira((java.lang.Object)fila16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!"+ "'", obj27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1+ "'", obj49.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test204"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    fila13.imprime();
    fila13.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test205"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100);
    boolean b8 = fila0.vazia();
    boolean b9 = fila0.vazia();
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    fila10.imprime();
    fila10.enfileira((java.lang.Object)1);
    boolean b17 = fila10.vazia();
    ds.Fila fila18 = new ds.Fila();
    fila18.enfileira((java.lang.Object)(byte)1);
    fila18.imprime();
    fila10.enfileira((java.lang.Object)fila18);
    fila10.enfileira((java.lang.Object)10.0d);
    fila10.enfileira((java.lang.Object)(byte)(-1));
    boolean b27 = fila10.vazia();
    fila10.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    fila29.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj33 = null;
    fila29.enfileira(obj33);
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    boolean b37 = fila35.vazia();
    fila35.imprime();
    fila29.enfileira((java.lang.Object)fila35);
    boolean b40 = fila35.vazia();
    ds.Fila fila41 = new ds.Fila();
    fila41.imprime();
    fila41.enfileira((java.lang.Object)"hi!");
    boolean b45 = fila41.vazia();
    fila41.enfileira((java.lang.Object)1.0d);
    fila41.imprime();
    fila35.enfileira((java.lang.Object)fila41);
    fila10.enfileira((java.lang.Object)fila35);
    java.lang.Object obj51 = fila10.desenfileira();
    fila0.enfileira(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 1+ "'", obj51.equals(1));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test206"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = new java.lang.Object();
    fila0.enfileira(obj13);
    java.lang.Object obj15 = fila0.desenfileira();
    boolean b16 = fila0.vazia();
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)1);
    boolean b24 = fila17.vazia();
    ds.Fila fila25 = new ds.Fila();
    fila25.enfileira((java.lang.Object)(byte)1);
    fila25.imprime();
    fila17.enfileira((java.lang.Object)fila25);
    fila0.enfileira((java.lang.Object)fila17);
    java.lang.Object obj31 = fila0.desenfileira();
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    boolean b34 = fila32.vazia();
    fila32.imprime();
    fila32.imprime();
    fila32.enfileira((java.lang.Object)1);
    ds.Fila fila39 = new ds.Fila();
    fila39.imprime();
    fila39.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj43 = fila39.desenfileira();
    fila32.enfileira(obj43);
    ds.Fila fila45 = new ds.Fila();
    fila45.imprime();
    boolean b47 = fila45.vazia();
    fila45.imprime();
    boolean b49 = fila45.vazia();
    fila32.enfileira((java.lang.Object)fila45);
    fila0.enfileira((java.lang.Object)fila32);
    boolean b52 = fila0.vazia();
    java.lang.Object obj53 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!"+ "'", obj43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj53);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test207"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)1);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj17 = fila13.desenfileira();
    fila6.enfileira(obj17);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila19.enfileira((java.lang.Object)b25);
    fila6.enfileira((java.lang.Object)fila19);
    fila0.enfileira((java.lang.Object)fila19);
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!"+ "'", obj17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test208"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    boolean b7 = fila5.vazia();
    fila5.imprime();
    boolean b9 = fila5.vazia();
    fila5.imprime();
    ds.Fila fila11 = new ds.Fila();
    fila11.imprime();
    boolean b13 = fila11.vazia();
    fila11.imprime();
    fila11.imprime();
    fila11.enfileira((java.lang.Object)1);
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj22 = fila18.desenfileira();
    fila11.enfileira(obj22);
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    boolean b28 = fila26.vazia();
    fila26.imprime();
    boolean b30 = fila26.vazia();
    fila24.enfileira((java.lang.Object)b30);
    fila11.enfileira((java.lang.Object)fila24);
    fila5.enfileira((java.lang.Object)fila24);
    java.lang.Object obj34 = fila24.desenfileira();
    fila0.enfileira(obj34);
    fila0.imprime();
    java.lang.Object obj37 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!"+ "'", obj22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true+ "'", obj34.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj37 + "' != '" + true+ "'", obj37.equals(true));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test209"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    boolean b30 = fila25.vazia();
    boolean b31 = fila25.vazia();
    boolean b32 = fila25.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test210"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test211"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    java.lang.Object obj22 = fila0.desenfileira();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1+ "'", obj22.equals(1));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test212"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    boolean b6 = fila0.vazia();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    fila7.enfileira((java.lang.Object)false);
    boolean b13 = fila7.vazia();
    fila7.imprime();
    fila0.enfileira((java.lang.Object)fila7);
    boolean b16 = fila7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test213"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila8.imprime();
    fila8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test214"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)1);
    fila0.imprime();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    java.lang.Object obj6 = fila0.desenfileira();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    fila9.imprime();
    boolean b13 = fila9.vazia();
    fila7.enfileira((java.lang.Object)b13);
    java.lang.Object obj15 = null;
    fila7.enfileira(obj15);
    ds.Fila fila17 = new ds.Fila();
    boolean b18 = fila17.vazia();
    fila17.imprime();
    fila7.enfileira((java.lang.Object)fila17);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    fila21.imprime();
    boolean b26 = fila21.vazia();
    fila17.enfileira((java.lang.Object)b26);
    boolean b28 = fila17.vazia();
    ds.Fila fila29 = new ds.Fila();
    boolean b30 = fila29.vazia();
    fila29.imprime();
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    boolean b34 = fila32.vazia();
    boolean b35 = fila32.vazia();
    fila32.enfileira((java.lang.Object)false);
    fila29.enfileira((java.lang.Object)fila32);
    fila17.enfileira((java.lang.Object)fila32);
    ds.Fila fila40 = new ds.Fila();
    fila40.imprime();
    fila40.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj44 = null;
    fila40.enfileira(obj44);
    ds.Fila fila46 = new ds.Fila();
    fila46.imprime();
    boolean b48 = fila46.vazia();
    fila46.imprime();
    fila40.enfileira((java.lang.Object)fila46);
    fila32.enfileira((java.lang.Object)fila40);
    fila0.enfileira((java.lang.Object)fila32);
    boolean b53 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte)1+ "'", obj6.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test215"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    ds.Fila fila4 = new ds.Fila();
    fila4.imprime();
    boolean b6 = fila4.vazia();
    fila4.imprime();
    boolean b8 = fila4.vazia();
    fila2.enfileira((java.lang.Object)b8);
    java.lang.Object obj10 = null;
    fila2.enfileira(obj10);
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    fila12.imprime();
    fila2.enfileira((java.lang.Object)fila12);
    java.lang.Object obj16 = fila2.desenfileira();
    fila2.enfileira((java.lang.Object)(short)(-1));
    boolean b19 = fila2.vazia();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    fila22.imprime();
    boolean b26 = fila22.vazia();
    fila20.enfileira((java.lang.Object)b26);
    java.lang.Object obj28 = null;
    fila20.enfileira(obj28);
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    fila30.imprime();
    fila20.enfileira((java.lang.Object)fila30);
    java.lang.Object obj34 = fila20.desenfileira();
    fila20.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    fila20.enfileira((java.lang.Object)fila37);
    fila2.enfileira((java.lang.Object)fila37);
    fila0.enfileira((java.lang.Object)fila2);
    fila0.imprime();
    java.lang.Object obj43 = fila0.desenfileira();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj45 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true+ "'", obj16.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true+ "'", obj34.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj43);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test216"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = new java.lang.Object();
    fila0.enfileira(obj13);
    java.lang.Object obj15 = fila0.desenfileira();
    boolean b16 = fila0.vazia();
    fila0.imprime();
    java.lang.Object obj18 = fila0.desenfileira();
    fila0.imprime();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    boolean b22 = fila20.vazia();
    fila20.imprime();
    fila20.imprime();
    fila20.enfileira((java.lang.Object)1);
    boolean b27 = fila20.vazia();
    ds.Fila fila28 = new ds.Fila();
    fila28.enfileira((java.lang.Object)(byte)1);
    fila28.imprime();
    fila20.enfileira((java.lang.Object)fila28);
    fila20.enfileira((java.lang.Object)10.0d);
    boolean b35 = fila20.vazia();
    java.lang.Object obj36 = fila20.desenfileira();
    fila20.imprime();
    fila0.enfileira((java.lang.Object)fila20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1+ "'", obj36.equals(1));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test217"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.imprime();
    fila6.imprime();
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    boolean b15 = fila13.vazia();
    fila13.imprime();
    boolean b17 = fila13.vazia();
    fila6.enfileira((java.lang.Object)b17);
    java.lang.Object obj19 = new java.lang.Object();
    fila6.enfileira(obj19);
    fila0.enfileira(obj19);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test218"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    boolean b12 = fila9.vazia();
    fila9.enfileira((java.lang.Object)false);
    boolean b15 = fila9.vazia();
    boolean b16 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    boolean b21 = fila19.vazia();
    fila19.imprime();
    fila19.imprime();
    fila19.enfileira((java.lang.Object)1);
    java.lang.Object obj26 = fila19.desenfileira();
    boolean b27 = fila19.vazia();
    fila0.enfileira((java.lang.Object)fila19);
    java.lang.Object obj29 = fila0.desenfileira();
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    boolean b32 = fila30.vazia();
    fila30.imprime();
    fila30.imprime();
    fila30.imprime();
    fila30.enfileira((java.lang.Object)100);
    boolean b38 = fila30.vazia();
    fila30.imprime();
    fila0.enfileira((java.lang.Object)fila30);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1+ "'", obj26.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test219"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    boolean b29 = fila27.vazia();
    fila27.imprime();
    boolean b31 = fila27.vazia();
    fila25.enfileira((java.lang.Object)b31);
    java.lang.Object obj33 = null;
    fila25.enfileira(obj33);
    java.lang.Object obj35 = fila25.desenfileira();
    boolean b36 = fila25.vazia();
    fila0.enfileira((java.lang.Object)b36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj35 + "' != '" + true+ "'", obj35.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test220"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    fila0.imprime();
    fila0.imprime();
    boolean b12 = fila0.vazia();
    ds.Fila fila13 = new ds.Fila();
    boolean b14 = fila13.vazia();
    fila13.imprime();
    boolean b16 = fila13.vazia();
    fila13.imprime();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.enfileira((java.lang.Object)"hi!");
    fila13.enfileira((java.lang.Object)fila18);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila23.imprime();
    fila13.enfileira((java.lang.Object)fila23);
    fila23.enfileira((java.lang.Object)(-1.0d));
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    fila23.enfileira((java.lang.Object)fila32);
    fila0.enfileira((java.lang.Object)fila32);
    fila32.imprime();
    fila32.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test221"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj9 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short)0+ "'", obj8.equals((short)0));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test222"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0f);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)(short)0);
    fila8.imprime();
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    boolean b18 = fila16.vazia();
    fila16.imprime();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)1);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj27 = fila23.desenfileira();
    fila16.enfileira(obj27);
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    boolean b35 = fila31.vazia();
    fila29.enfileira((java.lang.Object)b35);
    fila16.enfileira((java.lang.Object)fila29);
    fila8.enfileira((java.lang.Object)fila16);
    fila16.enfileira((java.lang.Object)'a');
    ds.Fila fila41 = new ds.Fila();
    fila41.imprime();
    boolean b43 = fila41.vazia();
    fila41.imprime();
    fila41.imprime();
    fila41.enfileira((java.lang.Object)1);
    boolean b48 = fila41.vazia();
    java.lang.Object obj49 = fila41.desenfileira();
    ds.Fila fila50 = new ds.Fila();
    fila50.imprime();
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    fila50.enfileira((java.lang.Object)false);
    boolean b56 = fila50.vazia();
    boolean b57 = fila50.vazia();
    fila50.imprime();
    fila41.enfileira((java.lang.Object)fila50);
    fila16.enfileira((java.lang.Object)fila50);
    ds.Fila fila61 = new ds.Fila();
    fila61.imprime();
    boolean b63 = fila61.vazia();
    fila61.imprime();
    fila61.imprime();
    fila61.enfileira((java.lang.Object)1);
    boolean b68 = fila61.vazia();
    ds.Fila fila69 = new ds.Fila();
    fila69.enfileira((java.lang.Object)(byte)1);
    fila69.imprime();
    fila61.enfileira((java.lang.Object)fila69);
    fila61.imprime();
    fila16.enfileira((java.lang.Object)fila61);
    fila0.enfileira((java.lang.Object)fila16);
    boolean b77 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!"+ "'", obj27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1+ "'", obj49.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test223"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    boolean b22 = fila13.vazia();
    boolean b23 = fila13.vazia();
    java.lang.Object obj24 = fila13.desenfileira();
    boolean b25 = fila13.vazia();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    boolean b28 = fila26.vazia();
    fila26.imprime();
    fila26.imprime();
    fila26.enfileira((java.lang.Object)1);
    boolean b33 = fila26.vazia();
    java.lang.Object obj34 = fila26.desenfileira();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    boolean b37 = fila35.vazia();
    boolean b38 = fila35.vazia();
    fila35.enfileira((java.lang.Object)false);
    boolean b41 = fila35.vazia();
    boolean b42 = fila35.vazia();
    fila35.imprime();
    fila26.enfileira((java.lang.Object)fila35);
    ds.Fila fila45 = new ds.Fila();
    fila45.imprime();
    boolean b47 = fila45.vazia();
    fila45.imprime();
    fila45.imprime();
    fila45.enfileira((java.lang.Object)(short)0);
    ds.Fila fila52 = new ds.Fila();
    fila52.imprime();
    fila52.enfileira((java.lang.Object)"hi!");
    boolean b56 = fila52.vazia();
    fila45.enfileira((java.lang.Object)fila52);
    boolean b58 = fila45.vazia();
    fila26.enfileira((java.lang.Object)b58);
    fila13.enfileira((java.lang.Object)b58);
    boolean b61 = fila13.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + true+ "'", obj24.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1+ "'", obj34.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test224"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    boolean b6 = fila0.vazia();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj8 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test225"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    boolean b22 = fila13.vazia();
    fila13.imprime();
    java.lang.Object obj24 = fila13.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + true+ "'", obj24.equals(true));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test226"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    boolean b10 = fila5.vazia();
    fila5.imprime();
    fila5.imprime();
    java.lang.Object obj13 = null;
    fila5.enfileira(obj13);
    boolean b15 = fila5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test227"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0f);
    java.lang.Object obj7 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0f+ "'", obj7.equals(10.0f));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test228"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    boolean b12 = fila9.vazia();
    fila9.enfileira((java.lang.Object)false);
    boolean b15 = fila9.vazia();
    boolean b16 = fila9.vazia();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    boolean b19 = fila9.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test229"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = new java.lang.Object();
    fila0.enfileira(obj13);
    java.lang.Object obj15 = fila0.desenfileira();
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj20 = fila16.desenfileira();
    fila16.enfileira((java.lang.Object)10.0f);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)1);
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    fila30.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj34 = fila30.desenfileira();
    fila23.enfileira(obj34);
    ds.Fila fila36 = new ds.Fila();
    fila36.imprime();
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    boolean b40 = fila38.vazia();
    fila38.imprime();
    boolean b42 = fila38.vazia();
    fila36.enfileira((java.lang.Object)b42);
    fila23.enfileira((java.lang.Object)fila36);
    fila16.enfileira((java.lang.Object)fila23);
    fila0.enfileira((java.lang.Object)fila23);
    ds.Fila fila47 = new ds.Fila();
    fila47.imprime();
    boolean b49 = fila47.vazia();
    boolean b50 = fila47.vazia();
    fila0.enfileira((java.lang.Object)b50);
    java.lang.Object obj52 = null;
    fila0.enfileira(obj52);
    ds.Fila fila54 = new ds.Fila();
    fila54.imprime();
    fila54.enfileira((java.lang.Object)"hi!");
    boolean b58 = fila54.vazia();
    java.lang.Object obj59 = fila54.desenfileira();
    boolean b60 = fila54.vazia();
    fila0.enfileira((java.lang.Object)b60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!"+ "'", obj20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!"+ "'", obj34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "hi!"+ "'", obj59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test230"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = fila15.desenfileira();
    fila8.enfileira(obj19);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila21.enfileira((java.lang.Object)b27);
    fila8.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila8);
    fila8.enfileira((java.lang.Object)'a');
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    boolean b35 = fila33.vazia();
    fila33.imprime();
    fila33.imprime();
    fila33.enfileira((java.lang.Object)1);
    boolean b40 = fila33.vazia();
    java.lang.Object obj41 = fila33.desenfileira();
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    boolean b44 = fila42.vazia();
    boolean b45 = fila42.vazia();
    fila42.enfileira((java.lang.Object)false);
    boolean b48 = fila42.vazia();
    boolean b49 = fila42.vazia();
    fila42.imprime();
    fila33.enfileira((java.lang.Object)fila42);
    fila8.enfileira((java.lang.Object)fila42);
    java.lang.Object obj53 = fila42.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1+ "'", obj41.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj53 + "' != '" + false+ "'", obj53.equals(false));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test231"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    boolean b13 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test232"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila5.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = null;
    fila5.enfileira(obj13);
    ds.Fila fila15 = new ds.Fila();
    boolean b16 = fila15.vazia();
    fila15.imprime();
    fila5.enfileira((java.lang.Object)fila15);
    java.lang.Object obj19 = fila5.desenfileira();
    fila5.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    boolean b24 = fila22.vazia();
    fila22.imprime();
    boolean b26 = fila22.vazia();
    fila22.imprime();
    ds.Fila fila28 = new ds.Fila();
    fila28.imprime();
    boolean b30 = fila28.vazia();
    fila28.imprime();
    fila28.imprime();
    fila28.enfileira((java.lang.Object)1);
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj39 = fila35.desenfileira();
    fila28.enfileira(obj39);
    ds.Fila fila41 = new ds.Fila();
    fila41.imprime();
    ds.Fila fila43 = new ds.Fila();
    fila43.imprime();
    boolean b45 = fila43.vazia();
    fila43.imprime();
    boolean b47 = fila43.vazia();
    fila41.enfileira((java.lang.Object)b47);
    fila28.enfileira((java.lang.Object)fila41);
    fila22.enfileira((java.lang.Object)fila41);
    fila22.imprime();
    ds.Fila fila52 = new ds.Fila();
    fila52.imprime();
    ds.Fila fila54 = new ds.Fila();
    fila54.imprime();
    boolean b56 = fila54.vazia();
    fila54.imprime();
    boolean b58 = fila54.vazia();
    fila52.enfileira((java.lang.Object)b58);
    java.lang.Object obj60 = null;
    fila52.enfileira(obj60);
    ds.Fila fila62 = new ds.Fila();
    boolean b63 = fila62.vazia();
    fila62.imprime();
    fila52.enfileira((java.lang.Object)fila62);
    java.lang.Object obj66 = fila52.desenfileira();
    fila52.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila69 = new ds.Fila();
    fila69.imprime();
    fila52.enfileira((java.lang.Object)fila69);
    fila22.enfileira((java.lang.Object)fila69);
    fila5.enfileira((java.lang.Object)fila22);
    fila0.enfileira((java.lang.Object)fila22);
    fila22.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + true+ "'", obj19.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!"+ "'", obj39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj66 + "' != '" + true+ "'", obj66.equals(true));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test233"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    boolean b30 = fila25.vazia();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    fila31.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj35 = null;
    fila31.enfileira(obj35);
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    boolean b39 = fila37.vazia();
    fila37.imprime();
    fila31.enfileira((java.lang.Object)fila37);
    fila25.enfileira((java.lang.Object)fila31);
    fila25.imprime();
    fila25.imprime();
    fila25.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test234"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test235"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    boolean b11 = fila6.vazia();
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    fila12.enfileira((java.lang.Object)"hi!");
    boolean b16 = fila12.vazia();
    fila12.enfileira((java.lang.Object)1.0d);
    fila12.imprime();
    fila6.enfileira((java.lang.Object)fila12);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)1);
    boolean b28 = fila21.vazia();
    java.lang.Object obj29 = fila21.desenfileira();
    fila12.enfileira((java.lang.Object)fila21);
    java.lang.Object obj31 = null;
    fila12.enfileira(obj31);
    java.lang.Object obj33 = fila12.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1+ "'", obj29.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!"+ "'", obj33.equals("hi!"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test236"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila8.imprime();
    boolean b14 = fila8.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test237"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    boolean b7 = fila5.vazia();
    fila5.imprime();
    boolean b9 = fila5.vazia();
    fila5.imprime();
    ds.Fila fila11 = new ds.Fila();
    fila11.imprime();
    boolean b13 = fila11.vazia();
    fila11.imprime();
    fila11.imprime();
    fila11.enfileira((java.lang.Object)1);
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj22 = fila18.desenfileira();
    fila11.enfileira(obj22);
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    boolean b28 = fila26.vazia();
    fila26.imprime();
    boolean b30 = fila26.vazia();
    fila24.enfileira((java.lang.Object)b30);
    fila11.enfileira((java.lang.Object)fila24);
    fila5.enfileira((java.lang.Object)fila24);
    java.lang.Object obj34 = fila24.desenfileira();
    fila0.enfileira(obj34);
    fila0.imprime();
    ds.Fila fila37 = new ds.Fila();
    boolean b38 = fila37.vazia();
    fila37.imprime();
    fila0.enfileira((java.lang.Object)fila37);
    boolean b41 = fila0.vazia();
    ds.Fila fila42 = new ds.Fila();
    boolean b43 = fila42.vazia();
    fila42.imprime();
    boolean b45 = fila42.vazia();
    boolean b46 = fila42.vazia();
    ds.Fila fila47 = new ds.Fila();
    fila47.imprime();
    boolean b49 = fila47.vazia();
    fila47.imprime();
    boolean b51 = fila47.vazia();
    fila47.imprime();
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    boolean b55 = fila53.vazia();
    fila53.imprime();
    fila53.imprime();
    fila53.enfileira((java.lang.Object)1);
    ds.Fila fila60 = new ds.Fila();
    fila60.imprime();
    fila60.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj64 = fila60.desenfileira();
    fila53.enfileira(obj64);
    ds.Fila fila66 = new ds.Fila();
    fila66.imprime();
    ds.Fila fila68 = new ds.Fila();
    fila68.imprime();
    boolean b70 = fila68.vazia();
    fila68.imprime();
    boolean b72 = fila68.vazia();
    fila66.enfileira((java.lang.Object)b72);
    fila53.enfileira((java.lang.Object)fila66);
    fila47.enfileira((java.lang.Object)fila66);
    java.lang.Object obj76 = fila66.desenfileira();
    fila42.enfileira(obj76);
    fila42.imprime();
    ds.Fila fila79 = new ds.Fila();
    boolean b80 = fila79.vazia();
    fila79.imprime();
    fila42.enfileira((java.lang.Object)fila79);
    fila79.imprime();
    fila0.enfileira((java.lang.Object)fila79);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj85 = fila79.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!"+ "'", obj22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true+ "'", obj34.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj64 + "' != '" + "hi!"+ "'", obj64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj76 + "' != '" + true+ "'", obj76.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test238"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)(short)0);
    fila6.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)1);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj25 = fila21.desenfileira();
    fila14.enfileira(obj25);
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    boolean b33 = fila29.vazia();
    fila27.enfileira((java.lang.Object)b33);
    fila14.enfileira((java.lang.Object)fila27);
    fila6.enfileira((java.lang.Object)fila14);
    fila0.enfileira((java.lang.Object)fila14);
    boolean b38 = fila14.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!"+ "'", obj25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test239"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    boolean b19 = fila14.vazia();
    fila10.enfileira((java.lang.Object)b19);
    boolean b21 = fila10.vazia();
    ds.Fila fila22 = new ds.Fila();
    boolean b23 = fila22.vazia();
    fila22.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    boolean b28 = fila25.vazia();
    fila25.enfileira((java.lang.Object)false);
    fila22.enfileira((java.lang.Object)fila25);
    fila10.enfileira((java.lang.Object)fila25);
    fila25.imprime();
    fila25.imprime();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    boolean b37 = fila35.vazia();
    fila35.imprime();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)(short)0);
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    fila42.enfileira((java.lang.Object)"hi!");
    boolean b46 = fila42.vazia();
    fila35.enfileira((java.lang.Object)fila42);
    boolean b48 = fila35.vazia();
    fila25.enfileira((java.lang.Object)b48);
    ds.Fila fila50 = new ds.Fila();
    fila50.imprime();
    boolean b52 = fila50.vazia();
    fila50.imprime();
    fila50.imprime();
    fila50.enfileira((java.lang.Object)1);
    boolean b57 = fila50.vazia();
    ds.Fila fila58 = new ds.Fila();
    fila58.enfileira((java.lang.Object)(byte)1);
    fila58.imprime();
    fila50.enfileira((java.lang.Object)fila58);
    fila50.enfileira((java.lang.Object)10.0d);
    fila50.enfileira((java.lang.Object)(byte)(-1));
    boolean b67 = fila50.vazia();
    fila50.imprime();
    boolean b69 = fila50.vazia();
    boolean b70 = fila50.vazia();
    fila25.enfileira((java.lang.Object)b70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test240"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)(short)0);
    fila6.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)1);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj25 = fila21.desenfileira();
    fila14.enfileira(obj25);
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    boolean b33 = fila29.vazia();
    fila27.enfileira((java.lang.Object)b33);
    fila14.enfileira((java.lang.Object)fila27);
    fila6.enfileira((java.lang.Object)fila14);
    fila0.enfileira((java.lang.Object)fila14);
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    boolean b40 = fila38.vazia();
    fila38.imprime();
    fila38.imprime();
    fila38.imprime();
    fila38.imprime();
    ds.Fila fila45 = new ds.Fila();
    fila45.imprime();
    boolean b47 = fila45.vazia();
    fila45.imprime();
    boolean b49 = fila45.vazia();
    fila38.enfileira((java.lang.Object)b49);
    java.lang.Object obj51 = new java.lang.Object();
    fila38.enfileira(obj51);
    java.lang.Object obj53 = fila38.desenfileira();
    ds.Fila fila54 = new ds.Fila();
    fila54.imprime();
    fila54.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj58 = fila54.desenfileira();
    fila54.enfileira((java.lang.Object)10.0f);
    ds.Fila fila61 = new ds.Fila();
    fila61.imprime();
    boolean b63 = fila61.vazia();
    fila61.imprime();
    fila61.imprime();
    fila61.enfileira((java.lang.Object)1);
    ds.Fila fila68 = new ds.Fila();
    fila68.imprime();
    fila68.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj72 = fila68.desenfileira();
    fila61.enfileira(obj72);
    ds.Fila fila74 = new ds.Fila();
    fila74.imprime();
    ds.Fila fila76 = new ds.Fila();
    fila76.imprime();
    boolean b78 = fila76.vazia();
    fila76.imprime();
    boolean b80 = fila76.vazia();
    fila74.enfileira((java.lang.Object)b80);
    fila61.enfileira((java.lang.Object)fila74);
    fila54.enfileira((java.lang.Object)fila61);
    fila38.enfileira((java.lang.Object)fila61);
    fila14.enfileira((java.lang.Object)fila61);
    java.lang.Object obj86 = fila61.desenfileira();
    boolean b87 = fila61.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!"+ "'", obj25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj53 + "' != '" + true+ "'", obj53.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!"+ "'", obj58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "hi!"+ "'", obj72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 1+ "'", obj86.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test241"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = fila15.desenfileira();
    fila8.enfileira(obj19);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila21.enfileira((java.lang.Object)b27);
    fila8.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila8);
    boolean b31 = fila8.vazia();
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    boolean b34 = fila32.vazia();
    fila32.imprime();
    fila32.imprime();
    fila32.enfileira((java.lang.Object)1);
    ds.Fila fila39 = new ds.Fila();
    fila39.imprime();
    fila39.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj43 = fila39.desenfileira();
    fila32.enfileira(obj43);
    ds.Fila fila45 = new ds.Fila();
    fila45.imprime();
    ds.Fila fila47 = new ds.Fila();
    fila47.imprime();
    boolean b49 = fila47.vazia();
    fila47.imprime();
    boolean b51 = fila47.vazia();
    fila45.enfileira((java.lang.Object)b51);
    fila32.enfileira((java.lang.Object)fila45);
    fila45.imprime();
    boolean b55 = fila45.vazia();
    ds.Fila fila56 = new ds.Fila();
    fila56.imprime();
    boolean b58 = fila56.vazia();
    fila56.imprime();
    fila56.imprime();
    fila56.imprime();
    fila56.imprime();
    ds.Fila fila63 = new ds.Fila();
    fila63.imprime();
    boolean b65 = fila63.vazia();
    fila63.imprime();
    boolean b67 = fila63.vazia();
    fila56.enfileira((java.lang.Object)b67);
    java.lang.Object obj69 = new java.lang.Object();
    fila56.enfileira(obj69);
    java.lang.Object obj71 = fila56.desenfileira();
    boolean b72 = fila56.vazia();
    ds.Fila fila73 = new ds.Fila();
    fila73.imprime();
    boolean b75 = fila73.vazia();
    fila73.imprime();
    fila73.imprime();
    fila73.enfileira((java.lang.Object)1);
    boolean b80 = fila73.vazia();
    ds.Fila fila81 = new ds.Fila();
    fila81.enfileira((java.lang.Object)(byte)1);
    fila81.imprime();
    fila73.enfileira((java.lang.Object)fila81);
    fila56.enfileira((java.lang.Object)fila73);
    java.lang.Object obj87 = fila56.desenfileira();
    fila56.imprime();
    fila45.enfileira((java.lang.Object)fila56);
    fila8.enfileira((java.lang.Object)fila56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!"+ "'", obj43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj71 + "' != '" + true+ "'", obj71.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj87);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test242"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    fila0.enfileira((java.lang.Object)fila17);
    java.lang.Object obj20 = fila0.desenfileira();
    java.lang.Object obj21 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test243"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    boolean b19 = fila14.vazia();
    fila10.enfileira((java.lang.Object)b19);
    boolean b21 = fila10.vazia();
    ds.Fila fila22 = new ds.Fila();
    boolean b23 = fila22.vazia();
    fila22.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    boolean b28 = fila25.vazia();
    fila25.enfileira((java.lang.Object)false);
    fila22.enfileira((java.lang.Object)fila25);
    fila10.enfileira((java.lang.Object)fila25);
    fila25.imprime();
    fila25.imprime();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    boolean b37 = fila35.vazia();
    fila35.imprime();
    fila35.imprime();
    fila35.enfileira((java.lang.Object)(short)0);
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    fila42.enfileira((java.lang.Object)"hi!");
    boolean b46 = fila42.vazia();
    fila35.enfileira((java.lang.Object)fila42);
    boolean b48 = fila35.vazia();
    fila25.enfileira((java.lang.Object)b48);
    ds.Fila fila50 = new ds.Fila();
    fila50.imprime();
    boolean b52 = fila50.vazia();
    fila50.imprime();
    fila50.imprime();
    boolean b55 = fila50.vazia();
    boolean b56 = fila50.vazia();
    fila25.enfileira((java.lang.Object)fila50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test244"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    fila0.imprime();
    java.lang.Object obj23 = fila0.desenfileira();
    java.lang.Object obj24 = fila0.desenfileira();
    java.lang.Object obj25 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1+ "'", obj23.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "hi!"+ "'", obj24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test245"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    boolean b4 = fila0.vazia();
    java.lang.Object obj5 = fila0.desenfileira();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)1);
    boolean b13 = fila6.vazia();
    ds.Fila fila14 = new ds.Fila();
    fila14.enfileira((java.lang.Object)(byte)1);
    fila14.imprime();
    fila6.enfileira((java.lang.Object)fila14);
    fila6.enfileira((java.lang.Object)10.0d);
    fila6.enfileira((java.lang.Object)(byte)(-1));
    boolean b23 = fila6.vazia();
    fila6.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    fila25.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj29 = null;
    fila25.enfileira(obj29);
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    fila25.enfileira((java.lang.Object)fila31);
    boolean b36 = fila31.vazia();
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    fila37.enfileira((java.lang.Object)"hi!");
    boolean b41 = fila37.vazia();
    fila37.enfileira((java.lang.Object)1.0d);
    fila37.imprime();
    fila31.enfileira((java.lang.Object)fila37);
    fila6.enfileira((java.lang.Object)fila31);
    java.lang.Object obj47 = fila6.desenfileira();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!"+ "'", obj5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1+ "'", obj47.equals(1));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test246"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    boolean b11 = fila6.vazia();
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    fila12.enfileira((java.lang.Object)"hi!");
    boolean b16 = fila12.vazia();
    fila12.enfileira((java.lang.Object)1.0d);
    fila12.imprime();
    fila6.enfileira((java.lang.Object)fila12);
    ds.Fila fila21 = new ds.Fila();
    boolean b22 = fila21.vazia();
    fila21.imprime();
    boolean b24 = fila21.vazia();
    fila21.imprime();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    fila26.enfileira((java.lang.Object)"hi!");
    fila21.enfileira((java.lang.Object)fila26);
    java.lang.Object obj31 = fila21.desenfileira();
    java.lang.Object obj32 = new java.lang.Object();
    fila21.enfileira(obj32);
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    boolean b36 = fila34.vazia();
    fila34.imprime();
    fila34.imprime();
    fila34.enfileira((java.lang.Object)1);
    boolean b41 = fila34.vazia();
    ds.Fila fila42 = new ds.Fila();
    fila42.enfileira((java.lang.Object)(byte)1);
    fila42.imprime();
    fila34.enfileira((java.lang.Object)fila42);
    fila34.enfileira((java.lang.Object)10.0d);
    fila34.enfileira((java.lang.Object)(byte)(-1));
    fila21.enfileira((java.lang.Object)(byte)(-1));
    fila12.enfileira((java.lang.Object)fila21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test247"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    fila0.enfileira((java.lang.Object)fila17);
    boolean b20 = fila17.vazia();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila21.imprime();
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    boolean b33 = fila29.vazia();
    fila27.enfileira((java.lang.Object)b33);
    java.lang.Object obj35 = null;
    fila27.enfileira(obj35);
    ds.Fila fila37 = new ds.Fila();
    boolean b38 = fila37.vazia();
    fila37.imprime();
    fila27.enfileira((java.lang.Object)fila37);
    java.lang.Object obj41 = fila27.desenfileira();
    fila27.enfileira((java.lang.Object)(short)(-1));
    boolean b44 = fila27.vazia();
    fila21.enfileira((java.lang.Object)fila27);
    ds.Fila fila46 = new ds.Fila();
    fila46.imprime();
    ds.Fila fila48 = new ds.Fila();
    fila48.imprime();
    boolean b50 = fila48.vazia();
    fila48.imprime();
    boolean b52 = fila48.vazia();
    fila46.enfileira((java.lang.Object)b52);
    fila21.enfileira((java.lang.Object)fila46);
    fila21.imprime();
    fila17.enfileira((java.lang.Object)fila21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true+ "'", obj41.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test248"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    boolean b10 = fila5.vazia();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)true);
    java.lang.Object obj14 = fila5.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "hi!"+ "'", obj14.equals("hi!"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test249"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.enfileira((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test250"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)(-1));
    boolean b17 = fila0.vazia();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    boolean b22 = fila20.vazia();
    fila20.imprime();
    boolean b24 = fila20.vazia();
    fila18.enfileira((java.lang.Object)b24);
    java.lang.Object obj26 = null;
    fila18.enfileira(obj26);
    ds.Fila fila28 = new ds.Fila();
    boolean b29 = fila28.vazia();
    fila28.imprime();
    fila18.enfileira((java.lang.Object)fila28);
    java.lang.Object obj32 = fila18.desenfileira();
    fila18.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    fila18.enfileira((java.lang.Object)fila35);
    fila0.enfileira((java.lang.Object)fila35);
    fila35.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + true+ "'", obj32.equals(true));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test251"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    boolean b7 = fila3.vazia();
    fila1.enfileira((java.lang.Object)b7);
    java.lang.Object obj9 = null;
    fila1.enfileira(obj9);
    ds.Fila fila11 = new ds.Fila();
    boolean b12 = fila11.vazia();
    fila11.imprime();
    fila1.enfileira((java.lang.Object)fila11);
    java.lang.Object obj15 = fila1.desenfileira();
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj20 = null;
    fila16.enfileira(obj20);
    fila16.enfileira((java.lang.Object)10);
    fila1.enfileira((java.lang.Object)fila16);
    fila0.enfileira((java.lang.Object)fila1);
    java.lang.Object obj26 = fila1.desenfileira();
    java.lang.Object obj27 = fila1.desenfileira();
    boolean b28 = fila1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test252"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    boolean b4 = fila3.vazia();
    fila3.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    boolean b9 = fila6.vazia();
    fila6.enfileira((java.lang.Object)false);
    fila3.enfileira((java.lang.Object)fila6);
    java.lang.Object obj13 = fila3.desenfileira();
    fila0.enfileira((java.lang.Object)fila3);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)1);
    java.lang.Object obj22 = fila15.desenfileira();
    fila15.enfileira((java.lang.Object)100.0d);
    fila0.enfileira((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1+ "'", obj22.equals(1));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test253"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    fila3.imprime();
    fila3.enfileira((java.lang.Object)1);
    boolean b10 = fila3.vazia();
    ds.Fila fila11 = new ds.Fila();
    fila11.enfileira((java.lang.Object)(byte)1);
    fila11.imprime();
    fila3.enfileira((java.lang.Object)fila11);
    fila0.enfileira((java.lang.Object)fila3);
    boolean b17 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test254"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = fila15.desenfileira();
    fila8.enfileira(obj19);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila21.enfileira((java.lang.Object)b27);
    fila8.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila8);
    fila8.enfileira((java.lang.Object)'a');
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    boolean b35 = fila33.vazia();
    fila33.imprime();
    fila33.imprime();
    fila33.enfileira((java.lang.Object)1);
    boolean b40 = fila33.vazia();
    ds.Fila fila41 = new ds.Fila();
    fila41.enfileira((java.lang.Object)(byte)1);
    fila41.imprime();
    fila33.enfileira((java.lang.Object)fila41);
    fila8.enfileira((java.lang.Object)fila33);
    ds.Fila fila47 = new ds.Fila();
    fila47.imprime();
    boolean b49 = fila47.vazia();
    fila47.imprime();
    boolean b51 = fila47.vazia();
    fila47.imprime();
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    ds.Fila fila55 = new ds.Fila();
    fila55.imprime();
    boolean b57 = fila55.vazia();
    fila55.imprime();
    boolean b59 = fila55.vazia();
    fila53.enfileira((java.lang.Object)b59);
    java.lang.Object obj61 = null;
    fila53.enfileira(obj61);
    ds.Fila fila63 = new ds.Fila();
    boolean b64 = fila63.vazia();
    fila63.imprime();
    fila53.enfileira((java.lang.Object)fila63);
    java.lang.Object obj67 = fila53.desenfileira();
    fila53.enfileira((java.lang.Object)(short)(-1));
    boolean b70 = fila53.vazia();
    fila47.enfileira((java.lang.Object)fila53);
    ds.Fila fila72 = new ds.Fila();
    fila72.imprime();
    ds.Fila fila74 = new ds.Fila();
    fila74.imprime();
    boolean b76 = fila74.vazia();
    fila74.imprime();
    boolean b78 = fila74.vazia();
    fila72.enfileira((java.lang.Object)b78);
    fila47.enfileira((java.lang.Object)fila72);
    fila47.imprime();
    java.lang.Object obj82 = fila47.desenfileira();
    fila33.enfileira((java.lang.Object)fila47);
    fila33.enfileira((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj67 + "' != '" + true+ "'", obj67.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj82);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test255"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    boolean b10 = fila0.vazia();
    java.lang.Object obj11 = fila0.desenfileira();
    boolean b12 = fila0.vazia();
    boolean b13 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true+ "'", obj11.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test256"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    ds.Fila fila9 = new ds.Fila();
    boolean b10 = fila9.vazia();
    fila9.imprime();
    boolean b12 = fila9.vazia();
    fila9.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)"hi!");
    fila9.enfileira((java.lang.Object)fila14);
    boolean b19 = fila14.vazia();
    fila0.enfileira((java.lang.Object)fila14);
    java.lang.Object obj21 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1+ "'", obj8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test257"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    boolean b19 = fila14.vazia();
    fila10.enfileira((java.lang.Object)b19);
    boolean b21 = fila10.vazia();
    ds.Fila fila22 = new ds.Fila();
    boolean b23 = fila22.vazia();
    fila22.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    boolean b28 = fila25.vazia();
    fila25.enfileira((java.lang.Object)false);
    fila22.enfileira((java.lang.Object)fila25);
    fila10.enfileira((java.lang.Object)fila25);
    boolean b33 = fila10.vazia();
    boolean b34 = fila10.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test258"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test259"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(byte)100);
    fila0.imprime();
    java.lang.Object obj8 = fila0.desenfileira();
    fila0.imprime();
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    fila10.imprime();
    fila10.imprime();
    fila10.imprime();
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    boolean b21 = fila17.vazia();
    fila10.enfileira((java.lang.Object)b21);
    fila0.enfileira((java.lang.Object)b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte)100+ "'", obj8.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test260"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    boolean b10 = fila0.vazia();
    boolean b11 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test261"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.enfileira((java.lang.Object)false);
    boolean b6 = fila0.vazia();
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila0.enfileira((java.lang.Object)b12);
    fila0.imprime();
    ds.Fila fila15 = new ds.Fila();
    boolean b16 = fila15.vazia();
    fila15.imprime();
    boolean b18 = fila15.vazia();
    boolean b19 = fila15.vazia();
    fila0.enfileira((java.lang.Object)fila15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test262"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    boolean b34 = fila32.vazia();
    fila32.imprime();
    boolean b36 = fila32.vazia();
    fila30.enfileira((java.lang.Object)b36);
    java.lang.Object obj38 = null;
    fila30.enfileira(obj38);
    ds.Fila fila40 = new ds.Fila();
    boolean b41 = fila40.vazia();
    fila40.imprime();
    fila30.enfileira((java.lang.Object)fila40);
    java.lang.Object obj44 = fila30.desenfileira();
    fila30.enfileira((java.lang.Object)(short)(-1));
    boolean b47 = fila30.vazia();
    fila25.enfileira((java.lang.Object)fila30);
    java.lang.Object obj49 = fila30.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj44 + "' != '" + true+ "'", obj44.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test263"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0f);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)(short)0);
    fila8.imprime();
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    boolean b18 = fila16.vazia();
    fila16.imprime();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)1);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj27 = fila23.desenfileira();
    fila16.enfileira(obj27);
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    boolean b35 = fila31.vazia();
    fila29.enfileira((java.lang.Object)b35);
    fila16.enfileira((java.lang.Object)fila29);
    fila8.enfileira((java.lang.Object)fila16);
    fila16.enfileira((java.lang.Object)'a');
    ds.Fila fila41 = new ds.Fila();
    fila41.imprime();
    boolean b43 = fila41.vazia();
    fila41.imprime();
    fila41.imprime();
    fila41.enfileira((java.lang.Object)1);
    boolean b48 = fila41.vazia();
    java.lang.Object obj49 = fila41.desenfileira();
    ds.Fila fila50 = new ds.Fila();
    fila50.imprime();
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    fila50.enfileira((java.lang.Object)false);
    boolean b56 = fila50.vazia();
    boolean b57 = fila50.vazia();
    fila50.imprime();
    fila41.enfileira((java.lang.Object)fila50);
    fila16.enfileira((java.lang.Object)fila50);
    ds.Fila fila61 = new ds.Fila();
    fila61.imprime();
    boolean b63 = fila61.vazia();
    fila61.imprime();
    fila61.imprime();
    fila61.enfileira((java.lang.Object)1);
    boolean b68 = fila61.vazia();
    ds.Fila fila69 = new ds.Fila();
    fila69.enfileira((java.lang.Object)(byte)1);
    fila69.imprime();
    fila61.enfileira((java.lang.Object)fila69);
    fila61.imprime();
    fila16.enfileira((java.lang.Object)fila61);
    fila0.enfileira((java.lang.Object)fila16);
    boolean b77 = fila16.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!"+ "'", obj27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1+ "'", obj49.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test264"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0f);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = null;
    fila7.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    boolean b15 = fila13.vazia();
    fila13.imprime();
    fila7.enfileira((java.lang.Object)fila13);
    fila7.enfileira((java.lang.Object)1.0d);
    fila0.enfileira((java.lang.Object)fila7);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)(short)0);
    fila21.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    fila29.imprime();
    fila29.enfileira((java.lang.Object)1);
    ds.Fila fila36 = new ds.Fila();
    fila36.imprime();
    fila36.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj40 = fila36.desenfileira();
    fila29.enfileira(obj40);
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    ds.Fila fila44 = new ds.Fila();
    fila44.imprime();
    boolean b46 = fila44.vazia();
    fila44.imprime();
    boolean b48 = fila44.vazia();
    fila42.enfileira((java.lang.Object)b48);
    fila29.enfileira((java.lang.Object)fila42);
    fila21.enfileira((java.lang.Object)fila29);
    ds.Fila fila52 = new ds.Fila();
    fila52.imprime();
    ds.Fila fila54 = new ds.Fila();
    fila54.imprime();
    boolean b56 = fila54.vazia();
    fila54.imprime();
    boolean b58 = fila54.vazia();
    fila52.enfileira((java.lang.Object)b58);
    java.lang.Object obj60 = null;
    fila52.enfileira(obj60);
    ds.Fila fila62 = new ds.Fila();
    boolean b63 = fila62.vazia();
    fila62.imprime();
    fila52.enfileira((java.lang.Object)fila62);
    fila62.imprime();
    fila21.enfileira((java.lang.Object)fila62);
    fila7.enfileira((java.lang.Object)fila62);
    boolean b69 = fila7.vazia();
    // The following exception was thrown during execution in test generation
    try {
      fila7.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "hi!"+ "'", obj4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!"+ "'", obj40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test265"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila10 = new ds.Fila();
    fila10.imprime();
    boolean b12 = fila10.vazia();
    fila10.imprime();
    fila10.imprime();
    fila10.enfileira((java.lang.Object)1);
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj21 = fila17.desenfileira();
    fila10.enfileira(obj21);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    boolean b29 = fila25.vazia();
    fila23.enfileira((java.lang.Object)b29);
    fila10.enfileira((java.lang.Object)fila23);
    fila10.imprime();
    java.lang.Object obj33 = fila10.desenfileira();
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    boolean b36 = fila34.vazia();
    fila34.imprime();
    fila34.imprime();
    fila34.enfileira((java.lang.Object)1);
    boolean b41 = fila34.vazia();
    java.lang.Object obj42 = fila34.desenfileira();
    ds.Fila fila43 = new ds.Fila();
    fila43.imprime();
    boolean b45 = fila43.vazia();
    boolean b46 = fila43.vazia();
    fila43.enfileira((java.lang.Object)false);
    boolean b49 = fila43.vazia();
    boolean b50 = fila43.vazia();
    fila43.imprime();
    fila34.enfileira((java.lang.Object)fila43);
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    boolean b55 = fila53.vazia();
    fila53.imprime();
    fila53.imprime();
    fila53.enfileira((java.lang.Object)1);
    java.lang.Object obj60 = fila53.desenfileira();
    boolean b61 = fila53.vazia();
    fila34.enfileira((java.lang.Object)fila53);
    fila10.enfileira((java.lang.Object)fila53);
    fila0.enfileira((java.lang.Object)fila53);
    ds.Fila fila65 = new ds.Fila();
    boolean b66 = fila65.vazia();
    fila65.imprime();
    boolean b68 = fila65.vazia();
    fila65.imprime();
    ds.Fila fila70 = new ds.Fila();
    fila70.imprime();
    fila70.enfileira((java.lang.Object)"hi!");
    fila65.enfileira((java.lang.Object)fila70);
    ds.Fila fila75 = new ds.Fila();
    fila75.imprime();
    boolean b77 = fila75.vazia();
    fila75.imprime();
    boolean b79 = fila75.vazia();
    fila75.imprime();
    fila65.enfileira((java.lang.Object)fila75);
    java.lang.Object obj82 = fila65.desenfileira();
    fila53.enfileira((java.lang.Object)fila65);
    java.lang.Object obj84 = fila53.desenfileira();
    ds.Fila fila85 = new ds.Fila();
    fila85.imprime();
    boolean b87 = fila85.vazia();
    boolean b88 = fila85.vazia();
    fila85.enfileira((java.lang.Object)false);
    fila85.imprime();
    fila53.enfileira((java.lang.Object)fila85);
    boolean b93 = fila85.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!"+ "'", obj21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1+ "'", obj33.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1+ "'", obj42.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1+ "'", obj60.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test266"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj14 = fila0.desenfileira();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)1);
    boolean b22 = fila15.vazia();
    java.lang.Object obj23 = fila15.desenfileira();
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    fila24.enfileira((java.lang.Object)false);
    boolean b30 = fila24.vazia();
    boolean b31 = fila24.vazia();
    fila24.imprime();
    fila15.enfileira((java.lang.Object)fila24);
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    boolean b36 = fila34.vazia();
    fila34.imprime();
    fila34.imprime();
    fila34.enfileira((java.lang.Object)1);
    java.lang.Object obj41 = fila34.desenfileira();
    boolean b42 = fila34.vazia();
    fila15.enfileira((java.lang.Object)fila34);
    fila15.imprime();
    fila0.enfileira((java.lang.Object)fila15);
    ds.Fila fila46 = new ds.Fila();
    fila46.imprime();
    boolean b48 = fila46.vazia();
    fila46.imprime();
    fila46.imprime();
    fila46.enfileira((java.lang.Object)(short)0);
    ds.Fila fila53 = new ds.Fila();
    fila53.imprime();
    fila53.enfileira((java.lang.Object)"hi!");
    boolean b57 = fila53.vazia();
    fila46.enfileira((java.lang.Object)fila53);
    boolean b59 = fila46.vazia();
    java.lang.Object obj60 = fila46.desenfileira();
    java.lang.Object obj61 = fila46.desenfileira();
    fila15.enfileira(obj61);
    java.lang.Object obj63 = fila15.desenfileira();
    fila15.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true+ "'", obj14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1+ "'", obj23.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1+ "'", obj41.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short)0+ "'", obj60.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj63);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test267"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    fila0.imprime();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    fila9.imprime();
    fila9.imprime();
    fila9.enfileira((java.lang.Object)1);
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    fila16.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj20 = fila16.desenfileira();
    fila9.enfileira(obj20);
    ds.Fila fila22 = new ds.Fila();
    fila22.imprime();
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    boolean b26 = fila24.vazia();
    fila24.imprime();
    boolean b28 = fila24.vazia();
    fila22.enfileira((java.lang.Object)b28);
    fila9.enfileira((java.lang.Object)fila22);
    fila9.imprime();
    fila9.imprime();
    fila0.enfileira((java.lang.Object)fila9);
    boolean b34 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!"+ "'", obj20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test268"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj15 = fila0.desenfileira();
    ds.Fila fila16 = new ds.Fila();
    fila16.imprime();
    fila16.imprime();
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    boolean b21 = fila19.vazia();
    fila19.imprime();
    fila19.imprime();
    fila19.enfileira((java.lang.Object)1);
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    fila26.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj30 = fila26.desenfileira();
    fila19.enfileira(obj30);
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    boolean b36 = fila34.vazia();
    fila34.imprime();
    boolean b38 = fila34.vazia();
    fila32.enfileira((java.lang.Object)b38);
    fila19.enfileira((java.lang.Object)fila32);
    fila32.imprime();
    fila16.enfileira((java.lang.Object)fila32);
    ds.Fila fila43 = new ds.Fila();
    fila43.enfileira((java.lang.Object)(byte)1);
    fila43.imprime();
    boolean b47 = fila43.vazia();
    fila16.enfileira((java.lang.Object)fila43);
    fila16.imprime();
    fila0.enfileira((java.lang.Object)fila16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1+ "'", obj15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "hi!"+ "'", obj30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test269"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.enfileira((java.lang.Object)10.0d);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    boolean b17 = fila0.vazia();
    java.lang.Object obj18 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1+ "'", obj18.equals(1));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test270"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    fila10.imprime();
    boolean b15 = fila10.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj16 = fila10.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test271"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    fila5.enfileira((java.lang.Object)"hi!");
    fila0.enfileira((java.lang.Object)fila5);
    boolean b10 = fila5.vazia();
    fila5.imprime();
    fila5.imprime();
    java.lang.Object obj13 = null;
    fila5.enfileira(obj13);
    // The following exception was thrown during execution in test generation
    try {
      fila5.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test272"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.enfileira((java.lang.Object)false);
    boolean b6 = fila0.vazia();
    boolean b7 = fila0.vazia();
    fila0.imprime();
    boolean b9 = fila0.vazia();
    java.lang.Object obj10 = null;
    fila0.enfileira(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test273"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.enfileira((java.lang.Object)10.0d);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    boolean b17 = fila0.vazia();
    boolean b18 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test274"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)0);
    java.lang.Object obj6 = fila0.desenfileira();
    boolean b7 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    boolean b11 = fila9.vazia();
    fila9.imprime();
    boolean b13 = fila9.vazia();
    fila9.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    boolean b21 = fila17.vazia();
    fila15.enfileira((java.lang.Object)b21);
    java.lang.Object obj23 = null;
    fila15.enfileira(obj23);
    ds.Fila fila25 = new ds.Fila();
    boolean b26 = fila25.vazia();
    fila25.imprime();
    fila15.enfileira((java.lang.Object)fila25);
    java.lang.Object obj29 = fila15.desenfileira();
    fila15.enfileira((java.lang.Object)(short)(-1));
    boolean b32 = fila15.vazia();
    fila9.enfileira((java.lang.Object)fila15);
    ds.Fila fila34 = new ds.Fila();
    fila34.imprime();
    ds.Fila fila36 = new ds.Fila();
    fila36.imprime();
    boolean b38 = fila36.vazia();
    fila36.imprime();
    boolean b40 = fila36.vazia();
    fila34.enfileira((java.lang.Object)b40);
    fila9.enfileira((java.lang.Object)fila34);
    ds.Fila fila43 = new ds.Fila();
    fila43.imprime();
    boolean b45 = fila43.vazia();
    fila43.imprime();
    fila43.imprime();
    fila43.imprime();
    fila43.imprime();
    ds.Fila fila50 = new ds.Fila();
    fila50.imprime();
    boolean b52 = fila50.vazia();
    fila50.imprime();
    boolean b54 = fila50.vazia();
    fila43.enfileira((java.lang.Object)b54);
    java.lang.Object obj56 = new java.lang.Object();
    fila43.enfileira(obj56);
    fila9.enfileira(obj56);
    fila0.enfileira((java.lang.Object)fila9);
    fila9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0+ "'", obj6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + true+ "'", obj29.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test275"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    boolean b14 = fila10.vazia();
    boolean b15 = fila10.vazia();
    fila10.imprime();
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    boolean b21 = fila19.vazia();
    fila19.imprime();
    boolean b23 = fila19.vazia();
    fila17.enfileira((java.lang.Object)b23);
    java.lang.Object obj25 = null;
    fila17.enfileira(obj25);
    ds.Fila fila27 = new ds.Fila();
    boolean b28 = fila27.vazia();
    fila27.imprime();
    fila17.enfileira((java.lang.Object)fila27);
    java.lang.Object obj31 = fila17.desenfileira();
    fila17.enfileira((java.lang.Object)(short)(-1));
    boolean b34 = fila17.vazia();
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    boolean b39 = fila37.vazia();
    fila37.imprime();
    boolean b41 = fila37.vazia();
    fila35.enfileira((java.lang.Object)b41);
    java.lang.Object obj43 = null;
    fila35.enfileira(obj43);
    ds.Fila fila45 = new ds.Fila();
    boolean b46 = fila45.vazia();
    fila45.imprime();
    fila35.enfileira((java.lang.Object)fila45);
    java.lang.Object obj49 = fila35.desenfileira();
    fila35.enfileira((java.lang.Object)(short)(-1));
    ds.Fila fila52 = new ds.Fila();
    fila52.imprime();
    fila35.enfileira((java.lang.Object)fila52);
    fila17.enfileira((java.lang.Object)fila52);
    fila10.enfileira((java.lang.Object)fila52);
    boolean b57 = fila52.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true+ "'", obj31.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj49 + "' != '" + true+ "'", obj49.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test276"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    boolean b17 = fila15.vazia();
    fila15.imprime();
    boolean b19 = fila15.vazia();
    fila13.enfileira((java.lang.Object)b19);
    fila0.enfileira((java.lang.Object)fila13);
    fila13.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila23.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    boolean b33 = fila31.vazia();
    fila31.imprime();
    boolean b35 = fila31.vazia();
    fila29.enfileira((java.lang.Object)b35);
    java.lang.Object obj37 = null;
    fila29.enfileira(obj37);
    ds.Fila fila39 = new ds.Fila();
    boolean b40 = fila39.vazia();
    fila39.imprime();
    fila29.enfileira((java.lang.Object)fila39);
    java.lang.Object obj43 = fila29.desenfileira();
    fila29.enfileira((java.lang.Object)(short)(-1));
    boolean b46 = fila29.vazia();
    fila23.enfileira((java.lang.Object)fila29);
    ds.Fila fila48 = new ds.Fila();
    fila48.imprime();
    ds.Fila fila50 = new ds.Fila();
    fila50.imprime();
    boolean b52 = fila50.vazia();
    fila50.imprime();
    boolean b54 = fila50.vazia();
    fila48.enfileira((java.lang.Object)b54);
    fila23.enfileira((java.lang.Object)fila48);
    fila23.imprime();
    fila13.enfileira((java.lang.Object)fila23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + true+ "'", obj43.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test277"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.enfileira((java.lang.Object)false);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    boolean b10 = fila6.vazia();
    fila6.imprime();
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    boolean b14 = fila12.vazia();
    fila12.imprime();
    fila12.imprime();
    fila12.enfileira((java.lang.Object)1);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    fila19.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj23 = fila19.desenfileira();
    fila12.enfileira(obj23);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    boolean b29 = fila27.vazia();
    fila27.imprime();
    boolean b31 = fila27.vazia();
    fila25.enfileira((java.lang.Object)b31);
    fila12.enfileira((java.lang.Object)fila25);
    fila6.enfileira((java.lang.Object)fila25);
    boolean b35 = fila25.vazia();
    fila0.enfileira((java.lang.Object)b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "hi!"+ "'", obj23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test278"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    fila0.enfileira((java.lang.Object)1.0d);
    ds.Fila fila13 = new ds.Fila();
    boolean b14 = fila13.vazia();
    fila13.imprime();
    boolean b16 = fila13.vazia();
    fila13.imprime();
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.enfileira((java.lang.Object)"hi!");
    fila13.enfileira((java.lang.Object)fila18);
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    fila23.imprime();
    fila23.enfileira((java.lang.Object)1);
    ds.Fila fila30 = new ds.Fila();
    fila30.imprime();
    fila30.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj34 = fila30.desenfileira();
    fila23.enfileira(obj34);
    ds.Fila fila36 = new ds.Fila();
    fila36.imprime();
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    boolean b40 = fila38.vazia();
    fila38.imprime();
    boolean b42 = fila38.vazia();
    fila36.enfileira((java.lang.Object)b42);
    fila23.enfileira((java.lang.Object)fila36);
    fila23.imprime();
    java.lang.Object obj46 = fila23.desenfileira();
    ds.Fila fila47 = new ds.Fila();
    fila47.imprime();
    boolean b49 = fila47.vazia();
    fila47.imprime();
    fila47.imprime();
    fila47.enfileira((java.lang.Object)1);
    boolean b54 = fila47.vazia();
    java.lang.Object obj55 = fila47.desenfileira();
    ds.Fila fila56 = new ds.Fila();
    fila56.imprime();
    boolean b58 = fila56.vazia();
    boolean b59 = fila56.vazia();
    fila56.enfileira((java.lang.Object)false);
    boolean b62 = fila56.vazia();
    boolean b63 = fila56.vazia();
    fila56.imprime();
    fila47.enfileira((java.lang.Object)fila56);
    ds.Fila fila66 = new ds.Fila();
    fila66.imprime();
    boolean b68 = fila66.vazia();
    fila66.imprime();
    fila66.imprime();
    fila66.enfileira((java.lang.Object)1);
    java.lang.Object obj73 = fila66.desenfileira();
    boolean b74 = fila66.vazia();
    fila47.enfileira((java.lang.Object)fila66);
    fila23.enfileira((java.lang.Object)fila66);
    fila13.enfileira((java.lang.Object)fila66);
    ds.Fila fila78 = new ds.Fila();
    boolean b79 = fila78.vazia();
    fila78.imprime();
    boolean b81 = fila78.vazia();
    fila78.imprime();
    ds.Fila fila83 = new ds.Fila();
    fila83.imprime();
    fila83.enfileira((java.lang.Object)"hi!");
    fila78.enfileira((java.lang.Object)fila83);
    ds.Fila fila88 = new ds.Fila();
    fila88.imprime();
    boolean b90 = fila88.vazia();
    fila88.imprime();
    boolean b92 = fila88.vazia();
    fila88.imprime();
    fila78.enfileira((java.lang.Object)fila88);
    java.lang.Object obj95 = fila78.desenfileira();
    fila66.enfileira((java.lang.Object)fila78);
    fila0.enfileira((java.lang.Object)fila66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!"+ "'", obj34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1+ "'", obj46.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1+ "'", obj55.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 1+ "'", obj73.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj95);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test279"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    boolean b12 = fila8.vazia();
    fila6.enfileira((java.lang.Object)b12);
    java.lang.Object obj14 = null;
    fila6.enfileira(obj14);
    ds.Fila fila16 = new ds.Fila();
    boolean b17 = fila16.vazia();
    fila16.imprime();
    fila6.enfileira((java.lang.Object)fila16);
    java.lang.Object obj20 = fila6.desenfileira();
    fila6.enfileira((java.lang.Object)(short)(-1));
    boolean b23 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila25 = new ds.Fila();
    fila25.imprime();
    boolean b27 = fila25.vazia();
    fila25.imprime();
    fila0.enfileira((java.lang.Object)fila25);
    boolean b30 = fila25.vazia();
    ds.Fila fila31 = new ds.Fila();
    fila31.imprime();
    fila31.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj35 = null;
    fila31.enfileira(obj35);
    ds.Fila fila37 = new ds.Fila();
    fila37.imprime();
    boolean b39 = fila37.vazia();
    fila37.imprime();
    fila31.enfileira((java.lang.Object)fila37);
    fila25.enfileira((java.lang.Object)fila31);
    fila25.imprime();
    fila25.imprime();
    java.lang.Object obj45 = null;
    fila25.enfileira(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true+ "'", obj20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test280"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    boolean b9 = fila7.vazia();
    fila7.imprime();
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)b11);
    java.lang.Object obj13 = new java.lang.Object();
    fila0.enfileira(obj13);
    java.lang.Object obj15 = fila0.desenfileira();
    boolean b16 = fila0.vazia();
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    boolean b19 = fila17.vazia();
    fila17.imprime();
    fila17.imprime();
    fila17.enfileira((java.lang.Object)1);
    boolean b24 = fila17.vazia();
    ds.Fila fila25 = new ds.Fila();
    fila25.enfileira((java.lang.Object)(byte)1);
    fila25.imprime();
    fila17.enfileira((java.lang.Object)fila25);
    fila0.enfileira((java.lang.Object)fila17);
    java.lang.Object obj31 = fila0.desenfileira();
    fila0.imprime();
    boolean b33 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true+ "'", obj15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test281"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj4 = null;
    fila0.enfileira(obj4);
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)(short)0);
    fila6.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    fila14.enfileira((java.lang.Object)1);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    fila21.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj25 = fila21.desenfileira();
    fila14.enfileira(obj25);
    ds.Fila fila27 = new ds.Fila();
    fila27.imprime();
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    boolean b31 = fila29.vazia();
    fila29.imprime();
    boolean b33 = fila29.vazia();
    fila27.enfileira((java.lang.Object)b33);
    fila14.enfileira((java.lang.Object)fila27);
    fila6.enfileira((java.lang.Object)fila14);
    fila0.enfileira((java.lang.Object)fila14);
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    boolean b40 = fila38.vazia();
    fila38.imprime();
    fila38.imprime();
    fila38.enfileira((java.lang.Object)1);
    boolean b45 = fila38.vazia();
    fila38.imprime();
    ds.Fila fila47 = new ds.Fila();
    boolean b48 = fila47.vazia();
    fila47.imprime();
    boolean b50 = fila47.vazia();
    fila47.imprime();
    fila38.enfileira((java.lang.Object)fila47);
    boolean b53 = fila47.vazia();
    fila14.enfileira((java.lang.Object)fila47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!"+ "'", obj25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test282"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila2.imprime();
    boolean b6 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b6);
    java.lang.Object obj8 = null;
    fila0.enfileira(obj8);
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    fila10.imprime();
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila14 = new ds.Fila();
    fila14.imprime();
    boolean b16 = fila14.vazia();
    fila14.imprime();
    fila14.imprime();
    boolean b19 = fila14.vazia();
    fila10.enfileira((java.lang.Object)b19);
    boolean b21 = fila10.vazia();
    java.lang.Object obj22 = fila10.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + true+ "'", obj22.equals(true));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test283"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    boolean b11 = fila7.vazia();
    fila0.enfileira((java.lang.Object)fila7);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)"hi!");
    boolean b17 = fila13.vazia();
    fila13.imprime();
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    boolean b21 = fila19.vazia();
    fila19.imprime();
    fila19.imprime();
    fila19.imprime();
    fila19.imprime();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    boolean b28 = fila26.vazia();
    fila26.imprime();
    boolean b30 = fila26.vazia();
    fila19.enfileira((java.lang.Object)b30);
    java.lang.Object obj32 = new java.lang.Object();
    fila19.enfileira(obj32);
    fila13.enfileira(obj32);
    fila7.enfileira(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test284"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    boolean b10 = fila8.vazia();
    fila8.imprime();
    fila8.imprime();
    fila8.enfileira((java.lang.Object)1);
    ds.Fila fila15 = new ds.Fila();
    fila15.imprime();
    fila15.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj19 = fila15.desenfileira();
    fila8.enfileira(obj19);
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    ds.Fila fila23 = new ds.Fila();
    fila23.imprime();
    boolean b25 = fila23.vazia();
    fila23.imprime();
    boolean b27 = fila23.vazia();
    fila21.enfileira((java.lang.Object)b27);
    fila8.enfileira((java.lang.Object)fila21);
    fila0.enfileira((java.lang.Object)fila8);
    fila8.enfileira((java.lang.Object)'a');
    ds.Fila fila33 = new ds.Fila();
    fila33.imprime();
    boolean b35 = fila33.vazia();
    fila33.imprime();
    fila33.imprime();
    fila33.enfileira((java.lang.Object)1);
    boolean b40 = fila33.vazia();
    java.lang.Object obj41 = fila33.desenfileira();
    ds.Fila fila42 = new ds.Fila();
    fila42.imprime();
    boolean b44 = fila42.vazia();
    boolean b45 = fila42.vazia();
    fila42.enfileira((java.lang.Object)false);
    boolean b48 = fila42.vazia();
    boolean b49 = fila42.vazia();
    fila42.imprime();
    fila33.enfileira((java.lang.Object)fila42);
    fila8.enfileira((java.lang.Object)fila42);
    java.lang.Object obj53 = fila8.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1+ "'", obj41.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1+ "'", obj53.equals(1));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test285"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj15 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1+ "'", obj15.equals(1));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test286"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    boolean b8 = fila6.vazia();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)1);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    fila13.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj17 = fila13.desenfileira();
    fila6.enfileira(obj17);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    boolean b23 = fila21.vazia();
    fila21.imprime();
    boolean b25 = fila21.vazia();
    fila19.enfileira((java.lang.Object)b25);
    fila6.enfileira((java.lang.Object)fila19);
    fila0.enfileira((java.lang.Object)fila19);
    ds.Fila fila29 = new ds.Fila();
    fila29.imprime();
    fila29.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj33 = null;
    fila29.enfileira(obj33);
    ds.Fila fila35 = new ds.Fila();
    fila35.imprime();
    boolean b37 = fila35.vazia();
    fila35.imprime();
    fila29.enfileira((java.lang.Object)fila35);
    fila29.enfileira((java.lang.Object)1.0d);
    boolean b42 = fila29.vazia();
    fila0.enfileira((java.lang.Object)b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!"+ "'", obj17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test287"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    fila8.enfileira((java.lang.Object)(byte)1);
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    fila0.enfileira((java.lang.Object)10.0d);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    boolean b17 = fila0.vazia();
    fila0.imprime();
    boolean b19 = fila0.vazia();
    boolean b20 = fila0.vazia();
    java.lang.Object obj21 = null;
    fila0.enfileira(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test288"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1);
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    fila7.enfileira((java.lang.Object)"hi!");
    java.lang.Object obj11 = fila7.desenfileira();
    fila0.enfileira(obj11);
    ds.Fila fila13 = new ds.Fila();
    fila13.imprime();
    boolean b15 = fila13.vazia();
    fila13.imprime();
    boolean b17 = fila13.vazia();
    fila0.enfileira((java.lang.Object)fila13);
    ds.Fila fila19 = new ds.Fila();
    fila19.imprime();
    boolean b21 = fila19.vazia();
    fila19.imprime();
    fila19.imprime();
    fila19.enfileira((java.lang.Object)1);
    boolean b26 = fila19.vazia();
    ds.Fila fila27 = new ds.Fila();
    fila27.enfileira((java.lang.Object)(byte)1);
    fila27.imprime();
    fila19.enfileira((java.lang.Object)fila27);
    fila19.imprime();
    ds.Fila fila33 = new ds.Fila();
    boolean b34 = fila33.vazia();
    fila33.imprime();
    boolean b36 = fila33.vazia();
    fila33.imprime();
    ds.Fila fila38 = new ds.Fila();
    fila38.imprime();
    fila38.enfileira((java.lang.Object)"hi!");
    fila33.enfileira((java.lang.Object)fila38);
    fila33.imprime();
    fila33.imprime();
    boolean b45 = fila33.vazia();
    fila19.enfileira((java.lang.Object)b45);
    java.lang.Object obj47 = fila19.desenfileira();
    java.lang.Object obj48 = fila19.desenfileira();
    fila0.enfileira(obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1+ "'", obj47.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj48);

  }

}
