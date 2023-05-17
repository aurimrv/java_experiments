package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test01"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test04"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item4 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)0);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test08"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)' ', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test10"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test12"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));

  }

}
