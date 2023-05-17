package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test1"); }


    ds.AvaliaMultMatrizes avaliaMultMatrizes0 = new ds.AvaliaMultMatrizes();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test2"); }


    int[] i_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test3"); }


    int[] i_array6 = new int[] { ' ', '4', (short)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array6);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test4"); }


    int[] i_array5 = new int[] { ' ', '4', (short)1 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array5);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array5);
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

}
