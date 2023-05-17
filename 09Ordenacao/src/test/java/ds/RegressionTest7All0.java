package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test1"); }


    ds.Ordenacao ordenacao0 = new ds.Ordenacao();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test2"); }


    int[] i_array1 = new int[] { 'a' };
    ds.Ordenacao.mergeSort(i_array1, (int)'4', (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array1, (int)'4', (int)(short)100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test3"); }


    int[] i_array1 = new int[] { 'a' };
    ds.Ordenacao.mergeSort(i_array1, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array1, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array1, (int)(short)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test4"); }


    int[] i_array6 = new int[] { 'a', 'a', (short)1, (short)0, (byte)10, 0 };
    ds.Ordenacao.mergeSort(i_array6, 10, 10);
    ds.Ordenacao.mergeSort(i_array6, (int)(short)100, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test5"); }


    int[] i_array1 = new int[] { 'a' };
    ds.Ordenacao.mergeSort(i_array1, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array1, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array1, (int)(short)0, 10);
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
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test6"); }


    int[] i_array1 = new int[] { 'a' };
    ds.Ordenacao.mergeSort(i_array1, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array1, 10, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array1, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test7"); }


    int[] i_array1 = new int[] { 'a' };
    ds.Ordenacao.mergeSort(i_array1, (int)'4', (int)(short)1);
    ds.Ordenacao.mergeSort(i_array1, (int)(short)10, (-1));
    ds.Ordenacao.mergeSort(i_array1, (int)(short)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array1, (int)(byte)10, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array1, (int)(short)0, (int)(short)0);
    ds.Ordenacao.mergeSort(i_array1, (int)' ', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);

  }

}
