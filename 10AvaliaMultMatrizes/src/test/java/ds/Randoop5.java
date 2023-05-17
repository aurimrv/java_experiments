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


    int[] i_array12 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test002"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test003"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test004"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test005"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test006"); }


    int[] i_array12 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test007"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test008"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test009"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test010"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test011"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array6);
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

    if (debug) { System.out.format("%n%s%n","Randoop5.test012"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test013"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test014"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test015"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test016"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test017"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test018"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test019"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test020"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test021"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test022"); }


    int[] i_array13 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test023"); }


    int[] i_array15 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test024"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test025"); }


    int[] i_array6 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array6);
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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test026"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array5);
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test027"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test028"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test029"); }


    int[] i_array5 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array5);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array5);
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
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test030"); }


    int[] i_array6 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array6);
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
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test031"); }


    int[] i_array9 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test032"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test033"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test034"); }


    int[] i_array4 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array4);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array4);
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
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test035"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test036"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test037"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test038"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test039"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test040"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test041"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test042"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test043"); }


    int[] i_array13 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test044"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test045"); }


    int[] i_array11 = new int[] { 0, (short)100, (short)100, (byte)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test046"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test047"); }


    int[] i_array16 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test048"); }


    int[] i_array13 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test049"); }


    int[] i_array7 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test050"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test051"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test052"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test053"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test054"); }


    int[] i_array12 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test055"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test056"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test057"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test058"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test059"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test060"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test061"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test062"); }


    int[] i_array7 = new int[] { '#', 1, (byte)0, (short)(-1) };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test063"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test064"); }


    int[] i_array8 = new int[] { 100, (byte)10, (short)100, (short)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test065"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test066"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test067"); }


    int[] i_array8 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test068"); }


    int[] i_array8 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test069"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test070"); }


    int[] i_array13 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test071"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test072"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test073"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test074"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test075"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test076"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test077"); }


    int[] i_array15 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test078"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test079"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test080"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array5);
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
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test081"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test082"); }


    int[] i_array9 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test083"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test084"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test085"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test086"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test087"); }


    int[] i_array4 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array4);
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test088"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test089"); }


    int[] i_array12 = new int[] { 0, (short)100, (short)100, (byte)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test090"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test091"); }


    int[] i_array15 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test092"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test093"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test094"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test095"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test096"); }


    int[] i_array5 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array5);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array5);
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
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test097"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test098"); }


    int[] i_array8 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test099"); }


    int[] i_array16 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test100"); }


    int[] i_array13 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test101"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test102"); }


    int[] i_array8 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test103"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test104"); }


    int[] i_array13 = new int[] { 0, (short)100, (short)100, (byte)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test105"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test106"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test107"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test108"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test109"); }


    int[] i_array17 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array17);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test110"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test111"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test112"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test113"); }


    int[] i_array8 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test114"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test115"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test116"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test117"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test118"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test119"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test120"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test121"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test122"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test123"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test124"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test125"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test126"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test127"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test128"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test129"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test130"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test131"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test132"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array6);
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
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test133"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test134"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test135"); }


    int[] i_array12 = new int[] { 0, (short)100, (short)100, (byte)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test136"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test137"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test138"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test139"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test140"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test141"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test142"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test143"); }


    int[] i_array16 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test144"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test145"); }


    int[] i_array8 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test146"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test147"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test148"); }


    int[] i_array7 = new int[] { '#', 1, (byte)0, (short)(-1) };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test149"); }


    int[] i_array9 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test150"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test151"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test152"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test153"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test154"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test155"); }


    int[] i_array8 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test156"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test157"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test158"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test159"); }


    int[] i_array12 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test160"); }


    int[] i_array13 = new int[] { 0, (short)100, (short)100, (byte)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test161"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test162"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test163"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test164"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test165"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test166"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test167"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test168"); }


    int[] i_array15 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test169"); }


    int[] i_array16 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test170"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test171"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test172"); }


    int[] i_array9 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test173"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test174"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test175"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test176"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test177"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test178"); }


    int[] i_array9 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test179"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test180"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test181"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test182"); }


    int[] i_array15 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test183"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test184"); }


    int[] i_array4 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test185"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test186"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test187"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test188"); }


    int[] i_array9 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test189"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test190"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test191"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test192"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test193"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test194"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test195"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test196"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test197"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test198"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test199"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test200"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test201"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test202"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test203"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array5);
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
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test204"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test205"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test206"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test207"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test208"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test209"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test210"); }


    int[] i_array15 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test211"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test212"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test213"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test214"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test215"); }


    int[] i_array15 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test216"); }


    int[] i_array17 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test217"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test218"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test219"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test220"); }


    int[] i_array8 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test221"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test222"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test223"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test224"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test225"); }


    int[] i_array16 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test226"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test227"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array6);
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
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test228"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test229"); }


    int[] i_array14 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test230"); }


    int[] i_array8 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test231"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test232"); }


    int[] i_array13 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test233"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test234"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test235"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test236"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test237"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test238"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test239"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test240"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test241"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test242"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test243"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test244"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test245"); }


    int[] i_array7 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test246"); }


    int[] i_array9 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test247"); }


    int[] i_array7 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test248"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array6);
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

    if (debug) { System.out.format("%n%s%n","Randoop5.test249"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test250"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test251"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test252"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test253"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test254"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test255"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test256"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array5);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array5);
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
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test257"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test258"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test259"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test260"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test261"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test262"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test263"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test264"); }


    int[] i_array16 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test265"); }


    int[] i_array17 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array17);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test266"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test267"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test268"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test269"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test270"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test271"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test272"); }


    int[] i_array16 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test273"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array6);
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
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test274"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test275"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test276"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test277"); }


    int[] i_array8 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test278"); }


    int[] i_array18 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array18);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test279"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test280"); }


    int[] i_array15 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test281"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test282"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test283"); }


    int[] i_array6 = new int[] { 100, (byte)10, (short)100, (short)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array6);
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

    if (debug) { System.out.format("%n%s%n","Randoop5.test284"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test285"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test286"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array6);
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
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test287"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test288"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test289"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test290"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test291"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test292"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test293"); }


    int[] i_array17 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test294"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test295"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test296"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test297"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test298"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test299"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test300"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test301"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test302"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test303"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test304"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test305"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test306"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test307"); }


    int[] i_array9 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test308"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test309"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test310"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test311"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array6);
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
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test312"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test313"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test314"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test315"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test316"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test317"); }


    int[] i_array13 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test318"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test319"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test320"); }


    int[] i_array16 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test321"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test322"); }


    int[] i_array11 = new int[] { 0, (short)100, (short)100, (byte)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test323"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test324"); }


    int[] i_array7 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test325"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test326"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test327"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test328"); }


    int[] i_array12 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test329"); }


    int[] i_array16 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test330"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test331"); }


    int[] i_array4 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array4);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test332"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test333"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array6);
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
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test334"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test335"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test336"); }


    int[] i_array9 = new int[] { 100, (byte)10, (short)100, (short)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test337"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test338"); }


    int[] i_array9 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test339"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test340"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test341"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test342"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test343"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test344"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test345"); }


    int[] i_array13 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test346"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test347"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test348"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test349"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test350"); }


    int[] i_array6 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array6);
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
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test351"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test352"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test353"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test354"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test355"); }


    int[] i_array16 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array16);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array16);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test356"); }


    int[] i_array18 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array18);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test357"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test358"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test359"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test360"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test361"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test362"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test363"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test364"); }


    int[] i_array9 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test365"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test366"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test367"); }


    int[] i_array9 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test368"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test369"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test370"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test371"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test372"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array5);
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
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test373"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test374"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test375"); }


    int[] i_array14 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test376"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test377"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test378"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test379"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test380"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test381"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test382"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test383"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test384"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test385"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test386"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test387"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test388"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test389"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test390"); }


    int[] i_array19 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array19);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array19);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array19);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array19);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array19);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array19);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array19);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array19);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array19);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array19);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array19);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array19);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array19);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array19);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array19);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test391"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test392"); }


    int[] i_array9 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test393"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test394"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test395"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array5);
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

    if (debug) { System.out.format("%n%s%n","Randoop5.test396"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test397"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test398"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test399"); }


    int[] i_array8 = new int[] { 100, (byte)10, (short)100, (short)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test400"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test401"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test402"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test403"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test404"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test405"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test406"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test407"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test408"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test409"); }


    int[] i_array8 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test410"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test411"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test412"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test413"); }


    int[] i_array15 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test414"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test415"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test416"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test417"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test418"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test419"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test420"); }


    int[] i_array12 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test421"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test422"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test423"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test424"); }


    int[] i_array17 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array17);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array17);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test425"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array5);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array5);
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
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test426"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test427"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test428"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test429"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array6);
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
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test430"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test431"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test432"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test433"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test434"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test435"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test436"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test437"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test438"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test439"); }


    int[] i_array7 = new int[] { 100, (byte)10, (short)100, (short)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test440"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test441"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test442"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test443"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test444"); }


    int[] i_array9 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test445"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test446"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test447"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test448"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test449"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test450"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test451"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array6);
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
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test452"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test453"); }


    int[] i_array14 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test454"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test455"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array6);
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
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test456"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test457"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test458"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test459"); }


    int[] i_array14 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test460"); }


    int[] i_array8 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test461"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test462"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test463"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test464"); }


    int[] i_array6 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array6);
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
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test465"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test466"); }


    int[] i_array7 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test467"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test468"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test469"); }


    int[] i_array10 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test470"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(100, i_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test471"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test472"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test473"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test474"); }


    int[] i_array9 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test475"); }


    int[] i_array5 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test476"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test477"); }


    int[] i_array6 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'a', i_array6);
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

    if (debug) { System.out.format("%n%s%n","Randoop5.test478"); }


    int[] i_array13 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test479"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test480"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test481"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test482"); }


    int[] i_array8 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array8);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test483"); }


    int[] i_array11 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test484"); }


    int[] i_array13 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test485"); }


    int[] i_array5 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array5);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array5);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test486"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize(10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test487"); }


    int[] i_array7 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test488"); }


    int[] i_array15 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array15);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array15);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test489"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test490"); }


    int[] i_array11 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test491"); }


    int[] i_array10 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test492"); }


    int[] i_array14 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array14);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array14);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test493"); }


    int[] i_array12 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test494"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test495"); }


    int[] i_array11 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array11);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array11);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test496"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(short)10, i_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test497"); }


    int[] i_array9 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize(1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test498"); }


    int[] i_array10 = new int[] { '4', (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test499"); }


    int[] i_array12 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array12);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array12);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop5.test500"); }


    int[] i_array13 = new int[] { (byte)10, 0, 0, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array13);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

}
