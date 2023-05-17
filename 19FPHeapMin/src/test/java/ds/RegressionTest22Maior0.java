package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test01"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)'4', (java.lang.Object)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test02"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test03"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMin1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(short)100, (java.lang.Object)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test04"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    ds.Item[] item_array7 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.copia(item_array7);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test05"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item4 = fPHeapMin1.retiraMin();
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

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test06"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test07"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test08"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test09"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMin1.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test10"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test11"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item3 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test12"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test13"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test14"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test15"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.Item item2 = fPHeapMin1.min();
    java.lang.Object obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)'a', obj4);
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

}
