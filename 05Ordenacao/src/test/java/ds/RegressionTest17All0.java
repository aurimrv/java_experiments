package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17All0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test1"); }


    int[] i_array3 = new int[] { ' ', (byte)100, (short)0 };
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.ordena(i_array3, (int)(byte)100);
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
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test2"); }


    int[] i_array6 = new int[] { (short)100, (byte)100, 'a', (byte)1, (byte)10, 1 };
    ds.Ordenacao.ordena(i_array6, (-1));
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
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test3"); }


    ds.Ordenacao ordenacao0 = new ds.Ordenacao();

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test4"); }


    int[] i_array0 = null;
    ds.Ordenacao.ordena(i_array0, 1);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test5"); }


    int[] i_array6 = new int[] { (short)100, (byte)100, 'a', (byte)1, (byte)10, 1 };
    ds.Ordenacao.ordena(i_array6, (-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Ordenacao.ordena(i_array6, (int)'#');
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
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test6"); }


    int[] i_array2 = new int[] { (-1), 0 };
    ds.Ordenacao.ordena(i_array2, 0);
    ds.Ordenacao.ordena(i_array2, (int)(byte)0);
    ds.Ordenacao.ordena(i_array2, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test7"); }


    int[] i_array0 = null;
    ds.Ordenacao.ordena(i_array0, (int)(byte)0);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test8"); }


    int[] i_array2 = new int[] { (-1), 0 };
    ds.Ordenacao.ordena(i_array2, 0);
    ds.Ordenacao.ordena(i_array2, (int)(byte)0);
    ds.Ordenacao.ordena(i_array2, (int)(byte)1);
    ds.Ordenacao.ordena(i_array2, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

}
