package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test01"); }


    int[] i_array5 = new int[] { (byte)1, (short)1, (short)(-1), (byte)100, (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array5, (int)' ', (int)(byte)100);
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test02"); }


    ds.Ordenacao ordenacao0 = new ds.Ordenacao();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test03"); }


    int[] i_array2 = new int[] { (short)1, (short)(-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)(-1));
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test04"); }


    int[] i_array5 = new int[] { '#', (byte)1, (-1), (-1), (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array5, (int)(byte)0, (int)(short)100);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test05"); }


    int[] i_array5 = new int[] { (byte)10, (byte)100, ' ', (short)10, '4' };
    ds.Ordenacao.mergeSort(i_array5, (int)'#', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test06"); }


    int[] i_array1 = new int[] { 0 };
    ds.Ordenacao.mergeSort(i_array1, (int)'4', (int)'4');
    ds.Ordenacao.mergeSort(i_array1, (int)'#', 0);
    ds.Ordenacao.mergeSort(i_array1, (int)(short)0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test07"); }


    int[] i_array2 = new int[] { (short)1, (short)(-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, (int)'4', (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test08"); }


    int[] i_array2 = new int[] { (short)1, (short)(-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array2, 0, 10);
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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test09"); }


    int[] i_array0 = null;
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)10, (int)(short)10);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test10"); }


    int[] i_array2 = new int[] { (short)1, (short)(-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test11"); }


    int[] i_array2 = new int[] { (short)1, (short)(-1) };
    ds.Ordenacao.mergeSort(i_array2, (int)' ', 0);
    ds.Ordenacao.mergeSort(i_array2, 1, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array2, 100, (int)'#');
    ds.Ordenacao.mergeSort(i_array2, (int)(byte)10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

}
