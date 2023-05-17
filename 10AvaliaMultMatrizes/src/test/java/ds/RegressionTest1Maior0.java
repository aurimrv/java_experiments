package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test1"); }


    ds.AvaliaMultMatrizes avaliaMultMatrizes0 = new ds.AvaliaMultMatrizes();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test2"); }


    int[] i_array9 = new int[] { (-1), (short)100, (short)1, 0, '#', (short)10 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)1, i_array9);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array9);
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test3"); }


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

}
