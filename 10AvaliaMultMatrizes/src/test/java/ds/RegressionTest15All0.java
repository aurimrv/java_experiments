package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test01"); }


    ds.AvaliaMultMatrizes avaliaMultMatrizes0 = new ds.AvaliaMultMatrizes();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test02"); }


    int[] i_array7 = new int[] { (short)1, '#', (byte)1, 0, 10, (short)(-1) };
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test03"); }


    int[] i_array6 = new int[] { (short)10, ' ', (byte)(-1), (short)0 };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array6);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize(10, i_array6);
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test04"); }


    int[] i_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize(100, i_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test05"); }


    int[] i_array5 = new int[] { (short)0, 'a', (short)(-1), '#' };
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test06"); }


    int[] i_array8 = new int[] { (short)10, ' ', (byte)(-1), (short)0 };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test07"); }


    int[] i_array9 = new int[] { (short)10, ' ', (byte)(-1), (short)0 };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test08"); }


    int[] i_array7 = new int[] { (short)(-1), (short)(-1), 10, (short)10, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test09"); }


    int[] i_array7 = new int[] { 1, 100, 1, ' ' };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array7);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test10"); }


    int[] i_array8 = new int[] { (short)(-1), (short)(-1), 10, (short)10, (byte)100 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

}
