package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test1"); }


    ds.Ordenacao ordenacao0 = new ds.Ordenacao();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test2"); }


    int[] i_array6 = new int[] { 0, 'a', (byte)1, 100, (byte)1, (short)(-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test3"); }


    int[] i_array6 = new int[] { 0, 'a', (byte)1, 100, (byte)1, (short)(-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.ordena(i_array6, (int)(byte)100);
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
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test4"); }


    int[] i_array6 = new int[] { 0, 'a', (byte)1, 100, (byte)1, (short)(-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)0);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.ordena(i_array6, (int)(short)100);
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
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test5"); }


    int[] i_array5 = new int[] { (byte)(-1), (short)1, 1, (byte)1, (short)(-1) };
    ds.Ordenacao.ordena(i_array5, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test6"); }


    int[] i_array5 = new int[] { (byte)10, (byte)0, (short)0, (short)100, (short)0 };
    ds.Ordenacao.ordena(i_array5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test7"); }


    int[] i_array6 = new int[] { 0, 'a', (byte)1, 100, (byte)1, (short)(-1) };
    ds.Ordenacao.ordena(i_array6, (int)(byte)1);
    ds.Ordenacao.ordena(i_array6, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.ordena(i_array6, (int)'4');
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

}
