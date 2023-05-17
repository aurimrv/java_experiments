package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9Maior0.test1"); }


    ds.Ordenacao ordenacao0 = new ds.Ordenacao();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9Maior0.test2"); }


    int[] i_array1 = new int[] { (-1) };
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array1, 0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9Maior0.test3"); }


    int[] i_array4 = new int[] { (byte)(-1), 10, (short)10, 100 };
    ds.Ordenacao.mergeSort(i_array4, (int)(byte)10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array4, (int)'#', (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9Maior0.test4"); }


    int[] i_array0 = new int[] {  };
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array0, 1, (int)'#');
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
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9Maior0.test5"); }


    int[] i_array4 = new int[] { (byte)(-1), 10, (short)10, 100 };
    ds.Ordenacao.mergeSort(i_array4, (int)(byte)10, (int)(byte)1);
    ds.Ordenacao.mergeSort(i_array4, 100, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

}
