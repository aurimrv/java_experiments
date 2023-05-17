package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test01"); }


    ds.MaxMin3 maxMin30 = new ds.MaxMin3();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test02"); }


    int[] i_array6 = new int[] { ' ', 'a', (byte)10, 100, (byte)0, 1 };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, 100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test03"); }


    int[] i_array0 = new int[] {  };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array2 = ds.MaxMin3.maxMin3(i_array0, (int)(byte)1);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test04"); }


    int[] i_array0 = new int[] {  };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array2 = ds.MaxMin3.maxMin3(i_array0, (int)'4');
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test05"); }


    int[] i_array5 = new int[] { '4', 1, (-1), (short)1, '4' };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array7 = ds.MaxMin3.maxMin3(i_array5, (int)'4');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test06"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array8, (int)'4');
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

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test07"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array8, 10);
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

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test08"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array8, (int)(short)100);
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

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test09"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array6, (int)'#');
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

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test10"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array6, (int)(short)100);
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

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test11"); }


    int[] i_array1 = new int[] { 100 };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array3 = ds.MaxMin3.maxMin3(i_array1, (int)(byte)(-1));
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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test12"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array6, 10);
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

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test13"); }


    int[] i_array5 = new int[] { (short)0, 10, ' ', (short)10, (-1) };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array7 = ds.MaxMin3.maxMin3(i_array5, (int)(byte)100);
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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test14"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array12 = ds.MaxMin3.maxMin3(i_array10, 10);
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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test15"); }


    int[] i_array5 = new int[] { 100, (short)10, (byte)(-1), (byte)(-1), 'a' };
    int[] i_array7 = ds.MaxMin3.maxMin3(i_array5, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test16"); }


    int[] i_array4 = new int[] { (byte)10, (short)(-1), '#', '4' };
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array6 = ds.MaxMin3.maxMin3(i_array4, (int)' ');
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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test17"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array12 = ds.MaxMin3.maxMin3(i_array6, (int)(byte)100);
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
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test18"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array8, 1);
    int[] i_array12 = ds.MaxMin3.maxMin3(i_array8, (int)(byte)0);
    int[] i_array14 = ds.MaxMin3.maxMin3(i_array8, (-1));
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array16 = ds.MaxMin3.maxMin3(i_array8, (int)(byte)10);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test19"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array6, 0);
    int[] i_array12 = ds.MaxMin3.maxMin3(i_array10, (int)(byte)0);
    
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
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test20"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array6, 0);
    // The following exception was thrown during execution in test generation
    try {
    int[] i_array12 = ds.MaxMin3.maxMin3(i_array6, (int)'#');
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
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test21"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array8, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test22"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array6, 0);
    int[] i_array12 = ds.MaxMin3.maxMin3(i_array10, 0);
    int[] i_array14 = ds.MaxMin3.maxMin3(i_array10, (int)(byte)0);
    
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

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test23"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array8, 1);
    int[] i_array12 = ds.MaxMin3.maxMin3(i_array8, (int)(byte)0);
    int[] i_array14 = ds.MaxMin3.maxMin3(i_array8, (-1));
    int[] i_array16 = ds.MaxMin3.maxMin3(i_array14, (int)(byte)1);
    
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

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test24"); }


    int[] i_array6 = new int[] { (short)(-1), (short)10, (short)10, (short)(-1), (byte)0, 100 };
    int[] i_array8 = ds.MaxMin3.maxMin3(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin3.maxMin3(i_array6, 0);
    int[] i_array12 = ds.MaxMin3.maxMin3(i_array10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

}
