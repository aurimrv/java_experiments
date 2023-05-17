package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test01"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item2);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test02"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)'4', (java.lang.Object)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test03"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item8 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test04"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test05"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((-1), (java.lang.Object)(byte)100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test06"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMin1.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin5.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test07"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test08"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test09"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item2 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test10"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test11"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin11.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin9.copia(item_array13);
    fPHeapMin1.copia(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test12"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMin1.copia(item_array3);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test13"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test14"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.refaz(10, 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test15"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'#');
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test16"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMin1.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    fPHeapMin5.imprime();
    fPHeapMin5.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test17"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.Item item8 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test18"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMin1.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    fPHeapMin5.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

}
