package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop6 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test001"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)100, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test002"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test003"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test004"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)10, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test005"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test006"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, 1, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, (int)(short)100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test007"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)(-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test008"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array30, (int)' ', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test009"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test010"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, 1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test011"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)' ', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test012"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, (int)'4', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test013"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test014"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test015"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, 100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test016"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)'4', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test017"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, (int)' ', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test018"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test019"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test020"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)100, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test021"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array9, (int)'4', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test022"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 1, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)'a', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test023"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test024"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(short)(-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test025"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)' ', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test026"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(short)1);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)0);
    int[] i_array39 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test027"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test028"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)'#', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test029"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)'a', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test030"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test031"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test032"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test033"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (-1), (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test034"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)'#', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test035"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test036"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(byte)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test037"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)(-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test038"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, (int)'4', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test039"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)10, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test040"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, (int)(byte)1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test041"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)(-1), (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test042"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(short)1);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array36, 0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test043"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)(-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test044"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test045"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, (int)'4', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test046"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(short)0, (int)(short)1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 0, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test047"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 100, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test048"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)100, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test049"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test050"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, (int)(short)10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test051"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)1, 0);
    int[] i_array39 = ds.MaxMin4.maxMin4(i_array33, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array42 = ds.MaxMin4.maxMin4(i_array33, (int)(byte)10, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test052"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)'#', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test053"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)(-1), (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test054"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, (int)(short)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test055"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test056"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (-1), (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test057"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test058"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)100, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test059"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (-1), (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test060"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test061"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, (int)'4', (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test062"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test063"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array9, (int)(short)10, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test064"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test065"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 1, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)'#', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test066"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test067"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)'a', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test068"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)(-1), (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test069"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array12, (int)(short)(-1), (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test070"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test071"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)' ', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test072"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)'4', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test073"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test074"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)(-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test075"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test076"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)' ', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test077"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test078"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)10, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test079"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test080"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test081"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)(-1), (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test082"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)10, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test083"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test084"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array21, (int)' ', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test085"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test086"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(short)1);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array36, (int)(byte)(-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test087"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test088"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)'4', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test089"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)1, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test090"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)'#', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test091"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test092"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 1, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test093"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 1, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test094"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)100, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test095"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test096"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)10, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test097"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 1, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test098"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test099"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, (int)(short)0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 0, (int)(short)0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array33, (int)'a', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test100"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)1, 0);
    int[] i_array39 = ds.MaxMin4.maxMin4(i_array33, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array42 = ds.MaxMin4.maxMin4(i_array33, (int)'#', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test101"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)'#', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test102"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(short)10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test103"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (-1), (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test104"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, (int)' ', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test105"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test106"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)100, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test107"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test108"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test109"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test110"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test111"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)'a', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test112"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array36, 1, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test113"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array24, (int)(short)(-1), 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test114"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test115"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test116"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test117"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)100, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test118"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 100, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test119"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(short)10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test120"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(short)0, (int)(short)1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test121"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)'a', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test122"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, (-1), (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test123"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, 1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test124"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)' ', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test125"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)'4', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test126"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test127"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 10, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test128"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test129"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test130"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, 1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test131"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(short)0, (int)(short)1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)(-1), (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test132"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test133"); }


    int[] i_array3 = new int[] { (byte)(-1), (short)1, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array6 = ds.MaxMin4.maxMin4(i_array3, (int)(byte)1, (int)(byte)10);
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

    if (debug) { System.out.format("%n%s%n","Randoop6.test134"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)'4', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test135"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)10, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test136"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(short)1);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array36, (int)(byte)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test137"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)(-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test138"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, 10, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test139"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test140"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 1, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, (int)(short)1, 0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test141"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)' ', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test142"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)100, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test143"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test144"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test145"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test146"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)'4', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test147"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)'a', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test148"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test149"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, (int)(short)0, 1);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array36, (int)'a', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test150"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test151"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test152"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)10, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test153"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, (int)(short)0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array30, (int)'4', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test154"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)10, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test155"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test156"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 1, 1);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array36, (int)(byte)100, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test157"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test158"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 1, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array9, 0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test159"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, 100, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test160"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)'a', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test161"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test162"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(short)(-1), (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test163"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test164"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 10, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test165"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, (int)(short)10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test166"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 1, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test167"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(short)0, (int)(short)1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 0, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, 0, 1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test168"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test169"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test170"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(short)0, (int)(short)1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 0, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, 0, 1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)' ', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test171"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 10, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test172"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)' ', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test173"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, (int)(short)(-1), (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test174"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array15, 0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test175"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test176"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test177"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 1, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test178"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, 100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test179"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test180"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)' ', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test181"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(short)0, (int)(short)1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 0, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, 0, 1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)0, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array27, (int)(short)(-1), (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test182"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, (int)'a', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test183"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)'#', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test184"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)'4', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test185"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(short)1, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test186"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)(-1), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test187"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test188"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(short)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array30, (int)'#', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test189"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)(-1), (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test190"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array18, 10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test191"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)1, 0);
    int[] i_array39 = ds.MaxMin4.maxMin4(i_array36, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array42 = ds.MaxMin4.maxMin4(i_array39, (int)(short)10, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test192"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test193"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(short)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test194"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test195"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)' ', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test196"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(byte)100, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test197"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, (-1), (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test198"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test199"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test200"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array21, (int)'4', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test201"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)'a', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test202"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)(-1), (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test203"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)'a', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test204"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(short)0, (int)(short)1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)(-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test205"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test206"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)1);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array27, 0, 0);
    int[] i_array39 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test207"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)' ', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test208"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(byte)1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test209"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)'a', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test210"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)10, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test211"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (-1), (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test212"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)'#', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test213"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test214"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)'#', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test215"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)'a', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test216"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 1, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 1, 1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test217"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array9, 10, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test218"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array33, (int)(byte)10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test219"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)(-1), (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test220"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test221"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test222"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)'a', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test223"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)(-1), (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test224"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, (int)(byte)100, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test225"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (-1), (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test226"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(short)0, (int)(short)1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 0, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, 1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test227"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test228"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)'4', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test229"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test230"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test231"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(short)0, (int)(short)1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 0, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, 0, 1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)'4', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test232"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)' ', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test233"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, (int)'4', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test234"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 1, 1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)'#', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test235"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(byte)10, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test236"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test237"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test238"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)0, (int)(short)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array12, (int)(short)(-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test239"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)'#', (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test240"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test241"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)'4', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test242"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, 0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test243"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, 100, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test244"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test245"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array15, 100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test246"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, 1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)'a', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test247"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(short)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)'4', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test248"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)1, 0);
    int[] i_array39 = ds.MaxMin4.maxMin4(i_array36, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array42 = ds.MaxMin4.maxMin4(i_array36, (int)' ', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test249"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 1, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)'a', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test250"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test251"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)'#', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test252"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test253"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test254"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test255"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)0, (int)(short)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test256"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)'#', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test257"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test258"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test259"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test260"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array18, (int)' ', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test261"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array21, 1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test262"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test263"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test264"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)1, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, 1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test265"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array12, (int)(short)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test266"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array12, 100, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test267"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test268"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test269"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)100, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test270"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)100, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test271"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, (int)(short)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(byte)100, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test272"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test273"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test274"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test275"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)'a', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test276"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 100, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test277"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array3 = ds.MaxMin4.maxMin4(i_array0, (int)'#', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test278"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)1, 0);
    int[] i_array39 = ds.MaxMin4.maxMin4(i_array33, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array42 = ds.MaxMin4.maxMin4(i_array33, (int)'4', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test279"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test280"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, (int)'a', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test281"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, (int)(short)100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test282"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test283"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test284"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, (int)'#', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test285"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, (int)'a', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test286"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(byte)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)'a', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test287"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, (int)(byte)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, (int)'4', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test288"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array9, (int)(short)(-1), (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test289"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test290"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)100, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test291"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test292"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array30, 10, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test293"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, (int)(byte)0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test294"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)0, (int)(byte)1);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(byte)0);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array36, (int)(byte)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test295"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)1, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test296"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(short)1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (-1), (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test297"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array9, 0, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)1, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, 1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test298"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array12, (int)(short)0, (int)(byte)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 1, (int)(short)0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, 0, (int)(byte)1);
    int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array39 = ds.MaxMin4.maxMin4(i_array33, 0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test299"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 1, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test300"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, 1, (int)(byte)0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)'#', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test301"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(short)1, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, 0, 0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (int)(short)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array33, (int)(byte)(-1), 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test302"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, 100, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test303"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(short)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (-1), (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test304"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array6, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)1, (int)(short)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array6, 0, 0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array6, (int)(byte)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)' ', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test305"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, 0, 1);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array15, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, 1, 0);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array30, (-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test306"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(byte)0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array18, (int)(short)1, (int)(short)1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)1, (int)(short)0);
    int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array36 = ds.MaxMin4.maxMin4(i_array27, (int)'#', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test307"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)(short)0, (int)(short)0);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array18, (int)(byte)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test308"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array12, 1, 0);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)0, (int)(short)1);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, (int)(byte)1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, (int)(short)1, 0);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array21, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, 10, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test309"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, (int)(byte)0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)1, 1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array15, (int)(byte)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, (int)' ', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop6.test310"); }


    int[] i_array6 = new int[] { 'a', 'a', '#', '4', 1, (short)0 };
    int[] i_array9 = ds.MaxMin4.maxMin4(i_array6, 1, 0);
    int[] i_array12 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, 0);
    int[] i_array15 = ds.MaxMin4.maxMin4(i_array9, (int)(short)0, (int)(byte)1);
    int[] i_array18 = ds.MaxMin4.maxMin4(i_array9, (int)(byte)1, (int)(short)0);
    int[] i_array21 = ds.MaxMin4.maxMin4(i_array18, 0, 1);
    int[] i_array24 = ds.MaxMin4.maxMin4(i_array21, 0, 1);
    int[] i_array27 = ds.MaxMin4.maxMin4(i_array24, (int)(byte)0, 1);
    int[] i_array30 = ds.MaxMin4.maxMin4(i_array27, (int)(short)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array33 = ds.MaxMin4.maxMin4(i_array27, 10, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

}
