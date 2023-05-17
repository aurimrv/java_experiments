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


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test002"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test003"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test004"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test005"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test006"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test007"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test008"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test009"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test010"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test011"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test012"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test013"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test014"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test015"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test016"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test017"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test018"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test019"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test020"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (-1));
    ds.Ordenacao.ordena(i_array2, (-1));
    ds.Ordenacao.ordena(i_array2, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test021"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test022"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test023"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test024"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test025"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test026"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test027"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test028"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test029"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test030"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test031"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test032"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test033"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test034"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test035"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test036"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test037"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test038"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test039"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test040"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test041"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test042"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test043"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test044"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test045"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test046"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test047"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test048"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test049"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test050"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test051"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test052"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test053"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test054"); }


    int[] i_array2 = new int[] { (byte)1, '#' };
    ds.Ordenacao.ordena(i_array2, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test055"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test056"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test057"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test058"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test059"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test060"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test061"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test062"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(short)0);
    ds.Ordenacao.ordena(i_array2, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test063"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test064"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test065"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test066"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test067"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test068"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test069"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test070"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test071"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test072"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test073"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test074"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test075"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test076"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test077"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test078"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test079"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test080"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test081"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test082"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test083"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test084"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test085"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test086"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test087"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test088"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test089"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test090"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test091"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test092"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test093"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test094"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test095"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test096"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test097"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test098"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test099"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test100"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test101"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test102"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test103"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test104"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test105"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test106"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test107"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test108"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test109"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test110"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test111"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test112"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, 0);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test113"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test114"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test115"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test116"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test117"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test118"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test119"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test120"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test121"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test122"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test123"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test124"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test125"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test126"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test127"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test128"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test129"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test130"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test131"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test132"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test133"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test134"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test135"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test136"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test137"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test138"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test139"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test140"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(short)0);
    ds.Ordenacao.ordena(i_array2, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test141"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test142"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test143"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test144"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test145"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test146"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test147"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test148"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test149"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test150"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test151"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test152"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test153"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test154"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test155"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test156"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test157"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test158"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test159"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test160"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test161"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test162"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test163"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test164"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test165"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test166"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test167"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (-1));
    ds.Ordenacao.ordena(i_array2, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test168"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test169"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test170"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test171"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test172"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test173"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test174"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test175"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test176"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test177"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test178"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test179"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test180"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test181"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test182"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test183"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test184"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test185"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test186"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test187"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test188"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test189"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test190"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test191"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test192"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test193"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test194"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test195"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test196"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test197"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test198"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test199"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test200"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test201"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test202"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test203"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test204"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test205"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test206"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test207"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test208"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test209"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test210"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test211"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test212"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test213"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test214"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test215"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test216"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test217"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test218"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test219"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test220"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test221"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test222"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test223"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test224"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test225"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test226"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test227"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test228"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test229"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test230"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test231"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test232"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test233"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test234"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test235"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test236"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test237"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test238"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test239"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test240"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test241"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test242"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test243"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test244"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test245"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test246"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test247"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test248"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test249"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test250"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test251"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test252"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test253"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test254"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test255"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test256"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test257"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test258"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test259"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test260"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test261"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test262"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test263"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test264"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test265"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test266"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test267"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)0);
    ds.Ordenacao.ordena(i_array2, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test268"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test269"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test270"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test271"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test272"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test273"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test274"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test275"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test276"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test277"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test278"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test279"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test280"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test281"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test282"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test283"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test284"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test285"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, 1);
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test286"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test287"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test288"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test289"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test290"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test291"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test292"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test293"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test294"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test295"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test296"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test297"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test298"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test299"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test300"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test301"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test302"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test303"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test304"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test305"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test306"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test307"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test308"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test309"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test310"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test311"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test312"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test313"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test314"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test315"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test316"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(byte)0);
    ds.Ordenacao.ordena(i_array2, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test317"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test318"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test319"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test320"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test321"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test322"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test323"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test324"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test325"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test326"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test327"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test328"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test329"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test330"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test331"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test332"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test333"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test334"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test335"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test336"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test337"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test338"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test339"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test340"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test341"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test342"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test343"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test344"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test345"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test346"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test347"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test348"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test349"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test350"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test351"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test352"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test353"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test354"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test355"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test356"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test357"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test358"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test359"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test360"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test361"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test362"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test363"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test364"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test365"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test366"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test367"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test368"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test369"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test370"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test371"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)0);
    ds.Ordenacao.ordena(i_array2, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test372"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test373"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test374"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test375"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test376"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test377"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test378"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test379"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test380"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test381"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test382"); }


    int[] i_array6 = new int[] { (byte)0, 0, (short)0, ' ', (byte)100, 0 };
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test383"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test384"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test385"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test386"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test387"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test388"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test389"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test390"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test391"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test392"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test393"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test394"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test395"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test396"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test397"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test398"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test399"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test400"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test401"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test402"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test403"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test404"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test405"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test406"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test407"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test408"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test409"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test410"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test411"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test412"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test413"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test414"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test415"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test416"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test417"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test418"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test419"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test420"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test421"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test422"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test423"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test424"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test425"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test426"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test427"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test428"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test429"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test430"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test431"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test432"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test433"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test434"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test435"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test436"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test437"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test438"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test439"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test440"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test441"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test442"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test443"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(byte)0);
    ds.Ordenacao.ordena(i_array2, (int)(short)0);
    ds.Ordenacao.ordena(i_array2, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array2, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test444"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test445"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test446"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test447"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test448"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test449"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test450"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test451"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test452"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (-1));
    ds.Ordenacao.ordena(i_array2, (-1));
    ds.Ordenacao.ordena(i_array2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test453"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test454"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test455"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test456"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test457"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test458"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test459"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test460"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test461"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test462"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test463"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test464"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test465"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test466"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test467"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test468"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test469"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test470"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (-1));
    ds.Ordenacao.ordena(i_array3, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test471"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test472"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test473"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test474"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test475"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test476"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test477"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test478"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test479"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test480"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test481"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test482"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (-1));
    ds.Ordenacao.ordena(i_array3, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test483"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test484"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test485"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test486"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test487"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test488"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test489"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test490"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test491"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test492"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test493"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test494"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array6, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test495"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test496"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array3, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test497"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array5, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test498"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test499"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop4.test500"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.ordena(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

}
