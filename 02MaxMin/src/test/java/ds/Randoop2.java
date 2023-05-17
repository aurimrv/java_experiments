package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test01"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, 0);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin1.maxMin1(i_array6, (int)(byte)0);
    int[] i_array12 = ds.MaxMin1.maxMin1(i_array6, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test02"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array5, (int)(byte)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array5, (int)(short)0);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array11, (int)(short)0);
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array11, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array17 = ds.MaxMin1.maxMin1(i_array15, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test03"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, 0);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array6, 0);
    int[] i_array10 = ds.MaxMin1.maxMin1(i_array6, 1);
    int[] i_array12 = ds.MaxMin1.maxMin1(i_array6, 0);
    int[] i_array14 = ds.MaxMin1.maxMin1(i_array12, (int)(byte)1);
    int[] i_array16 = ds.MaxMin1.maxMin1(i_array14, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test04"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array5, (int)(byte)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array9, (int)(short)1);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array11, (-1));
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array11, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test05"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array5, (int)(byte)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array5, (int)(short)0);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array11, (int)(short)0);
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array13, (int)(short)1);
    int[] i_array17 = ds.MaxMin1.maxMin1(i_array15, (int)(byte)0);
    int[] i_array19 = ds.MaxMin1.maxMin1(i_array17, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin1.maxMin1(i_array19, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test06"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array5, (int)(byte)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array5, (int)(short)0);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array5, (int)(short)1);
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array13, (int)(short)0);
    int[] i_array17 = ds.MaxMin1.maxMin1(i_array13, (-1));
    int[] i_array19 = ds.MaxMin1.maxMin1(i_array13, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test07"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, 0);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin1.maxMin1(i_array8, 0);
    int[] i_array12 = ds.MaxMin1.maxMin1(i_array8, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array14 = ds.MaxMin1.maxMin1(i_array12, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test08"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array7, (int)(short)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array9, (int)(short)0);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array9, 1);
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array13, (-1));
    int[] i_array17 = ds.MaxMin1.maxMin1(i_array13, 1);
    int[] i_array19 = ds.MaxMin1.maxMin1(i_array17, (int)(short)0);
    int[] i_array21 = ds.MaxMin1.maxMin1(i_array19, (-1));
    int[] i_array23 = ds.MaxMin1.maxMin1(i_array21, (int)(byte)1);
    int[] i_array25 = ds.MaxMin1.maxMin1(i_array21, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin1.maxMin1(i_array21, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test09"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, 0);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array6, (int)(short)0);
    int[] i_array10 = ds.MaxMin1.maxMin1(i_array8, (int)(short)0);
    int[] i_array12 = ds.MaxMin1.maxMin1(i_array10, (int)(byte)0);
    int[] i_array14 = ds.MaxMin1.maxMin1(i_array12, 0);
    int[] i_array16 = ds.MaxMin1.maxMin1(i_array12, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test10"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, 0);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array4, (int)(byte)0);
    int[] i_array10 = ds.MaxMin1.maxMin1(i_array8, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array12 = ds.MaxMin1.maxMin1(i_array10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test11"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array7, (int)(short)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array9, (int)(short)0);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array9, 1);
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array13, (-1));
    int[] i_array17 = ds.MaxMin1.maxMin1(i_array13, 1);
    int[] i_array19 = ds.MaxMin1.maxMin1(i_array13, (int)(byte)1);
    int[] i_array21 = ds.MaxMin1.maxMin1(i_array13, (int)(short)(-1));
    int[] i_array23 = ds.MaxMin1.maxMin1(i_array13, (int)(byte)1);
    int[] i_array25 = ds.MaxMin1.maxMin1(i_array13, (-1));
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array27 = ds.MaxMin1.maxMin1(i_array13, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test12"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, 0);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array6, 0);
    int[] i_array10 = ds.MaxMin1.maxMin1(i_array6, 0);
    int[] i_array12 = ds.MaxMin1.maxMin1(i_array10, (int)(byte)0);
    int[] i_array14 = ds.MaxMin1.maxMin1(i_array12, (int)(short)1);
    int[] i_array16 = ds.MaxMin1.maxMin1(i_array14, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test13"); }


    int[] i_array2 = new int[] { (short)1, 100 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, 1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array2, 0);
    int[] i_array10 = ds.MaxMin1.maxMin1(i_array2, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array12 = ds.MaxMin1.maxMin1(i_array2, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test14"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array5, (int)(short)1);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array5, (int)(byte)1);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array5, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array17 = ds.MaxMin1.maxMin1(i_array15, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test15"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array7, (int)(short)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array9, (int)(short)0);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array9, (int)(byte)(-1));
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array13, (int)(short)1);
    int[] i_array17 = ds.MaxMin1.maxMin1(i_array13, 0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array19 = ds.MaxMin1.maxMin1(i_array13, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test16"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, 0);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array6, 0);
    int[] i_array10 = ds.MaxMin1.maxMin1(i_array6, 0);
    int[] i_array12 = ds.MaxMin1.maxMin1(i_array6, 0);
    int[] i_array14 = ds.MaxMin1.maxMin1(i_array6, (int)(byte)(-1));
    int[] i_array16 = ds.MaxMin1.maxMin1(i_array14, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test17"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array7, (int)(short)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array9, (int)(short)0);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array9, 1);
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array13, (-1));
    int[] i_array17 = ds.MaxMin1.maxMin1(i_array13, 1);
    int[] i_array19 = ds.MaxMin1.maxMin1(i_array17, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array21 = ds.MaxMin1.maxMin1(i_array17, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test18"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, 0);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array4, (int)(byte)0);
    int[] i_array10 = ds.MaxMin1.maxMin1(i_array4, (int)(byte)1);
    int[] i_array12 = ds.MaxMin1.maxMin1(i_array4, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
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
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test19"); }


    int[] i_array2 = new int[] { 10, (short)1 };
    int[] i_array4 = ds.MaxMin1.maxMin1(i_array2, (int)(short)1);
    int[] i_array6 = ds.MaxMin1.maxMin1(i_array4, 0);
    int[] i_array8 = ds.MaxMin1.maxMin1(i_array4, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array10 = ds.MaxMin1.maxMin1(i_array8, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test20"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array7, (int)(short)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array9, (int)(byte)1);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array11, (-1));
    // The following exception was thrown during execution in test generation
    try {
      int[] i_array15 = ds.MaxMin1.maxMin1(i_array13, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test21"); }


    int[] i_array5 = new int[] { (byte)1, (-1), (byte)100, 100, 1 };
    int[] i_array7 = ds.MaxMin1.maxMin1(i_array5, 0);
    int[] i_array9 = ds.MaxMin1.maxMin1(i_array7, (int)(short)0);
    int[] i_array11 = ds.MaxMin1.maxMin1(i_array9, (int)(short)0);
    int[] i_array13 = ds.MaxMin1.maxMin1(i_array9, 1);
    int[] i_array15 = ds.MaxMin1.maxMin1(i_array13, (-1));
    int[] i_array17 = ds.MaxMin1.maxMin1(i_array13, 1);
    int[] i_array19 = ds.MaxMin1.maxMin1(i_array17, (int)(short)0);
    int[] i_array21 = ds.MaxMin1.maxMin1(i_array19, (-1));
    int[] i_array23 = ds.MaxMin1.maxMin1(i_array21, (int)(byte)1);
    int[] i_array25 = ds.MaxMin1.maxMin1(i_array21, (int)(byte)0);
    int[] i_array27 = ds.MaxMin1.maxMin1(i_array21, 1);
    int[] i_array29 = ds.MaxMin1.maxMin1(i_array21, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);

  }

}
