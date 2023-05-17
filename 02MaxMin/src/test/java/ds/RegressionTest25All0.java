package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test01"); }


    ds.MaxMin1 maxMin10 = new ds.MaxMin1();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test02"); }


    int[] i_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array2 = ds.MaxMin1.maxMin1(i_array0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test03"); }


    int[] i_array4 = new int[] { (byte)1, (-1), (short)10, (short)100 };
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array6, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test04"); }


    int[] i_array4 = new int[] { (byte)1, (-1), (short)10, (short)100 };
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array6, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test05"); }


    int[] i_array1 = new int[] { 10 };
    int[] i_array3 = ds.MaxMin1.maxMin1(i_array1, (int)(byte)(-1));
    int[] i_array5 = ds.MaxMin1.maxMin1(i_array1, (-1));
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array1, 1);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array7, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test06"); }


    int[] i_array3 = new int[] { 1, (byte)(-1), 0 };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array5 = ds.MaxMin1.maxMin1(i_array3, 10);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test07"); }


    int[] i_array4 = new int[] { (byte)1, (-1), (short)10, (short)100 };
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, (int)(short)1);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array4, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test08"); }


    int[] i_array1 = new int[] { 10 };
    int[] i_array3 = ds.MaxMin1.maxMin1(i_array1, (int)(byte)(-1));
    int[] i_array5 = ds.MaxMin1.maxMin1(i_array1, (-1));
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array1, 1);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array1, (int)(byte)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test09"); }


    int[] i_array1 = new int[] { 10 };
    int[] i_array3 = ds.MaxMin1.maxMin1(i_array1, (int)(byte)(-1));
    int[] i_array5 = ds.MaxMin1.maxMin1(i_array1, (-1));
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test10"); }


    int[] i_array1 = new int[] { 10 };
    int[] i_array3 = ds.MaxMin1.maxMin1(i_array1, (int)(byte)(-1));
    int[] i_array5 = ds.MaxMin1.maxMin1(i_array1, (-1));
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array7, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test11"); }


    int[] i_array1 = new int[] { 10 };
    int[] i_array3 = ds.MaxMin1.maxMin1(i_array1, (int)(byte)(-1));
    int[] i_array5 = ds.MaxMin1.maxMin1(i_array3, (-1));
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

}
