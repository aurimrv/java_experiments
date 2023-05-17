package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test001"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)100);
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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test002"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test003"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test004"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test005"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)'#');
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
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test006"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'a');
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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test007"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 100);
    ds.Ordenacao.mergeSort(i_array2, 100, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)100);
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
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test008"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array6, (int)'4', (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test009"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)'a');
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
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test010"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)100);
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
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test011"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test012"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)10);
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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test013"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test014"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test015"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 100);
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
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test016"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array6, 1, (-1));
    ds.Ordenacao.mergeSort(i_array6, (int)'#', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array6, 100, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test017"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test018"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array6, (int)'#', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test019"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 1, (int)'#');
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
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test020"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test021"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test022"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 10);
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test023"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test024"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array6, (int)'a', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test025"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test026"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test027"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'a');
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test028"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test029"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test030"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test031"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)'a');
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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test032"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, (int)'4');
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
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test033"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test034"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test035"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test036"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test037"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, 100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, (int)'4', 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array6, (int)(byte)1, (int)' ');
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
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test038"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, (int)' ');
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test039"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)10);
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

    if (debug) { System.out.format("%n%s%n","Randoop5.test040"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test041"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)0, (-1));
    ds.Ordenacao.mergeSort(i_array6, (int)(short)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array6, 100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test042"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test043"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test044"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)10, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array6, (int)(byte)0, (int)(short)10);
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

    if (debug) { System.out.format("%n%s%n","Randoop5.test045"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test046"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)'#');
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
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test047"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test048"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test049"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test050"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)100);
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
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test051"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test052"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)100);
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
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test053"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)' ');
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
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test054"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 10, 100);
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

    if (debug) { System.out.format("%n%s%n","Randoop5.test055"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test056"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test057"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test058"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test059"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test060"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test061"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 0);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)100);
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
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test062"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test063"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test064"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test065"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test066"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test067"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test068"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test069"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)100);
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
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test070"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test071"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)'4', (int)' ');
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test072"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test073"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test074"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test075"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)100);
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
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test076"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, 10, 0);
    ds.Ordenacao.mergeSort(i_array6, (int)'a', (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test077"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test078"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'a');
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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test079"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)100);
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
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test080"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test081"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test082"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 10);
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
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test083"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, 100);
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
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test084"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test085"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)100);
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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test086"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test087"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'#', 100);
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test088"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test089"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test090"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test091"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test092"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)10);
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test093"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test094"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test095"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 1, (int)'a');
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test096"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test097"); }


    int[] i_array6 = new int[] { 'a', '4', 1, 0, '#', (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array6, 1, (int)'a');
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
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test098"); }


    int[] i_array4 = new int[] { 100, 100, (short)0, 10 };
    ds.Ordenacao.mergeSort(i_array4, 10, 1);
    ds.Ordenacao.mergeSort(i_array4, (int)'4', (int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array4, (int)(byte)0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test099"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test100"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test101"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test102"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test103"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test104"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test105"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 10);
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
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test106"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, 10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)100);
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
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test107"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test108"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test109"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test110"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)100);
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
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test111"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test112"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test113"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test114"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 10);
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
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test115"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test116"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 10, (int)'4');
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
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test117"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test118"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)'#');
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
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test119"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test120"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test121"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test122"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test123"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test124"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 100);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test125"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test126"); }


    int[] i_array0 = null;
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)(-1), (-1));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test127"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)10);
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
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test128"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)100);
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
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test129"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)10);
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
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test130"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array6, (int)'#', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, (int)'a', 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test131"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test132"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test133"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test134"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test135"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'4');
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
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test136"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 100);
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
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test137"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test138"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)'#');
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
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test139"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test140"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test141"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)10);
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
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test142"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test143"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test144"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test145"); }


    int[] i_array4 = new int[] { (byte)10, '4', (byte)10, 'a' };
    ds.Ordenacao.mergeSort(i_array4, (int)'#', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array4, (int)(byte)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test146"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test147"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test148"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test149"); }


    int[] i_array0 = null;
    ds.Ordenacao.mergeSort(i_array0, 100, (int)(short)10);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test150"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test151"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)100);
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
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test152"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test153"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test154"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test155"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test156"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test157"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test158"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test159"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test160"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test161"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test162"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test163"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)'a');
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
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test164"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test165"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, (int)'a');
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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test166"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test167"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test168"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test169"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test170"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test171"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test172"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test173"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test174"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 100);
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
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test175"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)' ');
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
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test176"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test177"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test178"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)10);
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
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test179"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test180"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test181"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)'4');
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
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test182"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test183"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)'4');
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
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test184"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test185"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)100);
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
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test186"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, 100, (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test187"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test188"); }


    int[] i_array4 = new int[] { 100, 100, (short)0, 10 };
    ds.Ordenacao.mergeSort(i_array4, 10, 1);
    ds.Ordenacao.mergeSort(i_array4, 10, 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array4, (int)'#', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test189"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test190"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test191"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)'4', (int)' ');
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)'a', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array6, (int)' ', 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)100, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test192"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)10);
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
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test193"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test194"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test195"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test196"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test197"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test198"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test199"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test200"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test201"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test202"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)' ');
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
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test203"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test204"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test205"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test206"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test207"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test208"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test209"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test210"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)100);
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
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test211"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)100);
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
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test212"); }


    int[] i_array0 = null;
    ds.Ordenacao.mergeSort(i_array0, (int)'a', (int)' ');

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test213"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)0, (-1));
    ds.Ordenacao.mergeSort(i_array6, (int)'a', (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test214"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, 100);
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
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test215"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)100);
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
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test216"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)' ');
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
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test217"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 10, (int)'#');
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
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test218"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test219"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)'a');
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
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test220"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)10);
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
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test221"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test222"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)100);
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
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test223"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array6, (int)'4', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test224"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 100);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test225"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array6, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test226"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test227"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test228"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test229"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test230"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test231"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test232"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.mergeSort(i_array0, 100, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array0, 0, (int)(short)1);
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
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test233"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'a', 100);
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
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test234"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test235"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test236"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test237"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test238"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)' ');
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
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test239"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test240"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test241"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test242"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)100, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test243"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test244"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test245"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test246"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test247"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, (int)'4');
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
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test248"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test249"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test250"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test251"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 10);
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
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test252"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test253"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test254"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test255"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test256"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, 10, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 10, (int)'#');
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
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test257"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)(-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test258"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(short)100);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test259"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 100);
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
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test260"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test261"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)10);
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
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test262"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 1, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, (int)'4');
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
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test263"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (-1), (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test264"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 10, 100);
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
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test265"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, (int)'#');
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
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test266"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)'4');
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
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test267"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test268"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 10);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test269"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test270"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test271"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, 1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)10, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)0, 1);
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)10, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test272"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 100);
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
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test273"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)'4');
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
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test274"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, 100, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test275"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 0, 100);
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
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test276"); }


    int[] i_array0 = null;
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)10, 10);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test277"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test278"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, 100, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, 10, (int)' ');
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
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test279"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, 10, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test280"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test281"); }


    int[] i_array6 = new int[] { (byte)1, (byte)(-1), 0, 1, '4', (byte)100 };
    ds.Ordenacao.mergeSort(i_array6, 0, 1);
    ds.Ordenacao.mergeSort(i_array6, 0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array6, 10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (-1));
    ds.Ordenacao.mergeSort(i_array6, (int)(byte)10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test282"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'a', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test283"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)' ');
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
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test284"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test285"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, 1);
    ds.Ordenacao.mergeSort(i_array2, 10, 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test286"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'a');
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
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test287"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 10, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)' ');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)100);
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
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test288"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'a', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 1, 1);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test289"); }


    int[] i_array4 = new int[] { 100, 100, (short)0, 10 };
    ds.Ordenacao.mergeSort(i_array4, 10, 1);
    ds.Ordenacao.mergeSort(i_array4, (int)(byte)10, (int)(short)1);
    ds.Ordenacao.mergeSort(i_array4, (int)'a', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test290"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)0, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test291"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)10, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)1, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test292"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)1, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)0, (int)(byte)0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, 0, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, 100, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test293"); }


    int[] i_array2 = new int[] { (short)1, (-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, 0);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)(byte)100);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)100, (int)'a');
    ds.Ordenacao.mergeSort(i_array2, (int)'#', (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 10);
    ds.Ordenacao.mergeSort(i_array2, 100, 100);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 1);
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(short)10);
    ds.Ordenacao.mergeSort(i_array2, (int)(short)100, (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array2, (int)' ', (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

}
