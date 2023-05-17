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


    ds.MaxMin2 maxMin20 = new ds.MaxMin2();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test2"); }


    int[] i_array0 = new int[] {  };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array2 = ds.MaxMin2.maxMin2(i_array0, (int)(byte)(-1));
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
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test3"); }


    int[] i_array2 = new int[] { 10, (short)100 };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array4 = ds.MaxMin2.maxMin2(i_array2, (int)(byte)100);
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
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test4"); }


    int[] i_array6 = new int[] { 0, 'a', (byte)1, 100, (byte)1, (short)(-1) };
    int[] i_array8 = ds.MaxMin2.maxMin2(i_array6, (int)(byte)1);
    int[] i_array10 = ds.MaxMin2.maxMin2(i_array8, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array12 = ds.MaxMin2.maxMin2(i_array8, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test5"); }


    int[] i_array6 = new int[] { 0, 'a', (byte)1, 100, (byte)1, (short)(-1) };
    int[] i_array8 = ds.MaxMin2.maxMin2(i_array6, (int)(byte)1);
    int[] i_array10 = ds.MaxMin2.maxMin2(i_array6, (int)(byte)0);
    int[] i_array12 = ds.MaxMin2.maxMin2(i_array10, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array14 = ds.MaxMin2.maxMin2(i_array10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test6"); }


    int[] i_array6 = new int[] { 0, 'a', (byte)1, 100, (byte)1, (short)(-1) };
    int[] i_array8 = ds.MaxMin2.maxMin2(i_array6, (int)(byte)1);
    int[] i_array10 = ds.MaxMin2.maxMin2(i_array6, 1);
    int[] i_array12 = ds.MaxMin2.maxMin2(i_array6, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test7"); }


    int[] i_array6 = new int[] { 0, 'a', (byte)1, 100, (byte)1, (short)(-1) };
    int[] i_array8 = ds.MaxMin2.maxMin2(i_array6, (int)(byte)1);
    int[] i_array10 = ds.MaxMin2.maxMin2(i_array6, (int)(byte)0);
    int[] i_array12 = ds.MaxMin2.maxMin2(i_array10, 0);
    int[] i_array14 = ds.MaxMin2.maxMin2(i_array10, 0);
    int[] i_array16 = ds.MaxMin2.maxMin2(i_array10, (int)(byte)(-1));
    int[] i_array18 = ds.MaxMin2.maxMin2(i_array10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

}
