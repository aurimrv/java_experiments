package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test01"); }


    ds.AvaliaMultMatrizes avaliaMultMatrizes0 = new ds.AvaliaMultMatrizes();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test02"); }


    int[] i_array6 = new int[] { 100, ' ', (byte)10, (byte)0, 0 };
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array6);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test03"); }


    int[] i_array2 = new int[] { 10 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)1, i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test04"); }


    int[] i_array1 = new int[] {  };
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)' ', i_array1);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test05"); }


    int[] i_array2 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array2);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array2);
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test06"); }


    int[] i_array2 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array2);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)'#', i_array2);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test07"); }


    int[] i_array2 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array2);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array2);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test08"); }


    int[] i_array2 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array2);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array2);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test09"); }


    int[] i_array3 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array3);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array3);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array3);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test10"); }


    int[] i_array3 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array3);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array3);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)10, i_array3);
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test11"); }


    int[] i_array4 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array4);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)100, i_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test12"); }


    int[] i_array4 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array4);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)'4', i_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test13"); }


    int[] i_array3 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array3);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array3);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test14"); }


    int[] i_array4 = new int[] {  };
    ds.AvaliaMultMatrizes.multmatrize((-1), i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array4);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array4);
    // The following exception was thrown during execution in test generation
    try {
    ds.AvaliaMultMatrizes.multmatrize((int)(short)100, i_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

}
