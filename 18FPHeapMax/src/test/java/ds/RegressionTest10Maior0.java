package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test01"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.refaz((int)(short)10, (int)(short)10);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.refaz((int)(short)10, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(byte)100, 10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.refaz((int)(short)10, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((-1), (-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test04"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.refaz((int)(short)10, (int)(short)10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.refaz((int)(short)10, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item5 = fPHeapMax1.retiraMax();
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test08"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.refaz((int)(short)10, (int)(short)10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'4', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.refaz((int)(short)10, (int)(short)10);
    fPHeapMax1.constroi();
    ds.Item[] item_array6 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.copia(item_array6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test10"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((-1), (java.lang.Object)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test12"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.refaz((int)(short)10, (int)(short)10);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    fPHeapMax7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMax7.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test13"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)0, (-1));

  }

}
