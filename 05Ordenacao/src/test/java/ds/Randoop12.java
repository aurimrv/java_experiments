package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop12 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test001"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test002"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
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
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test003"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
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
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test004"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test005"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
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

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test006"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test007"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
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
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test008"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test009"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test010"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test011"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test012"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test013"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
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
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test014"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test015"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
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
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test016"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
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
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test017"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (-1));
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
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test018"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
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
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test019"); }


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
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test020"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
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
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test021"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
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
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test022"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test023"); }


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
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test024"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test025"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test026"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test027"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test028"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test029"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
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
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test030"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test031"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test032"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test033"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
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
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test034"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test035"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
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
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test036"); }


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
    ds.Ordenacao.ordena(i_array3, 0);
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
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test037"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
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
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test038"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test039"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
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
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test040"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test041"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
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
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test042"); }


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
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test043"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
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
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test044"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
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
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test045"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test046"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
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
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test047"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test048"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
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
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test049"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test050"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 1);
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
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test051"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test052"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
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
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test053"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test054"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test055"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
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
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test056"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
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
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test057"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
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
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test058"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test059"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test060"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test061"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
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
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test062"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
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
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test063"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test064"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test065"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (-1));
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
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test066"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
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
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test067"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test068"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test069"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test070"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test071"); }


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
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
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
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test072"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test073"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
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
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test074"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test075"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test076"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test077"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
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
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test078"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test079"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test080"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
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
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test081"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test082"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 1);
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
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test083"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test084"); }


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
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
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
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test085"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test086"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test087"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test088"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test089"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test090"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
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
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test091"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test092"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test093"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test094"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
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
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test095"); }


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
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test096"); }


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
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test097"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test098"); }


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
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test099"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
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
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test100"); }


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
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test101"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
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
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test102"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test103"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test104"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test105"); }


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
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test106"); }


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
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test107"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
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
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test108"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test109"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test110"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test111"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
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
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test112"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test113"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, 1);
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
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test114"); }


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
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test115"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 1);
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
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test116"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
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
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test117"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test118"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test119"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test120"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
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
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test121"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (-1));
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
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test122"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test123"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 1);
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
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test124"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test125"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(byte)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test126"); }


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
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test127"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
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
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test128"); }


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
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test129"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
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
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test130"); }


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
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test131"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test132"); }


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
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test133"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, (-1));
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
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test134"); }


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
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test135"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test136"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test137"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test138"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test139"); }


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
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test140"); }


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
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test141"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test142"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test143"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
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
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test144"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test145"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    ds.Ordenacao.ordena(i_array2, (int)(short)1);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, 0);
    ds.Ordenacao.ordena(i_array2, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array2, (int)(short)0);
    ds.Ordenacao.ordena(i_array2, 0);
    ds.Ordenacao.ordena(i_array2, (int)(short)0);
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
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test146"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(byte)1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test147"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
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
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test148"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test149"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
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
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test150"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test151"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
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
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test152"); }


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
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test153"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test154"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
    ds.Ordenacao.ordena(i_array0, 1);
    ds.Ordenacao.ordena(i_array0, (-1));
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
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test155"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)1);
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
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test156"); }


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
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test157"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test158"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test159"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test160"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test161"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)1);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
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
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test162"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test163"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (-1));
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
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test164"); }


    int[] i_array5 = new int[] { 1, 1, 'a', 'a', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (-1));
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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test165"); }


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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test166"); }


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
    ds.Ordenacao.ordena(i_array6, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test167"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
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
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test168"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)0);
    ds.Ordenacao.ordena(i_array0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test169"); }


    int[] i_array3 = new int[] { ' ', (short)1, 100 };
    ds.Ordenacao.ordena(i_array3, 0);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)1);
    ds.Ordenacao.ordena(i_array3, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array3, (int)(short)0);
    ds.Ordenacao.ordena(i_array3, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test170"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, 0);
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array0, (-1));
    ds.Ordenacao.ordena(i_array0, (int)(byte)(-1));
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
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test171"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 1);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, 1);
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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test172"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test173"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (-1));
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
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test174"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array6, (-1));
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
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
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test175"); }


    int[] i_array6 = new int[] { (byte)1, (byte)100, (short)100, (byte)100, (byte)1, (-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(short)1);
    ds.Ordenacao.ordena(i_array6, 0);
    ds.Ordenacao.ordena(i_array6, (int)(short)0);
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
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test176"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
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
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test177"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 1);
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
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test178"); }


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
    ds.Ordenacao.ordena(i_array6, (-1));
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
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop12.test179"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(byte)1);
    ds.Ordenacao.ordena(i_array5, (int)(byte)(-1));
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, 0);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    ds.Ordenacao.ordena(i_array5, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

}
