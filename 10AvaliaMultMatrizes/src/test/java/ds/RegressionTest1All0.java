package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test01"); }


    ds.AvaliaMultMatrizes avaliaMultMatrizes0 = new ds.AvaliaMultMatrizes();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test02"); }


    int[] i_array7 = new int[] { (-1), (short)(-1), 100, 0, '#' };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array7);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test03"); }


    int[] i_array9 = new int[] { (-1), (short)100, (short)1, 0, '#', (short)10 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test04"); }


    int[] i_array10 = new int[] { (-1), (short)100, (short)1, 0, '#', (short)10 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array10);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test05"); }


    int[] i_array10 = new int[] { (-1), (short)100, (short)1, 0, '#', (short)10 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test06"); }


    int[] i_array9 = new int[] { (byte)100, '4', 0, (byte)10, (short)100, (byte)(-1) };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test07"); }


    int[] i_array9 = new int[] { (-1), (short)100, (short)1, 0, '#', (short)10 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test08"); }


    int[] i_array8 = new int[] { (-1), (short)(-1), 100, 0, '#' };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test09"); }


    int[] i_array10 = new int[] { (-1), (short)100, (short)1, 0, '#', (short)10 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array10);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test10"); }


    int[] i_array8 = new int[] { (byte)100, '4', 0, (byte)10, (short)100, (byte)(-1) };
    ds.AvaliaMultMatrizes.multmatrize(0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

}
