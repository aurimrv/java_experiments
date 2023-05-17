package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test01"); }


    ds.Ordenacao ordenacao0 = new ds.Ordenacao();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test02"); }


    int[] i_array5 = new int[] { (byte)10, '4', (short)10, (short)0, (-1) };
    ds.Ordenacao.mergeSort(i_array5, (int)'#', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array5, (-1), (-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array5, (int)' ', (int)(short)100);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test03"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.mergeSort(i_array0, (int)'#', 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array0, 1, 100);
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test04"); }


    int[] i_array5 = new int[] { (byte)10, '4', (short)10, (short)0, (-1) };
    ds.Ordenacao.mergeSort(i_array5, (int)'#', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array5, (int)(byte)0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test05"); }


    int[] i_array5 = new int[] { (byte)10, '4', (short)10, (short)0, (-1) };
    ds.Ordenacao.mergeSort(i_array5, (int)'#', (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array5, (int)(short)0, (int)'#');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test06"); }


    int[] i_array0 = null;
    ds.Ordenacao.mergeSort(i_array0, 0, (int)(short)(-1));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test07"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.mergeSort(i_array0, (int)'#', 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)10, (int)'a');
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test08"); }


    int[] i_array5 = new int[] { (byte)10, '4', (short)10, (short)0, (-1) };
    ds.Ordenacao.mergeSort(i_array5, (int)'#', (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.mergeSort(i_array5, 10, (int)'#');
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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test09"); }


    int[] i_array5 = new int[] { (byte)10, '4', (short)10, (short)0, (-1) };
    ds.Ordenacao.mergeSort(i_array5, (int)'#', (int)(short)10);
    ds.Ordenacao.mergeSort(i_array5, (-1), (-1));
    ds.Ordenacao.mergeSort(i_array5, (int)(short)10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test10"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.mergeSort(i_array0, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array0, (int)' ', (int)(byte)10);
    ds.Ordenacao.mergeSort(i_array0, (int)(byte)(-1), (-1));
    ds.Ordenacao.mergeSort(i_array0, (int)(short)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

}
