package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test001"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test002"); }


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
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test003"); }


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
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test004"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test005"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test006"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test007"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test008"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)1, (java.lang.Object)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test009"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test010"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test011"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test012"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test013"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test014"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test015"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test016"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test017"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test018"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)0, (java.lang.Object)0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test019"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test020"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin7.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test021"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test022"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test023"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test024"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    fPHeapMin8.constroi();
    fPHeapMin8.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)1, (java.lang.Object)fPHeapMin8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test025"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin7.refaz((int)(short)(-1), (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test026"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(10, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test027"); }


    ds.Item[] item_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
      ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test028"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item8 = fPHeapMin7.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test029"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
    fPHeapMin5.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin2.diminuiChave(0, (java.lang.Object)fPHeapMin5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test030"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'a', (java.lang.Object)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test031"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test032"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)0, (java.lang.Object)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test033"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin6.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test034"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test035"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test036"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test037"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test038"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test039"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test040"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.constroi();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin4.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.imprime();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array15);
    fPHeapMin10.copia(item_array15);
    fPHeapMin4.copia(item_array15);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array15);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)10, (java.lang.Object)item_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test041"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMin8.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test042"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.imprime();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array25);
    fPHeapMin20.copia(item_array25);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'#', (java.lang.Object)fPHeapMin20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test043"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)(-1), (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test044"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(10, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test045"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    fPHeapMin9.constroi();
    fPHeapMin9.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin6.diminuiChave((-1), (java.lang.Object)fPHeapMin9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test046"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test047"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test048"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
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
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test049"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test050"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(0, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test051"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item9 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test052"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin8.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test053"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)'a', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test054"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test055"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMin17.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test056"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test057"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.refaz(100, 10);
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

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test058"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array10);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin15.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test059"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array4);
    ds.Item[] item_array10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin9.copia(item_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test060"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test061"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMin6.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test062"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test063"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)1, (java.lang.Object)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test064"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((-1), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test065"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz(10, (int)(short)0);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin11.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)0, (java.lang.Object)fPHeapMin11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test066"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.constroi();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin5.copia(item_array8);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.imprime();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array14);
    fPHeapMin5.copia(item_array14);
    fPHeapMin5.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)' ', (java.lang.Object)fPHeapMin5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test067"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMin4.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)' ', (java.lang.Object)fPHeapMin4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test068"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item[] item_array4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test069"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)(-1));
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
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test070"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    fPHeapMin24.constroi();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    fPHeapMin24.copia(item_array27);
    fPHeapMin1.copia(item_array27);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)(-1), (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test071"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item8 = fPHeapMin7.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test072"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)1, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test073"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test074"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test075"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.imprime();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array25);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array25);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(item_array25);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array25);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(item_array25);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(10, (java.lang.Object)fPHeapMin31);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test076"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((-1), (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test077"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    java.lang.Object obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)0, obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test078"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(1, (java.lang.Object)100.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test079"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.Item item6 = fPHeapMin1.min();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test080"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test081"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin8.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item17 = fPHeapMin8.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test082"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(1, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test083"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.imprime();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin5.copia(item_array8);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array8);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array8);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)10, (java.lang.Object)item_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test084"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test085"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test086"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin26.copia(item_array31);
    fPHeapMin20.copia(item_array31);
    fPHeapMin20.imprime();
    ds.Item item37 = fPHeapMin20.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin17.diminuiChave(100, (java.lang.Object)fPHeapMin20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item37);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test087"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.Item item6 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test088"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test089"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    ds.Item item22 = fPHeapMin1.min();
    ds.Item item23 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test090"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item2 = fPHeapMin1.min();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test091"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test092"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)1, 1);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test093"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test094"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.imprime();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    fPHeapMin26.constroi();
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.constroi();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(item_array38);
    fPHeapMin26.copia(item_array38);
    fPHeapMin24.copia(item_array38);
    fPHeapMin1.copia(item_array38);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
    fPHeapMin46.constroi();
    ds.Item item48 = null;
    ds.Item[] item_array49 = new ds.Item[] { item48 };
    fPHeapMin46.copia(item_array49);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    fPHeapMin54.imprime();
    ds.Item item56 = null;
    ds.Item[] item_array57 = new ds.Item[] { item56 };
    fPHeapMin54.copia(item_array57);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(item_array57);
    fPHeapMin52.copia(item_array57);
    fPHeapMin46.copia(item_array57);
    fPHeapMin46.constroi();
    fPHeapMin46.imprime();
    fPHeapMin46.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)10, (java.lang.Object)fPHeapMin46);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test095"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test096"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item[] item_array22 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    fPHeapMin24.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)100, (java.lang.Object)fPHeapMin24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test097"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test098"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array26);
    fPHeapMin21.copia(item_array26);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(0, (java.lang.Object)fPHeapMin21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test099"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    ds.Item item2 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.imprime();
    fPHeapMin5.refaz(0, (int)(byte)(-1));
    fPHeapMin5.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array23);
    fPHeapMin18.copia(item_array23);
    fPHeapMin12.copia(item_array23);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array23);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin30.constroi();
    fPHeapMin30.imprime();
    fPHeapMin30.constroi();
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array42);
    fPHeapMin30.copia(item_array42);
    fPHeapMin28.copia(item_array42);
    fPHeapMin5.copia(item_array42);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)0, (java.lang.Object)item_array42);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test100"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)'4', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item23 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test101"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)100);
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.constroi();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin4.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.imprime();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array15);
    fPHeapMin10.copia(item_array15);
    fPHeapMin4.copia(item_array15);
    fPHeapMin4.imprime();
    fPHeapMin4.constroi();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    fPHeapMin29.imprime();
    ds.Item item31 = null;
    ds.Item[] item_array32 = new ds.Item[] { item31 };
    fPHeapMin29.copia(item_array32);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(item_array32);
    fPHeapMin23.copia(item_array32);
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
    fPHeapMin37.constroi();
    ds.Item item39 = null;
    ds.Item[] item_array40 = new ds.Item[] { item39 };
    fPHeapMin37.copia(item_array40);
    fPHeapMin23.copia(item_array40);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array40);
    fPHeapMin4.copia(item_array40);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)1, (java.lang.Object)item_array40);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test102"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);
    ds.Item item2 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)10, 100);
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
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test103"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test104"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test105"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMin4.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test106"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test107"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin7.refaz((int)(byte)10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test108"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
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
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test109"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array28);
    fPHeapMin23.copia(item_array28);
    fPHeapMin17.copia(item_array28);
    fPHeapMin17.imprime();
    ds.Item item34 = fPHeapMin17.min();
    fPHeapMin17.refaz((int)(short)1, (int)(short)1);
    ds.Item item38 = fPHeapMin17.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.diminuiChave((int)(short)10, (java.lang.Object)fPHeapMin17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test110"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    ds.Item[] item_array3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test111"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test112"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.constroi();
    fPHeapMin11.constroi();
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.imprime();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array26);
    fPHeapMin21.copia(item_array26);
    fPHeapMin15.copia(item_array26);
    fPHeapMin11.copia(item_array26);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin8.diminuiChave((int)(byte)100, (java.lang.Object)fPHeapMin11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test113"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array10);
    fPHeapMin15.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test114"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test115"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.imprime();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    fPHeapMin26.constroi();
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.constroi();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(item_array38);
    fPHeapMin26.copia(item_array38);
    fPHeapMin24.copia(item_array38);
    fPHeapMin1.copia(item_array38);
    ds.Item item44 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item44);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test116"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item24 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test117"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array0);
    fPHeapMin2.constroi();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.constroi();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    fPHeapMin14.imprime();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMin14.copia(item_array17);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array17);
    fPHeapMin12.copia(item_array17);
    fPHeapMin6.copia(item_array17);
    fPHeapMin6.constroi();
    fPHeapMin6.constroi();
    ds.Item item24 = fPHeapMin6.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin2.diminuiChave((int)(short)1, (java.lang.Object)item24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test118"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
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
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test119"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    fPHeapMin18.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMin18.copia(item_array21);
    fPHeapMin18.constroi();
    fPHeapMin18.imprime();
    fPHeapMin18.constroi();
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.constroi();
    ds.Item item29 = null;
    ds.Item[] item_array30 = new ds.Item[] { item29 };
    fPHeapMin27.copia(item_array30);
    fPHeapMin27.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    fPHeapMin27.copia(item_array37);
    fPHeapMin18.copia(item_array37);
    fPHeapMin18.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin15.diminuiChave((int)(byte)1, (java.lang.Object)fPHeapMin18);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test120"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test121"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    java.lang.Object obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)100, obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test122"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin26.copia(item_array31);
    fPHeapMin20.copia(item_array31);
    fPHeapMin1.copia(item_array31);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item37 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test123"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    fPHeapMin47.constroi();
    ds.Item item49 = null;
    ds.Item[] item_array50 = new ds.Item[] { item49 };
    fPHeapMin47.copia(item_array50);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
    fPHeapMin55.imprime();
    ds.Item item57 = null;
    ds.Item[] item_array58 = new ds.Item[] { item57 };
    fPHeapMin55.copia(item_array58);
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(item_array58);
    fPHeapMin53.copia(item_array58);
    fPHeapMin47.copia(item_array58);
    fPHeapMin47.imprime();
    ds.Item item64 = fPHeapMin47.min();
    fPHeapMin47.refaz((int)(short)1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)' ', (java.lang.Object)fPHeapMin47);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item64);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test124"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test125"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.refaz(100, 10);
    fPHeapMin1.constroi();

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test126"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array28);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(item_array28);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(item_array28);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test127"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test128"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test129"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test130"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array0);
    fPHeapMin2.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin2.refaz((int)'#', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test131"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin26.copia(item_array31);
    fPHeapMin20.copia(item_array31);
    fPHeapMin1.copia(item_array31);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.imprime();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(item_array48);
    fPHeapMin39.copia(item_array48);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.constroi();
    ds.Item item55 = null;
    ds.Item[] item_array56 = new ds.Item[] { item55 };
    fPHeapMin53.copia(item_array56);
    fPHeapMin39.copia(item_array56);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(item_array56);
    fPHeapMin1.copia(item_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test132"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item24 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test133"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test134"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test135"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin6.constroi();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    fPHeapMin18.constroi();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMin18.copia(item_array21);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array21);
    fPHeapMin16.copia(item_array21);
    fPHeapMin6.copia(item_array21);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin6.refaz((int)(byte)(-1), (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test136"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
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
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test137"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)1, 1);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test138"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'a', (java.lang.Object)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test139"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMin9.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test140"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test141"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item15 = fPHeapMin14.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test142"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin16.refaz((int)'4', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test143"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMin17.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test144"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test145"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.imprime();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin4.copia(item_array7);
    fPHeapMin1.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMin10.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test146"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin6.constroi();
    fPHeapMin6.imprime();
    fPHeapMin6.constroi();
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin6.copia(item_array18);
    fPHeapMin6.refaz((int)' ', (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(0, (java.lang.Object)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test147"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item2 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)(short)100);
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
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test148"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.constroi();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test149"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMin17.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test150"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test151"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)'#', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test152"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array9);
    fPHeapMin14.constroi();
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test153"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test154"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test155"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin6.diminuiChave((int)(byte)(-1), (java.lang.Object)100.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test156"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)'#', (int)(byte)10);
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test157"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item46 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test158"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test159"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
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
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test160"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test161"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin2.diminuiChave((int)'a', (java.lang.Object)fPHeapMin6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test162"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int)(byte)1);
    ds.Item item11 = fPHeapMin10.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)100, (java.lang.Object)item11);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test163"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array0);
    fPHeapMin2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test164"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test165"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.imprime();
    fPHeapMin5.refaz(0, (int)(byte)(-1));
    fPHeapMin5.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array23);
    fPHeapMin18.copia(item_array23);
    fPHeapMin12.copia(item_array23);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array23);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin30.constroi();
    fPHeapMin30.imprime();
    fPHeapMin30.constroi();
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array42);
    fPHeapMin30.copia(item_array42);
    fPHeapMin28.copia(item_array42);
    fPHeapMin5.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item49 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test166"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = fPHeapMin15.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test167"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)1, 1);
    fPHeapMin1.imprime();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test168"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((-1), (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test169"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array42);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(item_array59);
    fPHeapMin54.copia(item_array59);
    fPHeapMin48.copia(item_array59);
    fPHeapMin48.constroi();
    fPHeapMin48.imprime();
    fPHeapMin48.imprime();
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
    fPHeapMin68.constroi();
    fPHeapMin68.constroi();
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(100);
    fPHeapMin72.constroi();
    ds.Item item74 = null;
    ds.Item[] item_array75 = new ds.Item[] { item74 };
    fPHeapMin72.copia(item_array75);
    ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(100);
    fPHeapMin80.imprime();
    ds.Item item82 = null;
    ds.Item[] item_array83 = new ds.Item[] { item82 };
    fPHeapMin80.copia(item_array83);
    ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(item_array83);
    fPHeapMin78.copia(item_array83);
    fPHeapMin72.copia(item_array83);
    fPHeapMin68.copia(item_array83);
    fPHeapMin48.copia(item_array83);
    fPHeapMin46.copia(item_array83);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item91 = fPHeapMin46.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array83);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test170"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test171"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test172"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array9);
    fPHeapMin14.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.refaz((int)(byte)1, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test173"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.constroi();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    fPHeapMin14.imprime();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMin14.copia(item_array17);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array17);
    fPHeapMin12.copia(item_array17);
    fPHeapMin6.copia(item_array17);
    fPHeapMin6.constroi();
    fPHeapMin6.constroi();
    ds.Item item24 = fPHeapMin6.min();
    fPHeapMin6.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(100, (java.lang.Object)fPHeapMin6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test174"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test175"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test176"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test177"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test178"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMin4.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test179"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test180"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.constroi();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin16.diminuiChave(10, (java.lang.Object)fPHeapMin24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test181"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    fPHeapMin17.constroi();
    fPHeapMin17.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = fPHeapMin17.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test182"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin29.copia(item_array34);
    fPHeapMin23.copia(item_array34);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array34);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin41.constroi();
    fPHeapMin41.imprime();
    fPHeapMin41.constroi();
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(item_array53);
    fPHeapMin41.copia(item_array53);
    fPHeapMin39.copia(item_array53);
    fPHeapMin1.copia(item_array53);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(item_array53);
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(item_array53);
    fPHeapMin60.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test183"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)(-1));
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
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test184"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test185"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array13);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int)' ');
    fPHeapMin20.constroi();
    fPHeapMin20.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin17.diminuiChave((int)(short)(-1), (java.lang.Object)fPHeapMin20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test186"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMin2.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test187"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test188"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    ds.Item item23 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test189"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test190"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test191"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test192"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array42);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(item_array59);
    fPHeapMin54.copia(item_array59);
    fPHeapMin48.copia(item_array59);
    fPHeapMin48.constroi();
    fPHeapMin48.imprime();
    fPHeapMin48.imprime();
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
    fPHeapMin68.constroi();
    fPHeapMin68.constroi();
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(100);
    fPHeapMin72.constroi();
    ds.Item item74 = null;
    ds.Item[] item_array75 = new ds.Item[] { item74 };
    fPHeapMin72.copia(item_array75);
    ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(100);
    fPHeapMin80.imprime();
    ds.Item item82 = null;
    ds.Item[] item_array83 = new ds.Item[] { item82 };
    fPHeapMin80.copia(item_array83);
    ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(item_array83);
    fPHeapMin78.copia(item_array83);
    fPHeapMin72.copia(item_array83);
    fPHeapMin68.copia(item_array83);
    fPHeapMin48.copia(item_array83);
    fPHeapMin46.copia(item_array83);
    ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(item_array83);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item92 = fPHeapMin91.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array83);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test193"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(100, 10);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test194"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    fPHeapMin7.refaz(0, (int)(byte)(-1));
    fPHeapMin7.imprime();
    fPHeapMin7.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((-1), (java.lang.Object)fPHeapMin7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test195"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    fPHeapMin24.constroi();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    fPHeapMin24.copia(item_array27);
    fPHeapMin1.copia(item_array27);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    fPHeapMin32.constroi();
    ds.Item item34 = null;
    ds.Item[] item_array35 = new ds.Item[] { item34 };
    fPHeapMin32.copia(item_array35);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    fPHeapMin38.imprime();
    ds.Item item40 = null;
    ds.Item[] item_array41 = new ds.Item[] { item40 };
    fPHeapMin38.copia(item_array41);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array41);
    fPHeapMin32.copia(item_array41);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(item_array41);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)10, (java.lang.Object)item_array41);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test196"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test197"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.Item item21 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test198"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)'#', (int)(byte)10);
    fPHeapMin1.refaz((int)(byte)0, (int)(short)(-1));
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test199"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    fPHeapMin1.copia(item_array24);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array24);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin30.constroi();
    fPHeapMin30.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin27.diminuiChave(0, (java.lang.Object)fPHeapMin30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test200"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test201"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item2 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)100, (int)(byte)(-1));
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
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test202"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin8.refaz((int)' ', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test203"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    ds.Item item11 = fPHeapMin1.min();
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test204"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(10, (java.lang.Object)item_array24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test205"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
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
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test206"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array10);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin16.insere(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test207"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test208"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
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

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test209"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)1, (java.lang.Object)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test210"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array13);
    fPHeapMin8.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMin8.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test211"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin3.refaz(10, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test212"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)0, (java.lang.Object)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test213"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz(10, (int)(short)0);
    ds.Item item9 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test214"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin6.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test215"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)10, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test216"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz(1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test217"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.Item item9 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test218"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test219"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    ds.Item item17 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test220"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test221"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    fPHeapMin1.refaz((int)'4', (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test222"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.imprime();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    fPHeapMin26.constroi();
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.constroi();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(item_array38);
    fPHeapMin26.copia(item_array38);
    fPHeapMin24.copia(item_array38);
    fPHeapMin1.copia(item_array38);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item44 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test223"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin25.copia(item_array37);
    fPHeapMin23.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array37);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin43.refaz(100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test224"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)' ', (-1));
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test225"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.refaz(100, 10);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    fPHeapMin25.copia(item_array31);
    fPHeapMin20.copia(item_array31);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(0, (java.lang.Object)item_array31);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test226"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = fPHeapMin1.min();
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
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test227"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test228"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test229"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.Item[] item_array14 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test230"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin17.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test231"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test232"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    fPHeapMin1.copia(item_array24);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array24);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin27.refaz(10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test233"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array23);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin28.copia(item_array37);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test234"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.imprime();
    fPHeapMin5.refaz((int)(short)1, 1);
    fPHeapMin5.imprime();
    fPHeapMin5.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(10, (java.lang.Object)fPHeapMin5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test235"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test236"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.constroi();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.imprime();
    ds.Item item55 = null;
    ds.Item[] item_array56 = new ds.Item[] { item55 };
    fPHeapMin53.copia(item_array56);
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(item_array56);
    fPHeapMin51.copia(item_array56);
    fPHeapMin45.copia(item_array56);
    fPHeapMin26.copia(item_array56);
    fPHeapMin20.copia(item_array56);
    fPHeapMin1.copia(item_array56);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item64 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test237"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin6.constroi();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin6.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test238"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array18);
    fPHeapMin1.copia(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(1, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test239"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin7.copia(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array13);
    fPHeapMin5.copia(item_array13);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array22);
    fPHeapMin5.copia(item_array22);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array22);
    fPHeapMin1.copia(item_array22);
    ds.Item[] item_array32 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test240"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.refaz((-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test241"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test242"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    fPHeapMin54.imprime();
    ds.Item item56 = null;
    ds.Item[] item_array57 = new ds.Item[] { item56 };
    fPHeapMin54.copia(item_array57);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(item_array57);
    fPHeapMin48.copia(item_array57);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(item_array57);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)1, (java.lang.Object)item_array57);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test243"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test244"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin17.copia(item_array31);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array31);
    ds.Item item37 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin36.insere(item37);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test245"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test246"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.Item item23 = fPHeapMin7.min();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin25.copia(item_array37);
    fPHeapMin25.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.imprime();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    fPHeapMin25.copia(item_array48);
    fPHeapMin7.copia(item_array48);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array48);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    fPHeapMin54.constroi();
    ds.Item item56 = null;
    ds.Item[] item_array57 = new ds.Item[] { item56 };
    fPHeapMin54.copia(item_array57);
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
    fPHeapMin62.imprime();
    ds.Item item64 = null;
    ds.Item[] item_array65 = new ds.Item[] { item64 };
    fPHeapMin62.copia(item_array65);
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(item_array65);
    fPHeapMin60.copia(item_array65);
    fPHeapMin54.copia(item_array65);
    fPHeapMin54.constroi();
    fPHeapMin54.imprime();
    fPHeapMin54.imprime();
    ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(100);
    fPHeapMin74.constroi();
    fPHeapMin74.constroi();
    ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
    fPHeapMin78.constroi();
    ds.Item item80 = null;
    ds.Item[] item_array81 = new ds.Item[] { item80 };
    fPHeapMin78.copia(item_array81);
    ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(100);
    fPHeapMin86.imprime();
    ds.Item item88 = null;
    ds.Item[] item_array89 = new ds.Item[] { item88 };
    fPHeapMin86.copia(item_array89);
    ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(item_array89);
    fPHeapMin84.copia(item_array89);
    fPHeapMin78.copia(item_array89);
    fPHeapMin74.copia(item_array89);
    fPHeapMin54.copia(item_array89);
    fPHeapMin52.copia(item_array89);
    ds.FPHeapMin fPHeapMin97 = new ds.FPHeapMin(item_array89);
    ds.FPHeapMin fPHeapMin98 = new ds.FPHeapMin(item_array89);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(1, (java.lang.Object)fPHeapMin98);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array89);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test247"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test248"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz(1, (int)(byte)0);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test249"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    ds.Item item7 = fPHeapMin1.min();
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
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test250"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = fPHeapMin1.min();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test251"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test252"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test253"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)0, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test254"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.constroi();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    fPHeapMin17.copia(item_array22);
    fPHeapMin11.copia(item_array22);
    fPHeapMin11.imprime();
    fPHeapMin11.refaz((int)(short)100, (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)10, (java.lang.Object)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test255"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test256"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    fPHeapMin10.imprime();
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.constroi();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    fPHeapMin10.copia(item_array22);
    fPHeapMin10.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin10.copia(item_array33);
    ds.Item item36 = fPHeapMin10.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)0, (java.lang.Object)item36);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item36);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test257"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.constroi();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin4.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin4.copia(item_array13);
    fPHeapMin1.copia(item_array13);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test258"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test259"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)1, 1);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
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

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test260"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz(10, (int)(short)0);
    fPHeapMin1.constroi();
    ds.Item item10 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.imprime();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array15);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array15);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array15);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array15);
    fPHeapMin1.copia(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test261"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item8 = fPHeapMin1.min();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test262"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test263"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin6.constroi();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin6.copia(item_array9);
    fPHeapMin6.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin6.refaz((int)'a', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test264"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.refaz(100, 10);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    fPHeapMin6.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test265"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)(short)100, (int)(short)0);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test266"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item8 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test267"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin17.copia(item_array31);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array31);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    fPHeapMin47.imprime();
    ds.Item item49 = null;
    ds.Item[] item_array50 = new ds.Item[] { item49 };
    fPHeapMin47.copia(item_array50);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array50);
    fPHeapMin45.copia(item_array50);
    fPHeapMin39.copia(item_array50);
    fPHeapMin39.imprime();
    fPHeapMin39.refaz((int)(short)100, (int)(byte)100);
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
    fPHeapMin60.imprime();
    ds.Item item62 = null;
    ds.Item[] item_array63 = new ds.Item[] { item62 };
    fPHeapMin60.copia(item_array63);
    ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(item_array63);
    ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(item_array63);
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(item_array63);
    ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(100);
    fPHeapMin69.imprime();
    ds.Item item71 = null;
    ds.Item[] item_array72 = new ds.Item[] { item71 };
    fPHeapMin69.copia(item_array72);
    ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(item_array72);
    ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(item_array72);
    fPHeapMin67.copia(item_array72);
    fPHeapMin39.copia(item_array72);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin36.diminuiChave((int)(byte)0, (java.lang.Object)fPHeapMin39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array72);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test268"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array10);
    java.lang.Object obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin15.diminuiChave(10, obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test269"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    ds.Item[] item_array45 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array45);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(item_array45);
    fPHeapMin1.copia(item_array45);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)0, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test270"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin8.constroi();
    fPHeapMin8.constroi();
    fPHeapMin8.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)fPHeapMin8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test271"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int)(short)0);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin24.copia(item_array37);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)1, (java.lang.Object)item_array37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test272"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array18);
    fPHeapMin1.copia(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)(-1), (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test273"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.imprime();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test274"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)'#', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test275"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array42);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(item_array59);
    fPHeapMin54.copia(item_array59);
    fPHeapMin48.copia(item_array59);
    fPHeapMin48.constroi();
    fPHeapMin48.imprime();
    fPHeapMin48.imprime();
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
    fPHeapMin68.constroi();
    fPHeapMin68.constroi();
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(100);
    fPHeapMin72.constroi();
    ds.Item item74 = null;
    ds.Item[] item_array75 = new ds.Item[] { item74 };
    fPHeapMin72.copia(item_array75);
    ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(100);
    fPHeapMin80.imprime();
    ds.Item item82 = null;
    ds.Item[] item_array83 = new ds.Item[] { item82 };
    fPHeapMin80.copia(item_array83);
    ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(item_array83);
    fPHeapMin78.copia(item_array83);
    fPHeapMin72.copia(item_array83);
    fPHeapMin68.copia(item_array83);
    fPHeapMin48.copia(item_array83);
    fPHeapMin46.copia(item_array83);
    ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(item_array83);
    ds.FPHeapMin fPHeapMin92 = new ds.FPHeapMin(item_array83);
    fPHeapMin92.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array83);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test276"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.constroi();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.imprime();
    ds.Item item55 = null;
    ds.Item[] item_array56 = new ds.Item[] { item55 };
    fPHeapMin53.copia(item_array56);
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(item_array56);
    fPHeapMin51.copia(item_array56);
    fPHeapMin45.copia(item_array56);
    fPHeapMin26.copia(item_array56);
    fPHeapMin20.copia(item_array56);
    fPHeapMin1.copia(item_array56);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(100);
    fPHeapMin67.constroi();
    ds.Item item69 = null;
    ds.Item[] item_array70 = new ds.Item[] { item69 };
    fPHeapMin67.copia(item_array70);
    fPHeapMin67.constroi();
    fPHeapMin67.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)100, (java.lang.Object)fPHeapMin67);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array70);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test277"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.imprime();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array14);
    fPHeapMin9.copia(item_array14);
    fPHeapMin9.imprime();
    ds.Item item19 = fPHeapMin9.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'4', (java.lang.Object)fPHeapMin9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test278"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.imprime();
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin27.copia(item_array33);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array33);
    fPHeapMin25.copia(item_array33);
    fPHeapMin1.copia(item_array33);
    ds.Item item39 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test279"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array19);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)100, (java.lang.Object)fPHeapMin24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test280"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.refaz(100, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test281"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)(short)100, (int)(short)0);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.imprime();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array26);
    fPHeapMin21.copia(item_array26);
    fPHeapMin15.copia(item_array26);
    fPHeapMin15.imprime();
    fPHeapMin15.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    fPHeapMin40.imprime();
    ds.Item item42 = null;
    ds.Item[] item_array43 = new ds.Item[] { item42 };
    fPHeapMin40.copia(item_array43);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(item_array43);
    fPHeapMin34.copia(item_array43);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    fPHeapMin34.copia(item_array51);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array51);
    fPHeapMin15.copia(item_array51);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(1, (java.lang.Object)fPHeapMin15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test282"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'4', (java.lang.Object)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test283"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    fPHeapMin24.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)0, (java.lang.Object)fPHeapMin24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test284"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    fPHeapMin21.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin21.diminuiChave((int)(short)1, (java.lang.Object)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test285"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.imprime();
    fPHeapMin4.refaz((int)(short)1, 1);
    fPHeapMin4.imprime();
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.constroi();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    fPHeapMin17.copia(item_array22);
    fPHeapMin11.copia(item_array22);
    fPHeapMin11.constroi();
    fPHeapMin11.imprime();
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
    fPHeapMin36.constroi();
    ds.Item item38 = null;
    ds.Item[] item_array39 = new ds.Item[] { item38 };
    fPHeapMin36.copia(item_array39);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
    fPHeapMin44.imprime();
    ds.Item item46 = null;
    ds.Item[] item_array47 = new ds.Item[] { item46 };
    fPHeapMin44.copia(item_array47);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(item_array47);
    fPHeapMin42.copia(item_array47);
    fPHeapMin36.copia(item_array47);
    fPHeapMin36.constroi();
    fPHeapMin36.imprime();
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
    fPHeapMin55.constroi();
    ds.Item item57 = null;
    ds.Item[] item_array58 = new ds.Item[] { item57 };
    fPHeapMin55.copia(item_array58);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(100);
    fPHeapMin63.imprime();
    ds.Item item65 = null;
    ds.Item[] item_array66 = new ds.Item[] { item65 };
    fPHeapMin63.copia(item_array66);
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(item_array66);
    fPHeapMin61.copia(item_array66);
    fPHeapMin55.copia(item_array66);
    fPHeapMin36.copia(item_array66);
    fPHeapMin30.copia(item_array66);
    fPHeapMin11.copia(item_array66);
    fPHeapMin4.copia(item_array66);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)10, (java.lang.Object)item_array66);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test286"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test287"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.imprime();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array26);
    fPHeapMin21.copia(item_array26);
    fPHeapMin15.copia(item_array26);
    fPHeapMin15.constroi();
    fPHeapMin15.imprime();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    fPHeapMin42.imprime();
    ds.Item item44 = null;
    ds.Item[] item_array45 = new ds.Item[] { item44 };
    fPHeapMin42.copia(item_array45);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(item_array45);
    fPHeapMin40.copia(item_array45);
    fPHeapMin34.copia(item_array45);
    fPHeapMin15.copia(item_array45);
    fPHeapMin9.copia(item_array45);
    fPHeapMin1.copia(item_array45);
    ds.Item item53 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item53);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test288"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMin2.retiraMin();
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
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test289"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.imprime();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin2.insere(item4);
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
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test290"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.Item item9 = fPHeapMin1.min();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)1, (java.lang.Object)fPHeapMin14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test291"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin29.copia(item_array34);
    fPHeapMin23.copia(item_array34);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array34);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin41.constroi();
    fPHeapMin41.imprime();
    fPHeapMin41.constroi();
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(item_array53);
    fPHeapMin41.copia(item_array53);
    fPHeapMin39.copia(item_array53);
    fPHeapMin1.copia(item_array53);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item59 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test292"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array42);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(item_array59);
    fPHeapMin54.copia(item_array59);
    fPHeapMin48.copia(item_array59);
    fPHeapMin48.constroi();
    fPHeapMin48.imprime();
    fPHeapMin48.imprime();
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
    fPHeapMin68.constroi();
    fPHeapMin68.constroi();
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(100);
    fPHeapMin72.constroi();
    ds.Item item74 = null;
    ds.Item[] item_array75 = new ds.Item[] { item74 };
    fPHeapMin72.copia(item_array75);
    ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(100);
    fPHeapMin80.imprime();
    ds.Item item82 = null;
    ds.Item[] item_array83 = new ds.Item[] { item82 };
    fPHeapMin80.copia(item_array83);
    ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(item_array83);
    fPHeapMin78.copia(item_array83);
    fPHeapMin72.copia(item_array83);
    fPHeapMin68.copia(item_array83);
    fPHeapMin48.copia(item_array83);
    fPHeapMin46.copia(item_array83);
    ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(item_array83);
    ds.FPHeapMin fPHeapMin92 = new ds.FPHeapMin(item_array83);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item93 = fPHeapMin92.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array83);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test293"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array42);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMin49.copia(item_array50);
    fPHeapMin49.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin46.diminuiChave((int)'#', (java.lang.Object)fPHeapMin49);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test294"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.constroi();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test295"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array2);
    fPHeapMin4.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMin4.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test296"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array9);
    fPHeapMin4.copia(item_array9);
    fPHeapMin1.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test297"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)100);
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
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test298"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'4');
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
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test299"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)' ', (-1));
    ds.Item item11 = fPHeapMin1.min();
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test300"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test301"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test302"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'4');
    ds.Item item2 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test303"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test304"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test305"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test306"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.imprime();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin17.constroi();
    fPHeapMin17.imprime();
    fPHeapMin17.constroi();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    fPHeapMin26.constroi();
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.constroi();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    fPHeapMin26.copia(item_array36);
    fPHeapMin17.copia(item_array36);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.diminuiChave((int)(short)(-1), (java.lang.Object)fPHeapMin17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test307"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(0, (java.lang.Object)fPHeapMin22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test308"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    fPHeapMin1.copia(item_array24);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test309"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin29.copia(item_array34);
    fPHeapMin23.copia(item_array34);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array34);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin41.constroi();
    fPHeapMin41.imprime();
    fPHeapMin41.constroi();
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(item_array53);
    fPHeapMin41.copia(item_array53);
    fPHeapMin39.copia(item_array53);
    fPHeapMin1.copia(item_array53);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(item_array53);
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(item_array53);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin60.refaz((int)' ', (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test310"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
    fPHeapMin4.constroi();
    fPHeapMin4.imprime();
    fPHeapMin4.refaz((int)(short)0, (-1));
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.imprime();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    fPHeapMin4.copia(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)0, (java.lang.Object)item_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test311"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin29.copia(item_array34);
    fPHeapMin23.copia(item_array34);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array34);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin41.constroi();
    fPHeapMin41.imprime();
    fPHeapMin41.constroi();
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(item_array53);
    fPHeapMin41.copia(item_array53);
    fPHeapMin39.copia(item_array53);
    fPHeapMin1.copia(item_array53);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int)(byte)1);
    fPHeapMin61.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)10, (java.lang.Object)fPHeapMin61);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test312"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array24);
    fPHeapMin26.constroi();
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    fPHeapMin29.imprime();
    ds.Item item31 = null;
    ds.Item[] item_array32 = new ds.Item[] { item31 };
    fPHeapMin29.copia(item_array32);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(item_array32);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(item_array32);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array32);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    fPHeapMin38.constroi();
    ds.Item item40 = null;
    ds.Item[] item_array41 = new ds.Item[] { item40 };
    fPHeapMin38.copia(item_array41);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array41);
    fPHeapMin36.copia(item_array41);
    fPHeapMin26.copia(item_array41);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)1, (java.lang.Object)item_array41);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test313"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.refaz(100, 10);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    fPHeapMin6.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test314"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)'#', (int)(byte)10);
    fPHeapMin1.refaz((int)(byte)0, (int)(short)(-1));
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test315"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.constroi();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.imprime();
    ds.Item item55 = null;
    ds.Item[] item_array56 = new ds.Item[] { item55 };
    fPHeapMin53.copia(item_array56);
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(item_array56);
    fPHeapMin51.copia(item_array56);
    fPHeapMin45.copia(item_array56);
    fPHeapMin26.copia(item_array56);
    fPHeapMin20.copia(item_array56);
    fPHeapMin1.copia(item_array56);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test316"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMin4.copia(item_array5);
    fPHeapMin4.imprime();
    fPHeapMin4.imprime();
    fPHeapMin4.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'#', (java.lang.Object)fPHeapMin4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test317"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item item8 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test318"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    fPHeapMin8.constroi();
    fPHeapMin8.imprime();
    fPHeapMin8.imprime();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    fPHeapMin28.constroi();
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    fPHeapMin32.constroi();
    ds.Item item34 = null;
    ds.Item[] item_array35 = new ds.Item[] { item34 };
    fPHeapMin32.copia(item_array35);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    fPHeapMin40.imprime();
    ds.Item item42 = null;
    ds.Item[] item_array43 = new ds.Item[] { item42 };
    fPHeapMin40.copia(item_array43);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(item_array43);
    fPHeapMin38.copia(item_array43);
    fPHeapMin32.copia(item_array43);
    fPHeapMin28.copia(item_array43);
    fPHeapMin8.copia(item_array43);
    fPHeapMin1.copia(item_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test319"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test320"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    fPHeapMin9.constroi();
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array19);
    fPHeapMin9.copia(item_array19);
    fPHeapMin1.copia(item_array19);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    fPHeapMin31.copia(item_array37);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(item_array37);
    fPHeapMin40.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin28.diminuiChave((int)(byte)1, (java.lang.Object)fPHeapMin40);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test321"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array42);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(item_array59);
    fPHeapMin54.copia(item_array59);
    fPHeapMin48.copia(item_array59);
    fPHeapMin48.constroi();
    fPHeapMin48.imprime();
    fPHeapMin48.imprime();
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
    fPHeapMin68.constroi();
    fPHeapMin68.constroi();
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(100);
    fPHeapMin72.constroi();
    ds.Item item74 = null;
    ds.Item[] item_array75 = new ds.Item[] { item74 };
    fPHeapMin72.copia(item_array75);
    ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(100);
    fPHeapMin80.imprime();
    ds.Item item82 = null;
    ds.Item[] item_array83 = new ds.Item[] { item82 };
    fPHeapMin80.copia(item_array83);
    ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(item_array83);
    fPHeapMin78.copia(item_array83);
    fPHeapMin72.copia(item_array83);
    fPHeapMin68.copia(item_array83);
    fPHeapMin48.copia(item_array83);
    fPHeapMin46.copia(item_array83);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin46.diminuiChave((int)'a', (java.lang.Object)1L);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array83);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test322"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.constroi();

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test323"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin8.copia(item_array13);
    fPHeapMin8.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMin8.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test324"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item8 = fPHeapMin1.min();
    ds.Item item9 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test325"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    fPHeapMin1.copia(item_array24);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    fPHeapMin29.constroi();
    ds.Item item31 = null;
    ds.Item[] item_array32 = new ds.Item[] { item31 };
    fPHeapMin29.copia(item_array32);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
    fPHeapMin37.imprime();
    ds.Item item39 = null;
    ds.Item[] item_array40 = new ds.Item[] { item39 };
    fPHeapMin37.copia(item_array40);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(item_array40);
    fPHeapMin35.copia(item_array40);
    fPHeapMin29.copia(item_array40);
    fPHeapMin29.constroi();
    fPHeapMin29.imprime();
    fPHeapMin29.constroi();
    fPHeapMin29.imprime();
    ds.Item item49 = fPHeapMin29.min();
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
    fPHeapMin51.constroi();
    ds.Item item53 = null;
    ds.Item[] item_array54 = new ds.Item[] { item53 };
    fPHeapMin51.copia(item_array54);
    ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(100);
    fPHeapMin59.imprime();
    ds.Item item61 = null;
    ds.Item[] item_array62 = new ds.Item[] { item61 };
    fPHeapMin59.copia(item_array62);
    ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(item_array62);
    fPHeapMin57.copia(item_array62);
    fPHeapMin51.copia(item_array62);
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(item_array62);
    ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(100);
    fPHeapMin69.imprime();
    ds.Item item71 = null;
    ds.Item[] item_array72 = new ds.Item[] { item71 };
    fPHeapMin69.copia(item_array72);
    fPHeapMin69.constroi();
    fPHeapMin69.imprime();
    fPHeapMin69.constroi();
    ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
    fPHeapMin78.constroi();
    ds.Item item80 = null;
    ds.Item[] item_array81 = new ds.Item[] { item80 };
    fPHeapMin78.copia(item_array81);
    ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(item_array81);
    fPHeapMin69.copia(item_array81);
    fPHeapMin67.copia(item_array81);
    fPHeapMin29.copia(item_array81);
    ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(item_array81);
    fPHeapMin1.copia(item_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array81);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test326"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item2 = fPHeapMin1.min();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test327"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.Item item10 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    fPHeapMin13.constroi();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMin13.copia(item_array16);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array24);
    fPHeapMin19.copia(item_array24);
    fPHeapMin13.copia(item_array24);
    fPHeapMin13.constroi();
    fPHeapMin13.constroi();
    ds.Item item31 = fPHeapMin13.min();
    fPHeapMin13.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)1, (java.lang.Object)fPHeapMin13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item31);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test328"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin26.copia(item_array31);
    fPHeapMin20.copia(item_array31);
    fPHeapMin1.copia(item_array31);
    fPHeapMin1.imprime();
    ds.Item item38 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item38);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test329"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item item19 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test330"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array42);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(item_array59);
    fPHeapMin54.copia(item_array59);
    fPHeapMin48.copia(item_array59);
    fPHeapMin48.constroi();
    fPHeapMin48.imprime();
    fPHeapMin48.imprime();
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
    fPHeapMin68.constroi();
    fPHeapMin68.constroi();
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(100);
    fPHeapMin72.constroi();
    ds.Item item74 = null;
    ds.Item[] item_array75 = new ds.Item[] { item74 };
    fPHeapMin72.copia(item_array75);
    ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(100);
    fPHeapMin80.imprime();
    ds.Item item82 = null;
    ds.Item[] item_array83 = new ds.Item[] { item82 };
    fPHeapMin80.copia(item_array83);
    ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(item_array83);
    fPHeapMin78.copia(item_array83);
    fPHeapMin72.copia(item_array83);
    fPHeapMin68.copia(item_array83);
    fPHeapMin48.copia(item_array83);
    fPHeapMin46.copia(item_array83);
    ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(item_array83);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin91.refaz((int)(byte)100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array83);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test331"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    fPHeapMin1.constroi();
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test332"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test333"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item5 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test334"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)1, 1);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    fPHeapMin8.constroi();
    fPHeapMin8.imprime();
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.imprime();
    ds.Item item29 = null;
    ds.Item[] item_array30 = new ds.Item[] { item29 };
    fPHeapMin27.copia(item_array30);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.constroi();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array44);
    fPHeapMin39.copia(item_array44);
    fPHeapMin33.copia(item_array44);
    fPHeapMin33.constroi();
    fPHeapMin33.imprime();
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(100);
    fPHeapMin52.constroi();
    ds.Item item54 = null;
    ds.Item[] item_array55 = new ds.Item[] { item54 };
    fPHeapMin52.copia(item_array55);
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
    fPHeapMin60.imprime();
    ds.Item item62 = null;
    ds.Item[] item_array63 = new ds.Item[] { item62 };
    fPHeapMin60.copia(item_array63);
    ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(item_array63);
    fPHeapMin58.copia(item_array63);
    fPHeapMin52.copia(item_array63);
    fPHeapMin33.copia(item_array63);
    fPHeapMin27.copia(item_array63);
    fPHeapMin8.copia(item_array63);
    fPHeapMin1.copia(item_array63);
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(item_array63);
    ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(item_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array63);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test335"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin29.copia(item_array34);
    fPHeapMin23.copia(item_array34);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array34);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin41.constroi();
    fPHeapMin41.imprime();
    fPHeapMin41.constroi();
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(item_array53);
    fPHeapMin41.copia(item_array53);
    fPHeapMin39.copia(item_array53);
    fPHeapMin1.copia(item_array53);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(item_array53);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item60 = fPHeapMin59.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test336"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.constroi();
    fPHeapMin4.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    fPHeapMin4.copia(item_array19);
    fPHeapMin1.copia(item_array19);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array19);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item28 = fPHeapMin27.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test337"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin25.copia(item_array37);
    fPHeapMin23.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array37);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array37);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
    fPHeapMin49.imprime();
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(100);
    fPHeapMin52.imprime();
    ds.Item item54 = null;
    ds.Item[] item_array55 = new ds.Item[] { item54 };
    fPHeapMin52.copia(item_array55);
    fPHeapMin49.copia(item_array55);
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(item_array55);
    fPHeapMin47.copia(item_array55);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(100);
    fPHeapMin61.imprime();
    ds.Item item63 = null;
    ds.Item[] item_array64 = new ds.Item[] { item63 };
    fPHeapMin61.copia(item_array64);
    ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(item_array64);
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(item_array64);
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(item_array64);
    ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(item_array64);
    ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(item_array64);
    fPHeapMin47.copia(item_array64);
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(item_array64);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin44.diminuiChave((int)'4', (java.lang.Object)item_array64);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test338"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)100, (java.lang.Object)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test339"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.Item item9 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test340"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array9);
    fPHeapMin4.copia(item_array9);
    fPHeapMin1.copia(item_array9);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test341"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)(short)100, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test342"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    fPHeapMin1.copia(item_array24);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array24);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item28 = fPHeapMin27.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test343"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)1, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test344"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMin10.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item item15 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test345"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    fPHeapMin9.constroi();
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array19);
    fPHeapMin9.copia(item_array19);
    fPHeapMin1.copia(item_array19);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array19);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item29 = fPHeapMin28.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test346"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array0);
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin3.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test347"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    fPHeapMin24.constroi();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    fPHeapMin24.copia(item_array27);
    fPHeapMin1.copia(item_array27);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array27);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item31 = fPHeapMin30.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test348"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test349"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array9);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = fPHeapMin17.min();
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.imprime();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    fPHeapMin23.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(item_array29);
    fPHeapMin21.copia(item_array29);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.imprime();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(item_array38);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(item_array38);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(item_array38);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array38);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array38);
    fPHeapMin21.copia(item_array38);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array38);
    fPHeapMin17.copia(item_array38);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.diminuiChave((-1), (java.lang.Object)item_array38);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test350"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.Item item26 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test351"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test352"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test353"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    ds.Item item2 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test354"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
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
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test355"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin17.copia(item_array31);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin17.refaz(10, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test356"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.constroi();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.imprime();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(item_array36);
    fPHeapMin31.copia(item_array36);
    fPHeapMin25.copia(item_array36);
    fPHeapMin25.imprime();
    ds.Item item42 = fPHeapMin25.min();
    fPHeapMin25.refaz((int)(short)1, (int)(short)1);
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    fPHeapMin25.copia(item_array51);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)10, (java.lang.Object)fPHeapMin25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test357"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test358"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    ds.Item item21 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test359"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMin10.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test360"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item25 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    fPHeapMin29.imprime();
    ds.Item item31 = null;
    ds.Item[] item_array32 = new ds.Item[] { item31 };
    fPHeapMin29.copia(item_array32);
    fPHeapMin29.refaz((int)(short)10, (int)(short)0);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    fPHeapMin38.constroi();
    ds.Item item40 = null;
    ds.Item[] item_array41 = new ds.Item[] { item40 };
    fPHeapMin38.copia(item_array41);
    fPHeapMin38.constroi();
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.constroi();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    fPHeapMin38.copia(item_array48);
    fPHeapMin29.copia(item_array48);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array48);
    ds.Item[] item_array53 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array53);
    fPHeapMin52.copia(item_array53);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(10, (java.lang.Object)item_array53);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test361"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin21.insere(item23);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test362"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin7.copia(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array13);
    fPHeapMin5.copia(item_array13);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array22);
    fPHeapMin5.copia(item_array22);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array22);
    fPHeapMin1.copia(item_array22);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.imprime();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(item_array36);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array36);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.constroi();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    fPHeapMin47.imprime();
    ds.Item item49 = null;
    ds.Item[] item_array50 = new ds.Item[] { item49 };
    fPHeapMin47.copia(item_array50);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array50);
    fPHeapMin41.copia(item_array50);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array50);
    fPHeapMin39.copia(item_array50);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(item_array50);
    fPHeapMin1.copia(item_array50);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(100);
    fPHeapMin59.constroi();
    ds.Item item61 = null;
    ds.Item[] item_array62 = new ds.Item[] { item61 };
    fPHeapMin59.copia(item_array62);
    ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(100);
    fPHeapMin67.imprime();
    ds.Item item69 = null;
    ds.Item[] item_array70 = new ds.Item[] { item69 };
    fPHeapMin67.copia(item_array70);
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(item_array70);
    fPHeapMin65.copia(item_array70);
    fPHeapMin59.copia(item_array70);
    ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(item_array70);
    fPHeapMin1.copia(item_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array70);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test363"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)(-1));
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.imprime();
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    fPHeapMin4.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)1, (java.lang.Object)item_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test364"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test365"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test366"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'4');
    fPHeapMin1.imprime();

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test367"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    ds.Item item7 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test368"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item25 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item26 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test369"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    fPHeapMin48.constroi();
    fPHeapMin48.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)10, (java.lang.Object)fPHeapMin48);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test370"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    fPHeapMin34.constroi();
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.constroi();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin34.copia(item_array44);
    fPHeapMin25.copia(item_array44);
    fPHeapMin1.copia(item_array44);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test371"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array13);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array13);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array22);
    fPHeapMin17.copia(item_array22);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)fPHeapMin17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test372"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    fPHeapMin23.constroi();
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.refaz(100, 10);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    fPHeapMin32.imprime();
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.imprime();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    fPHeapMin32.copia(item_array38);
    fPHeapMin27.copia(item_array38);
    fPHeapMin23.copia(item_array38);
    fPHeapMin1.copia(item_array38);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.imprime();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    fPHeapMin45.refaz((int)(short)10, (int)(short)0);
    fPHeapMin45.constroi();
    fPHeapMin45.refaz((int)(byte)10, (int)(byte)(-1));
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
    fPHeapMin58.imprime();
    ds.Item item60 = null;
    ds.Item[] item_array61 = new ds.Item[] { item60 };
    fPHeapMin58.copia(item_array61);
    fPHeapMin58.constroi();
    fPHeapMin58.imprime();
    fPHeapMin58.constroi();
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(0);
    ds.Item[] item_array68 = new ds.Item[] {  };
    fPHeapMin67.copia(item_array68);
    ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(item_array68);
    fPHeapMin58.copia(item_array68);
    ds.Item[] item_array72 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(item_array72);
    fPHeapMin58.copia(item_array72);
    fPHeapMin45.copia(item_array72);
    fPHeapMin1.copia(item_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array72);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test373"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item22 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test374"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.constroi();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin5.copia(item_array8);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    fPHeapMin13.imprime();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMin13.copia(item_array16);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array16);
    fPHeapMin11.copia(item_array16);
    fPHeapMin5.copia(item_array16);
    fPHeapMin1.copia(item_array16);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test375"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    ds.Item item11 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array24);
    fPHeapMin15.copia(item_array24);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array24);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(0, (java.lang.Object)item_array24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test376"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    ds.Item item23 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test377"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    fPHeapMin24.constroi();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    fPHeapMin24.copia(item_array27);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    fPHeapMin32.imprime();
    ds.Item item34 = null;
    ds.Item[] item_array35 = new ds.Item[] { item34 };
    fPHeapMin32.copia(item_array35);
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(item_array35);
    fPHeapMin30.copia(item_array35);
    fPHeapMin24.copia(item_array35);
    fPHeapMin24.constroi();
    fPHeapMin24.imprime();
    fPHeapMin24.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((-1), (java.lang.Object)fPHeapMin24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test378"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    fPHeapMin1.refaz((int)'a', (int)' ');
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test379"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
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
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test380"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)100, (int)(byte)100);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.imprime();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array25);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array25);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(item_array25);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(item_array34);
    fPHeapMin29.copia(item_array34);
    fPHeapMin1.copia(item_array34);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    fPHeapMin42.imprime();
    ds.Item item44 = null;
    ds.Item[] item_array45 = new ds.Item[] { item44 };
    fPHeapMin42.copia(item_array45);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(item_array45);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(item_array45);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(item_array45);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'a', (java.lang.Object)item_array45);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test381"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    ds.Item item44 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item44);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test382"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    fPHeapMin9.constroi();
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array19);
    fPHeapMin9.copia(item_array19);
    fPHeapMin1.copia(item_array19);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array19);
    ds.Item item29 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin28.insere(item29);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test383"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test384"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)(-1), (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test385"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin8.copia(item_array13);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    fPHeapMin18.constroi();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMin18.copia(item_array21);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.imprime();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(item_array29);
    fPHeapMin24.copia(item_array29);
    fPHeapMin18.copia(item_array29);
    fPHeapMin18.constroi();
    fPHeapMin18.imprime();
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
    fPHeapMin37.constroi();
    ds.Item item39 = null;
    ds.Item[] item_array40 = new ds.Item[] { item39 };
    fPHeapMin37.copia(item_array40);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.imprime();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(item_array48);
    fPHeapMin43.copia(item_array48);
    fPHeapMin37.copia(item_array48);
    fPHeapMin18.copia(item_array48);
    fPHeapMin8.copia(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test386"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin25.copia(item_array37);
    fPHeapMin23.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test387"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)'4', 100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.imprime();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array14);
    fPHeapMin9.copia(item_array14);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array14);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)fPHeapMin19);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test388"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.constroi();
    fPHeapMin21.constroi();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.constroi();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.imprime();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(item_array36);
    fPHeapMin31.copia(item_array36);
    fPHeapMin25.copia(item_array36);
    fPHeapMin21.copia(item_array36);
    fPHeapMin1.copia(item_array36);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test389"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test390"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test391"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)'#', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test392"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMin17.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test393"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.constroi();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.imprime();
    ds.Item item55 = null;
    ds.Item[] item_array56 = new ds.Item[] { item55 };
    fPHeapMin53.copia(item_array56);
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(item_array56);
    fPHeapMin51.copia(item_array56);
    fPHeapMin45.copia(item_array56);
    fPHeapMin26.copia(item_array56);
    fPHeapMin20.copia(item_array56);
    fPHeapMin1.copia(item_array56);
    ds.Item item64 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item64);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test394"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item8 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    fPHeapMin18.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMin18.copia(item_array21);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array21);
    fPHeapMin16.copia(item_array21);
    fPHeapMin10.copia(item_array21);
    fPHeapMin10.imprime();
    ds.Item item27 = fPHeapMin10.min();
    fPHeapMin10.refaz((int)(short)1, (int)(short)1);
    fPHeapMin10.constroi();
    fPHeapMin10.imprime();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
    fPHeapMin36.imprime();
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin36.copia(item_array42);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(item_array42);
    fPHeapMin34.copia(item_array42);
    fPHeapMin10.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.imprime();
    ds.Item item55 = null;
    ds.Item[] item_array56 = new ds.Item[] { item55 };
    fPHeapMin53.copia(item_array56);
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(item_array56);
    fPHeapMin51.copia(item_array56);
    fPHeapMin51.imprime();
    fPHeapMin51.refaz(0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)0, (java.lang.Object)fPHeapMin51);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test395"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.imprime();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array26);
    fPHeapMin21.copia(item_array26);
    fPHeapMin15.copia(item_array26);
    fPHeapMin15.constroi();
    fPHeapMin15.imprime();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    fPHeapMin42.imprime();
    ds.Item item44 = null;
    ds.Item[] item_array45 = new ds.Item[] { item44 };
    fPHeapMin42.copia(item_array45);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(item_array45);
    fPHeapMin40.copia(item_array45);
    fPHeapMin34.copia(item_array45);
    fPHeapMin15.copia(item_array45);
    fPHeapMin9.copia(item_array45);
    fPHeapMin1.copia(item_array45);
    ds.Item item53 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item53);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test396"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.constroi();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.imprime();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array20);
    fPHeapMin15.copia(item_array20);
    fPHeapMin9.copia(item_array20);
    fPHeapMin9.imprime();
    fPHeapMin9.refaz((int)(short)100, (int)(byte)100);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin30.constroi();
    fPHeapMin30.imprime();
    fPHeapMin30.constroi();
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array42);
    fPHeapMin30.copia(item_array42);
    fPHeapMin9.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test397"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.imprime();
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin27.copia(item_array33);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array33);
    fPHeapMin25.copia(item_array33);
    fPHeapMin1.copia(item_array33);
    ds.Item item39 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item39);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test398"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test399"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array9);
    fPHeapMin14.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item16 = fPHeapMin14.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test400"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin21.insere(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test401"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    fPHeapMin1.constroi();
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test402"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
    fPHeapMin6.constroi();
    fPHeapMin6.imprime();
    fPHeapMin6.refaz((int)(short)0, (-1));
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    fPHeapMin13.imprime();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMin13.copia(item_array16);
    fPHeapMin6.copia(item_array16);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    fPHeapMin6.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array23);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'4', (java.lang.Object)item_array23);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test403"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'4');
    ds.Item item2 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.constroi();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin5.copia(item_array8);
    fPHeapMin5.constroi();
    fPHeapMin5.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)(-1), (java.lang.Object)fPHeapMin5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test404"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    ds.Item item23 = fPHeapMin1.min();
    ds.Item item24 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.constroi();
    ds.Item item29 = null;
    ds.Item[] item_array30 = new ds.Item[] { item29 };
    fPHeapMin27.copia(item_array30);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.imprime();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(item_array38);
    fPHeapMin33.copia(item_array38);
    fPHeapMin27.copia(item_array38);
    fPHeapMin27.constroi();
    fPHeapMin27.imprime();
    fPHeapMin27.constroi();
    fPHeapMin27.imprime();
    ds.Item item47 = fPHeapMin27.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'a', (java.lang.Object)item47);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test405"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.Item item6 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.constroi();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.imprime();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array20);
    fPHeapMin15.copia(item_array20);
    fPHeapMin9.copia(item_array20);
    fPHeapMin9.imprime();
    ds.Item item26 = fPHeapMin9.min();
    fPHeapMin9.refaz((int)(short)1, (int)(short)1);
    fPHeapMin9.constroi();
    fPHeapMin9.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'4', (java.lang.Object)fPHeapMin9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test406"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test407"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test408"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array42);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.constroi();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(item_array59);
    fPHeapMin54.copia(item_array59);
    fPHeapMin48.copia(item_array59);
    fPHeapMin48.constroi();
    fPHeapMin48.imprime();
    fPHeapMin48.imprime();
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
    fPHeapMin68.constroi();
    fPHeapMin68.constroi();
    ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(100);
    fPHeapMin72.constroi();
    ds.Item item74 = null;
    ds.Item[] item_array75 = new ds.Item[] { item74 };
    fPHeapMin72.copia(item_array75);
    ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(100);
    fPHeapMin80.imprime();
    ds.Item item82 = null;
    ds.Item[] item_array83 = new ds.Item[] { item82 };
    fPHeapMin80.copia(item_array83);
    ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(item_array83);
    fPHeapMin78.copia(item_array83);
    fPHeapMin72.copia(item_array83);
    fPHeapMin68.copia(item_array83);
    fPHeapMin48.copia(item_array83);
    fPHeapMin46.copia(item_array83);
    ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(item_array83);
    ds.Item item92 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin91.insere(item92);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array83);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test409"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)'4', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz(0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test410"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.constroi();

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test411"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz(10, (int)(short)0);
    fPHeapMin1.constroi();
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test412"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array6);
    fPHeapMin10.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = fPHeapMin10.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test413"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.Item item21 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    fPHeapMin24.constroi();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    fPHeapMin24.copia(item_array27);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.constroi();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    fPHeapMin38.imprime();
    ds.Item item40 = null;
    ds.Item[] item_array41 = new ds.Item[] { item40 };
    fPHeapMin38.copia(item_array41);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array41);
    fPHeapMin36.copia(item_array41);
    fPHeapMin30.copia(item_array41);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array41);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.imprime();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    fPHeapMin48.constroi();
    fPHeapMin48.imprime();
    fPHeapMin48.constroi();
    ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
    fPHeapMin57.constroi();
    ds.Item item59 = null;
    ds.Item[] item_array60 = new ds.Item[] { item59 };
    fPHeapMin57.copia(item_array60);
    ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(item_array60);
    fPHeapMin48.copia(item_array60);
    fPHeapMin46.copia(item_array60);
    fPHeapMin24.copia(item_array60);
    ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(item_array60);
    fPHeapMin1.copia(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test414"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test415"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.imprime();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin4.copia(item_array7);
    fPHeapMin1.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array7);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMin10.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test416"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.constroi();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.imprime();
    ds.Item item29 = null;
    ds.Item[] item_array30 = new ds.Item[] { item29 };
    fPHeapMin27.copia(item_array30);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(item_array30);
    fPHeapMin25.copia(item_array30);
    fPHeapMin19.copia(item_array30);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(item_array30);
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
    fPHeapMin37.imprime();
    ds.Item item39 = null;
    ds.Item[] item_array40 = new ds.Item[] { item39 };
    fPHeapMin37.copia(item_array40);
    fPHeapMin37.constroi();
    fPHeapMin37.imprime();
    fPHeapMin37.constroi();
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
    fPHeapMin46.constroi();
    ds.Item item48 = null;
    ds.Item[] item_array49 = new ds.Item[] { item48 };
    fPHeapMin46.copia(item_array49);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(item_array49);
    fPHeapMin37.copia(item_array49);
    fPHeapMin35.copia(item_array49);
    fPHeapMin1.copia(item_array49);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(item_array49);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test417"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item2 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test418"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
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
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test419"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.constroi();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test420"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item10 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    fPHeapMin13.constroi();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMin13.copia(item_array16);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array24);
    fPHeapMin19.copia(item_array24);
    fPHeapMin13.copia(item_array24);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(item_array24);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    fPHeapMin31.constroi();
    fPHeapMin31.imprime();
    fPHeapMin31.constroi();
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    fPHeapMin40.constroi();
    ds.Item item42 = null;
    ds.Item[] item_array43 = new ds.Item[] { item42 };
    fPHeapMin40.copia(item_array43);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(item_array43);
    fPHeapMin31.copia(item_array43);
    fPHeapMin29.copia(item_array43);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(item_array43);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)1, (java.lang.Object)fPHeapMin48);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test421"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)(-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.constroi();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.imprime();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array14);
    fPHeapMin9.copia(item_array14);
    fPHeapMin3.copia(item_array14);
    fPHeapMin3.constroi();
    fPHeapMin3.imprime();
    fPHeapMin3.constroi();
    fPHeapMin3.imprime();
    ds.Item item23 = fPHeapMin3.min();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.constroi();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.imprime();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(item_array36);
    fPHeapMin31.copia(item_array36);
    fPHeapMin25.copia(item_array36);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(item_array36);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
    fPHeapMin43.imprime();
    ds.Item item45 = null;
    ds.Item[] item_array46 = new ds.Item[] { item45 };
    fPHeapMin43.copia(item_array46);
    fPHeapMin43.constroi();
    fPHeapMin43.imprime();
    fPHeapMin43.constroi();
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(100);
    fPHeapMin52.constroi();
    ds.Item item54 = null;
    ds.Item[] item_array55 = new ds.Item[] { item54 };
    fPHeapMin52.copia(item_array55);
    ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(item_array55);
    fPHeapMin43.copia(item_array55);
    fPHeapMin41.copia(item_array55);
    fPHeapMin3.copia(item_array55);
    fPHeapMin1.copia(item_array55);
    ds.Item item62 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item62);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test422"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMin10.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item[] item_array15 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array15);
    fPHeapMin1.copia(item_array15);
    ds.Item item18 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test423"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin29.copia(item_array34);
    fPHeapMin23.copia(item_array34);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array34);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin41.constroi();
    fPHeapMin41.imprime();
    fPHeapMin41.constroi();
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(item_array53);
    fPHeapMin41.copia(item_array53);
    fPHeapMin39.copia(item_array53);
    fPHeapMin1.copia(item_array53);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(item_array53);
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(item_array53);
    ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
    fPHeapMin62.imprime();
    ds.Item item64 = null;
    ds.Item[] item_array65 = new ds.Item[] { item64 };
    fPHeapMin62.copia(item_array65);
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(item_array65);
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(item_array65);
    fPHeapMin60.copia(item_array65);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin60.refaz((int)(byte)10, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array65);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test424"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.Item item10 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    fPHeapMin12.constroi();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.constroi();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin12.copia(item_array22);
    fPHeapMin1.copia(item_array22);
    ds.Item[] item_array26 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test425"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)(-1), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test426"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test427"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.constroi();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin4.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin4.copia(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test428"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    fPHeapMin24.imprime();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    fPHeapMin24.copia(item_array27);
    fPHeapMin24.constroi();
    fPHeapMin24.imprime();
    fPHeapMin24.constroi();
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.constroi();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    fPHeapMin33.constroi();
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    fPHeapMin40.constroi();
    ds.Item item42 = null;
    ds.Item[] item_array43 = new ds.Item[] { item42 };
    fPHeapMin40.copia(item_array43);
    fPHeapMin33.copia(item_array43);
    fPHeapMin24.copia(item_array43);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.imprime();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    fPHeapMin48.constroi();
    fPHeapMin48.imprime();
    fPHeapMin48.constroi();
    ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
    fPHeapMin57.constroi();
    ds.Item item59 = null;
    ds.Item[] item_array60 = new ds.Item[] { item59 };
    fPHeapMin57.copia(item_array60);
    ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(item_array60);
    fPHeapMin48.copia(item_array60);
    fPHeapMin48.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
    fPHeapMin68.imprime();
    ds.Item item70 = null;
    ds.Item[] item_array71 = new ds.Item[] { item70 };
    fPHeapMin68.copia(item_array71);
    fPHeapMin48.copia(item_array71);
    fPHeapMin24.copia(item_array71);
    fPHeapMin1.copia(item_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array71);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test429"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test430"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test431"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array24);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array24);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array24);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(item_array24);
    fPHeapMin1.copia(item_array24);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test432"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)' ', (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test433"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test434"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test435"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.imprime();
    fPHeapMin5.refaz(0, (int)(byte)(-1));
    fPHeapMin5.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array23);
    fPHeapMin18.copia(item_array23);
    fPHeapMin12.copia(item_array23);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array23);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin30.constroi();
    fPHeapMin30.imprime();
    fPHeapMin30.constroi();
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array42);
    fPHeapMin30.copia(item_array42);
    fPHeapMin28.copia(item_array42);
    fPHeapMin5.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test436"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    ds.Item[] item_array45 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array45);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(item_array45);
    fPHeapMin1.copia(item_array45);
    fPHeapMin1.refaz((int)'a', 10);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)0, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test437"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.refaz(1, (int)(byte)0);
    ds.Item[] item_array13 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test438"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    fPHeapMin1.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.imprime();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    fPHeapMin1.copia(item_array24);
    ds.Item item27 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test439"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMin3.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test440"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(short)(-1));
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test441"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)(-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test442"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.imprime();
    fPHeapMin5.refaz(0, (int)(byte)(-1));
    fPHeapMin5.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array23);
    fPHeapMin18.copia(item_array23);
    fPHeapMin12.copia(item_array23);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array23);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin30.constroi();
    fPHeapMin30.imprime();
    fPHeapMin30.constroi();
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array42);
    fPHeapMin30.copia(item_array42);
    fPHeapMin28.copia(item_array42);
    fPHeapMin5.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(item_array42);
    ds.Item item50 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin49.insere(item50);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test443"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin7.refaz((int)(byte)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test444"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.imprime();
    fPHeapMin5.refaz(0, (int)(byte)(-1));
    fPHeapMin5.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array23);
    fPHeapMin18.copia(item_array23);
    fPHeapMin12.copia(item_array23);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array23);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin30.constroi();
    fPHeapMin30.imprime();
    fPHeapMin30.constroi();
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array42);
    fPHeapMin30.copia(item_array42);
    fPHeapMin28.copia(item_array42);
    fPHeapMin5.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(item_array42);
    fPHeapMin49.imprime();
    ds.Item item51 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin49.insere(item51);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test445"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test446"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.imprime();
    fPHeapMin5.refaz(0, (int)(byte)(-1));
    fPHeapMin5.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array23);
    fPHeapMin18.copia(item_array23);
    fPHeapMin12.copia(item_array23);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array23);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin30.constroi();
    fPHeapMin30.imprime();
    fPHeapMin30.constroi();
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array42);
    fPHeapMin30.copia(item_array42);
    fPHeapMin28.copia(item_array42);
    fPHeapMin5.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(item_array42);
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test447"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    ds.Item item7 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test448"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
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

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test449"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.Item item9 = fPHeapMin1.min();
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test450"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin6.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int)(byte)10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.imprime();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    fPHeapMin10.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array15);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin6.diminuiChave(10, (java.lang.Object)item_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test451"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)' ', (-1));
    java.lang.Object obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(100, obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test452"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.imprime();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin4.copia(item_array7);
    fPHeapMin1.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array7);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    fPHeapMin14.imprime();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMin14.copia(item_array17);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array17);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array17);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.constroi();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin22.copia(item_array31);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(item_array31);
    fPHeapMin20.copia(item_array31);
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(item_array31);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(item_array31);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin10.diminuiChave((int)(byte)100, (java.lang.Object)item_array31);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test453"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)1, 1);
    fPHeapMin1.imprime();
    ds.Item item7 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test454"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)(byte)10, (int)(byte)(-1));
    ds.Item[] item_array13 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test455"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int)(byte)100);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.imprime();
    ds.Item item24 = fPHeapMin7.min();
    fPHeapMin7.refaz((int)(short)1, (int)(short)1);
    fPHeapMin7.constroi();
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.constroi();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    fPHeapMin7.copia(item_array33);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array33);
    fPHeapMin5.copia(item_array33);
    fPHeapMin1.copia(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test456"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.constroi();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin9.copia(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array18);
    ds.Item[] item_array26 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array26);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(item_array26);
    fPHeapMin25.copia(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test457"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test458"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.constroi();
    fPHeapMin21.constroi();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.constroi();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.imprime();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(item_array36);
    fPHeapMin31.copia(item_array36);
    fPHeapMin25.copia(item_array36);
    fPHeapMin21.copia(item_array36);
    fPHeapMin1.copia(item_array36);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test459"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin17.copia(item_array31);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array31);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    fPHeapMin38.constroi();
    ds.Item item40 = null;
    ds.Item[] item_array41 = new ds.Item[] { item40 };
    fPHeapMin38.copia(item_array41);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
    fPHeapMin46.imprime();
    ds.Item item48 = null;
    ds.Item[] item_array49 = new ds.Item[] { item48 };
    fPHeapMin46.copia(item_array49);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(item_array49);
    fPHeapMin44.copia(item_array49);
    fPHeapMin38.copia(item_array49);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array49);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    fPHeapMin56.constroi();
    fPHeapMin56.imprime();
    fPHeapMin56.constroi();
    ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(100);
    fPHeapMin65.constroi();
    ds.Item item67 = null;
    ds.Item[] item_array68 = new ds.Item[] { item67 };
    fPHeapMin65.copia(item_array68);
    ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(item_array68);
    fPHeapMin56.copia(item_array68);
    fPHeapMin54.copia(item_array68);
    fPHeapMin36.copia(item_array68);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item74 = fPHeapMin36.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array68);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test460"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test461"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int)(byte)0);
    fPHeapMin10.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)fPHeapMin10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test462"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test463"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin7.copia(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array13);
    fPHeapMin5.copia(item_array13);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array22);
    fPHeapMin5.copia(item_array22);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array22);
    fPHeapMin1.copia(item_array22);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.imprime();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(item_array36);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array36);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.constroi();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    fPHeapMin47.imprime();
    ds.Item item49 = null;
    ds.Item[] item_array50 = new ds.Item[] { item49 };
    fPHeapMin47.copia(item_array50);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array50);
    fPHeapMin41.copia(item_array50);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array50);
    fPHeapMin39.copia(item_array50);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(item_array50);
    fPHeapMin1.copia(item_array50);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item58 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test464"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.Item item21 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.Item item23 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test465"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin17.copia(item_array31);
    fPHeapMin17.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test466"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.constroi();
    ds.Item item29 = null;
    ds.Item[] item_array30 = new ds.Item[] { item29 };
    fPHeapMin27.copia(item_array30);
    fPHeapMin27.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    fPHeapMin27.copia(item_array37);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'4', (java.lang.Object)item_array37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test467"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)'#', (int)(byte)10);
    ds.Item item21 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test468"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    ds.Item item11 = fPHeapMin1.min();
    ds.Item item12 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test469"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    fPHeapMin18.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMin18.copia(item_array21);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array21);
    fPHeapMin12.copia(item_array21);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array21);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array21);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array21);
    fPHeapMin1.copia(item_array21);
    fPHeapMin1.refaz((int)(short)100, 100);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test470"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin26.copia(item_array31);
    fPHeapMin26.imprime();
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
    fPHeapMin37.constroi();
    ds.Item item39 = null;
    ds.Item[] item_array40 = new ds.Item[] { item39 };
    fPHeapMin37.copia(item_array40);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
    fPHeapMin43.imprime();
    ds.Item item45 = null;
    ds.Item[] item_array46 = new ds.Item[] { item45 };
    fPHeapMin43.copia(item_array46);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(item_array46);
    fPHeapMin37.copia(item_array46);
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(item_array46);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(item_array46);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array46);
    fPHeapMin26.copia(item_array46);
    fPHeapMin1.copia(item_array46);
    ds.Item item55 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item55);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test471"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin6.constroi();
    fPHeapMin6.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test472"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test473"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item19 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test474"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.constroi();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    fPHeapMin14.imprime();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMin14.copia(item_array17);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array17);
    fPHeapMin12.copia(item_array17);
    fPHeapMin6.copia(item_array17);
    fPHeapMin6.constroi();
    fPHeapMin6.imprime();
    fPHeapMin6.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    fPHeapMin26.constroi();
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.constroi();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    fPHeapMin38.imprime();
    ds.Item item40 = null;
    ds.Item[] item_array41 = new ds.Item[] { item40 };
    fPHeapMin38.copia(item_array41);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array41);
    fPHeapMin36.copia(item_array41);
    fPHeapMin30.copia(item_array41);
    fPHeapMin26.copia(item_array41);
    fPHeapMin6.copia(item_array41);
    ds.Item[] item_array48 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(item_array48);
    fPHeapMin6.copia(item_array48);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)10, (java.lang.Object)fPHeapMin6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test475"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
    fPHeapMin49.imprime();
    ds.Item item51 = null;
    ds.Item[] item_array52 = new ds.Item[] { item51 };
    fPHeapMin49.copia(item_array52);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array52);
    fPHeapMin47.copia(item_array52);
    ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
    fPHeapMin57.imprime();
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
    fPHeapMin60.imprime();
    ds.Item item62 = null;
    ds.Item[] item_array63 = new ds.Item[] { item62 };
    fPHeapMin60.copia(item_array63);
    fPHeapMin57.copia(item_array63);
    ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(item_array63);
    fPHeapMin47.copia(item_array63);
    fPHeapMin1.copia(item_array63);
    ds.Item item69 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item69);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test476"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin25.copia(item_array37);
    fPHeapMin23.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array37);
    fPHeapMin43.imprime();
    fPHeapMin43.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test477"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array10);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.imprime();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin17.imprime();
    fPHeapMin17.imprime();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.constroi();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array42);
    fPHeapMin37.copia(item_array42);
    fPHeapMin31.copia(item_array42);
    fPHeapMin31.constroi();
    fPHeapMin31.imprime();
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
    fPHeapMin58.imprime();
    ds.Item item60 = null;
    ds.Item[] item_array61 = new ds.Item[] { item60 };
    fPHeapMin58.copia(item_array61);
    ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(item_array61);
    fPHeapMin56.copia(item_array61);
    fPHeapMin50.copia(item_array61);
    fPHeapMin31.copia(item_array61);
    fPHeapMin25.copia(item_array61);
    fPHeapMin17.copia(item_array61);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.diminuiChave((int)'4', (java.lang.Object)item_array61);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array61);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test478"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test479"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    fPHeapMin29.imprime();
    ds.Item item31 = null;
    ds.Item[] item_array32 = new ds.Item[] { item31 };
    fPHeapMin29.copia(item_array32);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(item_array32);
    fPHeapMin27.copia(item_array32);
    fPHeapMin21.copia(item_array32);
    fPHeapMin21.constroi();
    fPHeapMin21.imprime();
    fPHeapMin21.constroi();
    fPHeapMin21.imprime();
    ds.Item item41 = fPHeapMin21.min();
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
    fPHeapMin43.constroi();
    ds.Item item45 = null;
    ds.Item[] item_array46 = new ds.Item[] { item45 };
    fPHeapMin43.copia(item_array46);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
    fPHeapMin51.imprime();
    ds.Item item53 = null;
    ds.Item[] item_array54 = new ds.Item[] { item53 };
    fPHeapMin51.copia(item_array54);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(item_array54);
    fPHeapMin49.copia(item_array54);
    fPHeapMin43.copia(item_array54);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(item_array54);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(100);
    fPHeapMin61.imprime();
    ds.Item item63 = null;
    ds.Item[] item_array64 = new ds.Item[] { item63 };
    fPHeapMin61.copia(item_array64);
    fPHeapMin61.constroi();
    fPHeapMin61.imprime();
    fPHeapMin61.constroi();
    ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(100);
    fPHeapMin70.constroi();
    ds.Item item72 = null;
    ds.Item[] item_array73 = new ds.Item[] { item72 };
    fPHeapMin70.copia(item_array73);
    ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(item_array73);
    fPHeapMin61.copia(item_array73);
    fPHeapMin59.copia(item_array73);
    fPHeapMin21.copia(item_array73);
    ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(item_array73);
    fPHeapMin1.copia(item_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array73);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test480"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)100, (int)(byte)100);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test481"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item18 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test482"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    fPHeapMin23.constroi();
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.refaz(100, 10);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    fPHeapMin32.imprime();
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.imprime();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    fPHeapMin32.copia(item_array38);
    fPHeapMin27.copia(item_array38);
    fPHeapMin23.copia(item_array38);
    fPHeapMin1.copia(item_array38);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test483"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    fPHeapMin1.imprime();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test484"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.constroi();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.imprime();
    ds.Item item55 = null;
    ds.Item[] item_array56 = new ds.Item[] { item55 };
    fPHeapMin53.copia(item_array56);
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(item_array56);
    fPHeapMin51.copia(item_array56);
    fPHeapMin45.copia(item_array56);
    fPHeapMin26.copia(item_array56);
    fPHeapMin20.copia(item_array56);
    fPHeapMin1.copia(item_array56);
    fPHeapMin1.constroi();
    ds.Item item65 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item65);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test485"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test486"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin7.copia(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array13);
    fPHeapMin5.copia(item_array13);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array13);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.imprime();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    fPHeapMin20.copia(item_array26);
    fPHeapMin18.copia(item_array26);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array26);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(10, (java.lang.Object)item_array26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test487"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test488"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test489"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array26);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array26);
    fPHeapMin1.copia(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test490"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    ds.Item item23 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test491"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test492"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)1, 1);
    fPHeapMin1.refaz(100, (int)'4');
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test493"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    ds.Item item11 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(byte)100, 1);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    fPHeapMin18.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMin18.copia(item_array21);
    fPHeapMin18.imprime();
    fPHeapMin18.imprime();
    ds.Item item25 = fPHeapMin18.min();
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    fPHeapMin27.constroi();
    ds.Item item29 = null;
    ds.Item[] item_array30 = new ds.Item[] { item29 };
    fPHeapMin27.copia(item_array30);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.imprime();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(item_array38);
    fPHeapMin33.copia(item_array38);
    fPHeapMin27.copia(item_array38);
    fPHeapMin27.imprime();
    ds.Item item44 = fPHeapMin27.min();
    fPHeapMin27.refaz((int)(short)1, (int)(short)1);
    fPHeapMin27.constroi();
    fPHeapMin27.imprime();
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.imprime();
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    fPHeapMin53.copia(item_array59);
    ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(item_array59);
    fPHeapMin51.copia(item_array59);
    fPHeapMin27.copia(item_array59);
    fPHeapMin18.copia(item_array59);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)1, (java.lang.Object)item_array59);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test494"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.constroi();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin5.copia(item_array8);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array8);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array13);
    fPHeapMin10.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'4', (java.lang.Object)item_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test495"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.refaz(100, 10);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    fPHeapMin6.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test496"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    fPHeapMin1.constroi();

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test497"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.imprime();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array26);
    fPHeapMin21.copia(item_array26);
    fPHeapMin15.copia(item_array26);
    fPHeapMin15.constroi();
    fPHeapMin15.imprime();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    fPHeapMin42.imprime();
    ds.Item item44 = null;
    ds.Item[] item_array45 = new ds.Item[] { item44 };
    fPHeapMin42.copia(item_array45);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(item_array45);
    fPHeapMin40.copia(item_array45);
    fPHeapMin34.copia(item_array45);
    fPHeapMin15.copia(item_array45);
    fPHeapMin9.copia(item_array45);
    fPHeapMin1.copia(item_array45);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(item_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test498"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array20);
    fPHeapMin24.imprime();
    fPHeapMin24.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item27 = fPHeapMin24.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test499"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test500"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.constroi();
    ds.Item item5 = fPHeapMin3.min();
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    fPHeapMin7.refaz(0, (int)(byte)(-1));
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    fPHeapMin14.constroi();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMin14.copia(item_array17);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.imprime();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array25);
    fPHeapMin20.copia(item_array25);
    fPHeapMin14.copia(item_array25);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array25);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    fPHeapMin32.imprime();
    ds.Item item34 = null;
    ds.Item[] item_array35 = new ds.Item[] { item34 };
    fPHeapMin32.copia(item_array35);
    fPHeapMin32.constroi();
    fPHeapMin32.imprime();
    fPHeapMin32.constroi();
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.constroi();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array44);
    fPHeapMin32.copia(item_array44);
    fPHeapMin30.copia(item_array44);
    fPHeapMin7.copia(item_array44);
    fPHeapMin3.copia(item_array44);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(item_array44);
    fPHeapMin1.copia(item_array44);
    ds.Item item53 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item53);

  }

}
